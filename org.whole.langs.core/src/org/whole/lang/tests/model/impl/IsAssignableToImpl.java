package org.whole.lang.tests.model.impl;

import org.whole.lang.model.AbstractSimpleEntity;
import org.whole.lang.tests.model.*;
import org.whole.lang.reflect.EntityDescriptor;
import org.whole.lang.tests.reflect.TestsEntityDescriptorEnum;
import org.whole.lang.tests.visitors.ITestsVisitor;
import org.whole.lang.tests.reflect.TestsFeatureDescriptorEnum;
import org.whole.lang.model.IEntity;

/** 
 * @generator Whole
 */
public class IsAssignableToImpl extends AbstractSimpleEntity implements
		IsAssignableTo {
	private static final long serialVersionUID = 1;

	public EntityDescriptor<IsAssignableTo> wGetEntityDescriptor() {
		return TestsEntityDescriptorEnum.IsAssignableTo;
	}

	public int wGetEntityOrd() {
		return TestsEntityDescriptorEnum.IsAssignableTo_ord;
	}

	public void accept(ITestsVisitor visitor) {
		try {
			visitor.visit(this);
		} catch (Exception e) {
			throw org.whole.lang.exceptions.WholeExceptionUtil.asWholeException(e, this, visitor.getBindings());
		}
	}

	private Name descriptorName;

	public Name getDescriptorName() {
		return notifyRequested(TestsFeatureDescriptorEnum.descriptorName,
				descriptorName);
	}

	public void setDescriptorName(Name descriptorName) {
		notifyChanged(TestsFeatureDescriptorEnum.descriptorName,
				this.descriptorName, this.descriptorName = descriptorName);
	}

	public IEntity wGet(int index) {
		switch (index) {
		case 0:
			return getDescriptorName().wGetAdaptee(false);
		default:
			throw new IllegalArgumentException();
		}
	}

	public void wSet(int index, IEntity value) {
		switch (index) {
		case 0:
			setDescriptorName(value.wGetAdapter(TestsEntityDescriptorEnum.Name));
			break;
		default:
			throw new IllegalArgumentException();
		}
	}

	public int wSize() {
		return 1;
	}
}
