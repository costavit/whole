package org.whole.lang.java.model.adapters;

import org.whole.lang.model.adapters.AbstractEntityAdapter;
import org.whole.lang.java.model.*;
import org.whole.lang.model.IEntity;
import org.whole.lang.java.visitors.IJavaVisitor;
import org.whole.lang.reflect.EntityDescriptor;
import org.whole.lang.java.reflect.JavaEntityDescriptorEnum;

/** 
 * @generator Whole
 */
public class SwitchDefaultAdapter extends AbstractEntityAdapter implements
		SwitchDefault {
	private static final long serialVersionUID = 1;

	public SwitchDefaultAdapter(IEntity implementor) {
		super(implementor);
	}

	public SwitchDefaultAdapter() {
	}

	public void accept(IJavaVisitor visitor) {
		if (visitor.visitAdapter(this))
			visitor.visit(this);
	}

	public EntityDescriptor<SwitchDefault> wGetEntityDescriptor() {
		return JavaEntityDescriptorEnum.SwitchDefault;
	}
}
