/**
 * Copyright 2004-2014 Riccardo Solmi. All rights reserved.
 * This file is part of the Whole Platform.
 *
 * The Whole Platform is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * The Whole Platform is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with the Whole Platform. If not, see <http://www.gnu.org/licenses/>.
 */
package org.whole.lang.e4.ui.compatibility;

import java.io.ByteArrayOutputStream;
import java.util.EventObject;

import org.eclipse.compare.CompareConfiguration;
import org.eclipse.compare.CompareEditorInput;
import org.eclipse.compare.CompareUI;
import org.eclipse.compare.IPropertyChangeNotifier;
import org.eclipse.compare.IStreamContentAccessor;
import org.eclipse.compare.ResourceNode;
import org.eclipse.compare.contentmergeviewer.IFlushable;
import org.eclipse.compare.contentmergeviewer.IMergeViewerContentProvider;
import org.eclipse.compare.internal.ICompareUIConstants;
import org.eclipse.compare.internal.IFlushable2;
import org.eclipse.compare.internal.MergeViewerContentProvider;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.ISafeRunnable;
import org.eclipse.core.runtime.ListenerList;
import org.eclipse.core.runtime.SafeRunner;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.EclipseContextFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.di.UISynchronize;
import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.gef.ContextMenuProvider;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.CommandStackListener;
import org.eclipse.jface.action.IContributionItem;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.jface.viewers.ContentViewer;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.IWorkbenchPart;
import org.whole.lang.bindings.IBindingManager;
import org.whole.lang.codebase.IPersistenceKit;
import org.whole.lang.codebase.StreamPersistenceProvider;
import org.whole.lang.e4.ui.actions.ActionRegistry;
import org.whole.lang.e4.ui.actions.E4KeyHandler;
import org.whole.lang.e4.ui.actions.E4NavigationKeyHandler;
import org.whole.lang.e4.ui.menu.JFaceMenuBuilder;
import org.whole.lang.e4.ui.menu.PopupMenuProvider;
import org.whole.lang.e4.ui.util.E4Utils;
import org.whole.lang.e4.ui.viewers.E4GraphicalViewer;
import org.whole.lang.misc.factories.MiscEntityFactory;
import org.whole.lang.model.IEntity;
import org.whole.lang.reflect.ReflectionFactory;
import org.whole.lang.status.codebase.ErrorStatusTemplate;
import org.whole.lang.ui.IUIProvider;
import org.whole.lang.ui.dialogs.LazyConfirmationDialogReloader;
import org.whole.lang.ui.editparts.IEntityPart;
import org.whole.lang.ui.editparts.IPartFocusListener;
import org.whole.lang.ui.viewers.IEntityPartViewer;

/**
 * @author Enrico Persiani
 */
public class ModelMergeViewer extends ContentViewer implements IPropertyChangeNotifier, IFlushable, IFlushable2 {
	protected CompareConfiguration compareConfiguration;
	protected ListenerList listenerList;
	protected IPropertyChangeListener ccPropertyListener;
	protected CommandStackListener csListener;
	protected IResourceChangeListener resourceListener;
	protected boolean dirty;

	protected IEntityPartViewer viewer;
	protected ActionRegistry actionRegistry;
	protected IUIProvider<IMenuManager> contextMenuProvider;
	protected LazyConfirmationDialogReloader reloader;


	protected ModelMergeViewer(Composite parent, int style, CompareConfiguration compareConfiguration) {
		if (compareConfiguration == null)
			this.compareConfiguration = new CompareConfiguration();
		else
			this.compareConfiguration = compareConfiguration;

		this.listenerList = new ListenerList();

		setContentProvider(new MergeViewerContentProvider(compareConfiguration));

		this.ccPropertyListener = new CompareConfigurationPropertyListener();
		this.getCompareConfiguration().addPropertyChangeListener(ccPropertyListener);

		createMergeArea(parent);
		getControl().setData(CompareUI.COMPARE_VIEWER_TITLE, "Whole Model Compare");

		viewer.setEntityContents(MiscEntityFactory.instance.createMisc(3));
		viewer.getCommandStack().addCommandStackListener(csListener = new CommandStackListener() {
			public void commandStackChanged(EventObject event) {
				setDirty(viewer.isDirty());
			}
		});
		
		reloader = new LazyConfirmationDialogReloader(getControl(), new Runnable() {
			@Override
			public void run() {
				refresh();
			}
		});
		
		hookControl(getControl());
	}

