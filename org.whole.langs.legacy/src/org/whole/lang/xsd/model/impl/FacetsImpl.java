package org.whole.lang.xsd.model.impl;

import org.whole.lang.model.AbstractListCompositeEntity;
import org.whole.lang.xsd.model.*;
import org.whole.lang.xsd.visitors.IXsdVisitor;
import org.whole.lang.xsd.reflect.XsdEntityDescriptorEnum;
import org.whole.lang.reflect.EntityDescriptor;

/** 
 * @generator Whole
 */
public class FacetsImpl extends AbstractListCompositeEntity<Facet> implements
		Facets {
	private static final long serialVersionUID = 1;

	public void accept(IXsdVisitor visitor) {
		try {
			visitor.visit(this);
		} catch (Exception e) {
			throw org.whole.lang.exceptions.IWholeRuntimeException.asWholeException(e, this, visitor.getBindings());
		}
	}

	public int wGetEntityOrd() {
		return XsdEntityDescriptorEnum.Facets_ord;
	}

	public EntityDescriptor<Facets> wGetEntityDescriptor() {
		return XsdEntityDescriptorEnum.Facets;
	}
}
