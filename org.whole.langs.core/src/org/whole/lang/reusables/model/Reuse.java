/**
 *  Copyright 2004-2016 Riccardo Solmi. All rights reserved.
 *  This file is part of the Whole Platform.
 *  
 *  The Whole Platform is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU Lesser General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *  
 *  The Whole Platform is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 *  GNU Lesser General Public License for more details.
 *  
 *  You should have received a copy of the GNU Lesser General Public License
 *  along with the Whole Platform. If not, see <http://www.gnu.org/licenses/>.
 */
package org.whole.lang.reusables.model;


/**
 *  @generator Whole
 */
public interface Reuse extends IReusablesEntity, Reusable {


    public Source getSource();

    public void setSource(Source source);

    public Reusable getOriginal();

    public void setOriginal(Reusable original);

    public PathExpression getAdapter();

    public void setAdapter(PathExpression adapter);

    public Reusable getAdapted();

    public void setAdapted(Reusable adapted);

    public Revision getAdaptedRevision();

    public void setAdaptedRevision(Revision adaptedRevision);
}
