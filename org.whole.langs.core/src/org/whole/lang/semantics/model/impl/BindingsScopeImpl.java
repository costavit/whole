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
import org.whole.lang.semantics.model.BindingsScope;
import org.whole.lang.reflect.EntityDescriptor;
import org.whole.lang.semantics.reflect.SemanticsEntityDescriptorEnum;
import org.whole.lang.semantics.visitors.ISemanticsVisitor;
import org.whole.lang.exceptions.IWholeRuntimeException;
import org.whole.lang.semantics.model.LocalIdentifier;
import org.whole.lang.semantics.reflect.SemanticsFeatureDescriptorEnum;
import org.whole.lang.model.IEntity;
import org.whole.lang.semantics.model.LocalBindings;

/**
 *  @generator Whole
 */
public class BindingsScopeImpl extends AbstractSimpleEntity implements BindingsScope {
    private static final long serialVersionUID = 1;

    public EntityDescriptor<BindingsScope> wGetEntityDescriptor() {
        return SemanticsEntityDescriptorEnum.BindingsScope;
    }

    public int wGetEntityOrd() {
        return SemanticsEntityDescriptorEnum.BindingsScope_ord;
    }

    public void accept(ISemanticsVisitor visitor) {
        try {
            visitor.visit(this);
        } catch (Exception e) {
            throw IWholeRuntimeException.asWholeException(e, this, visitor.getBindings());
        }
    }
    private LocalIdentifier identifier;

    public LocalIdentifier getIdentifier() {
        return notifyRequested(SemanticsFeatureDescriptorEnum.identifier, identifier);
    }

    public void setIdentifier(LocalIdentifier identifier) {
        notifyChanged(SemanticsFeatureDescriptorEnum.identifier, this.identifier, this.identifier = identifier);
    }
    private LocalBindings bindings;

    public LocalBindings getBindings() {
        return notifyRequested(SemanticsFeatureDescriptorEnum.bindings, bindings);
    }

    public void setBindings(LocalBindings bindings) {
        notifyChanged(SemanticsFeatureDescriptorEnum.bindings, this.bindings, this.bindings = bindings);
    }
    private BindingsScope nestedScope;

    public BindingsScope getNestedScope() {
        return notifyRequested(SemanticsFeatureDescriptorEnum.nestedScope, nestedScope);
    }

    public void setNestedScope(BindingsScope nestedScope) {
        notifyChanged(SemanticsFeatureDescriptorEnum.nestedScope, this.nestedScope, this.nestedScope = nestedScope);
    }

    public IEntity wGet(int index) {
        switch (index) {
            case 0 :
            return getIdentifier().wGetAdaptee(false);
            case 1 :
            return getBindings().wGetAdaptee(false);
            case 2 :
            return getNestedScope().wGetAdaptee(false);
            default :
            throw new IllegalArgumentException();
        }
    }

    public void wSet(int index, IEntity value) {
        switch (index) {
            case 0 :
            setIdentifier(value.wGetAdapter(SemanticsEntityDescriptorEnum.LocalIdentifier));
            break;
            case 1 :
            setBindings(value.wGetAdapter(SemanticsEntityDescriptorEnum.LocalBindings));
            break;
            case 2 :
            setNestedScope(value.wGetAdapter(SemanticsEntityDescriptorEnum.BindingsScope));
            break;
            default :
            throw new IllegalArgumentException();
        }
    }

    public int wSize() {
        return 3;
    }
}
