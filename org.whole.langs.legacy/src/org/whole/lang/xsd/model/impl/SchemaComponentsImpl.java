package org.whole.lang.xsd.model.impl;

import org.whole.lang.model.AbstractListCompositeEntity;
import org.whole.lang.xsd.model.*;
import org.whole.lang.xsd.visitors.IXsdVisitor;
import org.whole.lang.xsd.reflect.XsdEntityDescriptorEnum;
import org.whole.lang.reflect.EntityDescriptor;

/** 
 * @generator Whole
 */
public class SchemaComponentsImpl extends
		AbstractListCompositeEntity<SchemaComponent> implements
		SchemaComponents {
	private static final long serialVersionUID = 1;

	public void accept(IXsdVisitor visitor) {
		try {
			visitor.visit(this);
		} catch (Exception e) {
			throw org.whole.lang.exceptions.IWholeRuntimeException.asWholeException(e, this, visitor.getBindings());
		}
	}

	public int wGetEntityOrd() {
		return XsdEntityDescriptorEnum.SchemaComponents_ord;
	}

	public EntityDescriptor<SchemaComponents> wGetEntityDescriptor() {
		return XsdEntityDescriptorEnum.SchemaComponents;
	}
}
