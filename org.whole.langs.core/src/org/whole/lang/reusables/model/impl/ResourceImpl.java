/**
 *  Copyright 2004-2016 Riccardo Solmi. All rights reserved.
 *  This file is part of the Whole Platform.
 *  
 *  The Whole Platform is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU Lesser General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *  
 *  The Whole Platform is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 *  GNU Lesser General Public License for more details.
 *  
 *  You should have received a copy of the GNU Lesser General Public License
 *  along with the Whole Platform. If not, see <http://www.gnu.org/licenses/>.
 */
package org.whole.lang.reusables.model.impl;

import org.whole.lang.model.AbstractSimpleEntity;
import org.whole.lang.reusables.model.Resource;
import org.whole.lang.reflect.EntityDescriptor;
import org.whole.lang.reusables.reflect.ReusablesEntityDescriptorEnum;
import org.whole.lang.reusables.visitors.IReusablesVisitor;
import org.whole.lang.exceptions.IWholeRuntimeException;
import org.whole.lang.reusables.model.Locator;
import org.whole.lang.reusables.reflect.ReusablesFeatureDescriptorEnum;
import org.whole.lang.model.IEntity;
import org.whole.lang.reusables.model.Persistence;

/**
 *  @generator Whole
 */
public class ResourceImpl extends AbstractSimpleEntity implements Resource {
    private static final long serialVersionUID = 1;

    public EntityDescriptor<Resource> wGetEntityDescriptor() {
        return ReusablesEntityDescriptorEnum.Resource;
    }

    public int wGetEntityOrd() {
        return ReusablesEntityDescriptorEnum.Resource_ord;
    }

    public void accept(IReusablesVisitor visitor) {
        try {
            visitor.visit(this);
        } catch (Exception e) {
            throw IWholeRuntimeException.asWholeException(e, this, visitor.getBindings());
        }
    }
    private Locator locator;

    public Locator getLocator() {
        return notifyRequested(ReusablesFeatureDescriptorEnum.locator, locator);
    }

    public void setLocator(Locator locator) {
        notifyChanged(ReusablesFeatureDescriptorEnum.locator, this.locator, this.locator = locator);
    }
    private Persistence persistence;

    public Persistence getPersistence() {
        return notifyRequested(ReusablesFeatureDescriptorEnum.persistence, persistence);
    }

    public void setPersistence(Persistence persistence) {
        notifyChanged(ReusablesFeatureDescriptorEnum.persistence, this.persistence, this.persistence = persistence);
    }

    public IEntity wGet(int index) {
        switch (index) {
            case 0 :
            return getLocator().wGetAdaptee(false);
            case 1 :
            return getPersistence().wGetAdaptee(false);
            default :
            throw new IllegalArgumentException();
        }
    }

    public void wSet(int index, IEntity value) {
        switch (index) {
            case 0 :
            setLocator(value.wGetAdapter(ReusablesEntityDescriptorEnum.Locator));
            break;
            case 1 :
            setPersistence(value.wGetAdapter(ReusablesEntityDescriptorEnum.Persistence));
            break;
            default :
            throw new IllegalArgumentException();
        }
    }

    public int wSize() {
        return 2;
    }
}
