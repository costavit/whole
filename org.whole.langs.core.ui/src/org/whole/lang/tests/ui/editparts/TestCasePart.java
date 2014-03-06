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
package org.whole.lang.tests.ui.editparts;

import java.beans.PropertyChangeEvent;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.whole.lang.model.IEntity;
import org.whole.lang.tests.model.TestCase;
import org.whole.lang.tests.reflect.TestsFeatureDescriptorEnum;
import org.whole.lang.tests.ui.figures.TestCaseFigure;
import org.whole.lang.ui.editparts.AbstractContentPanePart;
import org.whole.lang.util.EntityUtils;

/**
 * @author Riccardo Solmi
 */
public class TestCasePart extends AbstractContentPanePart {
    protected IFigure createFigure() {
        return new TestCaseFigure();
    }
	@Override
	public TestCaseFigure getFigure() {
		return (TestCaseFigure) super.getFigure();
	}

	@Override
	protected void propertyChangeUI(PropertyChangeEvent evt) {
		if (evt.getPropertyName().equals("description") ||
				 evt.getPropertyName().equals("deployer") ||
				 evt.getPropertyName().equals("aspects"))
			refreshVisuals();
		super.propertyChangeUI(evt);
	}

	@Override
	protected void refreshVisuals() {
		IEntity entity = getModelEntity();
		getFigure().showDescription(EntityUtils.isNotResolver(entity.wGet(TestsFeatureDescriptorEnum.description)));
		getFigure().showDeployer(EntityUtils.isNotResolver(entity.wGet(TestsFeatureDescriptorEnum.deployer)));
		getFigure().showAspects(EntityUtils.isNotResolver(entity.wGet(TestsFeatureDescriptorEnum.aspects)));
	}

    protected List<IEntity> getModelSpecificChildren() {
        TestCase entity = getModelEntity();
        List<IEntity> list = new ArrayList<IEntity>(6);
        list.add(entity.getDescription());
        list.add(entity.getPackageName());
        list.add(entity.getName());
        list.add(entity.getDeployer());
        list.add(entity.getAspects());
        list.add(entity.getTests());
        return list;
    }
}
