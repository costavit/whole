package org.whole.lang.workflows.model.impl;

import org.whole.lang.model.AbstractSimpleEntity;
import org.whole.lang.workflows.model.*;
import org.whole.lang.reflect.EntityDescriptor;
import org.whole.lang.workflows.reflect.WorkflowsEntityDescriptorEnum;
import org.whole.lang.workflows.visitors.IWorkflowsVisitor;
import org.whole.lang.workflows.reflect.WorkflowsFeatureDescriptorEnum;
import org.whole.lang.model.IEntity;

/** 
 * @generator Whole
 */
public class OnMessageEventImpl extends AbstractSimpleEntity implements
		OnMessageEvent {
	private static final long serialVersionUID = 1;

	public EntityDescriptor<OnMessageEvent> wGetEntityDescriptor() {
		return WorkflowsEntityDescriptorEnum.OnMessageEvent;
	}

	public int wGetEntityOrd() {
		return WorkflowsEntityDescriptorEnum.OnMessageEvent_ord;
	}

	public void accept(IWorkflowsVisitor visitor) {
		try {
			visitor.visit(this);
		} catch (Exception e) {
			throw org.whole.lang.exceptions.WholeExceptionUtil.asWholeException(e, this, visitor.getBindings());
		}
	}

	public int wHashCode() {
		return getName().wHashCode();
	}

	public boolean wEquals(IEntity entity) {
		if (this == entity)
			return true;
		if (!wGetEntityDescriptor().equals(entity.wGetEntityDescriptor()))
			return false;
		try {
			return getName().wEquals(
					entity.wGet(WorkflowsFeatureDescriptorEnum.name));
		} catch (Exception e) {
			return false;
		}
	}

	protected void toString(StringBuffer buffer) {
		buffer.append("name=");
		buffer.append(name);
	}

	private Name name;

	public Name getName() {
		return notifyRequested(WorkflowsFeatureDescriptorEnum.name, name);
	}

	public void setName(Name name) {
		notifyChanged(WorkflowsFeatureDescriptorEnum.name, this.name,
				this.name = name);
	}

	private Label label;

	public Label getLabel() {
		return notifyRequested(WorkflowsFeatureDescriptorEnum.label, label);
	}

	public void setLabel(Label label) {
		notifyChanged(WorkflowsFeatureDescriptorEnum.label, this.label,
				this.label = label);
	}

	private Message message;

	public Message getMessage() {
		return notifyRequested(WorkflowsFeatureDescriptorEnum.message, message);
	}

	public void setMessage(Message message) {
		notifyChanged(WorkflowsFeatureDescriptorEnum.message, this.message,
				this.message = message);
	}

	public IEntity wGet(int index) {
		switch (index) {
		case 0:
			return getName().wGetAdaptee(false);
		case 1:
			return getLabel().wGetAdaptee(false);
		case 2:
			return getMessage().wGetAdaptee(false);
		default:
			throw new IllegalArgumentException();
		}
	}

	public void wSet(int index, IEntity value) {
		switch (index) {
		case 0:
			setName(value.wGetAdapter(WorkflowsEntityDescriptorEnum.Name));
			break;
		case 1:
			setLabel(value.wGetAdapter(WorkflowsEntityDescriptorEnum.Label));
			break;
		case 2:
			setMessage(value.wGetAdapter(WorkflowsEntityDescriptorEnum.Message));
			break;
		default:
			throw new IllegalArgumentException();
		}
	}

	public int wSize() {
		return 3;
	}
}
