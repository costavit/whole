package org.whole.lang.xsd.model.impl;

import org.whole.lang.model.AbstractSimpleEntity;
import org.whole.lang.xsd.model.*;
import org.whole.lang.reflect.EntityDescriptor;
import org.whole.lang.xsd.reflect.XsdEntityDescriptorEnum;
import org.whole.lang.xsd.visitors.IXsdVisitor;
import org.whole.lang.xsd.reflect.XsdFeatureDescriptorEnum;
import org.whole.lang.model.IEntity;

/** 
 * @generator Whole
 */
public class ImportImpl extends AbstractSimpleEntity implements Import {
	private static final long serialVersionUID = 1;

	public EntityDescriptor<Import> wGetEntityDescriptor() {
		return XsdEntityDescriptorEnum.Import;
	}

	public int wGetEntityOrd() {
		return XsdEntityDescriptorEnum.Import_ord;
	}

	public void accept(IXsdVisitor visitor) {
		try {
			visitor.visit(this);
		} catch (Exception e) {
			throw org.whole.lang.exceptions.WholeExceptionUtil.asWholeException(e, this, visitor.getBindings());
		}
	}

	private NamespaceDecls namespaces;

	public NamespaceDecls getNamespaces() {
		return notifyRequested(XsdFeatureDescriptorEnum.namespaces, namespaces);
	}

	public void setNamespaces(NamespaceDecls namespaces) {
		notifyChanged(XsdFeatureDescriptorEnum.namespaces, this.namespaces,
				this.namespaces = namespaces);
	}

	private StringData id;

	public StringData getId() {
		return notifyRequested(XsdFeatureDescriptorEnum.id, id);
	}

	public void setId(StringData id) {
		notifyChanged(XsdFeatureDescriptorEnum.id, this.id, this.id = id);
	}

	private Attributes attributes;

	public Attributes getAttributes() {
		return notifyRequested(XsdFeatureDescriptorEnum.attributes, attributes);
	}

	public void setAttributes(Attributes attributes) {
		notifyChanged(XsdFeatureDescriptorEnum.attributes, this.attributes,
				this.attributes = attributes);
	}

	private Annotation annotation;

	public Annotation getAnnotation() {
		return notifyRequested(XsdFeatureDescriptorEnum.annotation, annotation);
	}

	public void setAnnotation(Annotation annotation) {
		notifyChanged(XsdFeatureDescriptorEnum.annotation, this.annotation,
				this.annotation = annotation);
	}

	private AnyURI namespace;

	public AnyURI getNamespace() {
		return notifyRequested(XsdFeatureDescriptorEnum.namespace, namespace);
	}

	public void setNamespace(AnyURI namespace) {
		notifyChanged(XsdFeatureDescriptorEnum.namespace, this.namespace,
				this.namespace = namespace);
	}

	private AnyURI schemaLocation;

	public AnyURI getSchemaLocation() {
		return notifyRequested(XsdFeatureDescriptorEnum.schemaLocation,
				schemaLocation);
	}

	public void setSchemaLocation(AnyURI schemaLocation) {
		notifyChanged(XsdFeatureDescriptorEnum.schemaLocation,
				this.schemaLocation, this.schemaLocation = schemaLocation);
	}

	public IEntity wGet(int index) {
		switch (index) {
		case 0:
			return getNamespaces().wGetAdaptee(false);
		case 1:
			return getId().wGetAdaptee(false);
		case 2:
			return getAttributes().wGetAdaptee(false);
		case 3:
			return getAnnotation().wGetAdaptee(false);
		case 4:
			return getNamespace().wGetAdaptee(false);
		case 5:
			return getSchemaLocation().wGetAdaptee(false);
		default:
			throw new IllegalArgumentException();
		}
	}

	public void wSet(int index, IEntity value) {
		switch (index) {
		case 0:
			setNamespaces(value
					.wGetAdapter(XsdEntityDescriptorEnum.NamespaceDecls));
			break;
		case 1:
			setId(value.wGetAdapter(XsdEntityDescriptorEnum.StringData));
			break;
		case 2:
			setAttributes(value.wGetAdapter(XsdEntityDescriptorEnum.Attributes));
			break;
		case 3:
			setAnnotation(value.wGetAdapter(XsdEntityDescriptorEnum.Annotation));
			break;
		case 4:
			setNamespace(value.wGetAdapter(XsdEntityDescriptorEnum.AnyURI));
			break;
		case 5:
			setSchemaLocation(value.wGetAdapter(XsdEntityDescriptorEnum.AnyURI));
			break;
		default:
			throw new IllegalArgumentException();
		}
	}

	public int wSize() {
		return 6;
	}
}
