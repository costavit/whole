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
package org.whole.lang.e4.ui.handler;

import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CommandStack;
import org.whole.lang.bindings.IBindingManager;
import org.whole.lang.e4.ui.viewers.E4GraphicalViewer;
import org.whole.lang.model.IEntity;
import org.whole.lang.ui.actions.Clipboard;
import org.whole.lang.ui.commands.ITextCommand;
import org.whole.lang.ui.commands.TextTransactionCommand;
import org.whole.lang.ui.editparts.ITextualEntityPart;
import org.whole.lang.ui.requests.TextualRequest;
import org.whole.lang.ui.util.ClipboardUtils;

/**
 * @author Enrico Persiani
 */
@SuppressWarnings("restriction")
public class PasteHandler extends ModelTransactionHandler {
	@Override
	@CanExecute
	public boolean canExecute(@Named(IServiceConstants.ACTIVE_SELECTION) IBindingManager bm) {
		if (bm.wIsSet("viewer") && Clipboard.instance().getInternalOrNativeEntityContents() == null) {
			E4GraphicalViewer viewer = (E4GraphicalViewer) bm.wGetValue("viewer");
			return ClipboardUtils.hasTextFocus(viewer) ||  ClipboardUtils.hasTextSeletion(viewer);
		} else
			return super.canExecute(bm);
	}

	@Override
	@Execute
	public void execute(@Named(IServiceConstants.ACTIVE_SELECTION) IBindingManager bm) {
		if (bm.wIsSet("viewer") && Clipboard.instance().getInternalOrNativeEntityContents() == null) {
			E4GraphicalViewer viewer = (E4GraphicalViewer) bm.wGetValue("viewer");
			IEntity focusEntity = bm.wGet("focusEntity");
			ITextualEntityPart focusPart = (ITextualEntityPart) viewer.getEditPartRegistry().get(focusEntity);
	
			String textContents = Clipboard.instance().getTextContents();
			Command command = focusPart.getCommand(TextualRequest.createInsertRequest(textContents));
	
			CommandStack commandStack = viewer.getEditDomain().getCommandStack();
			if (command instanceof ITextCommand) {
				TextTransactionCommand transactionCommand = new TextTransactionCommand();
				transactionCommand.setModel(focusEntity);
				transactionCommand.merge((ITextCommand) command);
				transactionCommand.setLabel(getLabel(bm));
				commandStack.execute(transactionCommand);
			} else {
				command.setLabel(getLabel(bm)+" text");
				commandStack.execute(command);
			}
		} else
			super.execute(bm);
	}

	public boolean isEnabled(IBindingManager bm) {
		return HandlersBehavior.canPaste(bm);
	}

	public void run(IBindingManager bm) {
		HandlersBehavior.paste(bm);
	}
	public String getLabel(IBindingManager bm) {
		return "paste";
	}
}