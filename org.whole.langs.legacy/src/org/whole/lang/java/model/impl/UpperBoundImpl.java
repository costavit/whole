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
package org.whole.lang.java.model.impl;

import org.whole.lang.model.AbstractDataEntity;
import org.whole.lang.java.model.UpperBound;
import org.whole.lang.java.visitors.IJavaVisitor;
import org.whole.lang.exceptions.IWholeRuntimeException;
import org.whole.lang.java.reflect.JavaEntityDescriptorEnum;
import org.whole.lang.reflect.EntityDescriptor;

/**
 *  @generator Whole
 */
public class UpperBoundImpl extends AbstractDataEntity implements UpperBound {
    private static final long serialVersionUID = 1;
    private boolean value;

    public boolean isValue() {
        return notifyRequested(value);
    }

    public void setValue(boolean value) {
        notifyChanged(this.value, this.value = value);
    }

    public void accept(IJavaVisitor visitor) {
        try {
            visitor.visit(this);
        } catch (Exception e) {
            throw IWholeRuntimeException.asWholeException(e, this, visitor.getBindings());
        }
    }

    public int wGetEntityOrd() {
        return JavaEntityDescriptorEnum.UpperBound_ord;
    }

    public EntityDescriptor<UpperBound> wGetEntityDescriptor() {
        return JavaEntityDescriptorEnum.UpperBound;
    }

    public Object wGetValue() {
        return new Boolean(isValue());
    }

    public void wSetValue(Object value) {
        setValue(((Boolean) value).booleanValue());
    }

    public String wStringValue() {
        return toString();
    }

    public void wSetValue(String value) {
        try {
            setValue(Boolean.valueOf(value).booleanValue());
        } catch (NumberFormatException e) {
        }
    }

    public boolean wBooleanValue() {
        return isValue();
    }

    public void wSetValue(boolean value) {
        setValue(value);
    }
}
