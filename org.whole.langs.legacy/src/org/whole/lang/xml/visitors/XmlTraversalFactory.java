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
package org.whole.lang.xml.visitors;

import org.whole.lang.visitors.GenericTraversalFactory;
import org.whole.lang.visitors.IVisitor;
import org.whole.lang.visitors.IBinaryVisitor;
import org.whole.lang.visitors.IUnaryVisitor;

/**
 *  @generator Whole
 */
public class XmlTraversalFactory extends GenericTraversalFactory {
    public static final XmlTraversalFactory instance = new XmlTraversalFactory();

    private XmlTraversalFactory() {
    }

    protected IVisitor ensureSpecific(IVisitor visitor) {
        if (visitor instanceof IXmlVisitor)
            return visitor;
        else
            return new XmlForwardGenericVisitor(visitor);
    }

    public IVisitor failure() {
        return new XmlFailureVisitor();
    }

    public IVisitor identity() {
        return new XmlIdentityVisitor();
    }

    public IVisitor forwardStaged() {
        return new XmlForwardStagedVisitor();
    }

    public IBinaryVisitor sequence(IVisitor visitor1, IVisitor visitor2) {
        return new XmlSequenceVisitor(ensureSpecific(visitor1), ensureSpecific(visitor2));
    }

    public IUnaryVisitor traverseAll(IVisitor visitor1) {
        return new XmlTraverseAllVisitor(ensureSpecific(visitor1));
    }

    public IUnaryVisitor traverseAllChildren(IVisitor visitor1) {
        return new XmlTraverseAllChildrenVisitor(ensureSpecific(visitor1));
    }

    public IUnaryVisitor traverseAllAdjacents(IVisitor visitor1) {
        return new XmlTraverseAllAdjacentsVisitor(ensureSpecific(visitor1));
    }
}
