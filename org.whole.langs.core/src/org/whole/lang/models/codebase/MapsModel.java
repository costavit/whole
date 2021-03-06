package org.whole.lang.models.codebase;

import org.whole.lang.builders.IBuilderOperation;
import org.whole.lang.templates.AbstractTemplateFactory;

public class MapsModel extends AbstractTemplateFactory<org.whole.lang.models.model.Model> {

    public void apply(IBuilderOperation op) {
        org.whole.lang.models.builders.IModelsBuilder b0 = (org.whole.lang.models.builders.IModelsBuilder) op.wGetBuilder(org.whole.lang.models.reflect.ModelsLanguageKit.URI);
        b0.Model_();
        b0.SimpleName("Maps");
        b0.TypeRelations_(0);
        b0._TypeRelations();
        b0.ModelDeclarations_(70);
        b0.SimpleEntity_();
        b0.EntityModifiers_(0);
        b0._EntityModifiers();
        b0.SimpleName("Map");
        b0.Types_(0);
        b0._Types();
        b0.Features_(5);
        b0.Feature_();
        b0.FeatureModifiers_(0);
        b0._FeatureModifiers();
        b0.SimpleName("URI");
        b0.SimpleName("uri");
        b0._Feature();
        b0.Feature_();
        b0.FeatureModifiers_(0);
        b0._FeatureModifiers();
        b0.SimpleName("Name");
        b0.SimpleName("name");
        b0._Feature();
        b0.Feature_();
        b0.FeatureModifiers_(1);
        b0.FeatureModifier("optional");
        b0._FeatureModifiers();
        b0.SimpleName("Version");
        b0.SimpleName("version");
        b0._Feature();
        b0.Feature_();
        b0.FeatureModifiers_(1);
        b0.FeatureModifier("optional");
        b0._FeatureModifiers();
        b0.SimpleName("Resources");
        b0.SimpleName("resources");
        b0._Feature();
        b0.Feature_();
        b0.FeatureModifiers_(0);
        b0._FeatureModifiers();
        b0.SimpleName("Topic");
        b0.SimpleName("mainTopic");
        b0._Feature();
        b0._Features();
        b0._SimpleEntity();
        b0.SimpleEntity_();
        b0.EntityModifiers_(0);
        b0._EntityModifiers();
        b0.SimpleName("Index");
        b0.Types_(0);
        b0._Types();
        b0.Features_(1);
        b0.Feature_();
        b0.FeatureModifiers_(0);
        b0._FeatureModifiers();
        b0.SimpleName("Topics");
        b0.SimpleName("topics");
        b0._Feature();
        b0._Features();
        b0._SimpleEntity();
        b0.CompositeEntity_();
        b0.EntityModifiers_(0);
        b0._EntityModifiers();
        b0.SimpleName("Topics");
        b0.Types_(0);
        b0._Types();
        b0.ComponentModifiers_(1);
        b0.ComponentModifier("ordered");
        b0._ComponentModifiers();
        b0.SimpleName("Topic");
        b0._CompositeEntity();
        b0.CompositeEntity_();
        b0.EntityModifiers_(0);
        b0._EntityModifiers();
        b0.SimpleName("Associations");
        b0.Types_(0);
        b0._Types();
        b0.ComponentModifiers_(1);
        b0.ComponentModifier("ordered");
        b0._ComponentModifiers();
        b0.SimpleName("Associable");
        b0._CompositeEntity();
        b0.CompositeEntity_();
        b0.EntityModifiers_(0);
        b0._EntityModifiers();
        b0.SimpleName("Occurrences");
        b0.Types_(0);
        b0._Types();
        b0.ComponentModifiers_(1);
        b0.ComponentModifier("ordered");
        b0._ComponentModifiers();
        b0.SimpleName("Occurrence");
        b0._CompositeEntity();
        b0.SimpleEntity_();
        b0.EntityModifiers_(0);
        b0._EntityModifiers();
        b0.SimpleName("Occurrence");
        b0.Types_(0);
        b0._Types();
        b0.Features_(2);
        b0.Feature_();
        b0.FeatureModifiers_(0);
        b0._FeatureModifiers();
        b0.SimpleName("Name");
        b0.SimpleName("type");
        b0._Feature();
        b0.Feature_();
        b0.FeatureModifiers_(0);
        b0._FeatureModifiers();
        b0.SimpleName("Locator");
        b0.SimpleName("locator");
        b0._Feature();
        b0._Features();
        b0._SimpleEntity();
        b0.SimpleEntity_();
        b0.EntityModifiers_(0);
        b0._EntityModifiers();
        b0.SimpleName("EntityInEditorLocator");
        b0.Types_(1);
        b0.SimpleName("Locator");
        b0._Types();
        b0.Features_(2);
        b0.Feature_();
        b0.FeatureModifiers_(1);
        b0.FeatureModifier("reference");
        b0._FeatureModifiers();
        b0.SimpleName("Any");
        b0.SimpleName("entity");
        b0._Feature();
        b0.Feature_();
        b0.FeatureModifiers_(0);
        b0._FeatureModifiers();
        b0.SimpleName("RelativeBounds");
        b0.SimpleName("bounds");
        b0._Feature();
        b0._Features();
        b0._SimpleEntity();
        b0.SimpleEntity_();
        b0.EntityModifiers_(0);
        b0._EntityModifiers();
        b0.SimpleName("Topic");
        b0.Types_(1);
        b0.SimpleName("Associable");
        b0._Types();
        b0.Features_(4);
        b0.Feature_();
        b0.FeatureModifiers_(0);
        b0._FeatureModifiers();
        b0.SimpleName("Name");
        b0.SimpleName("name");
        b0._Feature();
        b0.Feature_();
        b0.FeatureModifiers_(1);
        b0.FeatureModifier("optional");
        b0._FeatureModifiers();
        b0.SimpleName("Associations");
        b0.SimpleName("associations");
        b0._Feature();
        b0.Feature_();
        b0.FeatureModifiers_(1);
        b0.FeatureModifier("optional");
        b0._FeatureModifiers();
        b0.SimpleName("Occurrences");
        b0.SimpleName("occurrences");
        b0._Feature();
        b0.Feature_();
        b0.FeatureModifiers_(1);
        b0.FeatureModifier("optional");
        b0._FeatureModifiers();
        b0.SimpleName("Properties");
        b0.SimpleName("properties");
        b0._Feature();
        b0._Features();
        b0._SimpleEntity();
        b0.SimpleEntity_();
        b0.EntityModifiers_(0);
        b0._EntityModifiers();
        b0.SimpleName("Aspect");
        b0.Types_(1);
        b0.SimpleName("Associable");
        b0._Types();
        b0.Features_(3);
        b0.Feature_();
        b0.FeatureModifiers_(0);
        b0._FeatureModifiers();
        b0.SimpleName("Name");
        b0.SimpleName("name");
        b0._Feature();
        b0.Feature_();
        b0.FeatureModifiers_(1);
        b0.FeatureModifier("optional");
        b0._FeatureModifiers();
        b0.SimpleName("Topics");
        b0.SimpleName("topics");
        b0._Feature();
        b0.Feature_();
        b0.FeatureModifiers_(1);
        b0.FeatureModifier("optional");
        b0._FeatureModifiers();
        b0.SimpleName("Properties");
        b0.SimpleName("properties");
        b0._Feature();
        b0._Features();
        b0._SimpleEntity();
        b0.SimpleEntity_();
        b0.EntityModifiers_(0);
        b0._EntityModifiers();
        b0.SimpleName("Relationship");
        b0.Types_(1);
        b0.SimpleName("Associable");
        b0._Types();
        b0.Features_(3);
        b0.Feature_();
        b0.FeatureModifiers_(0);
        b0._FeatureModifiers();
        b0.SimpleName("Name");
        b0.SimpleName("name");
        b0._Feature();
        b0.Feature_();
        b0.FeatureModifiers_(1);
        b0.FeatureModifier("optional");
        b0._FeatureModifiers();
        b0.SimpleName("Topics");
        b0.SimpleName("topics");
        b0._Feature();
        b0.Feature_();
        b0.FeatureModifiers_(1);
        b0.FeatureModifier("optional");
        b0._FeatureModifiers();
        b0.SimpleName("Properties");
        b0.SimpleName("properties");
        b0._Feature();
        b0._Features();
        b0._SimpleEntity();
        b0.SimpleEntity_();
        b0.EntityModifiers_(0);
        b0._EntityModifiers();
        b0.SimpleName("Image");
        b0.Types_(1);
        b0.SimpleName("Associable");
        b0._Types();
        b0.Features_(3);
        b0.Feature_();
        b0.FeatureModifiers_(0);
        b0._FeatureModifiers();
        b0.SimpleName("Name");
        b0.SimpleName("name");
        b0._Feature();
        b0.Feature_();
        b0.FeatureModifiers_(0);
        b0._FeatureModifiers();
        b0.SimpleName("LinkReference");
        b0.SimpleName("resource");
        b0._Feature();
        b0.Feature_();
        b0.FeatureModifiers_(1);
        b0.FeatureModifier("optional");
        b0._FeatureModifiers();
        b0.SimpleName("ImageTransformer");
        b0.SimpleName("transformer");
        b0._Feature();
        b0._Features();
        b0._SimpleEntity();
        b0.SimpleEntity_();
        b0.EntityModifiers_(0);
        b0._EntityModifiers();
        b0.SimpleName("Model");
        b0.Types_(1);
        b0.SimpleName("Associable");
        b0._Types();
        b0.Features_(4);
        b0.Feature_();
        b0.FeatureModifiers_(0);
        b0._FeatureModifiers();
        b0.SimpleName("Name");
        b0.SimpleName("name");
        b0._Feature();
        b0.Feature_();
        b0.FeatureModifiers_(0);
        b0._FeatureModifiers();
        b0.SimpleName("ResourceReference");
        b0.SimpleName("resource");
        b0._Feature();
        b0.Feature_();
        b0.FeatureModifiers_(1);
        b0.FeatureModifier("optional");
        b0._FeatureModifiers();
        b0.SimpleName("ResourceReference");
        b0.SimpleName("query");
        b0._Feature();
        b0.Feature_();
        b0.FeatureModifiers_(2);
        b0.FeatureModifier("optional");
        b0.FeatureModifier("derived");
        b0._FeatureModifiers();
        b0.SimpleName("EntityReference");
        b0.SimpleName("projection");
        b0._Feature();
        b0._Features();
        b0._SimpleEntity();
        b0.SimpleEntity_();
        b0.EntityModifiers_(0);
        b0._EntityModifiers();
        b0.SimpleName("Link");
        b0.Types_(1);
        b0.SimpleName("Associable");
        b0._Types();
        b0.Features_(3);
        b0.Feature_();
        b0.FeatureModifiers_(0);
        b0._FeatureModifiers();
        b0.SimpleName("Name");
        b0.SimpleName("name");
        b0._Feature();
        b0.Feature_();
        b0.FeatureModifiers_(0);
        b0._FeatureModifiers();
        b0.SimpleName("LinkReference");
        b0.SimpleName("resource");
        b0._Feature();
        b0.Feature_();
        b0.FeatureModifiers_(1);
        b0.FeatureModifier("optional");
        b0._FeatureModifiers();
        b0.SimpleName("ResourceReference");
        b0.SimpleName("query");
        b0._Feature();
        b0._Features();
        b0._SimpleEntity();
        b0.SimpleEntity_();
        b0.EntityModifiers_(0);
        b0._EntityModifiers();
        b0.SimpleName("Task");
        b0.Types_(1);
        b0.SimpleName("Associable");
        b0._Types();
        b0.Features_(2);
        b0.Feature_();
        b0.FeatureModifiers_(0);
        b0._FeatureModifiers();
        b0.SimpleName("Name");
        b0.SimpleName("name");
        b0._Feature();
        b0.Feature_();
        b0.FeatureModifiers_(1);
        b0.FeatureModifier("optional");
        b0._FeatureModifiers();
        b0.SimpleName("ResourceReference");
        b0.SimpleName("query");
        b0._Feature();
        b0._Features();
        b0._SimpleEntity();
        b0.CompositeEntity_();
        b0.EntityModifiers_(0);
        b0._EntityModifiers();
        b0.SimpleName("Properties");
        b0.Types_(0);
        b0._Types();
        b0.ComponentModifiers_(1);
        b0.ComponentModifier("ordered");
        b0._ComponentModifiers();
        b0.SimpleName("Property");
        b0._CompositeEntity();
        b0.SimpleEntity_();
        b0.EntityModifiers_(1);
        b0.EntityModifier("abstract");
        b0._EntityModifiers();
        b0.SimpleName("Property");
        b0.Types_(0);
        b0._Types();
        b0.Features_(0);
        b0._Features();
        b0._SimpleEntity();
        b0.DataEntity_();
        b0.EntityModifiers_(0);
        b0._EntityModifiers();
        b0.SimpleName("Theme");
        b0.Types_(1);
        b0.SimpleName("Property");
        b0._Types();
        b0.DataType("String");
        b0._DataEntity();
        b0.EnumEntity_();
        b0.EntityModifiers_(0);
        b0._EntityModifiers();
        b0.SimpleName("Layout");
        b0.Types_(1);
        b0.SimpleName("Property");
        b0._Types();
        b0.EnumValues_(16);
        b0.EnumValue("AUTOMATIC");
        b0.EnumValue("TEXT");
        b0.EnumValue("MAP");
        b0.EnumValue("TABLE");
        b0.EnumValue("OUTLINE_DOWN_LEFT");
        b0.EnumValue("OUTLINE_DOWN_RIGHT");
        b0.EnumValue("OUTLINE_UP_LEFT");
        b0.EnumValue("OUTLINE_UP_RIGHT");
        b0.EnumValue("TREE_LEFT");
        b0.EnumValue("TREE_RIGHT");
        b0.EnumValue("TREE_UP");
        b0.EnumValue("TREE_DOWN");
        b0.EnumValue("FISHBONE_LEFT");
        b0.EnumValue("FISHBONE_RIGHT");
        b0.EnumValue("FISHBONE_UP");
        b0.EnumValue("FISHBONE_DOWN");
        b0._EnumValues();
        b0._EnumEntity();
        b0.EnumEntity_();
        b0.EntityModifiers_(0);
        b0._EntityModifiers();
        b0.SimpleName("Shape");
        b0.Types_(1);
        b0.SimpleName("Property");
        b0._Types();
        b0.EnumValues_(8);
        b0.EnumValue("AUTOMATIC");
        b0.EnumValue("DIAMOND");
        b0.EnumValue("EXAGON");
        b0.EnumValue("ELLIPSE");
        b0.EnumValue("RECTANGLE");
        b0.EnumValue("ROUNDED_RECTANGLE");
        b0.EnumValue("UNDERLINE");
        b0.EnumValue("MARGIN");
        b0._EnumValues();
        b0._EnumEntity();
        b0.DataEntity_();
        b0.EntityModifiers_(0);
        b0._EntityModifiers();
        b0.SimpleName("ShapeColor");
        b0.Types_(1);
        b0.SimpleName("Property");
        b0._Types();
        b0.DataType("String");
        b0._DataEntity();
        b0.DataEntity_();
        b0.EntityModifiers_(0);
        b0._EntityModifiers();
        b0.SimpleName("ShapeFillColor");
        b0.Types_(1);
        b0.SimpleName("Property");
        b0._Types();
        b0.DataType("String");
        b0._DataEntity();
        b0.DataEntity_();
        b0.EntityModifiers_(0);
        b0._EntityModifiers();
        b0.SimpleName("ShapeFillColor2");
        b0.Types_(1);
        b0.SimpleName("Property");
        b0._Types();
        b0.DataType("String");
        b0._DataEntity();
        b0.EnumEntity_();
        b0.EntityModifiers_(0);
        b0._EntityModifiers();
        b0.SimpleName("ShapeFillGradient");
        b0.Types_(1);
        b0.SimpleName("Property");
        b0._Types();
        b0.EnumValues_(4);
        b0.EnumValue("AUTOMATIC");
        b0.EnumValue("NONE");
        b0.EnumValue("HORIZONTAL");
        b0.EnumValue("VERTICAL");
        b0._EnumValues();
        b0._EnumEntity();
        b0.DataEntity_();
        b0.EntityModifiers_(0);
        b0._EntityModifiers();
        b0.SimpleName("ShapeInsets");
        b0.Types_(1);
        b0.SimpleName("Property");
        b0._Types();
        b0.DataType("int");
        b0._DataEntity();
        b0.EnumEntity_();
        b0.EntityModifiers_(0);
        b0._EntityModifiers();
        b0.SimpleName("ShapeStyle");
        b0.Types_(1);
        b0.SimpleName("Property");
        b0._Types();
        b0.EnumValues_(6);
        b0.EnumValue("AUTOMATIC");
        b0.EnumValue("SOLID");
        b0.EnumValue("DASH");
        b0.EnumValue("DOT");
        b0.EnumValue("DASH_DOT");
        b0.EnumValue("DASH_DOT_DOT");
        b0._EnumValues();
        b0._EnumEntity();
        b0.EnumEntity_();
        b0.EntityModifiers_(0);
        b0._EntityModifiers();
        b0.SimpleName("ShapeWidth");
        b0.Types_(1);
        b0.SimpleName("Property");
        b0._Types();
        b0.EnumValues_(6);
        b0.EnumValue("AUTOMATIC");
        b0.EnumValue("THINNEST");
        b0.EnumValue("THIN");
        b0.EnumValue("MEDIUM");
        b0.EnumValue("FAT");
        b0.EnumValue("FATTEST");
        b0._EnumValues();
        b0._EnumEntity();
        b0.DataEntity_();
        b0.EntityModifiers_(0);
        b0._EntityModifiers();
        b0.SimpleName("LineColor");
        b0.Types_(1);
        b0.SimpleName("Property");
        b0._Types();
        b0.DataType("String");
        b0._DataEntity();
        b0.EnumEntity_();
        b0.EntityModifiers_(0);
        b0._EntityModifiers();
        b0.SimpleName("LineStyle");
        b0.Types_(1);
        b0.SimpleName("Property");
        b0._Types();
        b0.EnumValues_(6);
        b0.EnumValue("AUTOMATIC");
        b0.EnumValue("SOLID");
        b0.EnumValue("DASH");
        b0.EnumValue("DOT");
        b0.EnumValue("DASH_DOT");
        b0.EnumValue("DASH_DOT_DOT");
        b0._EnumValues();
        b0._EnumEntity();
        b0.EnumEntity_();
        b0.EntityModifiers_(0);
        b0._EntityModifiers();
        b0.SimpleName("LineWidth");
        b0.Types_(1);
        b0.SimpleName("Property");
        b0._Types();
        b0.EnumValues_(6);
        b0.EnumValue("AUTOMATIC");
        b0.EnumValue("THINNEST");
        b0.EnumValue("THIN");
        b0.EnumValue("MEDIUM");
        b0.EnumValue("FAT");
        b0.EnumValue("FATTEST");
        b0._EnumValues();
        b0._EnumEntity();
        b0.DataEntity_();
        b0.EntityModifiers_(0);
        b0._EntityModifiers();
        b0.SimpleName("TextFont");
        b0.Types_(1);
        b0.SimpleName("Property");
        b0._Types();
        b0.DataType("String");
        b0._DataEntity();
        b0.EnumEntity_();
        b0.EntityModifiers_(0);
        b0._EntityModifiers();
        b0.SimpleName("TextPlacement");
        b0.Types_(1);
        b0.SimpleName("Property");
        b0._Types();
        b0.EnumValues_(5);
        b0.EnumValue("AUTOMATIC");
        b0.EnumValue("NORTH");
        b0.EnumValue("EAST");
        b0.EnumValue("SOUTH");
        b0.EnumValue("WEST");
        b0._EnumValues();
        b0._EnumEntity();
        b0.DataEntity_();
        b0.EntityModifiers_(0);
        b0._EntityModifiers();
        b0.SimpleName("TextColor");
        b0.Types_(0);
        b0._Types();
        b0.DataType("String");
        b0._DataEntity();
        b0.DataEntity_();
        b0.EntityModifiers_(0);
        b0._EntityModifiers();
        b0.SimpleName("IconName");
        b0.Types_(1);
        b0.SimpleName("Property");
        b0._Types();
        b0.DataType("String");
        b0._DataEntity();
        b0.EnumEntity_();
        b0.EntityModifiers_(0);
        b0._EntityModifiers();
        b0.SimpleName("IconPosition");
        b0.Types_(1);
        b0.SimpleName("Property");
        b0._Types();
        b0.EnumValues_(3);
        b0.EnumValue("AUTOMATIC");
        b0.EnumValue("LEFT");
        b0.EnumValue("RIGHT");
        b0._EnumValues();
        b0._EnumEntity();
        b0.DataEntity_();
        b0.EntityModifiers_(0);
        b0._EntityModifiers();
        b0.SimpleName("IconTextGap");
        b0.Types_(1);
        b0.SimpleName("Property");
        b0._Types();
        b0.DataType("int");
        b0._DataEntity();
        b0.EnumEntity_();
        b0.EntityModifiers_(0);
        b0._EntityModifiers();
        b0.SimpleName("IconAlignment");
        b0.Types_(1);
        b0.SimpleName("Property");
        b0._Types();
        b0.EnumValues_(6);
        b0.EnumValue("AUTOMATIC");
        b0.EnumValue("CENTER");
        b0.EnumValue("TOP");
        b0.EnumValue("BOTTOM");
        b0.EnumValue("LEFT");
        b0.EnumValue("RIGHT");
        b0._EnumValues();
        b0._EnumEntity();
        b0.EnumEntity_();
        b0.EntityModifiers_(0);
        b0._EntityModifiers();
        b0.SimpleName("NumberingStyle");
        b0.Types_(1);
        b0.SimpleName("Property");
        b0._Types();
        b0.EnumValues_(6);
        b0.EnumValue("AUTOMATIC");
        b0.EnumValue("NONE");
        b0.EnumValue("123");
        b0.EnumValue("IIIIII");
        b0.EnumValue("abc");
        b0.EnumValue("ABC");
        b0._EnumValues();
        b0._EnumEntity();
        b0.DataEntity_();
        b0.EntityModifiers_(0);
        b0._EntityModifiers();
        b0.SimpleName("Tip");
        b0.Types_(1);
        b0.SimpleName("Property");
        b0._Types();
        b0.DataType("String");
        b0._DataEntity();
        b0.EnumEntity_();
        b0.EntityModifiers_(0);
        b0._EntityModifiers();
        b0.SimpleName("Update");
        b0.Types_(1);
        b0.SimpleName("Property");
        b0._Types();
        b0.EnumValues_(3);
        b0.EnumValue("AUTOMATIC");
        b0.EnumValue("LAZY");
        b0.EnumValue("EARLY");
        b0._EnumValues();
        b0._EnumEntity();
        b0.EnumEntity_();
        b0.EntityModifiers_(0);
        b0._EntityModifiers();
        b0.SimpleName("ChildrenOrder");
        b0.Types_(1);
        b0.SimpleName("Property");
        b0._Types();
        b0.EnumValues_(3);
        b0.EnumValue("AUTOMATIC");
        b0.EnumValue("FORWARD");
        b0.EnumValue("REVERSE");
        b0._EnumValues();
        b0._EnumEntity();
        b0.DataEntity_();
        b0.EntityModifiers_(0);
        b0._EntityModifiers();
        b0.SimpleName("Visible");
        b0.Types_(1);
        b0.SimpleName("Property");
        b0._Types();
        b0.DataType("boolean");
        b0._DataEntity();
        b0.DataEntity_();
        b0.EntityModifiers_(0);
        b0._EntityModifiers();
        b0.SimpleName("Editable");
        b0.Types_(1);
        b0.SimpleName("Property");
        b0._Types();
        b0.DataType("boolean");
        b0._DataEntity();
        b0.DataEntity_();
        b0.EntityModifiers_(0);
        b0._EntityModifiers();
        b0.SimpleName("Id");
        b0.Types_(1);
        b0.SimpleName("Property");
        b0._Types();
        b0.DataType("long");
        b0._DataEntity();
        b0.CompositeEntity_();
        b0.EntityModifiers_(0);
        b0._EntityModifiers();
        b0.SimpleName("Resources");
        b0.Types_(0);
        b0._Types();
        b0.ComponentModifiers_(1);
        b0.ComponentModifier("ordered");
        b0._ComponentModifiers();
        b0.SimpleName("Resource");
        b0._CompositeEntity();
        b0.SimpleEntity_();
        b0.EntityModifiers_(1);
        b0.EntityModifier("abstract");
        b0._EntityModifiers();
        b0.SimpleName("Resource");
        b0.Types_(0);
        b0._Types();
        b0.Features_(0);
        b0._Features();
        b0._SimpleEntity();
        b0.SimpleEntity_();
        b0.EntityModifiers_(0);
        b0._EntityModifiers();
        b0.SimpleName("ThemeResource");
        b0.Types_(1);
        b0.SimpleName("Resource");
        b0._Types();
        b0.Features_(2);
        b0.Feature_();
        b0.FeatureModifiers_(1);
        b0.FeatureModifier("id");
        b0._FeatureModifiers();
        b0.SimpleName("Name");
        b0.SimpleName("resourceName");
        b0._Feature();
        b0.Feature_();
        b0.FeatureModifiers_(0);
        b0._FeatureModifiers();
        b0.SimpleName("Properties");
        b0.SimpleName("properties");
        b0._Feature();
        b0._Features();
        b0._SimpleEntity();
        b0.SimpleEntity_();
        b0.EntityModifiers_(0);
        b0._EntityModifiers();
        b0.SimpleName("ColorResource");
        b0.Types_(1);
        b0.SimpleName("Resource");
        b0._Types();
        b0.Features_(4);
        b0.Feature_();
        b0.FeatureModifiers_(1);
        b0.FeatureModifier("id");
        b0._FeatureModifiers();
        b0.SimpleName("Name");
        b0.SimpleName("resourceName");
        b0._Feature();
        b0.Feature_();
        b0.FeatureModifiers_(0);
        b0._FeatureModifiers();
        b0.SimpleName("ColorAmount");
        b0.SimpleName("red");
        b0._Feature();
        b0.Feature_();
        b0.FeatureModifiers_(0);
        b0._FeatureModifiers();
        b0.SimpleName("ColorAmount");
        b0.SimpleName("green");
        b0._Feature();
        b0.Feature_();
        b0.FeatureModifiers_(0);
        b0._FeatureModifiers();
        b0.SimpleName("ColorAmount");
        b0.SimpleName("blue");
        b0._Feature();
        b0._Features();
        b0._SimpleEntity();
        b0.DataEntity_();
        b0.EntityModifiers_(0);
        b0._EntityModifiers();
        b0.SimpleName("ColorAmount");
        b0.Types_(0);
        b0._Types();
        b0.DataType("int");
        b0._DataEntity();
        b0.SimpleEntity_();
        b0.EntityModifiers_(0);
        b0._EntityModifiers();
        b0.SimpleName("ImageResource");
        b0.Types_(1);
        b0.SimpleName("Resource");
        b0._Types();
        b0.Features_(2);
        b0.Feature_();
        b0.FeatureModifiers_(1);
        b0.FeatureModifier("id");
        b0._FeatureModifiers();
        b0.SimpleName("Name");
        b0.SimpleName("resourceName");
        b0._Feature();
        b0.Feature_();
        b0.FeatureModifiers_(0);
        b0._FeatureModifiers();
        b0.SimpleName("Location");
        b0.SimpleName("location");
        b0._Feature();
        b0._Features();
        b0._SimpleEntity();
        b0.SimpleEntity_();
        b0.EntityModifiers_(0);
        b0._EntityModifiers();
        b0.SimpleName("FontResource");
        b0.Types_(1);
        b0.SimpleName("Resource");
        b0._Types();
        b0.Features_(4);
        b0.Feature_();
        b0.FeatureModifiers_(1);
        b0.FeatureModifier("id");
        b0._FeatureModifiers();
        b0.SimpleName("Name");
        b0.SimpleName("resourceName");
        b0._Feature();
        b0.Feature_();
        b0.FeatureModifiers_(0);
        b0._FeatureModifiers();
        b0.SimpleName("Name");
        b0.SimpleName("name");
        b0._Feature();
        b0.Feature_();
        b0.FeatureModifiers_(0);
        b0._FeatureModifiers();
        b0.SimpleName("FontSize");
        b0.SimpleName("height");
        b0._Feature();
        b0.Feature_();
        b0.FeatureModifiers_(0);
        b0._FeatureModifiers();
        b0.SimpleName("FontStyle");
        b0.SimpleName("style");
        b0._Feature();
        b0._Features();
        b0._SimpleEntity();
        b0.DataEntity_();
        b0.EntityModifiers_(0);
        b0._EntityModifiers();
        b0.SimpleName("FontSize");
        b0.Types_(0);
        b0._Types();
        b0.DataType("int");
        b0._DataEntity();
        b0.EnumEntity_();
        b0.EntityModifiers_(0);
        b0._EntityModifiers();
        b0.SimpleName("FontStyle");
        b0.Types_(0);
        b0._Types();
        b0.EnumValues_(4);
        b0.EnumValue("NORMAL");
        b0.EnumValue("BOLD");
        b0.EnumValue("ITALIC");
        b0.EnumValue("BOLD_ITALIC");
        b0._EnumValues();
        b0._EnumEntity();
        b0.SimpleEntity_();
        b0.EntityModifiers_(0);
        b0._EntityModifiers();
        b0.SimpleName("ModelResource");
        b0.Types_(1);
        b0.SimpleName("Resource");
        b0._Types();
        b0.Features_(4);
        b0.Feature_();
        b0.FeatureModifiers_(1);
        b0.FeatureModifier("id");
        b0._FeatureModifiers();
        b0.SimpleName("Name");
        b0.SimpleName("resourceName");
        b0._Feature();
        b0.Feature_();
        b0.FeatureModifiers_(1);
        b0.FeatureModifier("optional");
        b0._FeatureModifiers();
        b0.SimpleName("URI");
        b0.SimpleName("uri");
        b0._Feature();
        b0.Feature_();
        b0.FeatureModifiers_(1);
        b0.FeatureModifier("optional");
        b0._FeatureModifiers();
        b0.SimpleName("Location");
        b0.SimpleName("location");
        b0._Feature();
        b0.Feature_();
        b0.FeatureModifiers_(1);
        b0.FeatureModifier("optional");
        b0._FeatureModifiers();
        b0.SimpleName("Persistence");
        b0.SimpleName("persistence");
        b0._Feature();
        b0._Features();
        b0._SimpleEntity();
        b0.SimpleEntity_();
        b0.EntityModifiers_(0);
        b0._EntityModifiers();
        b0.SimpleName("InnerModelResource");
        b0.Types_(1);
        b0.SimpleName("Resource");
        b0._Types();
        b0.Features_(2);
        b0.Feature_();
        b0.FeatureModifiers_(1);
        b0.FeatureModifier("id");
        b0._FeatureModifiers();
        b0.SimpleName("Name");
        b0.SimpleName("resourceName");
        b0._Feature();
        b0.Feature_();
        b0.FeatureModifiers_(0);
        b0._FeatureModifiers();
        b0.SimpleName("Any");
        b0.SimpleName("model");
        b0._Feature();
        b0._Features();
        b0._SimpleEntity();
        b0.SimpleEntity_();
        b0.EntityModifiers_(1);
        b0.EntityModifier("abstract");
        b0._EntityModifiers();
        b0.SimpleName("LinkReference");
        b0.Types_(0);
        b0._Types();
        b0.Features_(0);
        b0._Features();
        b0._SimpleEntity();
        b0.SimpleEntity_();
        b0.EntityModifiers_(1);
        b0.EntityModifier("abstract");
        b0._EntityModifiers();
        b0.SimpleName("ResourceReference");
        b0.Types_(1);
        b0.SimpleName("LinkReference");
        b0._Types();
        b0.Features_(0);
        b0._Features();
        b0._SimpleEntity();
        b0.DataEntity_();
        b0.EntityModifiers_(0);
        b0._EntityModifiers();
        b0.SimpleName("ResourceRef");
        b0.Types_(1);
        b0.SimpleName("ResourceReference");
        b0._Types();
        b0.DataType("String");
        b0._DataEntity();
        b0.DataEntity_();
        b0.EntityModifiers_(0);
        b0._EntityModifiers();
        b0.SimpleName("IdRef");
        b0.Types_(1);
        b0.SimpleName("ResourceReference");
        b0._Types();
        b0.DataType("long");
        b0._DataEntity();
        b0.SimpleEntity_();
        b0.EntityModifiers_(0);
        b0._EntityModifiers();
        b0.SimpleName("EntityRef");
        b0.Types_(2);
        b0.SimpleName("ResourceReference");
        b0.SimpleName("EntityReference");
        b0._Types();
        b0.Features_(1);
        b0.Feature_();
        b0.FeatureModifiers_(1);
        b0.FeatureModifier("reference");
        b0._FeatureModifiers();
        b0.SimpleName("Any");
        b0.SimpleName("target");
        b0._Feature();
        b0._Features();
        b0._SimpleEntity();
        b0.DataEntity_();
        b0.EntityModifiers_(0);
        b0._EntityModifiers();
        b0.SimpleName("EntityData");
        b0.Types_(2);
        b0.SimpleName("ResourceReference");
        b0.SimpleName("EntityReference");
        b0._Types();
        b0.DataType("org.whole.lang.model.IEntity");
        b0._DataEntity();
        b0.DataEntity_();
        b0.EntityModifiers_(0);
        b0._EntityModifiers();
        b0.SimpleName("URI");
        b0.Types_(0);
        b0._Types();
        b0.DataType("String");
        b0._DataEntity();
        b0.SimpleEntity_();
        b0.EntityModifiers_(1);
        b0.EntityModifier("abstract");
        b0._EntityModifiers();
        b0.SimpleName("Location");
        b0.Types_(0);
        b0._Types();
        b0.Features_(0);
        b0._Features();
        b0._SimpleEntity();
        b0.DataEntity_();
        b0.EntityModifiers_(0);
        b0._EntityModifiers();
        b0.SimpleName("WorkspacePath");
        b0.Types_(1);
        b0.SimpleName("Location");
        b0._Types();
        b0.DataType("String");
        b0._DataEntity();
        b0.DataEntity_();
        b0.EntityModifiers_(0);
        b0._EntityModifiers();
        b0.SimpleName("FileSystemPath");
        b0.Types_(1);
        b0.SimpleName("Location");
        b0._Types();
        b0.DataType("String");
        b0._DataEntity();
        b0.DataEntity_();
        b0.EntityModifiers_(0);
        b0._EntityModifiers();
        b0.SimpleName("URL");
        b0.Types_(2);
        b0.SimpleName("Location");
        b0.SimpleName("LinkReference");
        b0._Types();
        b0.DataType("String");
        b0._DataEntity();
        b0.DataEntity_();
        b0.EntityModifiers_(0);
        b0._EntityModifiers();
        b0.SimpleName("Name");
        b0.Types_(0);
        b0._Types();
        b0.DataType("String");
        b0._DataEntity();
        b0.DataEntity_();
        b0.EntityModifiers_(0);
        b0._EntityModifiers();
        b0.SimpleName("Version");
        b0.Types_(0);
        b0._Types();
        b0.DataType("String");
        b0._DataEntity();
        b0.DataEntity_();
        b0.EntityModifiers_(0);
        b0._EntityModifiers();
        b0.SimpleName("PersistenceId");
        b0.Types_(1);
        b0.SimpleName("Persistence");
        b0._Types();
        b0.DataType("String");
        b0._DataEntity();
        b0.SimpleEntity_();
        b0.EntityModifiers_(0);
        b0._EntityModifiers();
        b0.SimpleName("RelativeBounds");
        b0.Types_(0);
        b0._Types();
        b0.Features_(4);
        b0.Feature_();
        b0.FeatureModifiers_(0);
        b0._FeatureModifiers();
        b0.SimpleName("IntPerc");
        b0.SimpleName("x");
        b0._Feature();
        b0.Feature_();
        b0.FeatureModifiers_(0);
        b0._FeatureModifiers();
        b0.SimpleName("IntPerc");
        b0.SimpleName("y");
        b0._Feature();
        b0.Feature_();
        b0.FeatureModifiers_(0);
        b0._FeatureModifiers();
        b0.SimpleName("IntPerc");
        b0.SimpleName("width");
        b0._Feature();
        b0.Feature_();
        b0.FeatureModifiers_(0);
        b0._FeatureModifiers();
        b0.SimpleName("IntPerc");
        b0.SimpleName("height");
        b0._Feature();
        b0._Features();
        b0._SimpleEntity();
        b0.DataEntity_();
        b0.EntityModifiers_(0);
        b0._EntityModifiers();
        b0.SimpleName("IntPerc");
        b0.Types_(0);
        b0._Types();
        b0.DataType("int");
        b0._DataEntity();
        b0._ModelDeclarations();
        b0.Namespace("org.whole.lang.maps");
        org.whole.lang.commons.builders.ICommonsBuilder b1 = (org.whole.lang.commons.builders.ICommonsBuilder) op.wGetBuilder(org.whole.lang.commons.reflect.CommonsLanguageKit.URI);
        b1.Resolver();
        b0.URI("http://lang.whole.org/Maps");
        b0._Model();
    }
}
