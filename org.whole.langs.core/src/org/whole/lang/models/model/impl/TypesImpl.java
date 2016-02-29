package org.whole.lang.models.model.impl;

import org.whole.lang.model.AbstractListCompositeEntity;
import org.whole.lang.models.model.*;
import org.whole.lang.models.visitors.IModelsVisitor;
import org.whole.lang.models.reflect.ModelsEntityDescriptorEnum;
import org.whole.lang.reflect.EntityDescriptor;

/** 
 * @generator Whole
 */
public class TypesImpl extends AbstractListCompositeEntity<Type> implements
		Types {
	private static final long serialVersionUID = 1;

	public void accept(IModelsVisitor visitor) {
		try {
			visitor.visit(this);
		} catch (Exception e) {
			throw org.whole.lang.exceptions.WholeExceptionUtil.asWholeException(e, this, visitor.getBindings());
		}
	}

	public int wGetEntityOrd() {
		return ModelsEntityDescriptorEnum.Types_ord;
	}

	public EntityDescriptor<Types> wGetEntityDescriptor() {
		return ModelsEntityDescriptorEnum.Types;
	}
}
