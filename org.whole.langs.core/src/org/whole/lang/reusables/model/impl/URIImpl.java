package org.whole.lang.reusables.model.impl;

import org.whole.lang.model.AbstractDataEntity;
import org.whole.lang.reusables.model.*;
import org.whole.lang.reusables.visitors.IReusablesVisitor;
import org.whole.lang.reusables.reflect.ReusablesEntityDescriptorEnum;
import org.whole.lang.reflect.EntityDescriptor;

/**
 *  @generator  Whole
 */
public class URIImpl extends AbstractDataEntity implements URI {
    private static final long serialVersionUID = 1;
    private String value;

    public String getValue() {
        return notifyRequested(value);
    }

    public void setValue(String value) {
        notifyChanged(this.value, this.value = value);
    }

    public void accept(IReusablesVisitor visitor) {
        visitor.visit(this);
    }

    public int wGetEntityOrd() {
        return ReusablesEntityDescriptorEnum.URI_ord;
    }

    public EntityDescriptor<URI> wGetEntityDescriptor() {
        return ReusablesEntityDescriptorEnum.URI;
    }

    public Object wGetValue() {
        return getValue();
    }

    public void wSetValue(Object value) {
        setValue((String) value);
    }

    public String wStringValue() {
        return getValue();
    }

    public void wSetValue(String value) {
        setValue(value);
    }
}