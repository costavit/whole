package org.whole.lang.sql.model.adapters;

import org.whole.lang.model.adapters.AbstractEntityAdapter;
import org.whole.lang.sql.model.*;
import org.whole.lang.model.IEntity;
import org.whole.lang.sql.visitors.ISQLVisitor;
import org.whole.lang.reflect.EntityDescriptor;
import org.whole.lang.sql.reflect.SQLEntityDescriptorEnum;

/** 
 * @generator Whole
 */
public class ArrayExprAdapter extends AbstractEntityAdapter implements
		ArrayExpr {
	private static final long serialVersionUID = 1;

	public ArrayExprAdapter(IEntity implementor) {
		super(implementor);
	}

	public ArrayExprAdapter() {
	}

	public void accept(ISQLVisitor visitor) {
		if (visitor.visitAdapter(this))
			visitor.visit(this);
	}

	public EntityDescriptor<ArrayExpr> wGetEntityDescriptor() {
		return SQLEntityDescriptorEnum.ArrayExpr;
	}

	public String getValue() {
		return wStringValue();
	}

	public void setValue(String value) {
		wSetValue(value);
	}
}
