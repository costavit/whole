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
package org.whole.lang.semantics.model.impl;

import org.whole.lang.model.AbstractSimpleEntity;
import org.whole.lang.semantics.model.AnyType;
import org.whole.lang.reflect.EntityDescriptor;
import org.whole.lang.semantics.reflect.SemanticsEntityDescriptorEnum;
import org.whole.lang.semantics.visitors.ISemanticsVisitor;
import org.whole.lang.exceptions.IWholeRuntimeException;

/**
 *  @generator Whole
 */
public class AnyTypeImpl extends AbstractSimpleEntity implements AnyType {
    private static final long serialVersionUID = 1;

    public EntityDescriptor<AnyType> wGetEntityDescriptor() {
        return SemanticsEntityDescriptorEnum.AnyType;
    }

    public int wGetEntityOrd() {
        return SemanticsEntityDescriptorEnum.AnyType_ord;
    }

    public void accept(ISemanticsVisitor visitor) {
        try {
            visitor.visit(this);
        } catch (Exception e) {
            throw IWholeRuntimeException.asWholeException(e, this, visitor.getBindings());
        }
    }
}
