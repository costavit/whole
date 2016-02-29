package org.whole.lang.rdb.model.impl;

import org.whole.lang.model.AbstractUniqueListCompositeEntity;
import org.whole.lang.rdb.model.*;
import org.whole.lang.rdb.visitors.IRDBVisitor;
import org.whole.lang.rdb.reflect.RDBEntityDescriptorEnum;
import org.whole.lang.reflect.EntityDescriptor;

/** 
 * @generator Whole
 */
public class ColumnNamesStrictImpl extends
		AbstractUniqueListCompositeEntity<StringData> implements ColumnNames {
	private static final long serialVersionUID = 1;

	public void accept(IRDBVisitor visitor) {
		try {
			visitor.visit(this);
		} catch (Exception e) {
			throw org.whole.lang.exceptions.WholeExceptionUtil.asWholeException(e, this, visitor.getBindings());
		}
	}

	public int wGetEntityOrd() {
		return RDBEntityDescriptorEnum.ColumnNames_ord;
	}

	public EntityDescriptor<ColumnNames> wGetEntityDescriptor() {
		return RDBEntityDescriptorEnum.ColumnNames;
	}
}
