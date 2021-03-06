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
package org.whole.lang.workflows.ui.editparts;

import java.beans.PropertyChangeEvent;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.ActionEvent;
import org.eclipse.draw2d.ActionListener;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Toggle;
import org.whole.lang.model.IEntity;
import org.whole.lang.ui.commands.ModelTransactionCommand;
import org.whole.lang.ui.editparts.AbstractContentPanePart;
import org.whole.lang.ui.notations.flowchart.figures.SwitchControlFigure;
import org.whole.lang.workflows.factories.WorkflowsEntityFactory;
import org.whole.lang.workflows.model.SwitchControl;
import org.whole.lang.workflows.model.SwitchType;
import org.whole.lang.workflows.model.SwitchTypeEnum;
import org.whole.lang.workflows.reflect.WorkflowsFeatureDescriptorEnum;

/**
 * @author Riccardo Solmi
 */
public class SwitchControlPart extends AbstractContentPanePart {
	protected IFigure createFigure() {
		return new SwitchControlFigure(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				SwitchControl entity = getModelEntity();
				ModelTransactionCommand command = new ModelTransactionCommand(entity);
				try {
					command.begin();
					entity.setSwitchType(WorkflowsEntityFactory.instance.createSwitchType(((Toggle) event.getSource()).isSelected() ?
							SwitchTypeEnum.inclusive : SwitchTypeEnum.exclusive));
					command.commit();
					getViewer().getEditDomain().getCommandStack().execute(command);
				} catch (Exception e) {
					command.rollback();
				}
			}
		});
	}

	@Override
	public SwitchControlFigure getFigure() {
		return (SwitchControlFigure) super.getFigure();
	}

	protected void propertyChangeUI(PropertyChangeEvent evt) {
		if (evt.getPropertyName().equals(WorkflowsFeatureDescriptorEnum.switchType.getName()))
			refreshVisuals();
		else
			super.propertyChangeUI(evt);
	}
	protected void refreshVisuals() {
		SwitchControl entity = getModelEntity();
		SwitchType type = entity.getSwitchType();
		getFigure().setSwitchType(type.wContainsValue(SwitchTypeEnum.inclusive));
	}

	protected List<IEntity> getModelSpecificChildren() {
		SwitchControl entity = getModelEntity();
		List<IEntity> children = new ArrayList<IEntity>(3);
		children.add(entity.getLabel());
		children.add(entity.getConditionalCases());
		children.add(entity.getDefaultCase());
		return children;
	}
}
