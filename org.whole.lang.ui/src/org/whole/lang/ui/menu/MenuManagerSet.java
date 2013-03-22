/**
 * Copyright 2004-2013 Riccardo Solmi. All rights reserved.
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
package org.whole.lang.ui.menu;

import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.resource.ImageDescriptor;

/**
 * @author Enrico Persiani
 */
public class MenuManagerSet implements IItemSet<MenuManager, ImageDescriptor> {
	protected MenuManager[] menus;
	protected MenuManagerSet(MenuManager[] actions) {
		this.menus = actions;
	}
	
	public static MenuManagerSet create(MenuManager[] menus) {
		return new MenuManagerSet(menus);
	}

	public int size() {
		return menus.length;
	}
	public MenuManager get(int index) {
		return menus[index];
	}
	public String getLabel(int index) {
		return get(index).getMenuText();
	}
	public ImageDescriptor getIcon(int index) {
		return get(index).getImageDescriptor();
	}
}