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
package org.whole.lang.models.codebase;

import org.whole.lang.builders.IBuilderOperation;
import org.whole.lang.templates.AbstractTemplateFactory;

public class VisitorsModel extends AbstractTemplateFactory<org.whole.lang.models.model.Model> {


    public void apply(IBuilderOperation op) {
        org.whole.lang.models.builders.IModelsBuilder b0 = (org.whole.lang.models.builders.IModelsBuilder) op.wGetBuilder(org.whole.lang.models.reflect.ModelsLanguageKit.URI);
        b0.Model_();
        b0.SimpleName("Visitors");
        b0.TypeRelations_(0);
        b0._TypeRelations();
        b0.ModelDeclarations_(37);
        b0.CompositeEntity_();
        b0.EntityModifiers();
        b0.SimpleName("Operations");
        b0.Types();
        b0.ComponentModifiers_(1);
        b0.ComponentModifier("ordered");
        b0._ComponentModifiers();
        b0.SimpleName("Operation");
        b0._CompositeEntity();
        b0.SimpleEntity_();
        b0.EntityModifiers();
        b0.SimpleName("RelationDeclaration");
        b0.Types_(1);
        b0.SimpleName("Operation");
        b0._Types();
        b0.Features_(3);
        b0.Feature_();
        b0.FeatureModifiers();
        b0.SimpleName("SimpleName");
        b0.SimpleName("name");
        b0._Feature();
        b0.Feature_();
        b0.FeatureModifiers();
        b0.SimpleName("PatternDeclarations");
        b0.SimpleName("patterns");
        b0._Feature();
        b0.Feature_();
        b0.FeatureModifiers();
        b0.SimpleName("Statements");
        b0.SimpleName("statements");
        b0._Feature();
        b0._Features();
        b0._SimpleEntity();
        b0.SimpleEntity_();
        b0.EntityModifiers();
        b0.SimpleName("VisitorDeclaration");
        b0.Types_(1);
        b0.SimpleName("Operation");
        b0._Types();
        b0.Features_(3);
        b0.Feature_();
        b0.FeatureModifiers();
        b0.SimpleName("SimpleName");
        b0.SimpleName("name");
        b0._Feature();
        b0.Feature_();
        b0.FeatureModifiers();
        b0.SimpleName("Templates");
        b0.SimpleName("templates");
        b0._Feature();
        b0.Feature_();
        b0.FeatureModifiers();
        b0.SimpleName("Cases");
        b0.SimpleName("cases");
        b0._Feature();
        b0._Features();
        b0._SimpleEntity();
        b0.CompositeEntity_();
        b0.EntityModifiers();
        b0.SimpleName("Cases");
        b0.Types();
        b0.ComponentModifiers_(1);
        b0.ComponentModifier("ordered");
        b0._ComponentModifiers();
        b0.SimpleName("ICase");
        b0._CompositeEntity();
        b0.SimpleEntity_();
        b0.EntityModifiers();
        b0.SimpleName("WhenCase");
        b0.Types_(1);
        b0.SimpleName("ICase");
        b0._Types();
        b0.Features_(2);
        b0.Feature_();
        b0.FeatureModifiers();
        b0.SimpleName("PatternDeclaration");
        b0.SimpleName("pattern");
        b0._Feature();
        b0.Feature_();
        b0.FeatureModifiers();
        b0.SimpleName("Statements");
        b0.SimpleName("statements");
        b0._Feature();
        b0._Features();
        b0._SimpleEntity();
        b0.SimpleEntity_();
        b0.EntityModifiers();
        b0.SimpleName("OtherwiseCase");
        b0.Types_(1);
        b0.SimpleName("ICase");
        b0._Types();
        b0.Features_(1);
        b0.Feature_();
        b0.FeatureModifiers();
        b0.SimpleName("Statements");
        b0.SimpleName("statements");
        b0._Feature();
        b0._Features();
        b0._SimpleEntity();
        b0.CompositeEntity_();
        b0.EntityModifiers();
        b0.SimpleName("PatternDeclarations");
        b0.Types();
        b0.ComponentModifiers_(2);
        b0.ComponentModifier("unique");
        b0.ComponentModifier("ordered");
        b0._ComponentModifiers();
        b0.SimpleName("PatternDeclaration");
        b0._CompositeEntity();
        b0.SimpleEntity_();
        b0.EntityModifiers();
        b0.SimpleName("PatternDeclaration");
        b0.Types();
        b0.Features_(2);
        b0.Feature_();
        b0.FeatureModifiers();
        b0.SimpleName("PatternExpression");
        b0.SimpleName("pattern");
        b0._Feature();
        b0.Feature_();
        b0.FeatureModifiers_(1);
        b0.FeatureModifier("id");
        b0._FeatureModifiers();
        b0.SimpleName("SimpleName");
        b0.SimpleName("name");
        b0._Feature();
        b0._Features();
        b0._SimpleEntity();
        b0.CompositeEntity_();
        b0.EntityModifiers();
        b0.SimpleName("Statements");
        b0.Types();
        b0.ComponentModifiers_(1);
        b0.ComponentModifier("ordered");
        b0._ComponentModifiers();
        b0.SimpleName("Statement");
        b0._CompositeEntity();
        b0.CompositeEntity_();
        b0.EntityModifiers();
        b0.SimpleName("Templates");
        b0.Types();
        b0.ComponentModifiers_(1);
        b0.ComponentModifier("ordered");
        b0._ComponentModifiers();
        b0.SimpleName("TemplateDeclaration");
        b0._CompositeEntity();
        b0.SimpleEntity_();
        b0.EntityModifiers();
        b0.SimpleName("TemplateDeclaration");
        b0.Types_(1);
        b0.SimpleName("Statement");
        b0._Types();
        b0.Features_(3);
        b0.Feature_();
        b0.FeatureModifiers();
        b0.SimpleName("SimpleName");
        b0.SimpleName("name");
        b0._Feature();
        b0.Feature_();
        b0.FeatureModifiers();
        b0.SimpleName("PointcutDeclarations");
        b0.SimpleName("pointcuts");
        b0._Feature();
        b0.Feature_();
        b0.FeatureModifiers();
        b0.SimpleName("PatternExpression");
        b0.SimpleName("template");
        b0._Feature();
        b0._Features();
        b0._SimpleEntity();
        b0.CompositeEntity_();
        b0.EntityModifiers();
        b0.SimpleName("PointcutDeclarations");
        b0.Types();
        b0.ComponentModifiers_(2);
        b0.ComponentModifier("unique");
        b0.ComponentModifier("ordered");
        b0._ComponentModifiers();
        b0.SimpleName("PointcutDeclaration");
        b0._CompositeEntity();
        b0.SimpleEntity_();
        b0.EntityModifiers();
        b0.SimpleName("PointcutDeclaration");
        b0.Types_(1);
        b0.SimpleName("Statement");
        b0._Types();
        b0.Features_(2);
        b0.Feature_();
        b0.FeatureModifiers();
        b0.SimpleName("PathExpression");
        b0.SimpleName("path");
        b0._Feature();
        b0.Feature_();
        b0.FeatureModifiers_(1);
        b0.FeatureModifier("id");
        b0._FeatureModifiers();
        b0.SimpleName("SimpleName");
        b0.SimpleName("name");
        b0._Feature();
        b0._Features();
        b0._SimpleEntity();
        b0.CompositeEntity_();
        b0.EntityModifiers();
        b0.SimpleName("PointcutAssignments");
        b0.Types();
        b0.ComponentModifiers_(1);
        b0.ComponentModifier("ordered");
        b0._ComponentModifiers();
        b0.SimpleName("PointcutAssignment");
        b0._CompositeEntity();
        b0.SimpleEntity_();
        b0.EntityModifiers();
        b0.SimpleName("PointcutAssignment");
        b0.Types_(1);
        b0.SimpleName("Statement");
        b0._Types();
        b0.Features_(2);
        b0.Feature_();
        b0.FeatureModifiers();
        b0.SimpleName("PathExpression");
        b0.SimpleName("path");
        b0._Feature();
        b0.Feature_();
        b0.FeatureModifiers();
        b0.SimpleName("Expression");
        b0.SimpleName("value");
        b0._Feature();
        b0._Features();
        b0._SimpleEntity();
        b0.SimpleEntity_();
        b0.EntityModifiers();
        b0.SimpleName("RecursiveTraversal");
        b0.Types_(1);
        b0.SimpleName("Statement");
        b0._Types();
        b0.Features_(1);
        b0.Feature_();
        b0.FeatureModifiers();
        b0.SimpleName("PathExpression");
        b0.SimpleName("path");
        b0._Feature();
        b0._Features();
        b0._SimpleEntity();
        b0.SimpleEntity_();
        b0.EntityModifiers();
        b0.SimpleName("VisitorTraversal");
        b0.Types_(1);
        b0.SimpleName("Statement");
        b0._Types();
        b0.Features_(2);
        b0.Feature_();
        b0.FeatureModifiers();
        b0.SimpleName("PathExpression");
        b0.SimpleName("path");
        b0._Feature();
        b0.Feature_();
        b0.FeatureModifiers();
        b0.SimpleName("IName");
        b0.SimpleName("visitor");
        b0._Feature();
        b0._Features();
        b0._SimpleEntity();
        b0.SimpleEntity_();
        b0.EntityModifiers();
        b0.SimpleName("NestedTraversal");
        b0.Types_(1);
        b0.SimpleName("Statement");
        b0._Types();
        b0.Features_(2);
        b0.Feature_();
        b0.FeatureModifiers();
        b0.SimpleName("PathExpression");
        b0.SimpleName("path");
        b0._Feature();
        b0.Feature_();
        b0.FeatureModifiers();
        b0.SimpleName("Cases");
        b0.SimpleName("cases");
        b0._Feature();
        b0._Features();
        b0._SimpleEntity();
        b0.SimpleEntity_();
        b0.EntityModifiers();
        b0.SimpleName("RelationCall");
        b0.Types_(1);
        b0.SimpleName("Statement");
        b0._Types();
        b0.Features_(2);
        b0.Feature_();
        b0.FeatureModifiers();
        b0.SimpleName("SimpleName");
        b0.SimpleName("name");
        b0._Feature();
        b0.Feature_();
        b0.FeatureModifiers();
        b0.SimpleName("PathExpressions");
        b0.SimpleName("args");
        b0._Feature();
        b0._Features();
        b0._SimpleEntity();
        b0.SimpleEntity_();
        b0.EntityModifiers();
        b0.SimpleName("JoinPointDeclaration");
        b0.Types();
        b0.Features_(2);
        b0.Feature_();
        b0.FeatureModifiers();
        b0.SimpleName("SimpleName");
        b0.SimpleName("name");
        b0._Feature();
        b0.Feature_();
        b0.FeatureModifiers_(1);
        b0.FeatureModifier("optional");
        b0._FeatureModifiers();
        b0.SimpleName("PatternExpression");
        b0.SimpleName("defaultTemplate");
        b0._Feature();
        b0._Features();
        b0._SimpleEntity();
        b0.SimpleEntity_();
        b0.EntityModifiers();
        b0.SimpleName("TemplatePattern");
        b0.Types_(1);
        b0.SimpleName("PatternExpression");
        b0._Types();
        b0.Features_(2);
        b0.Feature_();
        b0.FeatureModifiers();
        b0.SimpleName("IName");
        b0.SimpleName("name");
        b0._Feature();
        b0.Feature_();
        b0.FeatureModifiers();
        b0.SimpleName("PointcutAssignments");
        b0.SimpleName("bindings");
        b0._Feature();
        b0._Features();
        b0._SimpleEntity();
        b0.SimpleEntity_();
        b0.EntityModifiers_(1);
        b0.EntityModifier("abstract");
        b0._EntityModifiers();
        b0.SimpleName("PathExpression");
        b0.Types_(1);
        b0.SimpleName("Expression");
        b0._Types();
        b0.Features();
        b0._SimpleEntity();
        b0.SimpleEntity_();
        b0.EntityModifiers_(1);
        b0.EntityModifier("abstract");
        b0._EntityModifiers();
        b0.SimpleName("PatternExpression");
        b0.Types_(1);
        b0.SimpleName("Expression");
        b0._Types();
        b0.Features();
        b0._SimpleEntity();
        b0.DataEntity_();
        b0.EntityModifiers();
        b0.SimpleName("LiteralExpression");
        b0.Types_(1);
        b0.SimpleName("Expression");
        b0._Types();
        b0.DataType("String");
        b0._DataEntity();
        b0.SimpleEntity_();
        b0.EntityModifiers_(1);
        b0.EntityModifier("abstract");
        b0._EntityModifiers();
        b0.SimpleName("StepExpression");
        b0.Types_(1);
        b0.SimpleName("PathExpression");
        b0._Types();
        b0.Features();
        b0._SimpleEntity();
        b0.DataEntity_();
        b0.EntityModifiers();
        b0.SimpleName("SimpleName");
        b0.Types_(2);
        b0.SimpleName("IName");
        b0.SimpleName("StepExpression");
        b0._Types();
        b0.DataType("String");
        b0._DataEntity();
        b0.SimpleEntity_();
        b0.EntityModifiers();
        b0.SimpleName("QualifiedName");
        b0.Types_(2);
        b0.SimpleName("IName");
        b0.SimpleName("StepExpression");
        b0._Types();
        b0.Features_(2);
        b0.Feature_();
        b0.FeatureModifiers();
        b0.SimpleName("SimpleName");
        b0.SimpleName("language");
        b0._Feature();
        b0.Feature_();
        b0.FeatureModifiers();
        b0.SimpleName("SimpleName");
        b0.SimpleName("name");
        b0._Feature();
        b0._Features();
        b0._SimpleEntity();
        b0.SimpleEntity_();
        b0.EntityModifiers();
        b0.SimpleName("AllFeatures");
        b0.Types_(1);
        b0.SimpleName("StepExpression");
        b0._Types();
        b0.Features();
        b0._SimpleEntity();
        b0.DataEntity_();
        b0.EntityModifiers();
        b0.SimpleName("FeatureByIndex");
        b0.Types_(1);
        b0.SimpleName("StepExpression");
        b0._Types();
        b0.DataType("int");
        b0._DataEntity();
        b0.DataEntity_();
        b0.EntityModifiers();
        b0.SimpleName("FeatureByName");
        b0.Types_(1);
        b0.SimpleName("StepExpression");
        b0._Types();
        b0.DataType("String");
        b0._DataEntity();
        b0.DataEntity_();
        b0.EntityModifiers();
        b0.SimpleName("FeatureByType");
        b0.Types_(1);
        b0.SimpleName("StepExpression");
        b0._Types();
        b0.DataType("String");
        b0._DataEntity();
        b0.SimpleEntity_();
        b0.EntityModifiers();
        b0.SimpleName("FeatureByNameByType");
        b0.Types_(1);
        b0.SimpleName("StepExpression");
        b0._Types();
        b0.Features_(2);
        b0.Feature_();
        b0.FeatureModifiers();
        b0.SimpleName("FeatureByName");
        b0.SimpleName("feature");
        b0._Feature();
        b0.Feature_();
        b0.FeatureModifiers();
        b0.SimpleName("FeatureByType");
        b0.SimpleName("type");
        b0._Feature();
        b0._Features();
        b0._SimpleEntity();
        b0.CompositeEntity_();
        b0.EntityModifiers();
        b0.SimpleName("PathExpressions");
        b0.Types();
        b0.ComponentModifiers_(1);
        b0.ComponentModifier("ordered");
        b0._ComponentModifiers();
        b0.SimpleName("PathExpression");
        b0._CompositeEntity();
        b0.SimpleEntity_();
        b0.EntityModifiers();
        b0.SimpleName("ChildStep");
        b0.Types_(1);
        b0.SimpleName("PathExpression");
        b0._Types();
        b0.Features_(2);
        b0.Feature_();
        b0.FeatureModifiers();
        b0.SimpleName("StepExpression");
        b0.SimpleName("step");
        b0._Feature();
        b0.Feature_();
        b0.FeatureModifiers();
        b0.SimpleName("PathExpression");
        b0.SimpleName("path");
        b0._Feature();
        b0._Features();
        b0._SimpleEntity();
        b0.SimpleEntity_();
        b0.EntityModifiers();
        b0.SimpleName("DescendantStep");
        b0.Types_(1);
        b0.SimpleName("PathExpression");
        b0._Types();
        b0.Features_(2);
        b0.Feature_();
        b0.FeatureModifiers();
        b0.SimpleName("StepExpression");
        b0.SimpleName("step");
        b0._Feature();
        b0.Feature_();
        b0.FeatureModifiers();
        b0.SimpleName("PathExpression");
        b0.SimpleName("path");
        b0._Feature();
        b0._Features();
        b0._SimpleEntity();
        b0.SimpleEntity_();
        b0.EntityModifiers();
        b0.SimpleName("ParentStep");
        b0.Types_(1);
        b0.SimpleName("PathExpression");
        b0._Types();
        b0.Features_(2);
        b0.Feature_();
        b0.FeatureModifiers();
        b0.SimpleName("StepExpression");
        b0.SimpleName("step");
        b0._Feature();
        b0.Feature_();
        b0.FeatureModifiers();
        b0.SimpleName("PathExpression");
        b0.SimpleName("path");
        b0._Feature();
        b0._Features();
        b0._SimpleEntity();
        b0.SimpleEntity_();
        b0.EntityModifiers();
        b0.SimpleName("AncestorStep");
        b0.Types_(1);
        b0.SimpleName("PathExpression");
        b0._Types();
        b0.Features_(2);
        b0.Feature_();
        b0.FeatureModifiers();
        b0.SimpleName("StepExpression");
        b0.SimpleName("step");
        b0._Feature();
        b0.Feature_();
        b0.FeatureModifiers();
        b0.SimpleName("PathExpression");
        b0.SimpleName("path");
        b0._Feature();
        b0._Features();
        b0._SimpleEntity();
        b0._ModelDeclarations();
        b0.Namespace("org.whole.lang.visitors");
        org.whole.lang.commons.builders.ICommonsBuilder b1 = (org.whole.lang.commons.builders.ICommonsBuilder) op.wGetBuilder(org.whole.lang.commons.reflect.CommonsLanguageKit.URI);
        b1.Resolver();
        b0.URI("http://lang.whole.org/Visitors");
        b0._Model();
    }
}
