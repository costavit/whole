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
public class AssumeThatImpl extends AbstractSimpleEntity implements AssumeThat {
	private static final long serialVersionUID = 1;

	public EntityDescriptor<AssumeThat> wGetEntityDescriptor() {
		return TestsEntityDescriptorEnum.AssumeThat;
	}

	public int wGetEntityOrd() {
		return TestsEntityDescriptorEnum.AssumeThat_ord;
	}

	public void accept(ITestsVisitor visitor) {
		try {
			visitor.visit(this);
		} catch (Exception e) {
			throw org.whole.lang.exceptions.WholeExceptionUtil.asWholeException(e, this, visitor.getBindings());
		}
	}

	private Expression subject;

	public Expression getSubject() {
		return notifyRequested(TestsFeatureDescriptorEnum.subject, subject);
	}

	public void setSubject(Expression subject) {
		notifyChanged(TestsFeatureDescriptorEnum.subject, this.subject,
				this.subject = subject);
	}

	private Constraint constraint;

	public Constraint getConstraint() {
		return notifyRequested(TestsFeatureDescriptorEnum.constraint,
				constraint);
	}

	public void setConstraint(Constraint constraint) {
		notifyChanged(TestsFeatureDescriptorEnum.constraint, this.constraint,
				this.constraint = constraint);
	}

	public IEntity wGet(int index) {
		switch (index) {
		case 0:
			return getSubject().wGetAdaptee(false);
		case 1:
			return getConstraint().wGetAdaptee(false);
		default:
			throw new IllegalArgumentException();
		}
	}

	public void wSet(int index, IEntity value) {
		switch (index) {
		case 0:
			setSubject(value.wGetAdapter(TestsEntityDescriptorEnum.Expression));
			break;
		case 1:
			setConstraint(value
					.wGetAdapter(TestsEntityDescriptorEnum.Constraint));
			break;
		default:
			throw new IllegalArgumentException();
		}
	}

	public int wSize() {
		return 2;
	}
}
