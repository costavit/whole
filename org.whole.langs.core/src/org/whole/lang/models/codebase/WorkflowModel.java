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
package org.whole.lang.models.codebase;

import org.whole.lang.builders.IBuilderOperation;
import org.whole.lang.templates.AbstractTemplateFactory;

public class WorkflowModel extends AbstractTemplateFactory<org.whole.lang.models.model.Model> {


    public void apply(IBuilderOperation op) {
        org.whole.lang.models.builders.IModelsBuilder b0 = (org.whole.lang.models.builders.IModelsBuilder) op.wGetBuilder(org.whole.lang.models.reflect.ModelsLanguageKit.URI);
        b0.Model_();
        b0.SimpleName("Workflow");
        b0.TypeRelations();
        b0.ModelDeclarations_(37);
        b0.SimpleEntity_();
        b0.EntityModifiers();
        b0.SimpleName("Workflow");
        b0.Types();
        b0.Features_(6);
        b0.Feature_();
        b0.FeatureModifiers_(1);
        b0.FeatureModifier("id");
        b0._FeatureModifiers();
        b0.SimpleName("Name");
        b0.SimpleName("name");
        b0._Feature();
        b0.Feature_();
        b0.FeatureModifiers_(1);
        b0.FeatureModifier("optional");
        b0._FeatureModifiers();
        b0.SimpleName("Description");
        b0.SimpleName("description");
        b0._Feature();
        b0.Feature_();
        b0.FeatureModifiers();
        b0.SimpleName("Declarations");
        b0.SimpleName("declarations");
        b0._Feature();
        b0.Feature_();
        b0.FeatureModifiers();
        b0.SimpleName("StartEvent");
        b0.SimpleName("startEvent");
        b0._Feature();
        b0.Feature_();
        b0.FeatureModifiers();
        b0.SimpleName("FlowObject");
        b0.SimpleName("flowObject");
        b0._Feature();
        b0.Feature_();
        b0.FeatureModifiers();
        b0.SimpleName("FlowEvent");
        b0.SimpleName("endEvent");
        b0._Feature();
        b0._Features();
        b0._SimpleEntity();
        b0.SimpleEntity_();
        b0.EntityModifiers_(1);
        b0.EntityModifier("abstract");
        b0._EntityModifiers();
        b0.SimpleName("FlowObject");
        b0.Types();
        b0.Features_(2);
        b0.Feature_();
        b0.FeatureModifiers_(1);
        b0.FeatureModifier("id");
        b0._FeatureModifiers();
        b0.SimpleName("Name");
        b0.SimpleName("name");
        b0._Feature();
        b0.Feature_();
        b0.FeatureModifiers_(1);
        b0.FeatureModifier("optional");
        b0._FeatureModifiers();
        b0.SimpleName("Label");
        b0.SimpleName("label");
        b0._Feature();
        b0._Features();
        b0._SimpleEntity();
        b0.SimpleEntity_();
        b0.EntityModifiers();
        b0.SimpleName("Scope");
        b0.Types_(1);
        b0.SimpleName("FlowObject");
        b0._Types();
        b0.Features_(5);
        b0.Feature_();
        b0.FeatureModifiers();
        b0.SimpleName("Declarations");
        b0.SimpleName("declarations");
        b0._Feature();
        b0.Feature_();
        b0.FeatureModifiers();
        b0.SimpleName("FlowObject");
        b0.SimpleName("flowObject");
        b0._Feature();
        b0.Feature_();
        b0.FeatureModifiers_(1);
        b0.FeatureModifier("optional");
        b0._FeatureModifiers();
        b0.SimpleName("FlowObject");
        b0.SimpleName("compensationHandler");
        b0._Feature();
        b0.Feature_();
        b0.FeatureModifiers_(1);
        b0.FeatureModifier("optional");
        b0._FeatureModifiers();
        b0.SimpleName("EventHandlers");
        b0.SimpleName("eventHandlers");
        b0._Feature();
        b0.Feature_();
        b0.FeatureModifiers_(1);
        b0.FeatureModifier("optional");
        b0._FeatureModifiers();
        b0.SimpleName("FaultHandlers");
        b0.SimpleName("faultHandlers");
        b0._Feature();
        b0._Features();
        b0._SimpleEntity();
        b0.CompositeEntity_();
        b0.EntityModifiers();
        b0.SimpleName("FaultHandlers");
        b0.Types();
        b0.ComponentModifiers_(2);
        b0.ComponentModifier("unique");
        b0.ComponentModifier("ordered");
        b0._ComponentModifiers();
        b0.SimpleName("FaultHandler");
        b0._CompositeEntity();
        b0.SimpleEntity_();
        b0.EntityModifiers();
        b0.SimpleName("FaultHandler");
        b0.Types();
        b0.Features_(5);
        b0.Feature_();
        b0.FeatureModifiers();
        b0.SimpleName("Name");
        b0.SimpleName("name");
        b0._Feature();
        b0.Feature_();
        b0.FeatureModifiers_(1);
        b0.FeatureModifier("optional");
        b0._FeatureModifiers();
        b0.SimpleName("Label");
        b0.SimpleName("label");
        b0._Feature();
        b0.Feature_();
        b0.FeatureModifiers_(1);
        b0.FeatureModifier("id");
        b0._FeatureModifiers();
        b0.SimpleName("Fault");
        b0.SimpleName("faultName");
        b0._Feature();
        b0.Feature_();
        b0.FeatureModifiers();
        b0.SimpleName("Variable");
        b0.SimpleName("faultVariable");
        b0._Feature();
        b0.Feature_();
        b0.FeatureModifiers();
        b0.SimpleName("FlowObject");
        b0.SimpleName("flowObject");
        b0._Feature();
        b0._Features();
        b0._SimpleEntity();
        b0.CompositeEntity_();
        b0.EntityModifiers();
        b0.SimpleName("EventHandlers");
        b0.Types();
        b0.ComponentModifiers_(1);
        b0.ComponentModifier("ordered");
        b0._ComponentModifiers();
        b0.SimpleName("EventHandler");
        b0._CompositeEntity();
        b0.SimpleEntity_();
        b0.EntityModifiers();
        b0.SimpleName("EventHandler");
        b0.Types();
        b0.Features_(4);
        b0.Feature_();
        b0.FeatureModifiers_(1);
        b0.FeatureModifier("id");
        b0._FeatureModifiers();
        b0.SimpleName("Name");
        b0.SimpleName("name");
        b0._Feature();
        b0.Feature_();
        b0.FeatureModifiers_(1);
        b0.FeatureModifier("optional");
        b0._FeatureModifiers();
        b0.SimpleName("Label");
        b0.SimpleName("label");
        b0._Feature();
        b0.Feature_();
        b0.FeatureModifiers();
        b0.SimpleName("StartEvent");
        b0.SimpleName("triggerEvent");
        b0._Feature();
        b0.Feature_();
        b0.FeatureModifiers();
        b0.SimpleName("FlowObject");
        b0.SimpleName("flowObject");
        b0._Feature();
        b0._Features();
        b0._SimpleEntity();
        b0.SimpleEntity_();
        b0.EntityModifiers();
        b0.SimpleName("Sequence");
        b0.Types_(1);
        b0.SimpleName("FlowObject");
        b0._Types();
        b0.Features_(1);
        b0.Feature_();
        b0.FeatureModifiers();
        b0.SimpleName("FlowObjects");
        b0.SimpleName("flowObjects");
        b0._Feature();
        b0._Features();
        b0._SimpleEntity();
        b0.SimpleEntity_();
        b0.EntityModifiers();
        b0.SimpleName("Parallel");
        b0.Types_(1);
        b0.SimpleName("FlowObject");
        b0._Types();
        b0.Features_(1);
        b0.Feature_();
        b0.FeatureModifiers();
        b0.SimpleName("FlowObjects");
        b0.SimpleName("flowObjects");
        b0._Feature();
        b0._Features();
        b0._SimpleEntity();
        b0.CompositeEntity_();
        b0.EntityModifiers();
        b0.SimpleName("FlowObjects");
        b0.Types();
        b0.ComponentModifiers_(1);
        b0.ComponentModifier("ordered");
        b0._ComponentModifiers();
        b0.SimpleName("FlowObject");
        b0._CompositeEntity();
        b0.SimpleEntity_();
        b0.EntityModifiers();
        b0.SimpleName("ForeachLoop");
        b0.Types_(1);
        b0.SimpleName("FlowObject");
        b0._Types();
        b0.Features_(4);
        b0.Feature_();
        b0.FeatureModifiers();
        b0.SimpleName("Variable");
        b0.SimpleName("compositeVariable");
        b0._Feature();
        b0.Feature_();
        b0.FeatureModifiers();
        b0.SimpleName("Variable");
        b0.SimpleName("elementVariable");
        b0._Feature();
        b0.Feature_();
        b0.FeatureModifiers();
        b0.SimpleName("Variable");
        b0.SimpleName("indexVariable");
        b0._Feature();
        b0.Feature_();
        b0.FeatureModifiers();
        b0.SimpleName("FlowObject");
        b0.SimpleName("flowObject");
        b0._Feature();
        b0._Features();
        b0._SimpleEntity();
        b0.SimpleEntity_();
        b0.EntityModifiers();
        b0.SimpleName("WhileLoop");
        b0.Types_(1);
        b0.SimpleName("FlowObject");
        b0._Types();
        b0.Features_(3);
        b0.Feature_();
        b0.FeatureModifiers();
        b0.SimpleName("TestTime");
        b0.SimpleName("testTime");
        b0._Feature();
        b0.Feature_();
        b0.FeatureModifiers();
        b0.SimpleName("Condition");
        b0.SimpleName("condition");
        b0._Feature();
        b0.Feature_();
        b0.FeatureModifiers();
        b0.SimpleName("FlowObject");
        b0.SimpleName("flowObject");
        b0._Feature();
        b0._Features();
        b0._SimpleEntity();
        b0.EnumEntity_();
        b0.EntityModifiers();
        b0.SimpleName("TestTime");
        b0.Types();
        b0.EnumValues_(2);
        b0.EnumValue("before");
        b0.EnumValue("after");
        b0._EnumValues();
        b0._EnumEntity();
        b0.SimpleEntity_();
        b0.EntityModifiers();
        b0.SimpleName("PickControl");
        b0.Types_(1);
        b0.SimpleName("FlowObject");
        b0._Types();
        b0.Features_(1);
        b0.Feature_();
        b0.FeatureModifiers();
        b0.SimpleName("EventHandlers");
        b0.SimpleName("eventHandlers");
        b0._Feature();
        b0._Features();
        b0._SimpleEntity();
        b0.SimpleEntity_();
        b0.EntityModifiers();
        b0.SimpleName("SwitchControl");
        b0.Types_(1);
        b0.SimpleName("FlowObject");
        b0._Types();
        b0.Features_(3);
        b0.Feature_();
        b0.FeatureModifiers();
        b0.SimpleName("SwitchType");
        b0.SimpleName("switchType");
        b0._Feature();
        b0.Feature_();
        b0.FeatureModifiers();
        b0.SimpleName("ConditionalCases");
        b0.SimpleName("conditionalCases");
        b0._Feature();
        b0.Feature_();
        b0.FeatureModifiers_(1);
        b0.FeatureModifier("optional");
        b0._FeatureModifiers();
        b0.SimpleName("DefaultCase");
        b0.SimpleName("defaultCase");
        b0._Feature();
        b0._Features();
        b0._SimpleEntity();
        b0.EnumEntity_();
        b0.EntityModifiers();
        b0.SimpleName("SwitchType");
        b0.Types();
        b0.EnumValues_(2);
        b0.EnumValue("exclusive");
        b0.EnumValue("inclusive");
        b0._EnumValues();
        b0._EnumEntity();
        b0.CompositeEntity_();
        b0.EntityModifiers();
        b0.SimpleName("ConditionalCases");
        b0.Types();
        b0.ComponentModifiers_(1);
        b0.ComponentModifier("ordered");
        b0._ComponentModifiers();
        b0.SimpleName("ConditionalCase");
        b0._CompositeEntity();
        b0.SimpleEntity_();
        b0.EntityModifiers();
        b0.SimpleName("ConditionalCase");
        b0.Types();
        b0.Features_(4);
        b0.Feature_();
        b0.FeatureModifiers_(1);
        b0.FeatureModifier("id");
        b0._FeatureModifiers();
        b0.SimpleName("Name");
        b0.SimpleName("name");
        b0._Feature();
        b0.Feature_();
        b0.FeatureModifiers_(1);
        b0.FeatureModifier("optional");
        b0._FeatureModifiers();
        b0.SimpleName("Label");
        b0.SimpleName("label");
        b0._Feature();
        b0.Feature_();
        b0.FeatureModifiers();
        b0.SimpleName("Condition");
        b0.SimpleName("condition");
        b0._Feature();
        b0.Feature_();
        b0.FeatureModifiers();
        b0.SimpleName("FlowObject");
        b0.SimpleName("flowObject");
        b0._Feature();
        b0._Features();
        b0._SimpleEntity();
        b0.SimpleEntity_();
        b0.EntityModifiers();
        b0.SimpleName("DefaultCase");
        b0.Types();
        b0.Features_(1);
        b0.Feature_();
        b0.FeatureModifiers();
        b0.SimpleName("FlowObject");
        b0.SimpleName("flowObject");
        b0._Feature();
        b0._Features();
        b0._SimpleEntity();
        b0.SimpleEntity_();
        b0.EntityModifiers_(1);
        b0.EntityModifier("abstract");
        b0._EntityModifiers();
        b0.SimpleName("StartEvent");
        b0.Types_(1);
        b0.SimpleName("Event");
        b0._Types();
        b0.Features_(2);
        b0.Feature_();
        b0.FeatureModifiers_(1);
        b0.FeatureModifier("id");
        b0._FeatureModifiers();
        b0.SimpleName("Name");
        b0.SimpleName("name");
        b0._Feature();
        b0.Feature_();
        b0.FeatureModifiers_(1);
        b0.FeatureModifier("optional");
        b0._FeatureModifiers();
        b0.SimpleName("Label");
        b0.SimpleName("label");
        b0._Feature();
        b0._Features();
        b0._SimpleEntity();
        b0.SimpleEntity_();
        b0.EntityModifiers_(1);
        b0.EntityModifier("abstract");
        b0._EntityModifiers();
        b0.SimpleName("FlowEvent");
        b0.Types_(2);
        b0.SimpleName("Event");
        b0.SimpleName("FlowObject");
        b0._Types();
        b0.Features();
        b0._SimpleEntity();
        b0.SimpleEntity_();
        b0.EntityModifiers();
        b0.SimpleName("OnCallEvent");
        b0.Types_(1);
        b0.SimpleName("StartEvent");
        b0._Types();
        b0.Features_(1);
        b0.Feature_();
        b0.FeatureModifiers_(1);
        b0.FeatureModifier("optional");
        b0._FeatureModifiers();
        b0.SimpleName("Parameters");
        b0.SimpleName("parameters");
        b0._Feature();
        b0._Features();
        b0._SimpleEntity();
        b0.SimpleEntity_();
        b0.EntityModifiers();
        b0.SimpleName("OnMessageEvent");
        b0.Types_(1);
        b0.SimpleName("StartEvent");
        b0._Types();
        b0.Features_(1);
        b0.Feature_();
        b0.FeatureModifiers();
        b0.SimpleName("Message");
        b0.SimpleName("message");
        b0._Feature();
        b0._Features();
        b0._SimpleEntity();
        b0.SimpleEntity_();
        b0.EntityModifiers();
        b0.SimpleName("OnTimerEvent");
        b0.Types_(1);
        b0.SimpleName("StartEvent");
        b0._Types();
        b0.Features_(1);
        b0.Feature_();
        b0.FeatureModifiers();
        b0.SimpleName("Timer");
        b0.SimpleName("timer");
        b0._Feature();
        b0._Features();
        b0._SimpleEntity();
        b0.SimpleEntity_();
        b0.EntityModifiers();
        b0.SimpleName("FaultEvent");
        b0.Types_(1);
        b0.SimpleName("FlowEvent");
        b0._Types();
        b0.Features_(1);
        b0.Feature_();
        b0.FeatureModifiers();
        b0.SimpleName("Fault");
        b0.SimpleName("fault");
        b0._Feature();
        b0._Features();
        b0._SimpleEntity();
        b0.SimpleEntity_();
        b0.EntityModifiers();
        b0.SimpleName("ReturnEvent");
        b0.Types_(1);
        b0.SimpleName("FlowEvent");
        b0._Types();
        b0.Features_(1);
        b0.Feature_();
        b0.FeatureModifiers_(1);
        b0.FeatureModifier("optional");
        b0._FeatureModifiers();
        b0.SimpleName("Result");
        b0.SimpleName("result");
        b0._Feature();
        b0._Features();
        b0._SimpleEntity();
        b0.SimpleEntity_();
        b0.EntityModifiers_(1);
        b0.EntityModifier("abstract");
        b0._EntityModifiers();
        b0.SimpleName("Activity");
        b0.Types_(1);
        b0.SimpleName("FlowObject");
        b0._Types();
        b0.Features();
        b0._SimpleEntity();
        b0.SimpleEntity_();
        b0.EntityModifiers();
        b0.SimpleName("EmptyActivity");
        b0.Types_(1);
        b0.SimpleName("Activity");
        b0._Types();
        b0.Features();
        b0._SimpleEntity();
        b0.SimpleEntity_();
        b0.EntityModifiers();
        b0.SimpleName("AssignActivity");
        b0.Types_(1);
        b0.SimpleName("Activity");
        b0._Types();
        b0.Features_(1);
        b0.Feature_();
        b0.FeatureModifiers();
        b0.SimpleName("Assignments");
        b0.SimpleName("assignments");
        b0._Feature();
        b0._Features();
        b0._SimpleEntity();
        b0.SimpleEntity_();
        b0.EntityModifiers();
        b0.SimpleName("InvokeActivity");
        b0.Types_(1);
        b0.SimpleName("Activity");
        b0._Types();
        b0.Features_(1);
        b0.Feature_();
        b0.FeatureModifiers();
        b0.SimpleName("Invoke");
        b0.SimpleName("invoke");
        b0._Feature();
        b0._Features();
        b0._SimpleEntity();
        b0.SimpleEntity_();
        b0.EntityModifiers();
        b0.SimpleName("ReceiveActivity");
        b0.Types_(1);
        b0.SimpleName("Activity");
        b0._Types();
        b0.Features_(1);
        b0.Feature_();
        b0.FeatureModifiers();
        b0.SimpleName("Receive");
        b0.SimpleName("receive");
        b0._Feature();
        b0._Features();
        b0._SimpleEntity();
        b0.DataEntity_();
        b0.EntityModifiers();
        b0.SimpleName("Name");
        b0.Types();
        b0.DataType("String");
        b0._DataEntity();
        b0.DataEntity_();
        b0.EntityModifiers();
        b0.SimpleName("Text");
        b0.Types_(2);
        b0.SimpleName("Description");
        b0.SimpleName("Label");
        b0._Types();
        b0.DataType("String");
        b0._DataEntity();
        b0.CompositeEntity_();
        b0.EntityModifiers();
        b0.SimpleName("Declarations");
        b0.Types();
        b0.ComponentModifiers_(1);
        b0.ComponentModifier("ordered");
        b0._ComponentModifiers();
        b0.SimpleName("Declaration");
        b0._CompositeEntity();
        b0.CompositeEntity_();
        b0.EntityModifiers();
        b0.SimpleName("Assignments");
        b0.Types();
        b0.ComponentModifiers_(1);
        b0.ComponentModifier("ordered");
        b0._ComponentModifiers();
        b0.SimpleName("Assign");
        b0._CompositeEntity();
        b0.SimpleEntity_();
        b0.EntityModifiers_(1);
        b0.EntityModifier("abstract");
        b0._EntityModifiers();
        b0.SimpleName("Declaration");
        b0.Types();
        b0.Features();
        b0._SimpleEntity();
        b0.SimpleEntity_();
        b0.EntityModifiers_(1);
        b0.EntityModifier("abstract");
        b0._EntityModifiers();
        b0.SimpleName("Assign");
        b0.Types();
        b0.Features();
        b0._SimpleEntity();
        b0._ModelDeclarations();
        b0.Namespace("org.whole.lang.workflow");
        org.whole.lang.commons.builders.ICommonsBuilder b1 = (org.whole.lang.commons.builders.ICommonsBuilder) op.wGetBuilder(org.whole.lang.commons.reflect.CommonsLanguageKit.URI);
        b1.Resolver();
        b0.URI("http://lang.whole.org/Workflow");
        b0._Model();
    }
}
