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
public class MatchesImpl extends AbstractSimpleEntity implements Matches {
	private static final long serialVersionUID = 1;

	public EntityDescriptor<Matches> wGetEntityDescriptor() {
		return TestsEntityDescriptorEnum.Matches;
	}

	public int wGetEntityOrd() {
		return TestsEntityDescriptorEnum.Matches_ord;
	}

	public void accept(ITestsVisitor visitor) {
		try {
			visitor.visit(this);
		} catch (Exception e) {
			throw org.whole.lang.exceptions.IWholeRuntimeException.asWholeException(e, this, visitor.getBindings());
		}
	}

	private Expression object;

	public Expression getObject() {
		return notifyRequested(TestsFeatureDescriptorEnum.object, object);
	}

	public void setObject(Expression object) {
		notifyChanged(TestsFeatureDescriptorEnum.object, this.object,
				this.object = object);
	}

	public IEntity wGet(int index) {
		switch (index) {
		case 0:
			return getObject().wGetAdaptee(false);
		default:
			throw new IllegalArgumentException();
		}
	}

	public void wSet(int index, IEntity value) {
		switch (index) {
		case 0:
			setObject(value.wGetAdapter(TestsEntityDescriptorEnum.Expression));
			break;
		default:
			throw new IllegalArgumentException();
		}
	}

	public int wSize() {
		return 1;
	}
}
