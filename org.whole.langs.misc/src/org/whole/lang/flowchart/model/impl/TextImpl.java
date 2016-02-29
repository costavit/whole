package org.whole.lang.flowchart.model.impl;

import org.whole.lang.model.AbstractDataEntity;
import org.whole.lang.flowchart.model.*;
import org.whole.lang.flowchart.visitors.IFlowchartVisitor;
import org.whole.lang.flowchart.reflect.FlowchartEntityDescriptorEnum;
import org.whole.lang.reflect.EntityDescriptor;

/** 
 * @generator Whole
 */
public class TextImpl extends AbstractDataEntity implements Text {
	private static final long serialVersionUID = 1;
	private String value;

	public String getValue() {
		return notifyRequested(value);
	}

	public void setValue(String value) {
		notifyChanged(this.value, this.value = value);
	}

	public void accept(IFlowchartVisitor visitor) {
		try {
			visitor.visit(this);
		} catch (Exception e) {
			throw org.whole.lang.exceptions.WholeExceptionUtil.asWholeException(e, this, visitor.getBindings());
		}
	}

	public int wGetEntityOrd() {
		return FlowchartEntityDescriptorEnum.Text_ord;
	}

	public EntityDescriptor<Text> wGetEntityDescriptor() {
		return FlowchartEntityDescriptorEnum.Text;
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
