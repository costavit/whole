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
package org.whole.lang.workflows.ui.figures;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.FigureUtilities;
import org.eclipse.draw2d.Graphics;
import org.whole.lang.ui.figures.EntityFigure;
import org.whole.lang.ui.figures.PaintFigureHelper;
import org.whole.lang.ui.figures.TableFigure;
import org.whole.lang.ui.figures.TableRowFigure;
import org.whole.lang.ui.layout.ICompositeEntityLayout;
import org.whole.lang.ui.layout.RowLayout;
import org.whole.lang.ui.notations.NotationImages;

/**
 * @author Enrico Persiani
 */
public class LoadArtifactsFigure extends AbstractActivityWithTableFigure {
	public LoadArtifactsFigure() {
		super(7, NotationImages.WORKSPACE16);

		TableRowFigure row = new TableRowFigure();
		row.addLabel("model");
		row.add(createContentPane(1));
		contentFigure.add(row);

		row = new TableRowFigure();
		row.addLabel("");
		row.addMath(" \u2191");
		contentFigure.add(row);

		EntityFigure resourceFigure = new EntityFigure(new RowLayout().withSpacing(4));
		resourceFigure.add(createContentPane(2));
		resourceFigure.add(createContentPane(3));
		row = new TableRowFigure();
		row.addLabel("resource");
		row.add(resourceFigure);
		contentFigure.add(row);
		
		EntityFigure strategyFigure = new EntityFigure(new RowLayout().withSpacing(4));
		strategyFigure.add(createContentPane(4));
		strategyFigure.add(createContentPane(5));
		row = new TableRowFigure();
		row.addLabel("strategy");
		row.add(strategyFigure);
		contentFigure.add(row);

		row = new TableRowFigure();
		row.addLabel("default persistence");
		row.add(createContentPane(6));
		contentFigure.add(row);
	}

	@Override
	protected ICompositeEntityLayout createTableLayout(int columns) {
		return super.createTableLayout(2);
	}
	protected TableFigure createTableFigure(ICompositeEntityLayout layout) {
		return new LeftHeadersTableFigure(layout);
	}

	public void paintFigure(Graphics g) {
        super.paintFigure(g);
        PaintFigureHelper.drawGradientRoundRectangle(g, getBounds(),
        		ColorConstants.white, FigureUtilities.lighter(ColorConstants.lightGreen), ColorConstants.darkGreen, false);
	}
}
