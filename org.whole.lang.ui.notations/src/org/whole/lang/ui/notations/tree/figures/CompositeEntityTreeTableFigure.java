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
package org.whole.lang.ui.notations.tree.figures;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.Rectangle;
import org.whole.lang.reflect.EntityDescriptor;
import org.whole.lang.reflect.FeatureDescriptor;
import org.whole.lang.ui.figures.AnchorFactory;
import org.whole.lang.ui.figures.EntityFigure;
import org.whole.lang.ui.figures.FigurePrefs;
import org.whole.lang.ui.figures.NodeFigure;
import org.whole.lang.ui.figures.TableFigure;
import org.whole.lang.ui.figures.TableRowFigure;
import org.whole.lang.ui.layout.Alignment;
import org.whole.lang.ui.layout.ColumnLayout;
import org.whole.lang.ui.layout.TableLayout;

/**
 * @author Riccardo Solmi
 */
public class CompositeEntityTreeTableFigure extends NodeFigure {
	protected boolean isRightToLeft;
	protected final EntityFigure titleFigure;
	protected TableFigure tableFigure;

	public CompositeEntityTreeTableFigure(EntityDescriptor<?> ed, boolean isRightToLeft) {
		this.isRightToLeft = isRightToLeft;

		setLayoutManager(new ColumnLayout().withAutoresizeWeight(1f)
				//.setMarginLeft(4)
				);
		initContentPanes(1);

		titleFigure = TreeNotationUtils.createTitleFigure(ed.getName(), createFoldingToggle(0));

		EntityDescriptor<?> elementEntityDescriptor = ed.getEntityDescriptor(0);
		//max is a workaround for data and composite entities
		tableFigure = createTableFigure(Math.max(1, elementEntityDescriptor.featureSize()));
		if (elementEntityDescriptor.getEntityKind().isSimple())
			tableFigure.add(createTableHeadersRow(elementEntityDescriptor), TableLayout.Placement.HEADER);
		initColumnAlignments(tableFigure.getLayoutManager(), elementEntityDescriptor);

		add(titleFigure);
		add(createContentPane(0, tableFigure));
	}

	protected TableRowFigure createTableHeadersRow(EntityDescriptor<?> elementEntityDescriptor) {
		TableRowFigure tableHeaderFigure = new TableRowFigure();
		for (FeatureDescriptor fd : elementEntityDescriptor.getEntityFeatureDescriptors())
			tableHeaderFigure.addLabel(fd.getName());
		return tableHeaderFigure;
	}

	protected void initColumnAlignments(TableLayout tableLayout, EntityDescriptor<?> elementEntityDescriptor) {
		if (elementEntityDescriptor.getEntityKind().isData())
			initColumnAlignment(tableLayout, 0, elementEntityDescriptor);
		else if (elementEntityDescriptor.featureSize() == 0)
			return;
		else
			for (int i=0; i<tableLayout.columns(); i++) {
				EntityDescriptor<?> columnEntityDescriptor = elementEntityDescriptor.getEntityDescriptor(i);
				if (columnEntityDescriptor.getEntityKind().isData()) {
					initColumnAlignment(tableLayout, i, columnEntityDescriptor);
				}
			}
	}

	protected void initColumnAlignment(TableLayout tableLayout, int i, EntityDescriptor<?> columnEntityDescriptor) {
		switch (columnEntityDescriptor.getDataKind()) {
		case BOOLEAN:
		case BYTE:
		case CHAR:
		case DOUBLE:
		case FLOAT:
		case INT:
		case LONG:
		case SHORT:
			tableLayout.withColumnAlignment(i, Alignment.TRAILING);
			break;
		}
	}

	protected TableFigure createTableFigure(int columns) {
		return new TableFigure(columns) {
			protected void paintFigure(Graphics g) {
				super.paintFigure(g);

				g.setBackgroundColor(ColorConstants.lightGray);
				drawHeadersRowBackground(g);

				g.setForegroundColor(ColorConstants.lightGray);
				drawColumnSeparators(g);
				drawHeadersRowSeparator(g);
				
				int oldAlpha = g.getAlpha();
				g.setAlpha(80);
				drawRowSeparators(g);
				drawTableColumnsBorder(g);
				drawTableRowsBorder(g);
				g.setAlpha(oldAlpha);
			}
		};
	}

	public boolean isRightToLeft() {
		return isRightToLeft;
	}

	@Override
	protected ConnectionAnchor[] createTargetAnchors() {
		return new ConnectionAnchor[] {
			AnchorFactory.createFixedAnchor(this, isRightToLeft() ? 1.0 : 0, 0.5)
		};
	}

	protected void paintFigure(Graphics g) {
		super.paintFigure(g);
		
		Rectangle b = getBounds();
		g.setForegroundColor(FigurePrefs.blueColor);
		g.drawRoundRectangle(b.getResized(-1, -1), 8, 8);

		int oldAlpha = g.getAlpha();
		g.setAlpha(60);

		b = b.getCopy();
		b.height = titleFigure.getBounds().height;
		g.setBackgroundColor(FigurePrefs.blueColor);
		if (tableFigure.isVisible()) {
			g.setClip(b);
			g.fillRoundRectangle(b.getResized(0, 4), 8, 8);
		} else
			g.fillRoundRectangle(b, 8, 8);

		g.setAlpha(oldAlpha);
	}
}
