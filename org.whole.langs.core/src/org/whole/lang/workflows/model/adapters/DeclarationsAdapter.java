package org.whole.lang.workflows.model.adapters;

import org.whole.lang.model.adapters.AbstractListEntityAdapter;
import org.whole.lang.workflows.model.*;
import org.whole.lang.model.IEntity;
import org.whole.lang.workflows.visitors.IWorkflowsVisitor;
import org.whole.lang.reflect.EntityDescriptor;
import org.whole.lang.workflows.reflect.WorkflowsEntityDescriptorEnum;

/** 
 * @generator Whole
 */
public class DeclarationsAdapter extends AbstractListEntityAdapter<Declaration>
		implements Declarations {
	private static final long serialVersionUID = 1;

	public DeclarationsAdapter(IEntity implementor) {
		super(implementor);
	}

	public DeclarationsAdapter() {
	}

	public void accept(IWorkflowsVisitor visitor) {
		if (visitor.visitAdapter(this))
			visitor.visit(this);
	}

	public EntityDescriptor<Declarations> wGetEntityDescriptor() {
		return WorkflowsEntityDescriptorEnum.Declarations;
	}
}
