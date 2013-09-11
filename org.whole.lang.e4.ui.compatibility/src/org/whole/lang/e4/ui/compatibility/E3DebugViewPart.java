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

import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.PartInitException;
import org.whole.lang.e4.ui.parts.E4DebugGraphicalPart;

/**
 * @author Enrico Persiani
 */
public class E3DebugViewPart extends E3ViewPart<E4DebugGraphicalPart> {
	protected IToolBarManager toolBarManager;

	public E3DebugViewPart() {
		super(DEBUG_PART_ID, E4DebugGraphicalPart.class);
	}

	@Override
	public void init(IViewSite site) throws PartInitException {
		super.init(site);
		IActionBars actionBars = site.getActionBars();
		this.toolBarManager = actionBars.getToolBarManager();
	}

	@Override
	public void createPartControl(Composite parent) {
		super.createPartControl(parent);

		toolBarManager.add(getComponent().getRunAction(getContext()));
		toolBarManager.add(getComponent().getResumeAction(getContext()));
		toolBarManager.add(getComponent().getTerminateAction(getContext()));
	}
}
