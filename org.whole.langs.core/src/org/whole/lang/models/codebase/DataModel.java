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

public class DataModel extends AbstractTemplateFactory<org.whole.lang.models.model.Model> {


    public void apply(IBuilderOperation op) {
        org.whole.lang.models.builders.IModelsBuilder b0 = (org.whole.lang.models.builders.IModelsBuilder) op.wGetBuilder(org.whole.lang.models.reflect.ModelsLanguageKit.URI);
        b0.Model_();
        b0.SimpleName("Data");
        b0.TypeRelations();
        b0.ModelDeclarations_(36);
        b0.SimpleEntity_();
        b0.EntityModifiers();
        b0.SimpleName("TextData");
        b0.Types();
        b0.Features_(3);
        b0.Feature_();
        b0.FeatureModifiers();
        b0.SimpleName("Encoding");
        b0.SimpleName("encoding");
        b0._Feature();
        b0.Feature_();
        b0.FeatureModifiers();
        b0.SimpleName("Size");
        b0.SimpleName("tabSize");
        b0._Feature();
        b0.Feature_();
        b0.FeatureModifiers();
        b0.SimpleName("DataExp");
        b0.SimpleName("dataExp");
        b0._Feature();
        b0._Features();
        b0._SimpleEntity();
        b0.SimpleEntity_();
        b0.EntityModifiers();
        b0.SimpleName("BinaryData");
        b0.Types();
        b0.Features_(1);
        b0.Feature_();
        b0.FeatureModifiers();
        b0.SimpleName("DataExp");
        b0.SimpleName("dataExp");
        b0._Feature();
        b0._Features();
        b0._SimpleEntity();
        b0.SimpleEntity_();
        b0.EntityModifiers_(1);
        b0.EntityModifier("abstract");
        b0._EntityModifiers();
        b0.SimpleName("DataExp");
        b0.Types_(1);
        b0.SimpleName("Condition");
        b0._Types();
        b0.Features();
        b0._SimpleEntity();
        b0.SimpleEntity_();
        b0.EntityModifiers();
        b0.SimpleName("SplitMany");
        b0.Types_(1);
        b0.SimpleName("DataExp");
        b0._Types();
        b0.Features_(2);
        b0.Feature_();
        b0.FeatureModifiers();
        b0.SimpleName("SplitMode");
        b0.SimpleName("mode");
        b0._Feature();
        b0.Feature_();
        b0.FeatureModifiers();
        b0.SimpleName("DataExp");
        b0.SimpleName("dataExp");
        b0._Feature();
        b0._Features();
        b0._SimpleEntity();
        b0.SimpleEntity_();
        b0.EntityModifiers();
        b0.SimpleName("SplitOnce");
        b0.Types_(1);
        b0.SimpleName("DataExp");
        b0._Types();
        b0.Features_(3);
        b0.Feature_();
        b0.FeatureModifiers();
        b0.SimpleName("SplitMode");
        b0.SimpleName("mode");
        b0._Feature();
        b0.Feature_();
        b0.FeatureModifiers();
        b0.SimpleName("DataExp");
        b0.SimpleName("dataExp1");
        b0._Feature();
        b0.Feature_();
        b0.FeatureModifiers();
        b0.SimpleName("DataExp");
        b0.SimpleName("dataExp2");
        b0._Feature();
        b0._Features();
        b0._SimpleEntity();
        b0.SimpleEntity_();
        b0.EntityModifiers();
        b0.SimpleName("SwitchOne");
        b0.Types_(1);
        b0.SimpleName("DataExp");
        b0._Types();
        b0.Features_(2);
        b0.Feature_();
        b0.FeatureModifiers();
        b0.SimpleName("SwitchCases");
        b0.SimpleName("cases");
        b0._Feature();
        b0.Feature_();
        b0.FeatureModifiers();
        b0.SimpleName("DataExp");
        b0.SimpleName("defaultDataExp");
        b0._Feature();
        b0._Features();
        b0._SimpleEntity();
        b0.SimpleEntity_();
        b0.EntityModifiers();
        b0.SimpleName("SwitchSome");
        b0.Types_(1);
        b0.SimpleName("DataExp");
        b0._Types();
        b0.Features_(2);
        b0.Feature_();
        b0.FeatureModifiers();
        b0.SimpleName("SwitchCases");
        b0.SimpleName("cases");
        b0._Feature();
        b0.Feature_();
        b0.FeatureModifiers();
        b0.SimpleName("DataExp");
        b0.SimpleName("defaultDataExp");
        b0._Feature();
        b0._Features();
        b0._SimpleEntity();
        b0.CompositeEntity_();
        b0.EntityModifiers();
        b0.SimpleName("SwitchCases");
        b0.Types();
        b0.ComponentModifiers_(1);
        b0.ComponentModifier("ordered");
        b0._ComponentModifiers();
        b0.SimpleName("SwitchCase");
        b0._CompositeEntity();
        b0.SimpleEntity_();
        b0.EntityModifiers();
        b0.SimpleName("SwitchCase");
        b0.Types();
        b0.Features_(2);
        b0.Feature_();
        b0.FeatureModifiers();
        b0.SimpleName("Condition");
        b0.SimpleName("condition");
        b0._Feature();
        b0.Feature_();
        b0.FeatureModifiers();
        b0.SimpleName("DataExp");
        b0.SimpleName("dataExp");
        b0._Feature();
        b0._Features();
        b0._SimpleEntity();
        b0.SimpleEntity_();
        b0.EntityModifiers_(1);
        b0.EntityModifier("abstract");
        b0._EntityModifiers();
        b0.SimpleName("Condition");
        b0.Types();
        b0.Features();
        b0._SimpleEntity();
        b0.SimpleEntity_();
        b0.EntityModifiers_(1);
        b0.EntityModifier("abstract");
        b0._EntityModifiers();
        b0.SimpleName("Terminal");
        b0.Types_(1);
        b0.SimpleName("DataExp");
        b0._Types();
        b0.Features();
        b0._SimpleEntity();
        b0.DataEntity_();
        b0.EntityModifiers();
        b0.SimpleName("Literal");
        b0.Types_(1);
        b0.SimpleName("Terminal");
        b0._Types();
        b0.DataType("String");
        b0._DataEntity();
        b0.DataEntity_();
        b0.EntityModifiers();
        b0.SimpleName("RegExp");
        b0.Types_(1);
        b0.SimpleName("Terminal");
        b0._Types();
        b0.DataType("String");
        b0._DataEntity();
        b0.SimpleEntity_();
        b0.EntityModifiers();
        b0.SimpleName("SeparatedEntities");
        b0.Types_(1);
        b0.SimpleName("DataExp");
        b0._Types();
        b0.Features_(8);
        b0.Feature_();
        b0.FeatureModifiers();
        b0.SimpleName("Terminal");
        b0.SimpleName("entitySeparator");
        b0._Feature();
        b0.Feature_();
        b0.FeatureModifiers();
        b0.SimpleName("Terminal");
        b0.SimpleName("featureSeparator");
        b0._Feature();
        b0.Feature_();
        b0.FeatureModifiers();
        b0.SimpleName("Char");
        b0.SimpleName("quoteCharacter");
        b0._Feature();
        b0.Feature_();
        b0.FeatureModifiers();
        b0.SimpleName("Char");
        b0.SimpleName("escapeCharacter");
        b0._Feature();
        b0.Feature_();
        b0.FeatureModifiers();
        b0.SimpleName("SkipFirstRow");
        b0.SimpleName("skipFirstRow");
        b0._Feature();
        b0.Feature_();
        b0.FeatureModifiers();
        b0.SimpleName("Name");
        b0.SimpleName("compositeEntityName");
        b0._Feature();
        b0.Feature_();
        b0.FeatureModifiers();
        b0.SimpleName("Name");
        b0.SimpleName("entityName");
        b0._Feature();
        b0.Feature_();
        b0.FeatureModifiers();
        b0.SimpleName("Features");
        b0.SimpleName("entityFeatures");
        b0._Feature();
        b0._Features();
        b0._SimpleEntity();
        b0.SimpleEntity_();
        b0.EntityModifiers();
        b0.SimpleName("FixedEntities");
        b0.Types_(1);
        b0.SimpleName("DataExp");
        b0._Types();
        b0.Features_(6);
        b0.Feature_();
        b0.FeatureModifiers_(1);
        b0.FeatureModifier("derived");
        b0._FeatureModifiers();
        b0.SimpleName("Size");
        b0.SimpleName("entitySize");
        b0._Feature();
        b0.Feature_();
        b0.FeatureModifiers();
        b0.SimpleName("Char");
        b0.SimpleName("fillCharacter");
        b0._Feature();
        b0.Feature_();
        b0.FeatureModifiers();
        b0.SimpleName("SkipFirstRow");
        b0.SimpleName("skipFirstRow");
        b0._Feature();
        b0.Feature_();
        b0.FeatureModifiers();
        b0.SimpleName("Name");
        b0.SimpleName("compositeEntityName");
        b0._Feature();
        b0.Feature_();
        b0.FeatureModifiers();
        b0.SimpleName("Name");
        b0.SimpleName("entityName");
        b0._Feature();
        b0.Feature_();
        b0.FeatureModifiers();
        b0.SimpleName("FixedFeatures");
        b0.SimpleName("entityFeatures");
        b0._Feature();
        b0._Features();
        b0._SimpleEntity();
        b0.SimpleEntity_();
        b0.EntityModifiers();
        b0.SimpleName("TerminalEntity");
        b0.Types_(1);
        b0.SimpleName("DataExp");
        b0._Types();
        b0.Features_(4);
        b0.Feature_();
        b0.FeatureModifiers();
        b0.SimpleName("Name");
        b0.SimpleName("entityName");
        b0._Feature();
        b0.Feature_();
        b0.FeatureModifiers();
        b0.SimpleName("DataType");
        b0.SimpleName("dataType");
        b0._Feature();
        b0.Feature_();
        b0.FeatureModifiers();
        b0.SimpleName("TrimSide");
        b0.SimpleName("trimSide");
        b0._Feature();
        b0.Feature_();
        b0.FeatureModifiers();
        b0.SimpleName("CharSet");
        b0.SimpleName("trimCharacterSet");
        b0._Feature();
        b0._Features();
        b0._SimpleEntity();
        b0.SimpleEntity_();
        b0.EntityModifiers_(1);
        b0.EntityModifier("abstract");
        b0._EntityModifiers();
        b0.SimpleName("SplitMode");
        b0.Types();
        b0.Features();
        b0._SimpleEntity();
        b0.SimpleEntity_();
        b0.EntityModifiers();
        b0.SimpleName("FixedMode");
        b0.Types_(1);
        b0.SimpleName("SplitMode");
        b0._Types();
        b0.Features_(2);
        b0.Feature_();
        b0.FeatureModifiers();
        b0.SimpleName("Offset");
        b0.SimpleName("offset");
        b0._Feature();
        b0.Feature_();
        b0.FeatureModifiers();
        b0.SimpleName("Unit");
        b0.SimpleName("offsetUnit");
        b0._Feature();
        b0._Features();
        b0._SimpleEntity();
        b0.SimpleEntity_();
        b0.EntityModifiers();
        b0.SimpleName("DelimitedMode");
        b0.Types_(1);
        b0.SimpleName("SplitMode");
        b0._Types();
        b0.Features_(1);
        b0.Feature_();
        b0.FeatureModifiers();
        b0.SimpleName("Terminal");
        b0.SimpleName("delimiter");
        b0._Feature();
        b0._Features();
        b0._SimpleEntity();
        b0.SimpleEntity_();
        b0.EntityModifiers();
        b0.SimpleName("SeparatedMode");
        b0.Types_(1);
        b0.SimpleName("SplitMode");
        b0._Types();
        b0.Features_(1);
        b0.Feature_();
        b0.FeatureModifiers();
        b0.SimpleName("Terminal");
        b0.SimpleName("separator");
        b0._Feature();
        b0._Features();
        b0._SimpleEntity();
        b0.EnumEntity_();
        b0.EntityModifiers();
        b0.SimpleName("Unit");
        b0.Types();
        b0.EnumValues_(4);
        b0.EnumValue("LINES");
        b0.EnumValue("COLUMNS");
        b0.EnumValue("CHARS");
        b0.EnumValue("BYTES");
        b0._EnumValues();
        b0._EnumEntity();
        b0.EnumEntity_();
        b0.EntityModifiers();
        b0.SimpleName("TrimSide");
        b0.Types();
        b0.EnumValues_(3);
        b0.EnumValue("LEFT");
        b0.EnumValue("RIGHT");
        b0.EnumValue("BOTH");
        b0._EnumValues();
        b0._EnumEntity();
        b0.CompositeEntity_();
        b0.EntityModifiers();
        b0.SimpleName("Features");
        b0.Types();
        b0.ComponentModifiers_(1);
        b0.ComponentModifier("ordered");
        b0._ComponentModifiers();
        b0.SimpleName("Feature");
        b0._CompositeEntity();
        b0.SimpleEntity_();
        b0.EntityModifiers();
        b0.SimpleName("Feature");
        b0.Types();
        b0.Features_(2);
        b0.Feature_();
        b0.FeatureModifiers();
        b0.SimpleName("DataType");
        b0.SimpleName("dataType");
        b0._Feature();
        b0.Feature_();
        b0.FeatureModifiers();
        b0.SimpleName("Name");
        b0.SimpleName("name");
        b0._Feature();
        b0._Features();
        b0._SimpleEntity();
        b0.CompositeEntity_();
        b0.EntityModifiers();
        b0.SimpleName("FixedFeatures");
        b0.Types();
        b0.ComponentModifiers_(1);
        b0.ComponentModifier("ordered");
        b0._ComponentModifiers();
        b0.SimpleName("FixedFeature");
        b0._CompositeEntity();
        b0.SimpleEntity_();
        b0.EntityModifiers();
        b0.SimpleName("FixedFeature");
        b0.Types();
        b0.Features_(3);
        b0.Feature_();
        b0.FeatureModifiers();
        b0.SimpleName("DataType");
        b0.SimpleName("dataType");
        b0._Feature();
        b0.Feature_();
        b0.FeatureModifiers();
        b0.SimpleName("Name");
        b0.SimpleName("name");
        b0._Feature();
        b0.Feature_();
        b0.FeatureModifiers();
        b0.SimpleName("Size");
        b0.SimpleName("size");
        b0._Feature();
        b0._Features();
        b0._SimpleEntity();
        b0.EnumEntity_();
        b0.EntityModifiers();
        b0.SimpleName("SimpleCardinality");
        b0.Types_(1);
        b0.SimpleName("Cardinality");
        b0._Types();
        b0.EnumValues_(4);
        b0.EnumValue("REQUIRED");
        b0.EnumValue("OPTIONAL");
        b0.EnumValue("ZERO_OR_MORE");
        b0.EnumValue("ONE_OR_MORE");
        b0._EnumValues();
        b0._EnumEntity();
        b0.SimpleEntity_();
        b0.EntityModifiers();
        b0.SimpleName("RangeCardinality");
        b0.Types_(1);
        b0.SimpleName("Cardinality");
        b0._Types();
        b0.Features_(2);
        b0.Feature_();
        b0.FeatureModifiers();
        b0.SimpleName("Size");
        b0.SimpleName("lowerBound");
        b0._Feature();
        b0.Feature_();
        b0.FeatureModifiers();
        b0.SimpleName("Size");
        b0.SimpleName("upperBound");
        b0._Feature();
        b0._Features();
        b0._SimpleEntity();
        b0.EnumEntity_();
        b0.EntityModifiers();
        b0.SimpleName("DataType");
        b0.Types();
        b0.EnumValues_(9);
        b0.EnumValue("boolean");
        b0.EnumValue("byte");
        b0.EnumValue("char");
        b0.EnumValue("double");
        b0.EnumValue("float");
        b0.EnumValue("int");
        b0.EnumValue("long");
        b0.EnumValue("short");
        b0.EnumValue("string");
        b0._EnumValues();
        b0._EnumEntity();
        b0.DataEntity_();
        b0.EntityModifiers();
        b0.SimpleName("Encoding");
        b0.Types();
        b0.DataType("String");
        b0._DataEntity();
        b0.DataEntity_();
        b0.EntityModifiers();
        b0.SimpleName("Name");
        b0.Types();
        b0.DataType("String");
        b0._DataEntity();
        b0.DataEntity_();
        b0.EntityModifiers();
        b0.SimpleName("Char");
        b0.Types();
        b0.DataType("char");
        b0._DataEntity();
        b0.DataEntity_();
        b0.EntityModifiers();
        b0.SimpleName("CharSet");
        b0.Types();
        b0.DataType("String");
        b0._DataEntity();
        b0.DataEntity_();
        b0.EntityModifiers();
        b0.SimpleName("Offset");
        b0.Types();
        b0.DataType("int");
        b0._DataEntity();
        b0.DataEntity_();
        b0.EntityModifiers();
        b0.SimpleName("Size");
        b0.Types();
        b0.DataType("int");
        b0._DataEntity();
        b0.DataEntity_();
        b0.EntityModifiers();
        b0.SimpleName("SkipFirstRow");
        b0.Types();
        b0.DataType("boolean");
        b0._DataEntity();
        b0._ModelDeclarations();
        b0.Namespace("org.whole.lang.data");
        org.whole.lang.commons.builders.ICommonsBuilder b1 = (org.whole.lang.commons.builders.ICommonsBuilder) op.wGetBuilder(org.whole.lang.commons.reflect.CommonsLanguageKit.URI);
        b1.Resolver();
        b0.URI("http://lang.whole.org/Data");
        b0._Model();
    }
}
