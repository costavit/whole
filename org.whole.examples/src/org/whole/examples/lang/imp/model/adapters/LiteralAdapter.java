package org.whole.examples.lang.imp.model.adapters;

import org.whole.lang.model.adapters.AbstractEntityAdapter;
import org.whole.examples.lang.imp.model.*;
import org.whole.lang.model.IEntity;
import org.whole.examples.lang.imp.visitors.IImpVisitor;
import org.whole.lang.reflect.EntityDescriptor;
import org.whole.examples.lang.imp.reflect.ImpEntityDescriptorEnum;

/** 
 * @generator Whole
 */
public class LiteralAdapter extends AbstractEntityAdapter implements Literal {
	private static final long serialVersionUID = 1;

	public LiteralAdapter(IEntity implementor) {
		super(implementor);
	}

	public LiteralAdapter() {
	}

	public void accept(IImpVisitor visitor) {
		if (visitor.visitAdapter(this))
			visitor.visit(this);
	}

	public EntityDescriptor<Literal> wGetEntityDescriptor() {
		return ImpEntityDescriptorEnum.Literal;
	}
}
