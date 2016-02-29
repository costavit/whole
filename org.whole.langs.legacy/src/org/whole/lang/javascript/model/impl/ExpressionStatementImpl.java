package org.whole.lang.javascript.model.impl;

import org.whole.lang.model.AbstractSimpleEntity;
import org.whole.lang.javascript.model.*;
import org.whole.lang.reflect.EntityDescriptor;
import org.whole.lang.javascript.reflect.JavaScriptEntityDescriptorEnum;
import org.whole.lang.javascript.visitors.IJavaScriptVisitor;
import org.whole.lang.javascript.reflect.JavaScriptFeatureDescriptorEnum;
import org.whole.lang.model.IEntity;

/** 
 * @generator Whole
 */
public class ExpressionStatementImpl extends AbstractSimpleEntity implements
		ExpressionStatement {
	private static final long serialVersionUID = 1;

	public EntityDescriptor<ExpressionStatement> wGetEntityDescriptor() {
		return JavaScriptEntityDescriptorEnum.ExpressionStatement;
	}

	public int wGetEntityOrd() {
		return JavaScriptEntityDescriptorEnum.ExpressionStatement_ord;
	}

	public void accept(IJavaScriptVisitor visitor) {
		try {
			visitor.visit(this);
		} catch (Exception e) {
			throw org.whole.lang.exceptions.WholeExceptionUtil.asWholeException(e, this, visitor.getBindings());
		}
	}

	private Expression expression;

	public Expression getExpression() {
		return notifyRequested(JavaScriptFeatureDescriptorEnum.expression,
				expression);
	}

	public void setExpression(Expression expression) {
		notifyChanged(JavaScriptFeatureDescriptorEnum.expression,
				this.expression, this.expression = expression);
	}

	public IEntity wGet(int index) {
		switch (index) {
		case 0:
			return getExpression().wGetAdaptee(false);
		default:
			throw new IllegalArgumentException();
		}
	}

	public void wSet(int index, IEntity value) {
		switch (index) {
		case 0:
			setExpression(value
					.wGetAdapter(JavaScriptEntityDescriptorEnum.Expression));
			break;
		default:
			throw new IllegalArgumentException();
		}
	}

	public int wSize() {
		return 1;
	}
}
