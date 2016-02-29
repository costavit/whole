package org.whole.lang.commons.model.impl;

import org.whole.lang.commons.model.VarName;
import org.whole.lang.commons.reflect.CommonsEntityDescriptorEnum;
import org.whole.lang.commons.visitors.ICommonsVisitor;
import org.whole.lang.exceptions.WholeExceptionUtil;
import org.whole.lang.model.AbstractDataEntity;
import org.whole.lang.reflect.EntityDescriptor;

/** 
 * @generator Whole
 */
public class VarNameImpl extends AbstractDataEntity implements VarName {
	private static final long serialVersionUID = 1;
	private String value;

	public String getValue() {
		return notifyRequested(value);
	}

	public void setValue(String value) {
		notifyChanged(this.value, this.value = value);
	}

	public void accept(ICommonsVisitor visitor) {
		try {
			visitor.visit(this);
		} catch (Exception e) {
			throw org.whole.lang.exceptions.WholeExceptionUtil.asWholeException(e, this, visitor.getBindings());
		}
	}

	public int wGetEntityOrd() {
		return CommonsEntityDescriptorEnum.VarName_ord;
	}

	public EntityDescriptor<VarName> wGetEntityDescriptor() {
		return CommonsEntityDescriptorEnum.VarName;
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
