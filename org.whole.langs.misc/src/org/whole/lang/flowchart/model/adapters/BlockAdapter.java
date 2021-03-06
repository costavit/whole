package org.whole.lang.flowchart.model.adapters;

import org.whole.lang.model.adapters.AbstractEntityAdapter;
import org.whole.lang.flowchart.model.*;
import org.whole.lang.model.IEntity;
import org.whole.lang.flowchart.visitors.IFlowchartVisitor;
import org.whole.lang.reflect.EntityDescriptor;
import org.whole.lang.flowchart.reflect.FlowchartEntityDescriptorEnum;
import org.whole.lang.flowchart.reflect.FlowchartFeatureDescriptorEnum;

/** 
 * @generator Whole
 */
public class BlockAdapter extends AbstractEntityAdapter implements Block {
	private static final long serialVersionUID = 1;

	public BlockAdapter(IEntity implementor) {
		super(implementor);
	}

	public BlockAdapter() {
	}

	public void accept(IFlowchartVisitor visitor) {
		if (visitor.visitAdapter(this))
			visitor.visit(this);
	}

	public EntityDescriptor<Block> wGetEntityDescriptor() {
		return FlowchartEntityDescriptorEnum.Block;
	}

	public Pixels getX() {
		return wGet(FlowchartFeatureDescriptorEnum.x).wGetAdapter(
				FlowchartEntityDescriptorEnum.Pixels);
	}

	public void setX(Pixels x) {
		wSet(FlowchartFeatureDescriptorEnum.x, x);
	}

	public Pixels getY() {
		return wGet(FlowchartFeatureDescriptorEnum.y).wGetAdapter(
				FlowchartEntityDescriptorEnum.Pixels);
	}

	public void setY(Pixels y) {
		wSet(FlowchartFeatureDescriptorEnum.y, y);
	}

	public Pixels getWidth() {
		return wGet(FlowchartFeatureDescriptorEnum.width).wGetAdapter(
				FlowchartEntityDescriptorEnum.Pixels);
	}

	public void setWidth(Pixels width) {
		wSet(FlowchartFeatureDescriptorEnum.width, width);
	}

	public Pixels getHeight() {
		return wGet(FlowchartFeatureDescriptorEnum.height).wGetAdapter(
				FlowchartEntityDescriptorEnum.Pixels);
	}

	public void setHeight(Pixels height) {
		wSet(FlowchartFeatureDescriptorEnum.height, height);
	}

	public Text getDescription() {
		return wGet(FlowchartFeatureDescriptorEnum.description).wGetAdapter(
				FlowchartEntityDescriptorEnum.Text);
	}

	public void setDescription(Text description) {
		wSet(FlowchartFeatureDescriptorEnum.description, description);
	}

	public Transition getTargetTransition() {
		return wGet(FlowchartFeatureDescriptorEnum.targetTransition)
				.wGetAdapter(FlowchartEntityDescriptorEnum.Transition);
	}

	public void setTargetTransition(Transition targetTransition) {
		wSet(FlowchartFeatureDescriptorEnum.targetTransition, targetTransition);
	}

	public Transition getSourceTransition() {
		return wGet(FlowchartFeatureDescriptorEnum.sourceTransition)
				.wGetAdapter(FlowchartEntityDescriptorEnum.Transition);
	}

	public void setSourceTransition(Transition sourceTransition) {
		wSet(FlowchartFeatureDescriptorEnum.sourceTransition, sourceTransition);
	}
}
