package org.whole.lang.templates.model.impl;

import org.whole.lang.model.AbstractCollectionCompositeEntity;
import org.whole.lang.templates.model.*;
import org.whole.lang.templates.visitors.ITemplatesVisitor;
import org.whole.lang.templates.reflect.TemplatesEntityDescriptorEnum;
import org.whole.lang.reflect.EntityDescriptor;

/** 
 * @generator Whole
 */
public class NamesImpl extends AbstractCollectionCompositeEntity<Name>
		implements Names {
	private static final long serialVersionUID = 1;

	public void accept(ITemplatesVisitor visitor) {
		try {
			visitor.visit(this);
		} catch (Exception e) {
			throw org.whole.lang.exceptions.WholeExceptionUtil.asWholeException(e, this, visitor.getBindings());
		}
	}

	public int wGetEntityOrd() {
		return TemplatesEntityDescriptorEnum.Names_ord;
	}

	public EntityDescriptor<Names> wGetEntityDescriptor() {
		return TemplatesEntityDescriptorEnum.Names;
	}
}
