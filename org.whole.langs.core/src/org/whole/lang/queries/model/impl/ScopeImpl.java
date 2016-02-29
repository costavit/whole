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
package org.whole.lang.queries.model.impl;

import org.whole.lang.model.AbstractSimpleEntity;
import org.whole.lang.queries.model.Scope;
import org.whole.lang.reflect.EntityDescriptor;
import org.whole.lang.queries.reflect.QueriesEntityDescriptorEnum;
import org.whole.lang.queries.visitors.IQueriesVisitor;
import org.whole.lang.exceptions.WholeExceptionUtil;
import org.whole.lang.queries.model.Names;
import org.whole.lang.queries.reflect.QueriesFeatureDescriptorEnum;
import org.whole.lang.model.IEntity;
import org.whole.lang.queries.model.PathExpression;

/**
 *  @generator Whole
 */
public class ScopeImpl extends AbstractSimpleEntity implements Scope {
    private static final long serialVersionUID = 1;

    public EntityDescriptor<Scope> wGetEntityDescriptor() {
        return QueriesEntityDescriptorEnum.Scope;
    }

    public int wGetEntityOrd() {
        return QueriesEntityDescriptorEnum.Scope_ord;
    }

    public void accept(IQueriesVisitor visitor) {
        try {
            visitor.visit(this);
        } catch (Exception e) {
            throw org.whole.lang.exceptions.WholeExceptionUtil.asWholeException(e, this, visitor.getBindings());
        }
    }
    private Names localNames;

    public Names getLocalNames() {
        return notifyRequested(QueriesFeatureDescriptorEnum.localNames, localNames);
    }

    public void setLocalNames(Names localNames) {
        notifyChanged(QueriesFeatureDescriptorEnum.localNames, this.localNames, this.localNames = localNames);
    }
    private PathExpression expression;

    public PathExpression getExpression() {
        return notifyRequested(QueriesFeatureDescriptorEnum.expression, expression);
    }

    public void setExpression(PathExpression expression) {
        notifyChanged(QueriesFeatureDescriptorEnum.expression, this.expression, this.expression = expression);
    }

    public IEntity wGet(int index) {
        switch (index) {
            case 0 :
            return getLocalNames().wGetAdaptee(false);
            case 1 :
            return getExpression().wGetAdaptee(false);
            default :
            throw new IllegalArgumentException();
        }
    }

    public void wSet(int index, IEntity value) {
        switch (index) {
            case 0 :
            setLocalNames(value.wGetAdapter(QueriesEntityDescriptorEnum.Names));
            break;
            case 1 :
            setExpression(value.wGetAdapter(QueriesEntityDescriptorEnum.PathExpression));
            break;
            default :
            throw new IllegalArgumentException();
        }
    }

    public int wSize() {
        return 2;
    }
}
