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
package org.whole.gen.util;

import java.io.File;

import org.whole.lang.util.StringUtils;

/**
 * @author Enrico Persiani
 */
public class FolderClassFilter implements IClassFilter {
	protected File folder;

	public FolderClassFilter(String location) {
		this(new File(location));
	}

	public FolderClassFilter(File folder) {
		this.folder = folder.exists() ? folder : null;
	}
	public boolean isFiltered(String className) {
		String fullpath = StringUtils.toResourceClasspath(className);
		return folder != null && new File(folder, fullpath).exists();
	}
}
