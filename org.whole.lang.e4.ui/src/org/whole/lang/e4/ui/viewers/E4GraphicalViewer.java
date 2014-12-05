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
package org.whole.lang.e4.ui.viewers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.draw2d.ExclusionSearch;
import org.eclipse.draw2d.FigureCanvas;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LightweightSystem;
import org.eclipse.draw2d.TreeSearch;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.e4.core.contexts.EclipseContextFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.gef.LightweightEditDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.CommandStack;
import org.eclipse.gef.editparts.ZoomManager;
import org.eclipse.gef.ui.parts.ScrollingGraphicalViewer;
import org.eclipse.jface.resource.ResourceManager;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.whole.lang.bindings.BindingManagerFactory;
import org.whole.lang.bindings.IBindingManager;
import org.whole.lang.commons.model.RootFragment;
import org.whole.lang.commons.model.impl.LazyContainmentRootFragmentImpl;
import org.whole.lang.e4.ui.draw2d.DelayableUpdateManager;
import org.whole.lang.e4.ui.editparts.IScalableRootEditPart;
import org.whole.lang.e4.ui.editparts.RootEditPart;
import org.whole.lang.e4.ui.handler.CopyHandler;
import org.whole.lang.e4.ui.handler.CutHandler;
import org.whole.lang.e4.ui.handler.PasteHandler;
import org.whole.lang.e4.ui.handler.SelectAllHandler;
import org.whole.lang.e4.ui.util.E4Utils;
import org.whole.lang.model.ICompoundModel;
import org.whole.lang.model.IEntity;
import org.whole.lang.reflect.FeatureDescriptorEnum;
import org.whole.lang.reflect.ILanguageKit;
import org.whole.lang.reflect.ReflectionFactory;
import org.whole.lang.status.codebase.ErrorStatusTemplate;
import org.whole.lang.ui.dialogs.IImportAsModelDialogFactory;
import org.whole.lang.ui.dnd.EditPartTransferDragSourceListener;
import org.whole.lang.ui.dnd.EditPartTransferDropTargetListener;
import org.whole.lang.ui.dnd.FileTransferDropTargetListener;
import org.whole.lang.ui.dnd.TextTransferDragSourceListener;
import org.whole.lang.ui.dnd.TextTransferDropTargetListener;
import org.whole.lang.ui.dnd.XmlBuilderFileTransferDragSourceListener;
import org.whole.lang.ui.editparts.EntityPartListener;
import org.whole.lang.ui.editparts.IEntityPart;
import org.whole.lang.ui.editparts.IGraphicalEntityPart;
import org.whole.lang.ui.editparts.IPartFocusListener;
import org.whole.lang.ui.editparts.ModelObserver;
import org.whole.lang.ui.editparts.WholeEditPartFactory;
import org.whole.lang.ui.figures.IEntityFigure;
import org.whole.lang.ui.input.IModelInput;
import org.whole.lang.ui.input.IModelInputListener;
import org.whole.lang.ui.keys.AbstractKeyHandler;
import org.whole.lang.ui.resources.ColorRegistry;
import org.whole.lang.ui.resources.FontRegistry;
import org.whole.lang.ui.resources.IColorRegistry;
import org.whole.lang.ui.resources.IFontRegistry;
import org.whole.lang.ui.resources.IResourceManager;
import org.whole.lang.ui.tools.Tools;
import org.whole.lang.ui.treesearch.DelegatingInteractiveTreeSearch;
import org.whole.lang.ui.treesearch.ITreeSearch;
import org.whole.lang.ui.treesearch.NonInteractiveConditional;
import org.whole.lang.ui.viewers.EntityEditDomain;
import org.whole.lang.ui.viewers.IEntityPartViewer;
import org.whole.lang.ui.viewers.ZoomGestureListener;
import org.whole.langs.core.CoreMetaModelsDeployer;

/**
 * @author Enrico Persiani
 */
public class E4GraphicalViewer extends ScrollingGraphicalViewer implements IResourceManager, IEntityPartViewer {
	@Inject IEclipseContext context;
	@Inject @Named("parent") Composite parent;
	@Inject @Optional EntityEditDomain domain;
	@Inject IImportAsModelDialogFactory factory;

	private ModelObserver modelObserver;
	private List<IPartFocusListener> partFocusListeners;
	private List<IModelInputListener> modelInputListeners;
	private Set<String> referencedResources;

