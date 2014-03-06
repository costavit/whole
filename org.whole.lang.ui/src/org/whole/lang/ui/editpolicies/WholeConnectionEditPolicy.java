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
package org.whole.lang.ui.editpolicies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gef.editpolicies.ConnectionEditPolicy;
import org.eclipse.gef.requests.GroupRequest;
import org.whole.lang.ui.editparts.IEntityPart;
import org.whole.lang.ui.requests.DeletePartRequest;
import org.whole.lang.ui.requests.ICommandFactory;
import org.whole.lang.ui.requests.PartRequest;

/**
 * @author Enrico Persiani
 */
public class WholeConnectionEditPolicy extends ConnectionEditPolicy {
	private ICommandFactory commandFactory;

	public WholeConnectionEditPolicy(ICommandFactory commandFactory) {
		this.commandFactory = commandFactory;
	}

	protected Command getDeleteCommand(GroupRequest deleteRequest) {
		if (commandFactory == null)
			return UnexecutableCommand.INSTANCE; //FIXME
		return commandFactory.create(new DeletePartRequest(PartRequest.DELETE, (IEntityPart)getHost(), deleteRequest.getEditParts()));
	}
}
