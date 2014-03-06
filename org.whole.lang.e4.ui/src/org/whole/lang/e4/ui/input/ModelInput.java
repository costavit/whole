/**
 * Copyright 2004-2014 Riccardo Solmi. All rights reserved.
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
package org.whole.lang.e4.ui.input;

import org.eclipse.core.resources.IFile;
import org.whole.lang.codebase.IFilePersistenceProvider;
import org.whole.lang.codebase.IPersistenceKit;
import org.whole.lang.model.IEntity;
import org.whole.lang.reflect.ReflectionFactory;
import org.whole.lang.ui.input.IModelInput;

/**
 * @author Enrico Persiani
 */
public class ModelInput implements IModelInput {
	protected final IFile file;
	protected final String basePersistenceKitId;
	protected String overridePersistenceKitId;
	protected Boolean readable;

	public ModelInput(IFile file, String basePersistenceKitId) {
		if (file == null || basePersistenceKitId == null)
			throw new NullPointerException();
		this.file = file;
		this.basePersistenceKitId = basePersistenceKitId;
		this.overridePersistenceKitId = null;
		this.readable = null;
	}

	@Override
	public IFile getFile() {
		return file;
	}

	@Override
	public IPersistenceKit getPersistenceKit() {
		return ReflectionFactory.getPersistenceKit(overridePersistenceKitId != null ?
				overridePersistenceKitId : basePersistenceKitId);
	}

	@Override
	public IPersistenceKit getBasePersistenceKit() {
		return ReflectionFactory.getPersistenceKit(basePersistenceKitId);
	}

	@Override
	public String getOverridePersistenceKitId() {
		return this.overridePersistenceKitId;
	}
	@Override
	public void setOverridePersistenceKitId(String overridePersistenceKitId) {
		this.overridePersistenceKitId = overridePersistenceKitId;
		this.readable = null;
	}

	@Override
	public IEntity readModel() throws Exception {
		try {
			IFilePersistenceProvider pp = new IFilePersistenceProvider(getFile());
			IEntity readModel = getPersistenceKit().readModel(pp);
			this.readable = true;
			return readModel;
		} catch (Exception e) {
			this.readable = false;
			throw e;
		}
	}

	@Override
	public boolean isReadable() {
		if (this.readable != null)
			return this.readable;

		try {
			IFilePersistenceProvider pp = new IFilePersistenceProvider(getFile());
			getPersistenceKit().readModel(pp);
			return this.readable = true;
		} catch (Exception e) {
			return this.readable = false;
		}
	}
}
