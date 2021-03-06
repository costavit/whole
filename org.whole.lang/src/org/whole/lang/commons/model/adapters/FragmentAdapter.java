package org.whole.lang.commons.model.adapters;

import org.whole.lang.model.adapters.AbstractEntityAdapter;
import org.whole.lang.commons.model.*;
import org.whole.lang.model.IEntity;
import org.whole.lang.commons.visitors.ICommonsVisitor;
import org.whole.lang.reflect.EntityDescriptor;
import org.whole.lang.commons.reflect.CommonsEntityDescriptorEnum;
import org.whole.lang.commons.reflect.CommonsFeatureDescriptorEnum;

/** 
 * @generator Whole
 */
public class FragmentAdapter extends AbstractEntityAdapter implements Fragment {
	private static final long serialVersionUID = 1;

	public FragmentAdapter(IEntity implementor) {
		super(implementor);
	}

	public FragmentAdapter() {
	}

	public void accept(ICommonsVisitor visitor) {
		if (visitor.visitAdapter(this))
			visitor.visit(this);
	}

	public EntityDescriptor<Fragment> wGetEntityDescriptor() {
		return CommonsEntityDescriptorEnum.Fragment;
	}

	public Any getRootEntity() {
		return wGet(CommonsFeatureDescriptorEnum.rootEntity).wGetAdapter(
				CommonsEntityDescriptorEnum.Any);
	}

	public void setRootEntity(Any rootEntity) {
		wSet(CommonsFeatureDescriptorEnum.rootEntity, rootEntity);
	}
}
