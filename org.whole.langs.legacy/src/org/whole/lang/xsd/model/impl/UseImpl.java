package org.whole.lang.xsd.model.impl;

import org.whole.lang.model.AbstractDataEntity;
import org.whole.lang.xsd.model.*;
import org.whole.lang.xsd.visitors.IXsdVisitor;
import org.whole.lang.xsd.reflect.XsdEntityDescriptorEnum;
import org.whole.lang.reflect.EntityDescriptor;
import org.whole.lang.model.EnumValue;

/** 
 * @generator Whole
 */
public class UseImpl extends AbstractDataEntity implements Use {
	private static final long serialVersionUID = 1;
	private org.whole.lang.xsd.model.UseEnum.Value value;

	public org.whole.lang.xsd.model.UseEnum.Value getValue() {
		return notifyRequested(value);
	}

	public void setValue(org.whole.lang.xsd.model.UseEnum.Value value) {
		notifyChanged(this.value, this.value = value);
	}

	public void accept(IXsdVisitor visitor) {
		try {
			visitor.visit(this);
		} catch (Exception e) {
			throw org.whole.lang.exceptions.WholeExceptionUtil.asWholeException(e, this, visitor.getBindings());
		}
	}

	public int wGetEntityOrd() {
		return XsdEntityDescriptorEnum.Use_ord;
	}

	public EntityDescriptor<Use> wGetEntityDescriptor() {
		return XsdEntityDescriptorEnum.Use;
	}

	public Object wGetValue() {
		return getValue();
	}

	public void wSetValue(Object value) {
		setValue((org.whole.lang.xsd.model.UseEnum.Value) value);
	}

	public String wStringValue() {
		return toString();
	}

	public void wSetValue(String value) {
		try {
			setValue(UseEnum.instance.valueOf(value));
		} catch (NumberFormatException e) {
		}
	}

	public EnumValue wEnumValue() {
		return value;
	}

	public void wSetValue(EnumValue value) {
		setValue((org.whole.lang.xsd.model.UseEnum.Value) value);
	}
}
