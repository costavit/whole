package org.whole.lang.changes.model.impl;

import org.whole.lang.model.AbstractDataEntity;
import org.whole.lang.changes.model.*;
import org.whole.lang.changes.visitors.IChangesVisitor;
import org.whole.lang.changes.reflect.ChangesEntityDescriptorEnum;
import org.whole.lang.reflect.EntityDescriptor;

/**
 *  @generator  Whole
 */
public class TextImpl extends AbstractDataEntity implements Text {
    private static final long serialVersionUID = 1;
    private String value;

    public String getValue() {
        return notifyRequested(value);
    }

    public void setValue(String value) {
        notifyChanged(this.value, this.value = value);
    }

    public void accept(IChangesVisitor visitor) {
		try {
	        visitor.visit(this);
		} catch (Exception e) {
			throw org.whole.lang.exceptions.WholeExceptionUtil.asWholeException(e, this, visitor.getBindings());
		}    }

    public int wGetEntityOrd() {
        return ChangesEntityDescriptorEnum.Text_ord;
    }

    public EntityDescriptor<Text> wGetEntityDescriptor() {
        return ChangesEntityDescriptorEnum.Text;
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
