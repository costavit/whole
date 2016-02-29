package org.whole.lang.actions.model.impl;

import org.whole.lang.model.AbstractListCompositeEntity;
import org.whole.lang.actions.model.*;
import org.whole.lang.actions.visitors.IActionsVisitor;
import org.whole.lang.actions.reflect.ActionsEntityDescriptorEnum;
import org.whole.lang.reflect.EntityDescriptor;

/** 
 * @generator Whole
 */
public class ActionsImpl extends AbstractListCompositeEntity<Action> implements
		Actions {
	private static final long serialVersionUID = 1;

	public void accept(IActionsVisitor visitor) {
		try {
			visitor.visit(this);
		} catch (Exception e) {
			throw org.whole.lang.exceptions.WholeExceptionUtil.asWholeException(e, this, visitor.getBindings());
		}
	}

	public int wGetEntityOrd() {
		return ActionsEntityDescriptorEnum.Actions_ord;
	}

	public EntityDescriptor<Actions> wGetEntityDescriptor() {
		return ActionsEntityDescriptorEnum.Actions;
	}
}
