package org.whole.lang.actions.model.impl;

import org.whole.lang.model.AbstractDataEntity;
import org.whole.lang.actions.model.*;
import org.whole.lang.actions.visitors.IActionsVisitor;
import org.whole.lang.actions.reflect.ActionsEntityDescriptorEnum;
import org.whole.lang.reflect.EntityDescriptor;

/** 
 * @generator Whole
 */
public class IconImpl extends AbstractDataEntity implements Icon {
	private static final long serialVersionUID = 1;
	private Object value;

	public Object getValue() {
		return notifyRequested(value);
	}

	public void setValue(Object value) {
		notifyChanged(this.value, this.value = value);
	}

	public void accept(IActionsVisitor visitor) {
		try {
			visitor.visit(this);
		} catch (Exception e) {
			throw org.whole.lang.exceptions.WholeExceptionUtil.asWholeException(e, this, visitor.getBindings());
		}
	}

	public int wGetEntityOrd() {
		return ActionsEntityDescriptorEnum.Icon_ord;
	}

	public EntityDescriptor<Icon> wGetEntityDescriptor() {
		return ActionsEntityDescriptorEnum.Icon;
	}

	public Object wGetValue() {
		return getValue();
	}

	public void wSetValue(Object value) {
		setValue(value);
	}
}
