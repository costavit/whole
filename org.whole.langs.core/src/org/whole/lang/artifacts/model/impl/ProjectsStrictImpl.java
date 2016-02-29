package org.whole.lang.artifacts.model.impl;

import org.whole.lang.model.AbstractUniqueListCompositeEntity;
import org.whole.lang.artifacts.model.*;
import org.whole.lang.artifacts.visitors.IArtifactsVisitor;
import org.whole.lang.artifacts.reflect.ArtifactsEntityDescriptorEnum;
import org.whole.lang.reflect.EntityDescriptor;

/** 
 * @generator Whole
 */
public class ProjectsStrictImpl extends
		AbstractUniqueListCompositeEntity<Project> implements Projects {
	private static final long serialVersionUID = 1;

	public void accept(IArtifactsVisitor visitor) {
		try {
			visitor.visit(this);
		} catch (Exception e) {
			throw org.whole.lang.exceptions.WholeExceptionUtil.asWholeException(e, this, visitor.getBindings());
		}
	}

	public int wGetEntityOrd() {
		return ArtifactsEntityDescriptorEnum.Projects_ord;
	}

	public EntityDescriptor<Projects> wGetEntityDescriptor() {
		return ArtifactsEntityDescriptorEnum.Projects;
	}
}
