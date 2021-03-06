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
package org.whole.lang.queries.model.impl;

import org.whole.lang.model.AbstractSimpleEntity;
import org.whole.lang.queries.model.IndexTest;
import org.whole.lang.reflect.EntityDescriptor;
import org.whole.lang.queries.reflect.QueriesEntityDescriptorEnum;
import org.whole.lang.queries.visitors.IQueriesVisitor;
import org.whole.lang.exceptions.IWholeRuntimeException;
import org.whole.lang.queries.model.IntLiteral;
import org.whole.lang.queries.reflect.QueriesFeatureDescriptorEnum;
import org.whole.lang.model.IEntity;

/**
 *  @generator Whole
 */
public class IndexTestImpl extends AbstractSimpleEntity implements IndexTest {
    private static final long serialVersionUID = 1;

    public EntityDescriptor<IndexTest> wGetEntityDescriptor() {
        return QueriesEntityDescriptorEnum.IndexTest;
    }

    public int wGetEntityOrd() {
        return QueriesEntityDescriptorEnum.IndexTest_ord;
    }

    public void accept(IQueriesVisitor visitor) {
        try {
            visitor.visit(this);
        } catch (Exception e) {
            throw IWholeRuntimeException.asWholeException(e, this, visitor.getBindings());
        }
    }
    private IntLiteral index;

    public IntLiteral getIndex() {
        return notifyRequested(QueriesFeatureDescriptorEnum.index, index);
    }

    public void setIndex(IntLiteral index) {
        notifyChanged(QueriesFeatureDescriptorEnum.index, this.index, this.index = index);
    }

    public IEntity wGet(int index) {
        switch (index) {
            case 0 :
            return getIndex().wGetAdaptee(false);
            default :
            throw new IllegalArgumentException();
        }
    }

    public void wSet(int index, IEntity value) {
        switch (index) {
            case 0 :
            setIndex(value.wGetAdapter(QueriesEntityDescriptorEnum.IntLiteral));
            break;
            default :
            throw new IllegalArgumentException();
        }
    }

    public int wSize() {
        return 1;
    }
}
