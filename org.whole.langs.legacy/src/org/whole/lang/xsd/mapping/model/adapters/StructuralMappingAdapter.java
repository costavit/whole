package org.whole.lang.xsd.mapping.model.adapters;

import org.whole.lang.model.adapters.AbstractEntityAdapter;
import org.whole.lang.xsd.mapping.model.*;
import org.whole.lang.model.IEntity;
import org.whole.lang.xsd.mapping.visitors.IMappingVisitor;
import org.whole.lang.reflect.EntityDescriptor;
import org.whole.lang.xsd.mapping.reflect.MappingEntityDescriptorEnum;
import org.whole.lang.xsd.mapping.reflect.MappingFeatureDescriptorEnum;

/** 
 * @generator Whole
 */
public class StructuralMappingAdapter extends AbstractEntityAdapter implements
		StructuralMapping {
	private static final long serialVersionUID = 1;

	public StructuralMappingAdapter(IEntity implementor) {
		super(implementor);
	}

	public StructuralMappingAdapter() {
	}

	public void accept(IMappingVisitor visitor) {
		if (visitor.visitAdapter(this))
			visitor.visit(this);
	}

	public EntityDescriptor<StructuralMapping> wGetEntityDescriptor() {
		return MappingEntityDescriptorEnum.StructuralMapping;
	}

	public URI getContextEntityType() {
		return wGet(MappingFeatureDescriptorEnum.contextEntityType)
				.wGetAdapter(MappingEntityDescriptorEnum.URI);
	}

	public void setContextEntityType(URI contextEntityType) {
		wSet(MappingFeatureDescriptorEnum.contextEntityType, contextEntityType);
	}

	public NCName getName() {
		return wGet(MappingFeatureDescriptorEnum.name).wGetAdapter(
				MappingEntityDescriptorEnum.NCName);
	}

	public void setName(NCName name) {
		wSet(MappingFeatureDescriptorEnum.name, name);
	}

	public URI getEntityType() {
		return wGet(MappingFeatureDescriptorEnum.entityType).wGetAdapter(
				MappingEntityDescriptorEnum.URI);
	}

	public void setEntityType(URI entityType) {
		wSet(MappingFeatureDescriptorEnum.entityType, entityType);
	}

	public URI getFeatureType() {
		return wGet(MappingFeatureDescriptorEnum.featureType).wGetAdapter(
				MappingEntityDescriptorEnum.URI);
	}

	public void setFeatureType(URI featureType) {
		wSet(MappingFeatureDescriptorEnum.featureType, featureType);
	}
}
