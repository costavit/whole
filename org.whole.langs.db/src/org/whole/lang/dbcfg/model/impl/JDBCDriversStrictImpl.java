package org.whole.lang.dbcfg.model.impl;

import org.whole.lang.model.AbstractSetCompositeEntity;
import org.whole.lang.dbcfg.model.*;
import org.whole.lang.dbcfg.visitors.IDBCFGVisitor;
import org.whole.lang.dbcfg.reflect.DBCFGEntityDescriptorEnum;
import org.whole.lang.reflect.EntityDescriptor;

/** 
 * @generator Whole
 */
public class JDBCDriversStrictImpl extends
		AbstractSetCompositeEntity<JDBCDriver> implements JDBCDrivers {
	private static final long serialVersionUID = 1;

	public void accept(IDBCFGVisitor visitor) {
		try {
			visitor.visit(this);
		} catch (Exception e) {
			throw org.whole.lang.exceptions.WholeExceptionUtil.asWholeException(e, this, visitor.getBindings());
		}
	}

	public int wGetEntityOrd() {
		return DBCFGEntityDescriptorEnum.JDBCDrivers_ord;
	}

	public EntityDescriptor<JDBCDrivers> wGetEntityDescriptor() {
		return DBCFGEntityDescriptorEnum.JDBCDrivers;
	}
}
