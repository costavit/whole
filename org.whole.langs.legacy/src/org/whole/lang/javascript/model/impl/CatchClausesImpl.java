package org.whole.lang.javascript.model.impl;

import org.whole.lang.model.AbstractListCompositeEntity;
import org.whole.lang.javascript.model.*;
import org.whole.lang.javascript.visitors.IJavaScriptVisitor;
import org.whole.lang.javascript.reflect.JavaScriptEntityDescriptorEnum;
import org.whole.lang.reflect.EntityDescriptor;

/** 
 * @generator Whole
 */
public class CatchClausesImpl extends AbstractListCompositeEntity<CatchClause>
		implements CatchClauses {
	private static final long serialVersionUID = 1;

	public void accept(IJavaScriptVisitor visitor) {
		try {
			visitor.visit(this);
		} catch (Exception e) {
			throw org.whole.lang.exceptions.WholeExceptionUtil.asWholeException(e, this, visitor.getBindings());
		}
	}

	public int wGetEntityOrd() {
		return JavaScriptEntityDescriptorEnum.CatchClauses_ord;
	}

	public EntityDescriptor<CatchClauses> wGetEntityDescriptor() {
		return JavaScriptEntityDescriptorEnum.CatchClauses;
	}
}
