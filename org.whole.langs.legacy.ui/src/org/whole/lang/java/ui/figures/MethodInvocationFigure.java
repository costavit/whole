/**
 * Copyright 2004-2016 Riccardo Solmi. All rights reserved.
 * This file is part of the Whole Platform.
 *
 * The Whole Platform is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * The Whole Platform is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with the Whole Platform. If not, see <http://www.gnu.org/licenses/>.
 */
package org.whole.lang.java.ui.figures;

import org.eclipse.draw2d.IFigure;
import org.whole.lang.ui.figures.ContentPaneFigure;
import org.whole.lang.ui.layout.RowLayout;

public class MethodInvocationFigure extends ContentPaneFigure {
	private IFigure f1,f2,f3;

	public MethodInvocationFigure() {
		super(new RowLayout());
		initContentPanes(4);

		add(createContentPane(0));
		f1 = addContentLight(".");
		f2 = addContentLight("<");
		add(createContentPane(1));
		f3 = addContentLight(">");
		add(createContentPane(2));
		addContentLight("(");
		add(createContentPane(3));
		addContentLight(")");
	}

	public void hideExpression(boolean value) {
		f1.setVisible(!value);
	}

	public void hideTypeParameters(boolean value) {
		f2.setVisible(!value);
		f3.setVisible(!value);
	}
}