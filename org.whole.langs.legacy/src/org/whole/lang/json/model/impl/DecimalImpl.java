/**
 *  Copyright 2004-2015 Riccardo Solmi. All rights reserved.
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
package org.whole.lang.json.model.impl;

import org.whole.lang.model.AbstractDataEntity;
import org.whole.lang.json.model.Decimal;
import org.whole.lang.json.visitors.IJSONVisitor;
import org.whole.lang.exceptions.WholeExceptionUtil;
import org.whole.lang.json.reflect.JSONEntityDescriptorEnum;
import org.whole.lang.reflect.EntityDescriptor;

/**
 *  @generator Whole
 */
public class DecimalImpl extends AbstractDataEntity implements Decimal {
    private static final long serialVersionUID = 1;
    private double value;

    public double getValue() {
        return notifyRequested(value);
    }

    public void setValue(double value) {
        notifyChanged(this.value, this.value = value);
    }

    public void accept(IJSONVisitor visitor) {
        try {
            visitor.visit(this);
        } catch (Exception e) {
            throw org.whole.lang.exceptions.WholeExceptionUtil.asWholeException(e, this, visitor.getBindings());
        }
    }

    public int wGetEntityOrd() {
        return JSONEntityDescriptorEnum.Decimal_ord;
    }

    public EntityDescriptor<Decimal> wGetEntityDescriptor() {
        return JSONEntityDescriptorEnum.Decimal;
    }

    public Object wGetValue() {
        return new Double(getValue());
    }

    public void wSetValue(Object value) {
        setValue(((Double) value).doubleValue());
    }

    public String wStringValue() {
        return toString();
    }

    public void wSetValue(String value) {
        try {
            setValue(Double.valueOf(value).doubleValue());
        } catch (NumberFormatException e) {
        }
    }

    public double wDoubleValue() {
        return getValue();
    }

    public void wSetValue(double value) {
        setValue(value);
    }
}
