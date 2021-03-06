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

/**
 * @author Enrico Persiani
 */
public class SuperMethodReferenceFigure extends ContentPaneFigure {
	private IFigure f1, f2, f3;

	public SuperMethodReferenceFigure() {
		super(new RowLayout().withSpacing(4));
		initContentPanes(3);
		add(createContentPane(0));
		f1 = addContentLight(".");
		addKeyword("super");
		addContentLight("::");
		f2 = addContentLight("<");
		add(createContentPane(1));
		f3 = addContentLight(">");
		add(createContentPane(2));
	}

	public void hideQualifierSeparator(boolean value) {
		f1.setVisible(!value);
	}

	public void hideTypeArguments(boolean value) {
		f2.setVisible(!value);
		f3.setVisible(!value);
	}
}
