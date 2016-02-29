package org.whole.lang.models.model.impl;

import org.whole.lang.model.AbstractCollectionCompositeEntity;
import org.whole.lang.models.model.*;
import org.whole.lang.models.visitors.IModelsVisitor;
import org.whole.lang.models.reflect.ModelsEntityDescriptorEnum;
import org.whole.lang.reflect.EntityDescriptor;

/** 
 * @generator Whole
 */
public class EnumValuesImpl extends
		AbstractCollectionCompositeEntity<EnumValue> implements EnumValues {
	private static final long serialVersionUID = 1;

	public void accept(IModelsVisitor visitor) {
		try {
			visitor.visit(this);
		} catch (Exception e) {
			throw org.whole.lang.exceptions.WholeExceptionUtil.asWholeException(e, this, visitor.getBindings());
		}
	}

	public int wGetEntityOrd() {
		return ModelsEntityDescriptorEnum.EnumValues_ord;
	}

	public EntityDescriptor<EnumValues> wGetEntityDescriptor() {
		return ModelsEntityDescriptorEnum.EnumValues;
	}
}
