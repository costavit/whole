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
public class DeleteArtifactsImpl extends AbstractSimpleEntity implements
		DeleteArtifacts {
	private static final long serialVersionUID = 1;

	public EntityDescriptor<DeleteArtifacts> wGetEntityDescriptor() {
		return WorkflowsEntityDescriptorEnum.DeleteArtifacts;
	}

	public int wGetEntityOrd() {
		return WorkflowsEntityDescriptorEnum.DeleteArtifacts_ord;
	}

	public void accept(IWorkflowsVisitor visitor) {
		try {
			visitor.visit(this);
		} catch (Exception e) {
			throw org.whole.lang.exceptions.IWholeRuntimeException.asWholeException(e, this, visitor.getBindings());
		}
	}

	private Label label;

	public Label getLabel() {
		return notifyRequested(WorkflowsFeatureDescriptorEnum.label, label);
	}

	public void setLabel(Label label) {
		notifyChanged(WorkflowsFeatureDescriptorEnum.label, this.label,
				this.label = label);
	}

	private Variable model;

	public Variable getModel() {
		return notifyRequested(WorkflowsFeatureDescriptorEnum.model, model);
	}

	public void setModel(Variable model) {
		notifyChanged(WorkflowsFeatureDescriptorEnum.model, this.model,
				this.model = model);
	}

	private ResourceKind rootResourceKind;

	public ResourceKind getRootResourceKind() {
		return notifyRequested(WorkflowsFeatureDescriptorEnum.rootResourceKind,
				rootResourceKind);
	}

	public void setRootResourceKind(ResourceKind rootResourceKind) {
		notifyChanged(WorkflowsFeatureDescriptorEnum.rootResourceKind,
				this.rootResourceKind, this.rootResourceKind = rootResourceKind);
	}

	private Expression rootResource;

	public Expression getRootResource() {
		return notifyRequested(WorkflowsFeatureDescriptorEnum.rootResource,
				rootResource);
	}

	public void setRootResource(Expression rootResource) {
		notifyChanged(WorkflowsFeatureDescriptorEnum.rootResource,
				this.rootResource, this.rootResource = rootResource);
	}

	public IEntity wGet(int index) {
		switch (index) {
		case 0:
			return getLabel().wGetAdaptee(false);
		case 1:
			return getModel().wGetAdaptee(false);
		case 2:
			return getRootResourceKind().wGetAdaptee(false);
		case 3:
			return getRootResource().wGetAdaptee(false);
		default:
			throw new IllegalArgumentException();
		}
	}

	public void wSet(int index, IEntity value) {
		switch (index) {
		case 0:
			setLabel(value.wGetAdapter(WorkflowsEntityDescriptorEnum.Label));
			break;
		case 1:
			setModel(value.wGetAdapter(WorkflowsEntityDescriptorEnum.Variable));
			break;
		case 2:
			setRootResourceKind(value
					.wGetAdapter(WorkflowsEntityDescriptorEnum.ResourceKind));
			break;
		case 3:
			setRootResource(value
					.wGetAdapter(WorkflowsEntityDescriptorEnum.Expression));
			break;
		default:
			throw new IllegalArgumentException();
		}
	}

	public int wSize() {
		return 4;
	}
}