	protected void registerResourceListener() {
		IWorkspace workspace = getContext().get(IWorkspace.class);
		if (resourceListener != null)
			workspace.removeResourceChangeListener(resourceListener);
		
		IResource leftResource = null;
		Object leftContent = getContentProvider().getLeftContent(getInput());
		if (leftContent instanceof ResourceNode)
			leftResource = ((ResourceNode) leftContent).getResource();

		IResource rightResource = null;
		Object rightContent = getContentProvider().getRightContent(getInput());
		if (rightContent instanceof ResourceNode)
			rightResource = ((ResourceNode) rightContent).getResource();

		workspace.addResourceChangeListener(resourceListener = new ResourceChangeListener(
				leftResource, rightResource));
	}

	@Override
	protected void handleDispose(DisposeEvent event) {
		if (ccPropertyListener != null)
			getCompareConfiguration().removePropertyChangeListener(ccPropertyListener);

		if (csListener != null)
			viewer.getCommandStack().removeCommandStackListener(csListener);

		if (resourceListener != null) {
			IWorkspace workspace = getContext().get(IWorkspace.class);
			workspace.removeResourceChangeListener(resourceListener);
		}

		super.handleDispose(event);
	}

	protected CompareConfiguration getCompareConfiguration() {
		return compareConfiguration;
	}

	protected IEclipseContext getContext() {
		IWorkbenchPart part = getWorkbenchPart();
		return (IEclipseContext) part.getSite().getService(IEclipseContext.class);
	}

	protected IWorkbenchPart getWorkbenchPart() {
		return getCompareConfiguration().getContainer().getWorkbenchPart();
	}