	@PostConstruct
	protected void initialize() {
		if (domain == null)
			domain = new EntityEditDomain();

		partFocusListeners = new ArrayList<IPartFocusListener>();
		modelInputListeners = new ArrayList<IModelInputListener>();
		referencedResources = new HashSet<String>();

		createControl2(parent);
		domain.addViewer(this);

		setEditPartFactory(new WholeEditPartFactory());
		setRootEditPart(createRootEditPart());

		configureViewer(domain);
	}

	protected void configureViewer(EntityEditDomain domain) {
		addDragSourceListener(new EditPartTransferDragSourceListener(this));
		addDropTargetListener(new EditPartTransferDropTargetListener(this));

		addDragSourceListener(new XmlBuilderFileTransferDragSourceListener(this));
		addDropTargetListener(new FileTransferDropTargetListener(this, factory));

		addDragSourceListener(new TextTransferDragSourceListener(this));
		addDropTargetListener(new TextTransferDropTargetListener(this, factory));

		getControl().addGestureListener(new ZoomGestureListener(getScalableRootEditPart().getZoomManager()));

		Tools.PANNING.ensureActive(domain);
	}

	protected RootEditPart createRootEditPart() {
		RootEditPart rootEditPart = new RootEditPart();

		List<String> levels = new ArrayList<String>(3);
		levels.add(ZoomManager.FIT_ALL);
		levels.add(ZoomManager.FIT_WIDTH);
		levels.add(ZoomManager.FIT_HEIGHT);
		ZoomManager zoomManager = rootEditPart.getZoomManager();
		zoomManager.setZoomLevelContributions(levels);
		zoomManager.setZoomAnimationStyle(ZoomManager.ANIMATE_ZOOM_IN_OUT);
		return rootEditPart;
	}

	public IScalableRootEditPart getScalableRootEditPart() {
		return (IScalableRootEditPart) super.getRootEditPart();
	}

	// Begin Block Shared With E4TreeViewer
	public IEclipseContext getContext() {
		return context;
	}
	
	public IBindingManager getContextBindings() {
		Object selection = getContext().get(ESelectionService.class).getSelection();
		if (selection instanceof IBindingManager)
			return (IBindingManager) selection;
		else {
			IBindingManager bm = BindingManagerFactory.instance.createBindingManager();
			E4Utils.defineResourceBindings(bm, modelInput);
			return bm;
		}
	}

	public Set<String> getReferencedResources() {
		return referencedResources;
	}
	protected boolean executable = true;
	public boolean isOperationExecutable() {
		return executable;
	}
	public void setOperationExecutable(boolean executable) {
		this.executable = executable;
	}

	public CommandStack getCommandStack() {
		return getEditDomain().getCommandStack();
	}
	public boolean isDirty() {
		return getCommandStack().isDirty();
	}

	public LightweightEditDomain linkEditDomain(IEntityPartViewer viewer) {
		LightweightEditDomain editDomain = viewer.getEditDomain();
		setEditDomain(editDomain);
		return editDomain;
	}

	public IEntity getEntityContents() {
		RootFragment modelEntity = ((IEntityPart) getContents()).getModelEntity();
		return modelEntity.getRootEntity().wGetAdaptee(false);
	}
	public void setEntityContents(IEntity entity) {
		setContents(entity);
		flush();
		ReflectionFactory.getHistoryManager(entity).setHistoryEnabled(true);
		getCommandStack().flush();
	}

	protected IModelInput modelInput = null;
	public void setContents(IModelInput modelInput, IEntity defaultContents) {
		if (modelInput != null) {
			IModelInput oldModelInput = this.modelInput;
			this.modelInput = modelInput;
			try {
				setEntityContents(this.modelInput.readModel());
				fireModelInputChanged(oldModelInput, this.modelInput);
			} catch (Exception e) {
				ILanguageKit languageKit = ReflectionFactory.getLanguageKit(CoreMetaModelsDeployer.STATUS_URI, false, null);
				FeatureDescriptorEnum fdEnum = languageKit.getFeatureDescriptorEnum();
				IEntity statusModel = new ErrorStatusTemplate().create();
				String errorMessage = String.format("Unable to open \"%s\" using \"%s\" persistence kit",
						modelInput.getFile().getName(), modelInput.getPersistenceKit().getDescription());
				statusModel.wGet(fdEnum.valueOf("error")).wSetValue(errorMessage);
				statusModel.wGet(fdEnum.valueOf("cause")).wSetValue(e.getLocalizedMessage());
				setEntityContents(statusModel);
			}
		} else
			setEntityContents(defaultContents);
	}
	public void reloadContents() {
		setContents(modelInput, null);
	}

