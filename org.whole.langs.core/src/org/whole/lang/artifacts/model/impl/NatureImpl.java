package org.whole.lang.artifacts.model.impl;

import org.whole.lang.model.AbstractDataEntity;
import org.whole.lang.artifacts.model.*;
import org.whole.lang.artifacts.visitors.IArtifactsVisitor;
import org.whole.lang.artifacts.reflect.ArtifactsEntityDescriptorEnum;
import org.whole.lang.reflect.EntityDescriptor;

/** 
 * @generator Whole
 */
public class NatureImpl extends AbstractDataEntity implements Nature {
	private static final long serialVersionUID = 1;
	private String value;

	public String getValue() {
		return notifyRequested(value);
	}

	public void setValue(String value) {
		notifyChanged(this.value, this.value = value);
	}

	public void accept(IArtifactsVisitor visitor) {
		try {
			visitor.visit(this);
		} catch (Exception e) {
			throw org.whole.lang.exceptions.WholeExceptionUtil.asWholeException(e, this, visitor.getBindings());
		}
	}

	public int wGetEntityOrd() {
		return ArtifactsEntityDescriptorEnum.Nature_ord;
	}

	public EntityDescriptor<Nature> wGetEntityDescriptor() {
		return ArtifactsEntityDescriptorEnum.Nature;
	}

	public Object wGetValue() {
		return getValue();
	}

	public void wSetValue(Object value) {
		setValue((String) value);
	}

	public String wStringValue() {
		return getValue();
	}

	public void wSetValue(String value) {
		setValue(value);
	}
}
