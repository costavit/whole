package org.whole.lang.javascript.model.adapters;

import org.whole.lang.model.adapters.AbstractEntityAdapter;
import org.whole.lang.javascript.model.*;
import org.whole.lang.model.IEntity;
import org.whole.lang.javascript.visitors.IJavaScriptVisitor;
import org.whole.lang.reflect.EntityDescriptor;
import org.whole.lang.javascript.reflect.JavaScriptEntityDescriptorEnum;
import org.whole.lang.javascript.reflect.JavaScriptFeatureDescriptorEnum;

/** 
 * @generator Whole
 */
public class ExpressionStatementAdapter extends AbstractEntityAdapter implements
		ExpressionStatement {
	private static final long serialVersionUID = 1;

	public ExpressionStatementAdapter(IEntity implementor) {
		super(implementor);
	}

	public ExpressionStatementAdapter() {
	}

	public void accept(IJavaScriptVisitor visitor) {
		if (visitor.visitAdapter(this))
			visitor.visit(this);
	}

	public EntityDescriptor<ExpressionStatement> wGetEntityDescriptor() {
		return JavaScriptEntityDescriptorEnum.ExpressionStatement;
	}

	public Expression getExpression() {
		return wGet(JavaScriptFeatureDescriptorEnum.expression).wGetAdapter(
				JavaScriptEntityDescriptorEnum.Expression);
	}

	public void setExpression(Expression expression) {
		wSet(JavaScriptFeatureDescriptorEnum.expression, expression);
	}
}
