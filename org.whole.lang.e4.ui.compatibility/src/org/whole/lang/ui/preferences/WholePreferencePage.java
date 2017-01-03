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
package org.whole.lang.ui.preferences;

import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.whole.lang.e4.ui.actions.IE4UIConstants;


public class WholePreferencePage
	extends FieldEditorPreferencePage
	implements IWorkbenchPreferencePage {

	public WholePreferencePage() {
		super(GRID);
		setPreferenceStore(new PreferenceStoreAdapter(IE4UIConstants.BUNDLE_ID));
		setDescription("Whole preference page");
		initializeDefaults();
	}

	private void initializeDefaults() {
	}
	
	public void createFieldEditors() {
	}
	
	public void init(IWorkbench workbench) {
	}
}
