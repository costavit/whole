package org.whole.lang.artifacts.model.adapters;

import org.whole.lang.model.adapters.AbstractEntityAdapter;
import org.whole.lang.artifacts.model.*;
import org.whole.lang.model.IEntity;
import org.whole.lang.artifacts.visitors.IArtifactsVisitor;
import org.whole.lang.reflect.EntityDescriptor;
import org.whole.lang.artifacts.reflect.ArtifactsEntityDescriptorEnum;

/** 
 * @generator Whole
 */
public class CopyrightAdapter extends AbstractEntityAdapter implements
		Copyright {
	private static final long serialVersionUID = 1;

	public CopyrightAdapter(IEntity implementor) {
		super(implementor);
	}

	public CopyrightAdapter() {
	}

	public void accept(IArtifactsVisitor visitor) {
		if (visitor.visitAdapter(this))
			visitor.visit(this);
	}

	public EntityDescriptor<Copyright> wGetEntityDescriptor() {
		return ArtifactsEntityDescriptorEnum.Copyright;
	}

	public String getValue() {
		return wStringValue();
	}

	public void setValue(String value) {
		wSetValue(value);
	}
}
