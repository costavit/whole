package org.whole.lang.grammars.codebase;

import org.whole.lang.builders.IBuilderOperation;
import org.whole.lang.templates.AbstractTemplateFactory;

public class XmlGrammar extends AbstractTemplateFactory<org.whole.lang.grammars.model.Grammar> {

    public void apply(IBuilderOperation op) {
        org.whole.lang.grammars.builders.IGrammarsBuilder b0 = (org.whole.lang.grammars.builders.IGrammarsBuilder) op.wGetBuilder(org.whole.lang.grammars.reflect.GrammarsLanguageKit.URI);
        b0.Grammar_();
        b0.Name("XmlGrammar");
        b0.LanguageDescriptor_();
        b0.URI("http://lang.whole.org/Xml");
        b0.Namespace("org.whole.lang.xml");
        b0.Name("Xml");
        org.whole.lang.commons.builders.ICommonsBuilder b1 = (org.whole.lang.commons.builders.ICommonsBuilder) op.wGetBuilder(org.whole.lang.commons.reflect.CommonsLanguageKit.URI);
        b1.Resolver();
        b0._LanguageDescriptor();
        b0.NonTerminal("Document");
        b0.LiteralTerminal_();
        b0.RegExp("\\p{javaWhitespace}*");
        b0.Category("SEPARATOR");
        b0.Literal("");
        b0._LiteralTerminal();
        b0.Productions_(4);
        b0.Production_();
        b0.NonTerminal("QS");
        b0.DataTerminal_();
        b0.RegExp("[^\"]*");
        b0.Category("LITERAL");
        b0.Format("%s");
        b0._DataTerminal();
        b1.Resolver();
        b0._Production();
        b0.Production_();
        b0.NonTerminal("NCNAME");
        b0.DataTerminal_();
        b0.RegExp("[a-zA-Z][_a-zA-Z0-9]*");
        b0.Category("LITERAL");
        b0.Format("%s");
        b0._DataTerminal();
        b1.Resolver();
        b0._Production();
        b0.Production_();
        b0.NonTerminal("STRING");
        b0.DataTerminal_();
        b0.RegExp("(?s).*");
        b0.Category("LITERAL");
        b0.Format("%s");
        b0._DataTerminal();
        b1.Resolver();
        b0._Production();
        b0.Production_();
        b0.NonTerminal("SP");
        b0.LiteralTerminal_();
        b0.RegExp("\\p{javaWhitespace}+");
        b0.Category("SEPARATOR");
        b0.Literal(" ");
        b0._LiteralTerminal();
        b1.Resolver();
        b0._Production();
        b0._Productions();
        b0.Productions_(5);
        b0.Production_();
        b0.NonTerminal("Document");
        b0.Concatenate_(2);
        b0.Production_();
        b0.NonTerminal("Prolog");
        b0.Concatenate_(3);
        b0.Optional_();
        b0.As_();
        b0.Production_();
        b0.NonTerminal("XMLDecl");
        b0.Concatenate_(12);
        b0.LiteralTerminal_();
        b0.RegExp("\\Q<?xml\\E");
        b0.Category("DELIMITER");
        b0.Literal("<?xml");
        b0._LiteralTerminal();
        b0.Empty_();
        b0.Literal(" ");
        b0._Empty();
        b0.LiteralTerminal_();
        b0.RegExp("version");
        b0.Category("DELIMITER");
        b0.Literal("version");
        b0._LiteralTerminal();
        b0.LiteralTerminal_();
        b0.RegExp("=");
        b0.Category("DELIMITER");
        b0.Literal("=");
        b0._LiteralTerminal();
        b0.LiteralTerminal_();
        b0.RegExp("\"");
        b0.Category("DELIMITER");
        b0.Literal("\"");
        b0._LiteralTerminal();
        b0.Production_();
        b0.NonTerminal("Version");
        b0.NonTerminal("QS");
        b1.Resolver();
        b0._Production();
        b0.LiteralTerminal_();
        b0.RegExp("\"");
        b0.Category("DELIMITER");
        b0.Literal("\"");
        b0._LiteralTerminal();
        b0.Optional_();
        b0.As_();
        b0.Concatenate_(6);
        b0.Empty_();
        b0.Literal(" ");
        b0._Empty();
        b0.LiteralTerminal_();
        b0.RegExp("encoding");
        b0.Category("DELIMITER");
        b0.Literal("encoding");
        b0._LiteralTerminal();
        b0.LiteralTerminal_();
        b0.RegExp("=");
        b0.Category("DELIMITER");
        b0.Literal("=");
        b0._LiteralTerminal();
        b0.LiteralTerminal_();
        b0.RegExp("\"");
        b0.Category("DELIMITER");
        b0.Literal("\"");
        b0._LiteralTerminal();
        b0.Production_();
        b0.NonTerminal("Encoding");
        b0.NonTerminal("QS");
        b1.Resolver();
        b0._Production();
        b0.LiteralTerminal_();
        b0.RegExp("\"");
        b0.Category("DELIMITER");
        b0.Literal("\"");
        b0._LiteralTerminal();
        b0._Concatenate();
        b0.Name("encoding");
        b0._As();
        b0._Optional();
        b0.Optional_();
        b0.As_();
        b0.Concatenate_(6);
        b0.Empty_();
        b0.Literal(" ");
        b0._Empty();
        b0.LiteralTerminal_();
        b0.RegExp("standalone");
        b0.Category("DELIMITER");
        b0.Literal("standalone");
        b0._LiteralTerminal();
        b0.LiteralTerminal_();
        b0.RegExp("=");
        b0.Category("DELIMITER");
        b0.Literal("=");
        b0._LiteralTerminal();
        b0.LiteralTerminal_();
        b0.RegExp("\"");
        b0.Category("DELIMITER");
        b0.Literal("\"");
        b0._LiteralTerminal();
        b0.Production_();
        b0.NonTerminal("Standalone");
        b0.DataTerminal_();
        b0.RegExp("yes|no");
        b0.Category("LITERAL");
        b0.Format("%s");
        b0._DataTerminal();
        b0.DataType("BOOLEAN");
        b0._Production();
        b0.LiteralTerminal_();
        b0.RegExp("\"");
        b0.Category("DELIMITER");
        b0.Literal("\"");
        b0._LiteralTerminal();
        b0._Concatenate();
        b0.Name("standalone");
        b0._As();
        b0._Optional();
        b0.Empty_();
        b0.Literal(" ");
        b0._Empty();
        b0.LiteralTerminal_();
        b0.RegExp("\\Q?>\\E");
        b0.Category("DELIMITER");
        b0.Literal("?>");
        b0._LiteralTerminal();
        b0.Empty_();
        b0.Literal("\n");
        b0._Empty();
        b0._Concatenate();
        b1.Resolver();
        b0._Production();
        b0.Name("xmlDecl");
        b0._As();
        b0._Optional();
        b0.Optional_();
        b0.Production_();
        b0.NonTerminal("DocTypeDecl");
        b0.Concatenate_(6);
        b0.LiteralTerminal_();
        b0.RegExp("\\Q<!DOCTYPE\\E");
        b0.Category("DELIMITER");
        b0.Literal("<!DOCTYPE");
        b0._LiteralTerminal();
        b0.Empty_();
        b0.Literal(" ");
        b0._Empty();
        b0.As_();
        b0.NonTerminal("IName");
        b0.Name("name");
        b0._As();
        b0.Optional_();
        b0.As_();
        b0.Concatenate_(2);
        b0.Empty_();
        b0.Literal(" ");
        b0._Empty();
        b0.Production_();
        b0.NonTerminal("IExternalId");
        b0.Choose_(2);
        b0.Production_();
        b0.NonTerminal("SystemId");
        b0.Concatenate_(1);
        b0.As_();
        b0.Production_();
        b0.NonTerminal("SystemLiteral");
        b0.NonTerminal("QS");
        b1.Resolver();
        b0._Production();
        b0.Name("systemLiteral");
        b0._As();
        b0._Concatenate();
        b1.Resolver();
        b0._Production();
        b0.Production_();
        b0.NonTerminal("PublicId");
        b0.Concatenate_(3);
        b0.Production_();
        b0.NonTerminal("PubidLiteral");
        b0.NonTerminal("QS");
        b1.Resolver();
        b0._Production();
        b0.Empty_();
        b0.Literal(" ");
        b0._Empty();
        b0.NonTerminal("SystemLiteral");
        b0._Concatenate();
        b1.Resolver();
        b0._Production();
        b0._Choose();
        b1.Resolver();
        b0._Production();
        b0._Concatenate();
        b0.Name("externalId");
        b0._As();
        b0._Optional();
        b0.LiteralTerminal_();
        b0.RegExp(">");
        b0.Category("DELIMITER");
        b0.Literal(">");
        b0._LiteralTerminal();
        b0.Empty_();
        b0.Literal("\n");
        b0._Empty();
        b0._Concatenate();
        b1.Resolver();
        b0._Production();
        b0._Optional();
        b0.Optional_();
        b0.Production_();
        b0.NonTerminal("Misc");
        b0.Repeat_();
        b0.Size(0);
        b0.Unbounded();
        b0.Empty_();
        b0.Literal("\n");
        b0._Empty();
        b0.NonTerminal("IMisc");
        b0._Repeat();
        b1.Resolver();
        b0._Production();
        b0._Optional();
        b0._Concatenate();
        b1.Resolver();
        b0._Production();
        b0.NonTerminal("Element");
        b0._Concatenate();
        b1.Resolver();
        b0._Production();
        b0.Production_();
        b0.NonTerminal("Element");
        b0.Concatenate_(8);
        b0.LiteralTerminal_();
        b0.RegExp("<");
        b0.Category("DELIMITER");
        b0.Literal("<");
        b0._LiteralTerminal();
        b0.As_();
        b0.NonTerminal("IName");
        b0.Name("tag");
        b0._As();
        b0.Optional_();
        b0.As_();
        b0.Production_();
        b0.NonTerminal("Attributes");
        b0.Repeat_();
        b0.Size(0);
        b0.Unbounded();
        b1.Resolver();
        b0.Production_();
        b0.NonTerminal("Attribute");
        b0.Concatenate_(6);
        b0.Empty_();
        b0.Literal(" ");
        b0._Empty();
        b0.As_();
        b0.NonTerminal("IName");
        b0.Name("name");
        b0._As();
        b0.LiteralTerminal_();
        b0.RegExp("=");
        b0.Category("DELIMITER");
        b0.Literal("=");
        b0._LiteralTerminal();
        b0.LiteralTerminal_();
        b0.RegExp("\"");
        b0.Category("DELIMITER");
        b0.Literal("\"");
        b0._LiteralTerminal();
        b0.Production_();
        b0.NonTerminal("Value");
        b0.NonTerminal("QS");
        b1.Resolver();
        b0._Production();
        b0.LiteralTerminal_();
        b0.RegExp("\"");
        b0.Category("DELIMITER");
        b0.Literal("\"");
        b0._LiteralTerminal();
        b0._Concatenate();
        b1.Resolver();
        b0._Production();
        b0._Repeat();
        b1.Resolver();
        b0._Production();
        b0.Name("attributes");
        b0._As();
        b0._Optional();
        b0.LiteralTerminal_();
        b0.RegExp(">");
        b0.Category("DELIMITER");
        b0.Literal(">");
        b0._LiteralTerminal();
        b0.As_();
        b0.NonTerminal("IContent");
        b0.Name("content");
        b0._As();
        b0.LiteralTerminal_();
        b0.RegExp("\\Q</\\E");
        b0.Category("DELIMITER");
        b0.Literal("</");
        b0._LiteralTerminal();
        b0.As_();
        b0.NonTerminal("IName");
        b0.Name("tag");
        b0._As();
        b0.LiteralTerminal_();
        b0.RegExp(">");
        b0.Category("DELIMITER");
        b0.Literal(">");
        b0._LiteralTerminal();
        b0._Concatenate();
        b1.Resolver();
        b0._Production();
        b0.Production_();
        b0.NonTerminal("IName");
        b0.Choose_(2);
        b0.Production_();
        b0.NonTerminal("Name");
        b0.NonTerminal("NCNAME");
        b1.Resolver();
        b0._Production();
        b0.Production_();
        b0.NonTerminal("QualifiedName");
        b0.Concatenate_(3);
        b0.Production_();
        b0.NonTerminal("NameSpace");
        b0.NonTerminal("NCNAME");
        b1.Resolver();
        b0._Production();
        b0.LiteralTerminal_();
        b0.RegExp(":");
        b0.Category("DELIMITER");
        b0.Literal(":");
        b0._LiteralTerminal();
        b0.As_();
        b0.NonTerminal("Name");
        b0.Name("name");
        b0._As();
        b0._Concatenate();
        b1.Resolver();
        b0._Production();
        b0._Choose();
        b1.Resolver();
        b0._Production();
        b0.Production_();
        b0.NonTerminal("IContent");
        b0.Choose_(6);
        b0.NonTerminal("Element");
        b0.Production_();
        b0.NonTerminal("CharData");
        b0.DataTerminal_();
        b0.RegExp("[^<]*");
        b0.Category("LITERAL");
        b0.Format("%s");
        b0._DataTerminal();
        b1.Resolver();
        b0._Production();
        b0.Production_();
        b0.NonTerminal("CDataSect");
        b0.Concatenate_(3);
        b0.LiteralTerminal_();
        b0.RegExp("\\Q<![CDATA[\\E");
        b0.Category("DELIMITER");
        b0.Literal("<![CDATA[");
        b0._LiteralTerminal();
        b0.Repeat_();
        b0.Size(0);
        b0.Unbounded();
        b1.Resolver();
        b0.Production_();
        b0.NonTerminal("CDataSectData");
        b0.NonTerminal("STRING");
        b1.Resolver();
        b0._Production();
        b0._Repeat();
        b0.LiteralTerminal_();
        b0.RegExp("]]>");
        b0.Category("DELIMITER");
        b0.Literal("]]>");
        b0._LiteralTerminal();
        b0._Concatenate();
        b1.Resolver();
        b0._Production();
        b0.Production_();
        b0.NonTerminal("Comment");
        b0.As_();
        b0.Concatenate_(3);
        b0.LiteralTerminal_();
        b0.RegExp("<!--");
        b0.Category("DELIMITER");
        b0.Literal("<!--");
        b0._LiteralTerminal();
        b0.Production_();
        b0.NonTerminal("CommentText");
        b0.NonTerminal("STRING");
        b1.Resolver();
        b0._Production();
        b0.LiteralTerminal_();
        b0.RegExp("-->");
        b0.Category("DELIMITER");
        b0.Literal("-->");
        b0._LiteralTerminal();
        b0._Concatenate();
        b0.Name("text");
        b0._As();
        b1.Resolver();
        b0._Production();
        b0.Production_();
        b0.NonTerminal("PI");
        b0.Concatenate_(5);
        b0.LiteralTerminal_();
        b0.RegExp("\\Q<?\\E");
        b0.Category("DELIMITER");
        b0.Literal("<?");
        b0._LiteralTerminal();
        b0.As_();
        b0.NonTerminal("IName");
        b0.Name("name");
        b0._As();
        b0.Empty_();
        b0.Literal(" ");
        b0._Empty();
        b0.As_();
        b0.Production_();
        b0.NonTerminal("Instruction");
        b0.NonTerminal("STRING");
        b1.Resolver();
        b0._Production();
        b0.Name("instruction");
        b0._As();
        b0.LiteralTerminal_();
        b0.RegExp("\\Q?>\\E");
        b0.Category("DELIMITER");
        b0.Literal("?>");
        b0._LiteralTerminal();
        b0._Concatenate();
        b1.Resolver();
        b0._Production();
        b0.Production_();
        b0.NonTerminal("Content");
        b0.Repeat_();
        b0.Size(0);
        b0.Unbounded();
        b0.Empty_();
        b0.Literal("\n");
        b0._Empty();
        b0.NonTerminal("IContent");
        b0._Repeat();
        b1.Resolver();
        b0._Production();
        b0._Choose();
        b1.Resolver();
        b0._Production();
        b0.Production_();
        b0.NonTerminal("IMisc");
        b0.Choose_(2);
        b0.NonTerminal("PI");
        b0.NonTerminal("Comment");
        b0._Choose();
        b1.Resolver();
        b0._Production();
        b0._Productions();
        b0.URI("http://examples.whole.org/XmlGrammar");
        b0.Namespace("org.whole.examples.xmlgrammar");
        b1.Resolver();
        b1.Resolver();
        b1.Resolver();
        b1.Resolver();
        b0._Grammar();
    }
}
