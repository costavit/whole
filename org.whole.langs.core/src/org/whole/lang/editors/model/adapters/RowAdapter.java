package org.whole.lang.editors.model.adapters;

import org.whole.lang.model.adapters.AbstractCollectionEntityAdapter;
import org.whole.lang.editors.model.*;
import org.whole.lang.model.IEntity;
import org.whole.lang.editors.visitors.IEditorsVisitor;
import org.whole.lang.reflect.EntityDescriptor;
import org.whole.lang.editors.reflect.EditorsEntityDescriptorEnum;

/** 
 * @generator Whole
 */
public class RowAdapter extends AbstractCollectionEntityAdapter<RowElement>
		implements Row {
	private static final long serialVersionUID = 1;

	public RowAdapter(IEntity implementor) {
		super(implementor);
	}

	public RowAdapter() {
	}

	public void accept(IEditorsVisitor visitor) {
		if (visitor.visitAdapter(this))
			visitor.visit(this);
	}

	public EntityDescriptor<Row> wGetEntityDescriptor() {
		return EditorsEntityDescriptorEnum.Row;
	}
}
