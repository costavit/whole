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
package org.whole.lang.reusables.visitors;

import org.whole.lang.visitors.IVisitor;
import org.whole.lang.visitors.AbstractUnaryVisitor;
import org.whole.lang.reusables.model.*;
import org.whole.lang.model.IEntity;

/**
 *  @generator Whole
 */
public class ReusablesIdentityUnaryVisitor<V extends IVisitor>  extends AbstractUnaryVisitor<V> implements IReusablesVisitor {

    public ReusablesIdentityUnaryVisitor() {
        super(null);
    }

    public ReusablesIdentityUnaryVisitor(IVisitor visitor1) {
        super(visitor1);
    }

    public void visit(IEntity entity) {
        ((IReusablesEntity) entity).accept(this);
    }

    public void visit(Adapt entity) {
    }

    public void visit(Reuse entity) {
    }

    public void visit(Synch entity) {
    }

    public void visit(Include entity) {
    }

    public void visit(Reusables entity) {
    }

    public void visit(ReferenceStep entity) {
    }

    public void visit(Resource entity) {
    }

    public void visit(Registry entity) {
    }

    public void visit(WorkspacePath entity) {
    }

    public void visit(FileSystemPath entity) {
    }

    public void visit(ClassPathURI entity) {
    }

    public void visit(URI entity) {
    }

    public void visit(Persistence entity) {
    }
}
