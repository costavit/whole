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
package org.whole.lang.e4.ui.actions;

import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.gef.Disposable;
import org.eclipse.gef.commands.CommandStackEvent;
import org.eclipse.gef.commands.CommandStackEventListener;
import org.eclipse.jface.action.Action;
import org.whole.lang.bindings.IBindingManager;
import org.whole.lang.e4.ui.viewers.E4GraphicalViewer;
import org.whole.lang.ui.actions.IActionRedirection;
import org.whole.lang.ui.actions.IUpdatableAction;
import org.whole.lang.ui.actions.NullActionRedirection;
import org.whole.lang.ui.editparts.IEntityPart;

/**
 * @author Enrico Persiani
 */
@SuppressWarnings("restriction")
public abstract class AbstractClipboardAction extends Action implements Disposable, IUpdatableAction {
	protected IEclipseContext context;
	protected E4GraphicalViewer viewer;
	protected CommandStackEventListener listener;
	protected String label;

	public AbstractClipboardAction(IEclipseContext context, String label) {
		this.context = context;
		this.viewer = context.get(E4GraphicalViewer.class);
		viewer.getCommandStack().addCommandStackEventListener(listener = new CommandStackEventListener() {
			public void stackChanged(CommandStackEvent event) {
				if (event.isPostChangeEvent())
					update();
			}
		});
		setText(this.label = label);
	}

	public void dispose() {
		if (viewer != null)
			viewer.getCommandStack().removeCommandStackEventListener(listener);
	}
	
	@Override
	public void run() {
		doRun(viewer);
	}

	public void update() {
		setEnabled(calculateEnabled(viewer));
		setText(calculateLabel(viewer));
	}

	protected IActionRedirection getActionRedirection() {
		Object selection = context.get(IServiceConstants.ACTIVE_SELECTION);
		if (!(selection instanceof IBindingManager))
			return NullActionRedirection.instance();

		IBindingManager bm = (IBindingManager) selection;
		if (!bm.wIsSet("primarySelectedEntity"))
			return NullActionRedirection.instance();

		E4GraphicalViewer viewer = (E4GraphicalViewer) ((IBindingManager) selection).wGetValue("viewer");
		IEntityPart entityPart = viewer.getEditPartRegistry().get(((IBindingManager) selection).wGet("primarySelectedEntity"));
		IActionRedirection actionRedirection = (IActionRedirection) entityPart.getAdapter(IActionRedirection.class);
		return actionRedirection != null ? actionRedirection : NullActionRedirection.instance();
	}

	protected abstract void doRun(E4GraphicalViewer viewer);
	protected abstract boolean calculateEnabled(E4GraphicalViewer viewer);
	protected abstract String calculateLabel(E4GraphicalViewer viewer);
}
