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
package org.whole.lang.semantics.ui.figures;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.Rectangle;
import org.whole.lang.ui.figures.FigurePrefs;
import org.whole.lang.ui.figures.TableFigure;
import org.whole.lang.ui.layout.Alignment;
import org.whole.lang.ui.layout.TableLayout;

/**
 * @author Riccardo Solmi
 */
public class BindingsTableFigure extends TableFigure {
	public BindingsTableFigure() {
		super(new TableLayout(2)
				.withColumnAlignment(0, Alignment.CENTER)
				.withRowSpacing(4).withColumnSpacing(8)
				.withMargin(1, 5, 2, 5));
	}

	protected void paintFigure(Graphics g) {
		super.paintFigure(g);

		TableLayout l = getLayoutManager();
		if (l.rows() == 0)
			return;

		g.setBackgroundColor(FigurePrefs.templateLanguageColor);
		int oldAlpha = g.getAlpha();
		g.setAlpha(FigurePrefs.templateLanguageAlpha);
		Rectangle tb = getTableBounds();
		Rectangle cb1 = l.getColumnBounds(0);
		g.fillRectangle(cb1.x, tb.y, cb1.width, tb.height-1);
		g.setAlpha(oldAlpha);

		g.setForegroundColor(ColorConstants.lightGray);
		drawColumnSeparators(g);
	}

	protected int getBorderLineWidth() {
		return 1;
	}
}
