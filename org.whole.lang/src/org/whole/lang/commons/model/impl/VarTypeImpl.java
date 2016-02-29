package org.whole.lang.commons.model.impl;

import org.whole.lang.commons.model.VarType;
import org.whole.lang.commons.reflect.CommonsEntityDescriptorEnum;
import org.whole.lang.commons.visitors.ICommonsVisitor;
import org.whole.lang.exceptions.WholeExceptionUtil;
import org.whole.lang.model.AbstractDataEntity;
import org.whole.lang.model.EnumValue;
import org.whole.lang.reflect.EntityDescriptor;

/** 
 * @generator Whole
 */
public class VarTypeImpl extends AbstractDataEntity implements VarType {
	private static final long serialVersionUID = 1;

	private EntityDescriptor<?> value;

	public EntityDescriptor<?> getValue() {
		return notifyRequested(value);
	}

	public void setValue(EntityDescriptor<?> value) {
		notifyChanged(this.value, this.value = value);
	}

	public EntityDescriptor<VarType> wGetEntityDescriptor() {
		return CommonsEntityDescriptorEnum.VarType;
	}
	public int wGetEntityOrd() {
		return CommonsEntityDescriptorEnum.VarType_ord;
	}

	public void accept(ICommonsVisitor visitor) {
		try {
			visitor.visit(this);
		} catch (Exception e) {
			throw org.whole.lang.exceptions.WholeExceptionUtil.asWholeException(e, this, visitor.getBindings());
		}
	}

	public Object wGetValue() {
		return getValue();
	}

	public void wSetValue(Object value) {
		try {
			setValue((EntityDescriptor<?>) value);
		} catch(ClassCastException e) {
			wSetValue((String) value);
		}
	}

	public EnumValue wEnumValue() {
		return value;
	}

	public void wSetValue(EnumValue value) {
		wSetValue((Object) value);
	}
}
