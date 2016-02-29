package org.whole.lang.testentities.model.impl;

import org.whole.lang.model.AbstractBagCompositeEntity;
import org.whole.lang.testentities.model.*;
import org.whole.lang.testentities.visitors.ITestEntitiesVisitor;
import org.whole.lang.testentities.reflect.TestEntitiesEntityDescriptorEnum;
import org.whole.lang.reflect.EntityDescriptor;

/** 
 * @generator Whole
 */
public class BagTestEntityStrictImpl extends
		AbstractBagCompositeEntity<ITestEntity> implements BagTestEntity {
	private static final long serialVersionUID = 1;

	public void accept(ITestEntitiesVisitor visitor) {
		try {
			visitor.visit(this);
		} catch (Exception e) {
			throw org.whole.lang.exceptions.WholeExceptionUtil.asWholeException(e, this, visitor.getBindings());
		}
	}

	public int wGetEntityOrd() {
		return TestEntitiesEntityDescriptorEnum.BagTestEntity_ord;
	}

	public EntityDescriptor<BagTestEntity> wGetEntityDescriptor() {
		return TestEntitiesEntityDescriptorEnum.BagTestEntity;
	}
}
