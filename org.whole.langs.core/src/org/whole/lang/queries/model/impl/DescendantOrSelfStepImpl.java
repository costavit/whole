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
import org.whole.lang.queries.model.DescendantOrSelfStep;
import org.whole.lang.reflect.EntityDescriptor;
import org.whole.lang.queries.reflect.QueriesEntityDescriptorEnum;
import org.whole.lang.queries.visitors.IQueriesVisitor;
import org.whole.lang.exceptions.WholeExceptionUtil;

/**
 *  @generator Whole
 */
public class DescendantOrSelfStepImpl extends AbstractSimpleEntity implements DescendantOrSelfStep {
    private static final long serialVersionUID = 1;

    public EntityDescriptor<DescendantOrSelfStep> wGetEntityDescriptor() {
        return QueriesEntityDescriptorEnum.DescendantOrSelfStep;
    }

    public int wGetEntityOrd() {
        return QueriesEntityDescriptorEnum.DescendantOrSelfStep_ord;
    }

    public void accept(IQueriesVisitor visitor) {
        try {
            visitor.visit(this);
        } catch (Exception e) {
            throw org.whole.lang.exceptions.WholeExceptionUtil.asWholeException(e, this, visitor.getBindings());
        }
    }
}
