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
package org.whole.examples.dialogs;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.widgets.Shell;
import org.whole.lang.bindings.IBindingManager;
import org.whole.lang.workflows.model.Assign;
import org.whole.lang.workflows.model.Assignments;
import org.whole.lang.workflows.ui.dialogs.ITaskDialogFactory;

/**
 * @author Enrico Persiani
 */
public class ChangeValueDialogFactory implements ITaskDialogFactory {
	private static class SingletonHolder {
		private static final ChangeValueDialogFactory instance = new ChangeValueDialogFactory();
	}
	public static ChangeValueDialogFactory instance() {
		return SingletonHolder.instance;
	}
	private ChangeValueDialogFactory() {
	}
	public Dialog createDialog(Shell shell, String title, String message, Assignments assignments, IBindingManager bindings) {
		return new ChangeValueDialog(shell, title, message, 
				((Assign) assignments.wGet(0)).getExpression());
	}
}
