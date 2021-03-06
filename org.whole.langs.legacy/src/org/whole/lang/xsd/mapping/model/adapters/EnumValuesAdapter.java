package org.whole.lang.xsd.mapping.model.adapters;

import org.whole.lang.model.adapters.AbstractCollectionEntityAdapter;
import org.whole.lang.xsd.mapping.model.*;
import org.whole.lang.model.IEntity;
import org.whole.lang.xsd.mapping.visitors.IMappingVisitor;
import org.whole.lang.reflect.EntityDescriptor;
import org.whole.lang.xsd.mapping.reflect.MappingEntityDescriptorEnum;

/** 
 * @generator Whole
 */
public class EnumValuesAdapter extends
		AbstractCollectionEntityAdapter<EnumValue> implements EnumValues {
	private static final long serialVersionUID = 1;

	public EnumValuesAdapter(IEntity implementor) {
		super(implementor);
	}

	public EnumValuesAdapter() {
	}

	public void accept(IMappingVisitor visitor) {
		if (visitor.visitAdapter(this))
			visitor.visit(this);
	}

	public EntityDescriptor<EnumValues> wGetEntityDescriptor() {
		return MappingEntityDescriptorEnum.EnumValues;
	}
}
