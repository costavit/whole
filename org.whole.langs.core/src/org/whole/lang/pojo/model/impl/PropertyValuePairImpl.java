package org.whole.lang.pojo.model.impl;

import org.whole.lang.model.AbstractSimpleEntity;
import org.whole.lang.pojo.model.*;
import org.whole.lang.reflect.EntityDescriptor;
import org.whole.lang.pojo.reflect.PojoEntityDescriptorEnum;
import org.whole.lang.pojo.visitors.IPojoVisitor;
import org.whole.lang.pojo.reflect.PojoFeatureDescriptorEnum;
import org.whole.lang.model.IEntity;

/** 
 * @generator Whole
 */
public class PropertyValuePairImpl extends AbstractSimpleEntity implements
		PropertyValuePair {
	private static final long serialVersionUID = 1;

	public EntityDescriptor<PropertyValuePair> wGetEntityDescriptor() {
		return PojoEntityDescriptorEnum.PropertyValuePair;
	}

	public int wGetEntityOrd() {
		return PojoEntityDescriptorEnum.PropertyValuePair_ord;
	}

	public void accept(IPojoVisitor visitor) {
		try {
			visitor.visit(this);
		} catch (Exception e) {
			throw org.whole.lang.exceptions.WholeExceptionUtil.asWholeException(e, this, visitor.getBindings());
		}
	}

	private Name name;

	public Name getName() {
		return notifyRequested(PojoFeatureDescriptorEnum.name, name);
	}

	public void setName(Name name) {
		notifyChanged(PojoFeatureDescriptorEnum.name, this.name,
				this.name = name);
	}

	private PropertyValue value;

	public PropertyValue getValue() {
		return notifyRequested(PojoFeatureDescriptorEnum.value, value);
	}

	public void setValue(PropertyValue value) {
		notifyChanged(PojoFeatureDescriptorEnum.value, this.value,
				this.value = value);
	}

	public IEntity wGet(int index) {
		switch (index) {
		case 0:
			return getName().wGetAdaptee(false);
		case 1:
			return getValue().wGetAdaptee(false);
		default:
			throw new IllegalArgumentException();
		}
	}

	public void wSet(int index, IEntity value) {
		switch (index) {
		case 0:
			setName(value.wGetAdapter(PojoEntityDescriptorEnum.Name));
			break;
		case 1:
			setValue(value.wGetAdapter(PojoEntityDescriptorEnum.PropertyValue));
			break;
		default:
			throw new IllegalArgumentException();
		}
	}

	public int wSize() {
		return 2;
	}
}
