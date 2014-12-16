package uk.ac.cam.ch.wwmm.chemicaltagger;

import java.io.IOException;

import nu.xom.Document;
import nu.xom.Element;
import nu.xom.Serializer;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.TerminalNode;

import uk.ac.cam.ch.wwmm.pregenerated.ChemicalChunkerBaseListener;
import uk.ac.cam.ch.wwmm.pregenerated.ChemicalChunkerParser;

//http://stackoverflow.com/questions/14565794/antlr-4-tree-inject-rewrite-operator
//http://stackoverflow.com/questions/14667781/antlr-4-and-ast-visitors
//http://stackoverflow.com/questions/15006720/antlr4-obtaining-list-of-tokens-for-a-specific-rule-in-listener
public class XMLChemicalChunkerBaseListener extends ChemicalChunkerBaseListener {

	private Element root = new Element("Document");
	private Document doc = new Document(root);

	private Element CurrentParentElement = root;

	private String[] tokenNames = null;
	private String[] ruleNames = null;

	XMLChemicalChunkerBaseListener(ChemicalChunkerParser parser) {
		ruleNames = parser.getRuleNames();
		tokenNames = parser.getTokenNames();

	}

	public Document GetDocument() {
		return doc;
	}

	public void printXML() {

		try {

			Serializer serializer = new Serializer(System.out, "ISO-8859-1");
			serializer.setIndent(2);
			serializer.setMaxLength(128);
			serializer.write(this.doc);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void enterEveryRule(@NotNull ParserRuleContext ctx) {

//		//OSCAR-CM
//		Token token = ctx.getStart();
//		System.out.println(token.getText());
//		
//		//benzene
//		token = ctx.getStop();
//		System.out.println(token.getText());

		Element element = new Element(ruleNames[ctx.getRuleIndex()]);
		CurrentParentElement.appendChild(element);

		CurrentParentElement = element;

	}

	@Override
	public void exitEveryRule(@NotNull ParserRuleContext ctx) {

		// System.out.println(ctx.invokingState);

	}

	@Override
	public void visitTerminal(@NotNull TerminalNode node) {

		CurrentParentElement.appendChild(node.getSymbol().getText());

	}

}
