package org.whole.lang.changes.model.impl;

import org.whole.lang.model.AbstractListCompositeEntity;
import org.whole.lang.changes.model.*;
import org.whole.lang.changes.visitors.IChangesVisitor;
import org.whole.lang.changes.reflect.ChangesEntityDescriptorEnum;
import org.whole.lang.reflect.EntityDescriptor;

/**
 *  @generator  Whole
 */
public class RevisionsImpl extends AbstractListCompositeEntity<Revision> implements Revisions {
    private static final long serialVersionUID = 1;

    public void accept(IChangesVisitor visitor) {
		try {
	        visitor.visit(this);
		} catch (Exception e) {
			throw org.whole.lang.exceptions.WholeExceptionUtil.asWholeException(e, this, visitor.getBindings());
		}    }

    public int wGetEntityOrd() {
        return ChangesEntityDescriptorEnum.Revisions_ord;
    }

    public EntityDescriptor<Revisions> wGetEntityDescriptor() {
        return ChangesEntityDescriptorEnum.Revisions;
    }
}
