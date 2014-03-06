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
package org.whole.lang.features.ui.editparts;

import java.beans.PropertyChangeEvent;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Toggle;
import org.eclipse.gef.EditPart;
import org.whole.lang.events.IChangeEventHandler;
import org.whole.lang.events.IdentityDefaultChangeEventHandler;
import org.whole.lang.features.ui.figures.FeatureFigure;
import org.whole.lang.features.ui.layouts.FeatureTreeDownLayout;
import org.whole.lang.frames.model.Feature;
import org.whole.lang.model.IEntity;
import org.whole.lang.reflect.FeatureDescriptor;
import org.whole.lang.ui.editparts.AbstractContentPanePart;

/**
 * @author Riccardo Solmi
 */
public class FeatureDownPart extends AbstractContentPanePart {
	protected IFigure createFigure() {
		return new FeatureFigure(new FeatureTreeDownLayout());
	}


	protected IChangeEventHandler childObserver;
	
//	private EditPartListener childListener;
	@Override
	protected void addChildVisual(EditPart childEditPart, int index) {
		super.addChildVisual(childEditPart, index);

		if (childObserver == null) {
			//TODO implement all methods
			childObserver = new IdentityDefaultChangeEventHandler() {
				private static final long serialVersionUID = 1L;
			    public void notifyChanged(IEntity source, FeatureDescriptor featureDesc, Object oldValue, Object newValue) {
			    	getViewer().getControl().getDisplay().asyncExec(new Runnable() {
						public void run() {
					    	refreshVisuals();
						}
					});
			    }
			};
		}
		((IEntity) childEditPart.getModel()).wAddChangeEventHandler(childObserver);
		
//		childEditPart.addEditPartListener(childListener = new EditPartListener.Stub() {
//			public void childAdded(EditPart child, int index) {
//				refreshVisuals();
//			}
//		});
	}
	@Override
	protected void removeChildVisual(EditPart childEditPart) {
		((IEntity) childEditPart.getModel()).wRemoveChangeEventHandler(childObserver);

//		childEditPart.removeEditPartListener(childListener);
		super.removeChildVisual(childEditPart);
	}

	protected List<IEntity> getModelSpecificChildren() {
		Feature entity = getModelEntity();
		List<IEntity> list = new ArrayList<IEntity>(2);
		list.add(entity.getName());
		list.add(entity.getFeatures());
		return list;
	}

	@Override
	protected void propertyChangeUI(PropertyChangeEvent evt) {
		if (evt.getPropertyName().equals("features"))
			refreshVisuals();
		super.propertyChangeUI(evt);
	}

	@Override
	protected void refreshVisuals() {
		Feature entity = getModelEntity();
		FeatureFigure f = (FeatureFigure) getFigure();
		
		Toggle toggle = f.getFoldingToggle(0);
		if (entity.getFeatures().wIsEmpty() && !toggle.isSelected())
			toggle.doClick();
	}
}
