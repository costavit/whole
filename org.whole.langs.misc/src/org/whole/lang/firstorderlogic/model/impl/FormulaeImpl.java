package org.whole.lang.firstorderlogic.model.impl;

import org.whole.lang.model.AbstractListCompositeEntity;
import org.whole.lang.firstorderlogic.model.*;
import org.whole.lang.firstorderlogic.visitors.IFirstOrderLogicVisitor;
import org.whole.lang.firstorderlogic.reflect.FirstOrderLogicEntityDescriptorEnum;
import org.whole.lang.reflect.EntityDescriptor;

/** 
 * @generator Whole
 */
public class FormulaeImpl extends AbstractListCompositeEntity<Formula>
		implements Formulae {
	private static final long serialVersionUID = 1;

	public void accept(IFirstOrderLogicVisitor visitor) {
		try {
			visitor.visit(this);
		} catch (Exception e) {
			throw org.whole.lang.exceptions.IWholeRuntimeException.asWholeException(e, this, visitor.getBindings());
		}
	}

	public int wGetEntityOrd() {
		return FirstOrderLogicEntityDescriptorEnum.Formulae_ord;
	}

	public EntityDescriptor<Formulae> wGetEntityDescriptor() {
		return FirstOrderLogicEntityDescriptorEnum.Formulae;
	}
}
