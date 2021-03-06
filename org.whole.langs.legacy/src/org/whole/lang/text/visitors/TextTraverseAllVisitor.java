package org.whole.lang.text.visitors;

import org.whole.lang.text.visitors.TextIdentityUnaryVisitor;
import org.whole.lang.text.visitors.ITextVisitor;
import org.whole.lang.text.model.*;
import org.whole.lang.visitors.IVisitor;

/** 
 * @generator Whole
 */
public class TextTraverseAllVisitor extends
		TextIdentityUnaryVisitor<ITextVisitor> {
	public TextTraverseAllVisitor() {
		wSetVisitor1(this);
	}

	public TextTraverseAllVisitor(IVisitor visitor1) {
		super(visitor1);
	}

	public void visit(Document entity) {
		for (int i = 0; i < entity.size(); i++)
			entity.get(i).accept(wGetVisitor1());
	}

	public void visit(Row entity) {
		for (int i = 0; i < entity.size(); i++)
			entity.get(i).accept(wGetVisitor1());
	}
}
