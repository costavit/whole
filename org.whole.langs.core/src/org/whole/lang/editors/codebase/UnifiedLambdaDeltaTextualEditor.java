package org.whole.lang.editors.codebase;

import org.whole.lang.builders.IBuilderOperation;
import org.whole.lang.editors.model.Editor;
import org.whole.lang.templates.AbstractTemplateFactory;

public class UnifiedLambdaDeltaTextualEditor extends AbstractTemplateFactory<Editor> {


    public void apply(IBuilderOperation op) {
        org.whole.lang.editors.builders.IEditorsBuilder b0 = (org.whole.lang.editors.builders.IEditorsBuilder) op.wGetBuilder(org.whole.lang.editors.reflect.EditorsLanguageKit.URI);
        b0.Editor_();
        b0.Identifier("UnifiedLambdaDeltaTextual");
        org.whole.lang.commons.builders.ICommonsBuilder b1 = (org.whole.lang.commons.builders.ICommonsBuilder) op.wGetBuilder(org.whole.lang.commons.reflect.CommonsLanguageKit.URI);
        b1.Resolver();
        b0.ModelComponent_();
        b0.Identifier("UnifiedLambdaDelta");
        b0._ModelComponent();
        b0.ViewComponent_();
        b0.ViewDeclarations_(10);
        b0.SimpleFigureDeclaration_();
        b0.Identifier("DeclarationFigure");
        b0.TextualFigure_(2);
        b0.Row_(1);
        b0.ChildPlace();
        b0._Row();
        b0.Row_(6);
        b0.ChildPlace();
        b0.KeywordToken("[");
        b0.ChildPlace();
        b0.KeywordToken(":");
        b0.ChildPlace();
        b0.KeywordToken("]");
        b0._Row();
        b0._TextualFigure();
        b0._SimpleFigureDeclaration();
        b0.SimpleFigureDeclaration_();
        b0.Identifier("DefinitionFigure");
        b0.TextualFigure_(2);
        b0.Row_(1);
        b0.ChildPlace();
        b0._Row();
        b0.Row_(6);
        b0.ChildPlace();
        b0.KeywordToken("[");
        b0.ChildPlace();
        b0.KeywordToken("=");
        b0.ChildPlace();
        b0.KeywordToken("]");
        b0._Row();
        b0._TextualFigure();
        b0._SimpleFigureDeclaration();
        b0.SimpleFigureDeclaration_();
        b0.Identifier("TopFigure");
        b0.TextualFigure_(1);
        b0.Row_(1);
        b0.KeywordToken("@");
        b0._Row();
        b0._TextualFigure();
        b0._SimpleFigureDeclaration();
        b0.SimpleFigureDeclaration_();
        b0.Identifier("AbstractionFigure");
        b0.TextualFigure_(2);
        b0.Row_(6);
        b0.ChildPlace();
        b0.KeywordToken("[");
        b0.ChildPlace();
        b0.KeywordToken(":");
        b0.ChildPlace();
        b0.KeywordToken("]");
        b0._Row();
        b0.Row_(1);
        b0.ChildPlace();
        b0._Row();
        b0._TextualFigure();
        b0._SimpleFigureDeclaration();
        b0.SimpleFigureDeclaration_();
        b0.Identifier("AbbreviationFigure");
        b0.TextualFigure_(2);
        b0.Row_(6);
        b0.ChildPlace();
        b0.KeywordToken("[");
        b0.ChildPlace();
        b0.KeywordToken("=");
        b0.ChildPlace();
        b0.KeywordToken("]");
        b0._Row();
        b0.Row_(1);
        b0.ChildPlace();
        b0._Row();
        b0._TextualFigure();
        b0._SimpleFigureDeclaration();
        b0.SimpleFigureDeclaration_();
        b0.Identifier("ApplicationFigure");
        b0.TextualFigure_(1);
        b0.Row_(5);
        b0.ChildPlace();
        b0.KeywordToken("(");
        b0.ChildPlace();
        b0.KeywordToken(")");
        b0.ChildPlace();
        b0._Row();
        b0._TextualFigure();
        b0._SimpleFigureDeclaration();
        b0.SimpleFigureDeclaration_();
        b0.Identifier("CastFigure");
        b0.TextualFigure_(1);
        b0.Row_(5);
        b0.ChildPlace();
        b0.KeywordToken("<");
        b0.ChildPlace();
        b0.KeywordToken(">");
        b0.ChildPlace();
        b0._Row();
        b0._TextualFigure();
        b0._SimpleFigureDeclaration();
        b0.SimpleFigureDeclaration_();
        b0.Identifier("LocalFigure");
        b0.TextualFigure_(1);
        b0.Row_(2);
        b0.KeywordToken("#");
        b0.ChildPlace();
        b0._Row();
        b0._TextualFigure();
        b0._SimpleFigureDeclaration();
        b0.SimpleFigureDeclaration_();
        b0.Identifier("SortFigure");
        b0.TextualFigure_(1);
        b0.Row_(2);
        b0.KeywordToken("@");
        b0.ChildPlace();
        b0._Row();
        b0._TextualFigure();
        b0._SimpleFigureDeclaration();
        b0.SimpleFigureDeclaration_();
        b0.Identifier("NameFigure");
        b0.TextualFigure_(1);
        b0.Row_(3);
        b0.ChildPlace();
        b0.ChildPlace();
        b0.ChildPlace();
        b0._Row();
        b0._TextualFigure();
        b0._SimpleFigureDeclaration();
        b0._ViewDeclarations();
        b0._ViewComponent();
        b0.ControllerComponent_();
        b0.ControllerDeclarations_(10);
        b0.PartDeclaration_();
        b0.Identifier("DeclarationPart");
        b0.Identifier("Declaration");
        b0.Identifier("DeclarationFigure");
        b0.EntityFeatures_(4);
        b0.Identifier("back");
        b0.Identifier("polarity");
        b0.Identifier("name");
        b0.Identifier("front");
        b0._EntityFeatures();
        b0._PartDeclaration();
        b0.PartDeclaration_();
        b0.Identifier("DefinitionPart");
        b0.Identifier("Definition");
        b0.Identifier("DefinitionFigure");
        b0.EntityFeatures_(4);
        b0.Identifier("back");
        b0.Identifier("polarity");
        b0.Identifier("name");
        b0.Identifier("front");
        b0._EntityFeatures();
        b0._PartDeclaration();
        b0.PartDeclaration_();
        b0.Identifier("TopPart");
        b0.Identifier("Top");
        b0.Identifier("TopFigure");
        b0.EntityFeatures();
        b0._PartDeclaration();
        b0.PartDeclaration_();
        b0.Identifier("AbstractionPart");
        b0.Identifier("Abstraction");
        b0.Identifier("AbstractionFigure");
        b0.EntityFeatures_(4);
        b0.Identifier("polarity");
        b0.Identifier("name");
        b0.Identifier("front");
        b0.Identifier("back");
        b0._EntityFeatures();
        b0._PartDeclaration();
        b0.PartDeclaration_();
        b0.Identifier("AbbreviationPart");
        b0.Identifier("Abbreviation");
        b0.Identifier("AbbreviationFigure");
        b0.EntityFeatures_(4);
        b0.Identifier("polarity");
        b0.Identifier("name");
        b0.Identifier("front");
        b0.Identifier("back");
        b0._EntityFeatures();
        b0._PartDeclaration();
        b0.PartDeclaration_();
        b0.Identifier("ApplicationPart");
        b0.Identifier("Application");
        b0.Identifier("ApplicationFigure");
        b0.EntityFeatures_(3);
        b0.Identifier("polarity");
        b0.Identifier("front");
        b0.Identifier("back");
        b0._EntityFeatures();
        b0._PartDeclaration();
        b0.PartDeclaration_();
        b0.Identifier("CastPart");
        b0.Identifier("Cast");
        b0.Identifier("CastFigure");
        b0.EntityFeatures_(3);
        b0.Identifier("polarity");
        b0.Identifier("front");
        b0.Identifier("back");
        b0._EntityFeatures();
        b0._PartDeclaration();
        b0.PartDeclaration_();
        b0.Identifier("LocalPart");
        b0.Identifier("Local");
        b0.Identifier("LocalFigure");
        b0.EntityFeatures_(1);
        b0.Identifier("index");
        b0._EntityFeatures();
        b0._PartDeclaration();
        b0.PartDeclaration_();
        b0.Identifier("SortPart");
        b0.Identifier("Sort");
        b0.Identifier("SortFigure");
        b0.EntityFeatures_(1);
        b0.Identifier("level");
        b0._EntityFeatures();
        b0._PartDeclaration();
        b0.PartDeclaration_();
        b0.Identifier("NamePart");
        b0.Identifier("Name");
        b0.Identifier("NameFigure");
        b0.EntityFeatures_(3);
        b0.Identifier("access");
        b0.Identifier("prefix");
        b0.Identifier("postfix");
        b0._EntityFeatures();
        b0._PartDeclaration();
        b0._ControllerDeclarations();
        b0._ControllerComponent();
        b0._Editor();
    }
}
