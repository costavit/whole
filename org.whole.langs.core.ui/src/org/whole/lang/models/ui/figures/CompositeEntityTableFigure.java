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
package org.whole.lang.models.ui.figures;

import org.eclipse.draw2d.MarginBorder;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.whole.lang.ui.figures.ContentPaneFigure;
import org.whole.lang.ui.figures.EntityFigure;
import org.whole.lang.ui.figures.EntityLabel;
import org.whole.lang.ui.figures.FigurePrefs;
import org.whole.lang.ui.layout.Alignment;
import org.whole.lang.ui.layout.RowLayout;
import org.whole.lang.ui.layout.TableRowLayout;
import org.whole.lang.ui.layout.UnderColumnLayout;
import org.whole.lang.ui.util.UIUtils;

/**
 * @author Riccardo Solmi
 */
public class CompositeEntityTableFigure extends ContentPaneFigure {
	public CompositeEntityTableFigure() {
		super(new TableRowLayout());
		initContentPanes(5);

		add(createContentPane(2));

		EntityFigure type = new EntityFigure(new UnderColumnLayout().withMinorAlignment(Alignment.LEADING));
		type.add(createContentPane(1, new MarginBorder(0,4,0,0)));
		type.add(createContentPane(0));
		add(type);

		EntityFigure row = new EntityFigure(new RowLayout());
		row.add(createContentPane(4));
		row.add(new EntityLabel("\u2026") {
			public Color getLocalForegroundColor() {
				return FigurePrefs.contentLighterColor;
			}	
			public Font getLocalFont() {
				return UIUtils.getOpenSymbolMediumFont();
			}
		});
		row.add(createContentPane(3, new MarginBorder(0,4,0,0)));
		add(row);
	}
}
