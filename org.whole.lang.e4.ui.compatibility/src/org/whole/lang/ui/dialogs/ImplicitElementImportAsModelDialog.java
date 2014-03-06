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
package org.whole.lang.ui.dialogs;

import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.SelectionStatusDialog;
import org.whole.lang.codebase.IPersistenceKit;
import org.whole.lang.commons.reflect.CommonsEntityDescriptorEnum;
import org.whole.lang.reflect.EntityDescriptor;
import org.whole.lang.reflect.ReflectionFactory;

/**
 * @author Enrico Persiani
 */
public class ImplicitElementImportAsModelDialog extends SelectionStatusDialog implements IImportAsModelDialog {
	protected IPersistenceKit persistenceKit;
	protected EntityDescriptor<?> stage;
	protected boolean enableForceAdding;
	protected boolean forceAdding;

	public ImplicitElementImportAsModelDialog(Shell parent, String title, boolean enableForceAdding) {
		super(parent);
		setTitle(title);
		this.enableForceAdding = enableForceAdding; 
		this.persistenceKit = ReflectionFactory.getDefaultPersistenceKit();
		this.stage = CommonsEntityDescriptorEnum.SameStageFragment;
		this.forceAdding = false;
	}
	
	@Override
	protected void computeResult() {
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		Composite composite = (Composite) super.createDialogArea(parent);
		Composite group = new Composite(composite, SWT.NONE);
		group.setLayout(new GridLayout());
		group.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		GridLayout gridLayout = new GridLayout();
		gridLayout.numColumns = 2;
		gridLayout.marginWidth = 10;
		group.setLayout(gridLayout);

		addControls(group);

		return composite;
	}

	protected void addControls(Composite group) {
		ImportAsModelDialogFactory.addPersistenceCombo(this, group, "Paste As:");
		ImportAsModelDialogFactory.addStageCombo(this, group, "Stage:");
		if (enableForceAdding)
			ImportAsModelDialogFactory.addForceAdditionButton(this, group, "Force addition");
	}

	@Override
	protected Control createButtonBar(Composite parent) {
		Control buttonBar = super.createButtonBar(parent);
		getOkButton().setFocus();
		return buttonBar;
	}

	public IPersistenceKit getPersistenceKit() {
		return persistenceKit;
	}
	public void setPersistenceKit(IPersistenceKit persistenceKit) {
		this.persistenceKit = persistenceKit;
	}

	public EntityDescriptor<?> getStage() {
		return stage;
	}
	public void setStage(EntityDescriptor<?> stage) {
		this.stage = stage;
	}

	public boolean isForceAdding() {
		return forceAdding;
	}
	public void setForceAdding(boolean forceAdding) {
		this.forceAdding = forceAdding;
	}

	public Object[] getSelection() {
		throw new IllegalStateException("cannot get selection");
	}
	public void setSelection(Object[] selection) {
		throw new IllegalStateException("cannot set selection");
	}

	public boolean show() {
		boolean value = super.open() == Window.OK;
		if (value)
			ImportAsModelDialogFactory.instance().setDefaults(persistenceKit, stage);				
		return value;
	}
	public void validate() {
	}
}
