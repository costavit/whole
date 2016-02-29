package org.whole.lang.workflows.model.impl;

import org.whole.lang.model.AbstractListCompositeEntity;
import org.whole.lang.workflows.model.*;
import org.whole.lang.workflows.visitors.IWorkflowsVisitor;
import org.whole.lang.workflows.reflect.WorkflowsEntityDescriptorEnum;
import org.whole.lang.reflect.EntityDescriptor;

/** 
 * @generator Whole
 */
public class EventHandlersImpl extends
		AbstractListCompositeEntity<EventHandler> implements EventHandlers {
	private static final long serialVersionUID = 1;

	public void accept(IWorkflowsVisitor visitor) {
		try {
			visitor.visit(this);
		} catch (Exception e) {
			throw org.whole.lang.exceptions.WholeExceptionUtil.asWholeException(e, this, visitor.getBindings());
		}
	}

	public int wGetEntityOrd() {
		return WorkflowsEntityDescriptorEnum.EventHandlers_ord;
	}

	public EntityDescriptor<EventHandlers> wGetEntityDescriptor() {
		return WorkflowsEntityDescriptorEnum.EventHandlers;
	}
}
