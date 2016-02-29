package org.whole.lang.pojo.model.impl;

import org.whole.lang.model.AbstractDataEntity;
import org.whole.lang.pojo.model.*;
import org.whole.lang.pojo.visitors.IPojoVisitor;
import org.whole.lang.pojo.reflect.PojoEntityDescriptorEnum;
import org.whole.lang.reflect.EntityDescriptor;
import org.whole.lang.model.EnumValue;

/** 
 * @generator Whole
 */
public class PrimitiveTypeImpl extends AbstractDataEntity implements
		PrimitiveType {
	private static final long serialVersionUID = 1;
	private org.whole.lang.pojo.model.PrimitiveTypeEnum.Value value;

	public org.whole.lang.pojo.model.PrimitiveTypeEnum.Value getValue() {
		return notifyRequested(value);
	}

	public void setValue(org.whole.lang.pojo.model.PrimitiveTypeEnum.Value value) {
		notifyChanged(this.value, this.value = value);
	}

	public void accept(IPojoVisitor visitor) {
		try {
			visitor.visit(this);
		} catch (Exception e) {
			throw org.whole.lang.exceptions.WholeExceptionUtil.asWholeException(e, this, visitor.getBindings());
		}
	}

	public int wGetEntityOrd() {
		return PojoEntityDescriptorEnum.PrimitiveType_ord;
	}

	public EntityDescriptor<PrimitiveType> wGetEntityDescriptor() {
		return PojoEntityDescriptorEnum.PrimitiveType;
	}

	public Object wGetValue() {
		return getValue();
	}

	public void wSetValue(Object value) {
		setValue((org.whole.lang.pojo.model.PrimitiveTypeEnum.Value) value);
	}

	public String wStringValue() {
		return toString();
	}

	public void wSetValue(String value) {
		try {
			setValue(PrimitiveTypeEnum.instance.valueOf(value));
		} catch (NumberFormatException e) {
		}
	}

	public EnumValue wEnumValue() {
		return value;
	}

	public void wSetValue(EnumValue value) {
		setValue((org.whole.lang.pojo.model.PrimitiveTypeEnum.Value) value);
	}
}
