/**
 * Copyright 2004-2016 Riccardo Solmi. All rights reserved.
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

import static org.whole.lang.e4.ui.actions.IUIConstants.*;

import java.net.URL;

import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.jface.resource.ImageDescriptor;
import org.whole.lang.e4.ui.parts.E4DebugGraphicalPart;

/**
 * @author Enrico Persiani
 */
public class BreakpointsDisableAction extends AbstractDebugAction {

	public BreakpointsDisableAction(IEclipseContext context, E4DebugGraphicalPart debugPart) {
		super(context, debugPart, DEBUG_RUN_LABEL);
		setChecked(false);
		try {
			setImageDescriptor(ImageDescriptor.createFromURL(new URL(DEBUG_BREAKPOINTS_DISABLED_URI)));
		} catch (Exception e) {
		}
	}
	
	@Override
	public void run() {
		debugPart.doBreakpointsDisable(isChecked());
	}

	@Override
	public void update() {
		setEnabled(true);
	}
}
