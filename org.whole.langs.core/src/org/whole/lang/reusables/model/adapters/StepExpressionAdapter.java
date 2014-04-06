package org.whole.lang.reusables.model.adapters;

import org.whole.lang.model.adapters.AbstractEntityAdapter;
import org.whole.lang.reusables.model.*;
import org.whole.lang.model.IEntity;
import org.whole.lang.reusables.visitors.IReusablesVisitor;
import org.whole.lang.reflect.EntityDescriptor;
import org.whole.lang.reusables.reflect.ReusablesEntityDescriptorEnum;

/**
 *  @generator  Whole
 */
public class StepExpressionAdapter extends AbstractEntityAdapter implements StepExpression {
    private static final long serialVersionUID = 1;

    public StepExpressionAdapter(IEntity implementor) {
        super(implementor);
    }

    public StepExpressionAdapter() {
    }

    public void accept(IReusablesVisitor visitor) {
        if (visitor.visitAdapter(this))
            visitor.visit(this);
    }

    public EntityDescriptor<StepExpression> wGetEntityDescriptor() {
        return ReusablesEntityDescriptorEnum.StepExpression;
    }
}
