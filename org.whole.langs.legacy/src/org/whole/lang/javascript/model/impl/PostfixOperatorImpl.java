package org.whole.lang.javascript.model.impl;

import org.whole.lang.model.AbstractDataEntity;
import org.whole.lang.javascript.model.*;
import org.whole.lang.javascript.visitors.IJavaScriptVisitor;
import org.whole.lang.javascript.reflect.JavaScriptEntityDescriptorEnum;
import org.whole.lang.reflect.EntityDescriptor;
import org.whole.lang.model.EnumValue;

/** 
 * @generator Whole
 */
public class PostfixOperatorImpl extends AbstractDataEntity implements
		PostfixOperator {
	private static final long serialVersionUID = 1;
	private org.whole.lang.javascript.model.PostfixOperatorEnum.Value value;

	public org.whole.lang.javascript.model.PostfixOperatorEnum.Value getValue() {
		return notifyRequested(value);
	}

	public void setValue(
			org.whole.lang.javascript.model.PostfixOperatorEnum.Value value) {
		notifyChanged(this.value, this.value = value);
	}

	public void accept(IJavaScriptVisitor visitor) {
		try {
			visitor.visit(this);
		} catch (Exception e) {
			throw org.whole.lang.exceptions.IWholeRuntimeException.asWholeException(e, this, visitor.getBindings());
		}
	}

	public int wGetEntityOrd() {
		return JavaScriptEntityDescriptorEnum.PostfixOperator_ord;
	}

	public EntityDescriptor<PostfixOperator> wGetEntityDescriptor() {
		return JavaScriptEntityDescriptorEnum.PostfixOperator;
	}

	public Object wGetValue() {
		return getValue();
	}

	public void wSetValue(Object value) {
		setValue((org.whole.lang.javascript.model.PostfixOperatorEnum.Value) value);
	}

	public String wStringValue() {
		return toString();
	}

	public void wSetValue(String value) {
		try {
			setValue(PostfixOperatorEnum.instance.valueOf(value));
		} catch (NumberFormatException e) {
		}
	}

	public EnumValue wEnumValue() {
		return value;
	}

	public void wSetValue(EnumValue value) {
		setValue((org.whole.lang.javascript.model.PostfixOperatorEnum.Value) value);
	}
}
