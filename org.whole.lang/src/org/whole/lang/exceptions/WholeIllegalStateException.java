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
package org.whole.lang.exceptions;

import org.whole.lang.bindings.IBindingManager;
import org.whole.lang.model.IEntity;

/**
 * @author Riccardo Solmi
 */
public class WholeIllegalStateException extends IllegalStateException implements IWholeRuntimeException {
	private static final long serialVersionUID = 1L;

	public WholeIllegalStateException(String message) {
		super(message);
	}
	public WholeIllegalStateException(String message, Throwable cause) {
		super(message, cause);
	}

	private IEntity sourceEntity;
	private IBindingManager bindings;
	public RuntimeException withSourceInfo(IEntity sourceEntity, IBindingManager bindings) {
		this.sourceEntity = sourceEntity;
		this.bindings = bindings;
		return this;
	}
	public IEntity getSourceEntity() {
		return sourceEntity;
	}
	public IBindingManager getBindings() {
		return bindings;
	}
}
