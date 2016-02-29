package org.whole.lang.models.model.impl;

import org.whole.lang.model.AbstractSimpleEntity;
import org.whole.lang.models.model.*;
import org.whole.lang.reflect.EntityDescriptor;
import org.whole.lang.models.reflect.ModelsEntityDescriptorEnum;
import org.whole.lang.models.visitors.IModelsVisitor;
import org.whole.lang.models.reflect.ModelsFeatureDescriptorEnum;
import org.whole.lang.model.IEntity;

/** 
 * @generator Whole
 */
public class SubtypesOfImpl extends AbstractSimpleEntity implements SubtypesOf {
	private static final long serialVersionUID = 1;

	public EntityDescriptor<SubtypesOf> wGetEntityDescriptor() {
		return ModelsEntityDescriptorEnum.SubtypesOf;
	}

	public int wGetEntityOrd() {
		return ModelsEntityDescriptorEnum.SubtypesOf_ord;
	}

	public void accept(IModelsVisitor visitor) {
		try {
			visitor.visit(this);
		} catch (Exception e) {
			throw org.whole.lang.exceptions.WholeExceptionUtil.asWholeException(e, this, visitor.getBindings());
		}
	}

	private Types types;

	public Types getTypes() {
		return notifyRequested(ModelsFeatureDescriptorEnum.types, types);
	}

	public void setTypes(Types types) {
		notifyChanged(ModelsFeatureDescriptorEnum.types, this.types,
				this.types = types);
	}

	private ForeignType foreignType;

	public ForeignType getForeignType() {
		return notifyRequested(ModelsFeatureDescriptorEnum.foreignType,
				foreignType);
	}

	public void setForeignType(ForeignType foreignType) {
		notifyChanged(ModelsFeatureDescriptorEnum.foreignType,
				this.foreignType, this.foreignType = foreignType);
	}

	public IEntity wGet(int index) {
		switch (index) {
		case 0:
			return getTypes().wGetAdaptee(false);
		case 1:
			return getForeignType().wGetAdaptee(false);
		default:
			throw new IllegalArgumentException();
		}
	}

	public void wSet(int index, IEntity value) {
		switch (index) {
		case 0:
			setTypes(value.wGetAdapter(ModelsEntityDescriptorEnum.Types));
			break;
		case 1:
			setForeignType(value
					.wGetAdapter(ModelsEntityDescriptorEnum.ForeignType));
			break;
		default:
			throw new IllegalArgumentException();
		}
	}

	public int wSize() {
		return 2;
	}
}