	protected RootFragment wrapContents(IEntity entity) {
		return entity instanceof RootFragment ? (RootFragment) entity :
			new LazyContainmentRootFragmentImpl(entity);
	}
	public void setContents(Object contents) {
		IEntity root = (IEntity) contents;
		super.setContents(wrapContents(root));
		updateModelObserver(root);
	}
	public boolean hasContents() {
		return !CoreMetaModelsDeployer.STATUS_URI.equals(getEntityContents().wGetLanguageKit().getURI());
	}

	@SuppressWarnings("unchecked")
	public Map<IEntity, IEntityPart> getEditPartRegistry() {
		return super.getEditPartRegistry();
	}
	public IEntityPart getFocusEntityPart() {
		return (IEntityPart) getFocusEditPart();
	}

	public AbstractKeyHandler getKeyHandler() {
		return (AbstractKeyHandler) super.getKeyHandler();
	}
	public void setKeyHandler(AbstractKeyHandler handler) {
		super.setKeyHandler(handler);
	}

	public void select(IEntity entity) {
		IEntityPart entityPart = getEditPartRegistry().get(entity);
		if (entityPart != null)
			select(entityPart);
	}
	public void reveal(IEntity entity) {
		IEntityPart entityPart = getEditPartRegistry().get(entity);
		reveal(entityPart);
	}
	public void selectAndReveal(IEntity entity) {
		IEntityPart entityPart = getEditPartRegistry().get(entity);

		if (entityPart != null) {
			reveal(entityPart);
			select(entityPart);
		}
	}

	protected void updateModelObserver(IEntity entity) {
		ICompoundModel model = entity.wGetModel().getCompoundModel();
		if (modelObserver != null && modelObserver.getModel() != model) {
			modelObserver.dispose();
			modelObserver = null;
		}
		if (modelObserver == null)
			modelObserver = new ModelObserver(model, (Map<IEntity, IEntityPart>) getEditPartRegistry());		
	}
	public void addEntityPartListener(EntityPartListener listener) {
		modelObserver.addEntityPartListener(listener);
	}
	public void removeEntityPartListener(EntityPartListener listener) {
		modelObserver.removeEntityPartListener(listener);
	}

	public void dispose() {
		if (modelObserver != null)
			modelObserver.dispose();
	}

	protected void firePartFocusChanged(IEntityPart oldPart, IEntityPart newPart) {
		for (IPartFocusListener listener : partFocusListeners)
			listener.focusChanged(oldPart, newPart);
	}
	public void addPartFocusListener(IPartFocusListener listener) {
		partFocusListeners.add(listener);
	}
	public void removePartFocusListener(IPartFocusListener listener) {
		partFocusListeners.remove(listener);
	}

	protected void fireModelInputChanged(IModelInput oldModelInput, IModelInput newModelInput) {
		for (IModelInputListener listener : modelInputListeners)
			listener.modelInputChanged(oldModelInput, newModelInput);
	}
	public void addModelInputListener(IModelInputListener listener) {
		modelInputListeners.add(listener);
	}
	public void removeModelInputListener(IModelInputListener listener) {
		modelInputListeners.remove(listener);
	}
	public void rebuildNotation() {
		setContents(getContents().getModel());
	}

	public void rebuildNotation(IEntity entity) {
		IEntityPart entityPart = getEditPartRegistry().get(entity);
		entityPart.rebuild();
	}

	// End Block Shared With E4TreeViewer

	public void refreshNotation(IEntity entity) {
		refreshNotation(((IGraphicalEntityPart) getEditPartRegistry().get(entity)).getFigure());
	}
	public void refreshNotation() {
		if (getFigureCanvas() != null)
			refreshNotation(getFigureCanvas().getViewport());
	}
	protected void refreshNotation(IFigure figure) {
		figure.invalidateTree();
		figure.revalidate();
		getFigureCanvas().redraw();
	}

	@SuppressWarnings("unchecked")
	public class E4FigureCanvas extends FigureCanvas {
		public E4FigureCanvas(Composite parent, LightweightSystem lws) {
			super(parent, lws);
		}
		public void cut() {
			IBindingManager bm = E4Utils.createSelectionBindings(getSelectedEditParts(), E4GraphicalViewer.this, EclipseContextFactory.create());
			CutHandler handler = new CutHandler();
			if (handler.canExecute(bm))
				handler.execute(bm);
		}
		public void copy() {
			IBindingManager bm = E4Utils.createSelectionBindings(getSelectedEditParts(), E4GraphicalViewer.this, EclipseContextFactory.create());
			CopyHandler handler = new CopyHandler();
			if (handler.canExecute(bm))
				handler.execute(bm);
		}
		public void paste() {
			IBindingManager bm = E4Utils.createSelectionBindings(getSelectedEditParts(), E4GraphicalViewer.this, EclipseContextFactory.create());
			PasteHandler handler = new PasteHandler();
			if (handler.canExecute(bm))
				handler.execute(bm);
		}
		public void selectAll() {
			IBindingManager bm = E4Utils.createSelectionBindings(getSelectedEditParts(), E4GraphicalViewer.this, EclipseContextFactory.create());
			SelectAllHandler handler = new SelectAllHandler();
			if (handler.canExecute(bm))
				handler.execute(bm);
		}
	}

