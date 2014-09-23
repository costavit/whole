package org.whole.lang.queries.model.adapters;

import org.whole.lang.model.adapters.AbstractEntityAdapter;
import org.whole.lang.queries.model.*;
import org.whole.lang.model.IEntity;
import org.whole.lang.queries.visitors.IQueriesVisitor;
import org.whole.lang.reflect.EntityDescriptor;
import org.whole.lang.queries.reflect.QueriesEntityDescriptorEnum;

/**
 *  @generator  Whole
 */
public class PruneOrPredicateAdapter extends AbstractEntityAdapter implements PruneOrPredicate {
    private static final long serialVersionUID = 1;

    public PruneOrPredicateAdapter(IEntity implementor) {
        super(implementor);
    }

    public PruneOrPredicateAdapter() {
    }

    public void accept(IQueriesVisitor visitor) {
        if (visitor.visitAdapter(this))
            visitor.visit(this);
    }

    public EntityDescriptor<PruneOrPredicate> wGetEntityDescriptor() {
        return QueriesEntityDescriptorEnum.PruneOrPredicate;
    }
}
