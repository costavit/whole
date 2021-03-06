package org.whole.lang.tests.model.impl;

import org.whole.lang.model.AbstractDataEntity;
import org.whole.lang.tests.model.*;
import org.whole.lang.tests.visitors.ITestsVisitor;
import org.whole.lang.tests.reflect.TestsEntityDescriptorEnum;
import org.whole.lang.reflect.EntityDescriptor;
import org.whole.lang.model.EnumValue;

/** 
 * @generator Whole
 */
public class KindImpl extends AbstractDataEntity implements Kind {
	private static final long serialVersionUID = 1;
	private org.whole.lang.tests.model.KindEnum.Value value;

	public org.whole.lang.tests.model.KindEnum.Value getValue() {
		return notifyRequested(value);
	}

	public void setValue(org.whole.lang.tests.model.KindEnum.Value value) {
		notifyChanged(this.value, this.value = value);
	}

	public void accept(ITestsVisitor visitor) {
		try {
			visitor.visit(this);
		} catch (Exception e) {
			throw org.whole.lang.exceptions.IWholeRuntimeException.asWholeException(e, this, visitor.getBindings());
		}
	}

	public int wGetEntityOrd() {
		return TestsEntityDescriptorEnum.Kind_ord;
	}

	public EntityDescriptor<Kind> wGetEntityDescriptor() {
		return TestsEntityDescriptorEnum.Kind;
	}

	public Object wGetValue() {
		return getValue();
	}

	public void wSetValue(Object value) {
		setValue((org.whole.lang.tests.model.KindEnum.Value) value);
	}

	public String wStringValue() {
		return toString();
	}

	public void wSetValue(String value) {
		try {
			setValue(KindEnum.instance.valueOf(value));
		} catch (NumberFormatException e) {
		}
	}

	public EnumValue wEnumValue() {
		return value;
	}

	public void wSetValue(EnumValue value) {
		setValue((org.whole.lang.tests.model.KindEnum.Value) value);
	}
}