	public Control createControl2(Composite parent) {
		setControl(new E4FigureCanvas(parent, getLightweightSystem()));
		hookRootFigure();
		return getControl();
	}

	public void setInteractive(IEntity entity, boolean edit, boolean browse, boolean inherited) {
		Map<?, ?> mapping = getEditPartRegistry();
		IGraphicalEntityPart entityPart = (IGraphicalEntityPart) mapping.get(entity);
		if (entityPart != null) {
			IEntityFigure entityFigure = (IEntityFigure) entityPart.getFigure();
			entityFigure.setInteractiveEdit(edit);
			entityFigure.setInteractiveBrowse(browse);
			entityFigure.setInteractiveInherited(inherited);
		}
	}

	@SuppressWarnings("rawtypes")
	@Override
	public EditPart findObjectAtExcluding(Point pt, Collection exclude, final Conditional condition) {
		class ConditionalTreeSearch extends ExclusionSearch implements ITreeSearch {
			ConditionalTreeSearch(Collection coll) {
				super(coll);
			}

			public boolean accept(IFigure figure) {
				EditPart editpart = null;
				while (editpart == null && figure != null) {
					editpart = (EditPart) getVisualPartMap().get(figure);
					figure = figure.getParent();
				}
				return editpart != null
						&& (condition == null || condition.evaluate(editpart));
			}
		}
		TreeSearch search = new ConditionalTreeSearch(exclude);
		IFigure figure = getLightweightSystem().getRootFigure().findFigureAt(pt.x, pt.y,
				condition instanceof NonInteractiveConditional ?
						search : new DelegatingInteractiveTreeSearch(search));
		EditPart part = null;
		while (part == null && figure != null) {
			part = (EditPart) getVisualPartMap().get(figure);
			figure = figure.getParent();
		}
		if (part == null)
			return getContents();
		return part;
	}

	private EditPart focusEditPart;
	@Override
	protected void handleFocusGained(FocusEvent fe) {
		if (focusEditPart != null)
			setFocus(focusEditPart);
		focusEditPart = null;
	}
	@Override
	protected void handleFocusLost(FocusEvent fe) {
		focusEditPart = getFocusEditPart();
		focusEditPart = focusEditPart.hasFocus() ? focusEditPart : null;
		setFocus(null);
	}
	@Override
	public void setFocus(EditPart part) {
		IEntityPart oldPart = getFocusEntityPart();
		super.setFocus(part);
		if (oldPart != part)
			firePartFocusChanged(oldPart, (IEntityPart) part);
	}

	@Override
	public EntityEditDomain getEditDomain() {
		return (EntityEditDomain) super.getEditDomain();
	}
	@Override
	protected LightweightSystem createLightweightSystem() {
		LightweightSystem lws = super.createLightweightSystem();
		lws.setUpdateManager(new DelayableUpdateManager(this));
		return lws;
	}

	//	private ResourceManager resourceManager;
	@Override
	public ResourceManager getResourceManager() {
		//		return resourceManager;
		return super.getResourceManager();
	}
	//	@Override
	//	protected void hookControl() {
	//		super.hookControl();
	//
	//		if (resourceManager == null)
	//			resourceManager = new LocalResourceManager(JFaceResources.getResources());
	//	}
	//	@Override
	//	protected void unhookControl() {
	//		super.unhookControl();
	//
	//		if (resourceManager != null)
	//			resourceManager.dispose();
	//	}

	@Override
	protected void handleDispose(DisposeEvent e) {
		colorRegistry = null;
		fontRegistry = null;
		super.handleDispose(e);
	}

	private IColorRegistry colorRegistry;
	public IColorRegistry getColorRegistry() {
		if (colorRegistry == null)
			colorRegistry = new ColorRegistry(getResourceManager());
		return colorRegistry;
	}
	private IFontRegistry fontRegistry;
	public IFontRegistry getFontRegistry() {
		if (fontRegistry == null)
			fontRegistry = new FontRegistry(getResourceManager());
		return fontRegistry;
	}
}
