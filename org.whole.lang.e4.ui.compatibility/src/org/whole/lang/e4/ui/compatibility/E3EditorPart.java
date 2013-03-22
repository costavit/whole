/**
 * Copyright 2004-2013 Riccardo Solmi. All rights reserved.
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

import static org.whole.lang.e4.ui.api.IUIConstants.*;

import java.lang.reflect.Field;
import java.util.EventObject;

import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.e4.tools.compat.parts.DIEditorPart;
import org.eclipse.gef.GraphicalViewer;
import org.eclipse.gef.commands.CommandStackListener;
import org.eclipse.gef.editparts.ZoomManager;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.IPersistableEditor;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.ide.IGotoMarker;
import org.whole.lang.e4.ui.actions.RedoAction;
import org.whole.lang.e4.ui.actions.UndoAction;
import org.whole.lang.e4.ui.parts.E4Part;
import org.whole.lang.model.IEntity;
import org.whole.lang.util.EntityUtils;

/**
 * @author Enrico Persiani
 */
public class E3EditorPart extends DIEditorPart<E4Part> implements IPersistableEditor, IGotoMarker {
	protected CommandStackListener listener;
	protected UndoAction undoAction;
	protected RedoAction redoAction;

	public E3EditorPart() {
		super(E4Part.class, CUT | COPY | PASTE);
	}

	@Override
	public void createPartControl(Composite parent) {
		super.createPartControl(parent);

		setPartName(getEditorInput().getName());

		getComponent().getViewer().getCommandStack().addCommandStackListener(listener = new CommandStackListener() {
			public void commandStackChanged(EventObject event) {
				setDirtyState(getComponent().getViewer().isDirty());
			}
		});

		IActionBars actionBars = getEditorSite().getActionBars();
		undoAction = new UndoAction(getContext(), UNDO_LABEL);
		undoAction.update();
		actionBars.setGlobalActionHandler(ActionFactory.UNDO.getId(), undoAction);

		redoAction = new RedoAction(getContext(), REDO_LABEL);
		redoAction.update();
		actionBars.setGlobalActionHandler(ActionFactory.REDO.getId(), redoAction);
	}

	//FIXME remove when implemented in DIEditorPart
	private IEclipseContext getContext() {
		try {
			Field contextField = DIEditorPart.class.getDeclaredField("context");
			contextField.setAccessible(true);
			return ((IEclipseContext) contextField.get(this)).getParent();
		} catch (Exception e) {
			throw new UnsupportedOperationException(e);
		}
	}

	public void gotoMarker(IMarker marker) {
		try {
			//FIXME MarkerUtils.MARKER_TYPE
			if (!marker.isSubtypeOf("org.whole.lang.ui.wholemarker"))
				return;
		} catch (CoreException e) {
			return;
		}
		String locationPath = marker.getAttribute("uri", "/");
		IEntity entity = EntityUtils.getEntity(getComponent().getViewer().getEntityContents(), locationPath);
		if (entity != null)
			getComponent().getViewer().selectAndReveal(entity);
	}

	@SuppressWarnings("rawtypes")
	@Override
	public Object getAdapter(Class adapter) {
		if (adapter == GraphicalViewer.class)
			return getComponent().getViewer();
		else if (adapter == ZoomManager.class)
			return getComponent().getViewer().getProperty(ZoomManager.class.toString());
		else
			return super.getAdapter(adapter);
	}

	@Override
	public void dispose() {
		if (listener != null)
			getComponent().getViewer().getCommandStack().removeCommandStackListener(listener);
		if (undoAction != null)
			undoAction.dispose();
		if (redoAction != null)
			redoAction.dispose();
		super.dispose();
	}

	@Override
	public void saveState(IMemento memento) {
		getComponent().saveState();
	}

	@Override
	public void restoreState(IMemento memento) {
	}
}