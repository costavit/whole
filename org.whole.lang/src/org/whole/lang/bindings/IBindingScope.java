/**
 * Copyright 2004-2012 Riccardo Solmi. All rights reserved.
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
package org.whole.lang.bindings;

import java.util.Date;
import java.util.Set;

import org.whole.lang.iterators.IEntityIterator;
import org.whole.lang.model.EnumValue;
import org.whole.lang.model.IEntity;

/**
 * @author Riccardo Solmi
 */
public interface IBindingScope {
	public static enum Kind { SCOPE, OUTER_GROUP_ADAPTER, OUTER_SCOPE_ADAPTER, INNER_SCOPE_ADAPTER };
	
	public Kind getKind();

	public IBindingScope wClone();

	public IBindingScope wTargetScope();
	public IBindingScope wEnclosingScope();


	/**
	 * Unbind all local names.
	 */
	public void wClear();
	/**
	 * Return the set of names defined in the current scope (local).
	 */
	public Set<String> wLocalNames();
	/**
	 * Return (a copy of) the set of names local or in scope (dynamic scope chain).
	 */
	public Set<String> wNames();

	/**
	 * Add (wDef) to the current scope all bindings (local or in scope) defined
	 * in the passed scope.
	 * @param scope
	 */
	public void wAddAll(IBindingScope scope);

	/**
	 * Get the value associated to the existing name (local or in scope).
	 * Returns null if the name is undefined.
	 */
	public IEntity wGet(String name);
	
	/**
	 * Bind an existing name (local or in scope) to the value.
	 * Throws IllegalArgumentException if the name is undefined.
	 */
	public void wSet(String name, IEntity value);
	
	/**
	 * Add a value to an existing name (local or in scope).
	 * Throws IllegalArgumentException if the name is undefined.
	 */
	public void wAdd(String name, IEntity value);

	/**
	 * Bind the local name to the value; create it if undefined.
	 */
	public void wDef(String name, IEntity value);
	
	/**
	 * Returns true if the name is defined (local or in scope).
	 */
	public boolean wIsSet(String name);
	
	/**
	 * Unbind the value associated to the name (local or in scope).
	 */
	public void wUnset(String name);
	
	public boolean wBooleanValue(String name);
	public byte wByteValue(String name);
	public char wCharValue(String name);
	public double wDoubleValue(String name);
	public float wFloatValue(String name);
	public int wIntValue(String name);
	public long wLongValue(String name);
	public short wShortValue(String name);
	public String wStringValue(String name);
	public Date wDateValue(String name);
	public EnumValue wEnumValue(String name);
	public Object wGetValue(String name);

	public void wSetValue(String name, boolean value);
	public void wSetValue(String name, byte value);
	public void wSetValue(String name, char value);
	public void wSetValue(String name, double value);
	public void wSetValue(String name, float value);
	public void wSetValue(String name, int value);
	public void wSetValue(String name, long value);
	public void wSetValue(String name, short value);
	public void wSetValue(String name, String value);
	public void wSetValue(String name, Date value);
	public void wSetValue(String name, EnumValue value);
	public void wSetValue(String name, Object value);

	public void wAddValue(String name, boolean value);
	public void wAddValue(String name, byte value);
	public void wAddValue(String name, char value);
	public void wAddValue(String name, double value);
	public void wAddValue(String name, float value);
	public void wAddValue(String name, int value);
	public void wAddValue(String name, long value);
	public void wAddValue(String name, short value);
	public void wAddValue(String name, String value);
	public void wAddValue(String name, Date value);
	public void wAddValue(String name, EnumValue value);
	public void wAddValue(String name, Object value);

	public void wDefValue(String name, boolean value);
	public void wDefValue(String name, byte value);
	public void wDefValue(String name, char value);
	public void wDefValue(String name, double value);
	public void wDefValue(String name, float value);
	public void wDefValue(String name, int value);
	public void wDefValue(String name, long value);
	public void wDefValue(String name, short value);
	public void wDefValue(String name, String value);
	public void wDefValue(String name, Date value);
	public void wDefValue(String name, EnumValue value);
	public void wDefValue(String name, Object value);

	public boolean hasResultIterator();
	public <E extends IEntity> IEntityIterator<E> getResultIterator();
	public void setResultIterator(IEntityIterator<?> resultIterator);
	public IEntity getResult();
	public void setResult(IEntity value);
}
