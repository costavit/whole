package org.whole.lang.sql.model.impl;

import org.whole.lang.model.AbstractListCompositeEntity;
import org.whole.lang.sql.model.*;
import org.whole.lang.sql.visitors.ISQLVisitor;
import org.whole.lang.sql.reflect.SQLEntityDescriptorEnum;
import org.whole.lang.reflect.EntityDescriptor;

/** 
 * @generator Whole
 */
public class WhenClausesImpl extends AbstractListCompositeEntity<WhenClause>
		implements WhenClauses {
	private static final long serialVersionUID = 1;

	public void accept(ISQLVisitor visitor) {
		try {
			visitor.visit(this);
		} catch (Exception e) {
			throw org.whole.lang.exceptions.WholeExceptionUtil.asWholeException(e, this, visitor.getBindings());
		}
	}

	public int wGetEntityOrd() {
		return SQLEntityDescriptorEnum.WhenClauses_ord;
	}

	public EntityDescriptor<WhenClauses> wGetEntityDescriptor() {
		return SQLEntityDescriptorEnum.WhenClauses;
	}
}
