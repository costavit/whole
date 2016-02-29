package org.whole.lang.editors.model.impl;

import org.whole.lang.model.AbstractSimpleEntity;
import org.whole.lang.editors.model.*;
import org.whole.lang.reflect.EntityDescriptor;
import org.whole.lang.editors.reflect.EditorsEntityDescriptorEnum;
import org.whole.lang.editors.visitors.IEditorsVisitor;

/** 
 * @generator Whole
 */
public class FoldingToggleImpl extends AbstractSimpleEntity implements
		FoldingToggle {
	private static final long serialVersionUID = 1;

	public EntityDescriptor<FoldingToggle> wGetEntityDescriptor() {
		return EditorsEntityDescriptorEnum.FoldingToggle;
	}

	public int wGetEntityOrd() {
		return EditorsEntityDescriptorEnum.FoldingToggle_ord;
	}

	public void accept(IEditorsVisitor visitor) {
		try {
			visitor.visit(this);
		} catch (Exception e) {
			throw org.whole.lang.exceptions.WholeExceptionUtil.asWholeException(e, this, visitor.getBindings());
		}
	}
}
