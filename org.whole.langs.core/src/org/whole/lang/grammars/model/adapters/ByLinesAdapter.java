package org.whole.lang.grammars.model.adapters;

import org.whole.lang.model.adapters.AbstractEntityAdapter;
import org.whole.lang.grammars.model.*;
import org.whole.lang.model.IEntity;
import org.whole.lang.grammars.visitors.IGrammarsVisitor;
import org.whole.lang.reflect.EntityDescriptor;
import org.whole.lang.grammars.reflect.GrammarsEntityDescriptorEnum;

/** 
 * @generator Whole
 */
public class ByLinesAdapter extends AbstractEntityAdapter implements ByLines {
	private static final long serialVersionUID = 1;

	public ByLinesAdapter(IEntity implementor) {
		super(implementor);
	}

	public ByLinesAdapter() {
	}

	public void accept(IGrammarsVisitor visitor) {
		if (visitor.visitAdapter(this))
			visitor.visit(this);
	}

	public EntityDescriptor<ByLines> wGetEntityDescriptor() {
		return GrammarsEntityDescriptorEnum.ByLines;
	}

	public int getValue() {
		return wIntValue();
	}

	public void setValue(int value) {
		wSetValue(value);
	}
}
