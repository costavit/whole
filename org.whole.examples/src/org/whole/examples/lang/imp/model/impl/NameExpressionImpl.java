package org.whole.examples.lang.imp.model.impl;

import org.whole.lang.model.AbstractDataEntity;
import org.whole.examples.lang.imp.model.*;
import org.whole.examples.lang.imp.visitors.IImpVisitor;
import org.whole.examples.lang.imp.reflect.ImpEntityDescriptorEnum;
import org.whole.lang.reflect.EntityDescriptor;

/** 
 * @generator Whole
 */
public class NameExpressionImpl extends AbstractDataEntity implements
		NameExpression {
	private static final long serialVersionUID = 1;
	private String value;

	public String getValue() {
		return notifyRequested(value);
	}

	public void setValue(String value) {
		notifyChanged(this.value, this.value = value);
	}

	public void accept(IImpVisitor visitor) {
		try {
			visitor.visit(this);
		} catch (Exception e) {
			throw org.whole.lang.exceptions.WholeExceptionUtil.asWholeException(e, this, visitor.getBindings());
		}
	}

	public int wGetEntityOrd() {
		return ImpEntityDescriptorEnum.NameExpression_ord;
	}

	public EntityDescriptor<NameExpression> wGetEntityDescriptor() {
		return ImpEntityDescriptorEnum.NameExpression;
	}

	public Object wGetValue() {
		return getValue();
	}

	public void wSetValue(Object value) {
		setValue((String) value);
	}

	public String wStringValue() {
		return getValue();
	}

	public void wSetValue(String value) {
		setValue(value);
	}
}
