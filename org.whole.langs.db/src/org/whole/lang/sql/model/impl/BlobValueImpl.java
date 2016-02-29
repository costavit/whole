package org.whole.lang.sql.model.impl;

import org.whole.lang.model.AbstractDataEntity;
import org.whole.lang.sql.model.*;
import org.whole.lang.sql.visitors.ISQLVisitor;
import org.whole.lang.sql.reflect.SQLEntityDescriptorEnum;
import org.whole.lang.reflect.EntityDescriptor;

/** 
 * @generator Whole
 */
public class BlobValueImpl extends AbstractDataEntity implements BlobValue {
	private static final long serialVersionUID = 1;
	private java.sql.Blob value;

	public java.sql.Blob getValue() {
		return notifyRequested(value);
	}

	public void setValue(java.sql.Blob value) {
		notifyChanged(this.value, this.value = value);
	}

	public void accept(ISQLVisitor visitor) {
		try {
			visitor.visit(this);
		} catch (Exception e) {
			throw org.whole.lang.exceptions.WholeExceptionUtil.asWholeException(e, this, visitor.getBindings());
		}
	}

	public int wGetEntityOrd() {
		return SQLEntityDescriptorEnum.BlobValue_ord;
	}

	public EntityDescriptor<BlobValue> wGetEntityDescriptor() {
		return SQLEntityDescriptorEnum.BlobValue;
	}

	public Object wGetValue() {
		return getValue();
	}

	public void wSetValue(Object value) {
		setValue((java.sql.Blob) value);
	}
}
