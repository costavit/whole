package org.whole.lang.pojo.model.impl;

import org.whole.lang.model.AbstractListCompositeEntity;
import org.whole.lang.pojo.model.*;
import org.whole.lang.pojo.visitors.IPojoVisitor;
import org.whole.lang.pojo.reflect.PojoEntityDescriptorEnum;
import org.whole.lang.reflect.EntityDescriptor;

/** 
 * @generator Whole
 */
public class ArrayDataImpl extends AbstractListCompositeEntity<PropertyValue>
		implements ArrayData {
	private static final long serialVersionUID = 1;

	public void accept(IPojoVisitor visitor) {
		try {
			visitor.visit(this);
		} catch (Exception e) {
			throw org.whole.lang.exceptions.WholeExceptionUtil.asWholeException(e, this, visitor.getBindings());
		}
	}

	public int wGetEntityOrd() {
		return PojoEntityDescriptorEnum.ArrayData_ord;
	}

	public EntityDescriptor<ArrayData> wGetEntityDescriptor() {
		return PojoEntityDescriptorEnum.ArrayData;
	}
}
