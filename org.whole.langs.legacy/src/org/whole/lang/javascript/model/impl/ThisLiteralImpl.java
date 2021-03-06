package org.whole.lang.javascript.model.impl;

import org.whole.lang.model.AbstractSimpleEntity;
import org.whole.lang.javascript.model.*;
import org.whole.lang.reflect.EntityDescriptor;
import org.whole.lang.javascript.reflect.JavaScriptEntityDescriptorEnum;
import org.whole.lang.javascript.visitors.IJavaScriptVisitor;

/** 
 * @generator Whole
 */
public class ThisLiteralImpl extends AbstractSimpleEntity implements
		ThisLiteral {
	private static final long serialVersionUID = 1;

	public EntityDescriptor<ThisLiteral> wGetEntityDescriptor() {
		return JavaScriptEntityDescriptorEnum.ThisLiteral;
	}

	public int wGetEntityOrd() {
		return JavaScriptEntityDescriptorEnum.ThisLiteral_ord;
	}

	public void accept(IJavaScriptVisitor visitor) {
		try {
			visitor.visit(this);
		} catch (Exception e) {
			throw org.whole.lang.exceptions.IWholeRuntimeException.asWholeException(e, this, visitor.getBindings());
		}
	}
}
