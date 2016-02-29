package org.whole.lang.frames.model.impl;

import org.whole.lang.model.AbstractDataEntity;
import org.whole.lang.frames.model.*;
import org.whole.lang.frames.visitors.IFramesVisitor;
import org.whole.lang.frames.reflect.FramesEntityDescriptorEnum;
import org.whole.lang.reflect.EntityDescriptor;
import org.whole.lang.model.EnumValue;

/** 
 * @generator Whole
 */
public class DomainImpl extends AbstractDataEntity implements Domain {
	private static final long serialVersionUID = 1;
	private org.whole.lang.frames.model.DomainEnum.Value value;

	public org.whole.lang.frames.model.DomainEnum.Value getValue() {
		return notifyRequested(value);
	}

	public void setValue(org.whole.lang.frames.model.DomainEnum.Value value) {
		notifyChanged(this.value, this.value = value);
	}

	public void accept(IFramesVisitor visitor) {
		try {
			visitor.visit(this);
		} catch (Exception e) {
			throw org.whole.lang.exceptions.WholeExceptionUtil.asWholeException(e, this, visitor.getBindings());
		}
	}

	public int wGetEntityOrd() {
		return FramesEntityDescriptorEnum.Domain_ord;
	}

	public EntityDescriptor<Domain> wGetEntityDescriptor() {
		return FramesEntityDescriptorEnum.Domain;
	}

	public Object wGetValue() {
		return getValue();
	}

	public void wSetValue(Object value) {
		setValue((org.whole.lang.frames.model.DomainEnum.Value) value);
	}

	public String wStringValue() {
		return toString();
	}

	public void wSetValue(String value) {
		try {
			setValue(DomainEnum.instance.valueOf(value));
		} catch (NumberFormatException e) {
		}
	}

	public EnumValue wEnumValue() {
		return value;
	}

	public void wSetValue(EnumValue value) {
		setValue((org.whole.lang.frames.model.DomainEnum.Value) value);
	}
}
