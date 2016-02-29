package org.whole.lang.firstorderlogic.model.impl;

import org.whole.lang.model.AbstractSimpleEntity;
import org.whole.lang.firstorderlogic.model.*;
import org.whole.lang.reflect.EntityDescriptor;
import org.whole.lang.firstorderlogic.reflect.FirstOrderLogicEntityDescriptorEnum;
import org.whole.lang.firstorderlogic.visitors.IFirstOrderLogicVisitor;
import org.whole.lang.firstorderlogic.reflect.FirstOrderLogicFeatureDescriptorEnum;
import org.whole.lang.model.IEntity;

/** 
 * @generator Whole
 */
public class NotImpl extends AbstractSimpleEntity implements Not {
	private static final long serialVersionUID = 1;

	public EntityDescriptor<Not> wGetEntityDescriptor() {
		return FirstOrderLogicEntityDescriptorEnum.Not;
	}

	public int wGetEntityOrd() {
		return FirstOrderLogicEntityDescriptorEnum.Not_ord;
	}

	public void accept(IFirstOrderLogicVisitor visitor) {
		try {
			visitor.visit(this);
		} catch (Exception e) {
			throw org.whole.lang.exceptions.WholeExceptionUtil.asWholeException(e, this, visitor.getBindings());
		}
	}

	private Formula formula;

	public Formula getFormula() {
		return notifyRequested(FirstOrderLogicFeatureDescriptorEnum.formula,
				formula);
	}

	public void setFormula(Formula formula) {
		notifyChanged(FirstOrderLogicFeatureDescriptorEnum.formula,
				this.formula, this.formula = formula);
	}

	public IEntity wGet(int index) {
		switch (index) {
		case 0:
			return getFormula().wGetAdaptee(false);
		default:
			throw new IllegalArgumentException();
		}
	}

	public void wSet(int index, IEntity value) {
		switch (index) {
		case 0:
			setFormula(value
					.wGetAdapter(FirstOrderLogicEntityDescriptorEnum.Formula));
			break;
		default:
			throw new IllegalArgumentException();
		}
	}

	public int wSize() {
		return 1;
	}
}
