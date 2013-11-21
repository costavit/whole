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
package org.whole.lang.e4.ui.jobs;

import java.lang.reflect.InvocationTargetException;
import java.util.Set;
import java.util.TreeSet;

import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.services.events.IEventBroker;
import org.eclipse.e4.ui.di.UISynchronize;
import org.whole.lang.bindings.BindingManagerFactory;
import org.whole.lang.bindings.IBindingManager;
import org.whole.lang.bindings.ITransactionScope;
import org.whole.lang.commons.factories.CommonsEntityAdapterFactory;
import org.whole.lang.commons.reflect.CommonsEntityDescriptorEnum;
import org.whole.lang.e4.ui.api.IUIConstants;
import org.whole.lang.e4.ui.viewers.IEntityPartViewer;
import org.whole.lang.factories.GenericEntityFactory;
import org.whole.lang.iterators.ConstantIterator;
import org.whole.lang.iterators.IEntityIterator;
import org.whole.lang.matchers.Matcher;
import org.whole.lang.misc.factories.MiscEntityFactory;
import org.whole.lang.model.IEntity;
import org.whole.lang.operations.IOperationProgressMonitor;
import org.whole.lang.operations.OperationCanceledException;
import org.whole.lang.util.BehaviorUtils;
import org.whole.lang.util.BindingUtils;
import org.whole.lang.util.EntityUtils;
import org.whole.lang.visitors.IVisitor;
import org.whole.lang.visitors.MissingVariableException;
import org.whole.lang.workflows.factories.WorkflowsEntityFactory;
import org.whole.lang.workflows.model.Variable;
import org.whole.lang.workflows.reflect.WorkflowsEntityDescriptorEnum;

/**
 * @author Enrico Persiani
 */
public class ExecuteSampleModelRunnable extends AbstractRunnableWithProgress {
	protected IEntity contextModel;
	protected IEntity selfModel;
	protected IEntity behaviorModel;

	public ExecuteSampleModelRunnable(IEclipseContext context, IBindingManager bm, String label,
			IEntity contextModel, IEntity selfModel, IEntity behaviorModel) {
		super(context, bm, label, false);
		this.contextModel = contextModel;
		this.selfModel = selfModel;
		this.behaviorModel = behaviorModel;
	}

	@Override
	public void run(IOperationProgressMonitor pm) throws InvocationTargetException, InterruptedException {
		IEntity selfEntity = EntityUtils.mapEntity(selfModel, EntityUtils.clone(EntityUtils.getCompoundRoot(selfModel)));

		Set<String> initialNames = bm.wNames();

		pm.beginTask("Executing sample...", IOperationProgressMonitor.TOTAL_WORK);

		behaviorModel = BehaviorUtils.apply(
				"whole:org.whole.lang.ui.views:SamplePerspectiveSemantics#SampleViewBehavior",
				behaviorModel, bm);

		IEntity derivedModel = null;
		try {
			//TODO investigate this workaround
			if (bm.wGet("self") != selfEntity)
				bm.wDef("self", selfEntity);
			IEntityIterator<?> iterator = BehaviorUtils.lazyEvaluate(behaviorModel, 0, bm);
			if (bm.wGet("self") != selfEntity)
				bm.wDef("self", selfEntity);
			iterator.reset(selfEntity);

			if (iterator.getClass().equals(ConstantIterator.class)) {
				IEntity result = iterator.next();
				if (result == null || !EntityUtils.isData(result))
					derivedModel = result;
				else {
					Object resultValue = result.wGetValue();
					derivedModel = IVisitor.class.isInstance(resultValue) ?
							BindingManagerFactory.instance.createValue(Matcher.match((IVisitor) resultValue, selfEntity)) : result;
				}
			} else if (iterator.hasNext()) {
				derivedModel = MiscEntityFactory.instance.createMisc(0);
	
				ITransactionScope transactionScope = BindingManagerFactory.instance.createTransactionScope();
				bm.wEnterScope(transactionScope);
				try {
					for (IEntity result : iterator) {
						transactionScope.commit();
						derivedModel.wAdd(GenericEntityFactory.instance.create(
								CommonsEntityDescriptorEnum.SameStageFragment,
								//CommonsEntityFactory.instance.createSameStageFragment(
								EntityUtils.clone(result)));//TODO substitute with a no containment fragment
					}
				} finally {
					transactionScope.rollback();
					bm.wExitScope();
				}
			}
		} catch (MissingVariableException e) {
			addMissingVariables(contextModel, e);
		} catch (OperationCanceledException e) {
			// gracefully terminate execution
		} catch (Exception e) {
			if (e.getCause() instanceof MissingVariableException)
				addMissingVariables(contextModel, (MissingVariableException) e);
		} finally {
			pm.endTask();
		}

		IEntity variablesModel = null;
		if (derivedModel != null) {
			WorkflowsEntityFactory ef = WorkflowsEntityFactory.instance;
			variablesModel = ef.createAssignments(0);
			for (String name : new TreeSet<String>(bm.wLocalNames()))
				if (!initialNames.contains(name))
					variablesModel.wAdd(ef.createAssign(
							ef.createVariable(name),
							EntityUtils.cloneIfParented(BindingUtils.wGet(bm, name)).wGetAdapter(WorkflowsEntityDescriptorEnum.Expression)));

			final IEntity contents = derivedModel;
			final IEntity variables = variablesModel;
			context.get(UISynchronize.class).asyncExec(new Runnable() {
				public void run() {
					context.get(IEntityPartViewer.class).setContents(null, contents);
					context.get(IEventBroker.class).post(IUIConstants.TOPIC_UPDATE_VARIABLES, variables);
				}
			});
		}
		
	}

	protected void addMissingVariables(IEntity contextModel, MissingVariableException e) {
		String[] varNames = e.getVariableNames();
		WorkflowsEntityFactory ef = WorkflowsEntityFactory.instance;

		for (String varName : varNames) {
			Variable var = ef.createVariable(varName);
			IEntity find = Matcher.find(var, contextModel, false);
			if (find == null)
				contextModel.wAdd(ef.createAssign(
						var, CommonsEntityAdapterFactory.createResolver(WorkflowsEntityDescriptorEnum.Expression)));
		}
	}
}