	protected Control createMergeArea(Composite parent) {
		IEclipseContext params = EclipseContextFactory.create();
		params.set("parent", parent);
		viewer = ContextInjectionFactory.make(E4GraphicalViewer.class, getContext(), params);
		viewer.getControl().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		viewer.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				updateSelection(E4Utils.createSelectionBindings(event, getContext()));
			}
		});
		viewer.getControl().addFocusListener(new FocusListener() {
			@Override
			public void focusLost(FocusEvent event) {
				getContext().remove(IEntityPartViewer.class);
				getContext().remove(ActionRegistry.class);
			}

			@SuppressWarnings("unchecked")
			@Override
			public void focusGained(FocusEvent event) {
				getContext().set(IEntityPartViewer.class, viewer);
				getContext().set(ActionRegistry.class, actionRegistry);
				updateSelection(E4Utils.createSelectionBindings(viewer.getSelectedEditParts(), viewer, getContext()));
			}
		});
		viewer.addPartFocusListener(new IPartFocusListener() {
			@SuppressWarnings("unchecked")
			public void focusChanged(IEntityPart oldPart, IEntityPart newPart) {
				updateSelection(E4Utils.createSelectionBindings(viewer.getSelectedEditParts(), viewer, getContext()));
			}
		});

		E4KeyHandler keyHandler = new E4KeyHandler(getContext());
		keyHandler.setParent(new E4NavigationKeyHandler(getContext()));
		viewer.setKeyHandler(keyHandler);
		viewer.setEntityContents(createDefaultContents());
		getContext().set(IEntityPartViewer.class, viewer);

		actionRegistry = ContextInjectionFactory.make(ActionRegistry.class, getContext());
		actionRegistry.registerWorkbenchActions();
		getContext().set(ActionRegistry.class, actionRegistry);

		JFaceMenuBuilder uiBuilder = ContextInjectionFactory.make(JFaceMenuBuilder.class, getContext());
		contextMenuProvider = new PopupMenuProvider<IContributionItem, IMenuManager>(uiBuilder);

		viewer.setContextMenu(new ContextMenuProvider(viewer) {
			@Override
			public void buildContextMenu(IMenuManager menuManager) {
				contextMenuProvider.populate(menuManager);
			}
		});
		return parent;
	}

	protected void updateSelection(IBindingManager bm) {
		getContext().get(ESelectionService.class).setSelection(bm);
	}

	protected IEntity createDefaultContents() {
		return new ErrorStatusTemplate().create();
	}

	protected void refresh(Object input) {
		IMergeViewerContentProvider contentProvider = getContentProvider();
		IEntity container = viewer.getEntityContents();
		if (contentProvider != null) {
			readContents(container, InputType.ANCESTOR, contentProvider.getAncestorContent(input));//TODO getAncestorContent is null unless merge mode
			readContents(container, InputType.LEFT, contentProvider.getLeftContent(input));
			readContents(container, InputType.RIGHT, contentProvider.getRightContent(input));
			setDirty(false);
		}
	}

	protected void readContents(IEntity container, InputType inputType, Object input) {//TODO
		try {
			IStreamContentAccessor accessor = (IStreamContentAccessor) input;
			IPersistenceKit defaultPersistenceKit = ReflectionFactory.getDefaultPersistenceKit();//TODO
			IEntity entity = defaultPersistenceKit.readModel(new StreamPersistenceProvider(accessor.getContents()));
			container.wSet(inputType.ordinal(), entity);
		} catch (Exception e) {
		}
	}

	protected void inputChanged(Object input, Object oldInput) {
		registerResourceListener();
		if (input != oldInput)
			refresh(input);
	}

	protected byte[] getContents(InputType inputType) {
		try {
			IPersistenceKit defaultPersistenceKit = ReflectionFactory.getDefaultPersistenceKit();//TODO
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			defaultPersistenceKit.writeModel(viewer.getEntityContents().wGet(inputType.ordinal()), new StreamPersistenceProvider(baos));
			return baos.toByteArray();
		} catch (Exception e) {
			throw new IllegalStateException("cannot gather contents of "+inputType.name().toLowerCase()+" pane", e);
		}
	}

	protected void fireDirtyState(boolean state) {
		final PropertyChangeEvent event = new PropertyChangeEvent(this, CompareEditorInput.DIRTY_STATE, false, state);
		if (listenerList == null || listenerList.isEmpty())
			return;

		Runnable runnable = new Runnable() {
			public void run() {
				for (Object listener : listenerList.getListeners()) {
					final IPropertyChangeListener propertyChangeListener = (IPropertyChangeListener) listener;
					SafeRunner.run(new ISafeRunnable() {
						public void run() throws Exception {
							propertyChangeListener.propertyChange(event);
						}
						public void handleException(Throwable exception) {
						}
					});
				}
			}
		};

		UISynchronize uiSynchronize = getContext().get(UISynchronize.class);
		if (uiSynchronize != null)
			uiSynchronize.syncExec(runnable);
		else
			runnable.run();
	}

	public boolean isDirty() {
		return dirty;
	}
	public void setDirty(boolean dirty) {
		this.dirty = dirty;
		fireDirtyState(dirty);
	}

	@Override
	public Control getControl() {
		return viewer.getControl();
	}

	@Override
	public ISelection getSelection() {
		return viewer.getSelection();
	}

	@Override
	public void refresh() {
		refresh(getInput());
	}

	public IMergeViewerContentProvider getContentProvider() {
		return (IMergeViewerContentProvider) super.getContentProvider();
	}

	@Override
	public void setSelection(ISelection selection, boolean reveal) {
		viewer.setSelection(selection);
		if (reveal && !selection.isEmpty()) {
			Object firstSelectedElement = ((IStructuredSelection) selection).iterator().next();
			if (firstSelectedElement instanceof EditPart)
				viewer.reveal((EditPart) firstSelectedElement);
		}
	}

	@Override
	public void flushLeft(IProgressMonitor monitor) {
		flush(monitor);
	}

	@Override
	public void flushRight(IProgressMonitor monitor) {
		flush(monitor);
	}

	@Override
	public void flush(IProgressMonitor monitor) {
		if (isDirty()) {
			if (getCompareConfiguration().isRightEditable())
				getContentProvider().saveRightContent(getInput(), getContents(InputType.RIGHT));

			if (getCompareConfiguration().isLeftEditable())
				getContentProvider().saveLeftContent(getInput(), getContents(InputType.LEFT));

			setDirty(false);
		}
	}

	public void addPropertyChangeListener(IPropertyChangeListener listener) {
		this.listenerList.add(listener);
	}
	public void removePropertyChangeListener(IPropertyChangeListener listener) {
		this.listenerList.remove(listener);
	}

	public static final class CompareConfigurationPropertyListener implements IPropertyChangeListener {
		public void propertyChange(PropertyChangeEvent event) {
			String key= event.getProperty();

			if (key.equals(ICompareUIConstants.PROP_ANCESTOR_VISIBLE)) {
				//TODO 
				return;
			}

			if (key.equals(ICompareUIConstants.PROP_IGNORE_ANCESTOR)) {
				//TODO
				return;
			}
		}
	}
	public enum InputType {
		ANCESTOR, LEFT, RIGHT
	}
	public class ResourceChangeListener implements IResourceChangeListener {
		protected IResource leftResource;
		protected IResource rightResource;

		public ResourceChangeListener(IResource leftResource, IResource rightResource) {
			this.leftResource = leftResource;
			this.rightResource = rightResource;
		}

		public void resourceChanged(IResourceChangeEvent event) {
			IResourceDelta delta = event.getDelta();
			if (delta == null)
				return;
			
			if (isDirty()) {
				if (leftResource != null && delta.findMember(leftResource.getFullPath()) != null)
					reloader.schedule(leftResource);
				if (rightResource != null && delta.findMember(rightResource.getFullPath()) != null)
					reloader.schedule(rightResource);
			} else {
				if ((leftResource != null && delta.findMember(leftResource.getFullPath()) != null) ||
					(rightResource != null && delta.findMember(rightResource.getFullPath()) != null))
						refresh();
			}
		}
	}
}