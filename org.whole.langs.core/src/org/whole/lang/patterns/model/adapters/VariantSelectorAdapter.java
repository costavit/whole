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
package org.whole.lang.patterns.model.adapters;

import org.whole.lang.model.adapters.AbstractEntityAdapter;
import org.whole.lang.patterns.model.*;
import org.whole.lang.model.IEntity;
import org.whole.lang.patterns.visitors.IPatternsVisitor;
import org.whole.lang.reflect.EntityDescriptor;
import org.whole.lang.patterns.reflect.PatternsEntityDescriptorEnum;
import org.whole.lang.patterns.reflect.PatternsFeatureDescriptorEnum;

/**
 *  @generator Whole
 */
public class VariantSelectorAdapter extends AbstractEntityAdapter implements VariantSelector {
    private static final long serialVersionUID = 1;

    public VariantSelectorAdapter(IEntity implementor) {
        super(implementor);
    }

    public VariantSelectorAdapter() {
    }

    public void accept(IPatternsVisitor visitor) {
        if (visitor.visitAdapter(this))
            visitor.visit(this);
    }

    public EntityDescriptor<VariantSelector> wGetEntityDescriptor() {
        return PatternsEntityDescriptorEnum.VariantSelector;
    }

    public Name getVariability() {
        return wGet(PatternsFeatureDescriptorEnum.variability).wGetAdapter(PatternsEntityDescriptorEnum.Name);
    }

    public void setVariability(Name variability) {
        wSet(PatternsFeatureDescriptorEnum.variability, variability);
    }

    public PathExpression getVariant() {
        return wGet(PatternsFeatureDescriptorEnum.variant).wGetAdapter(PatternsEntityDescriptorEnum.PathExpression);
    }

    public void setVariant(PathExpression variant) {
        wSet(PatternsFeatureDescriptorEnum.variant, variant);
    }
}
