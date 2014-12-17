package uk.ac.cam.ch.wwmm.chemicaltagger;

import java.io.IOException;

import nu.xom.Document;
import nu.xom.Element;
import nu.xom.Serializer;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTree;
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

	private String[] ruleNames = null;

	XMLChemicalChunkerBaseListener(ChemicalChunkerParser parser) {
		ruleNames = parser.getRuleNames();

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

	private void addElementFromContext(ParserRuleContext ctx) {

		Element element = new Element(ruleNames[ctx.getRuleIndex()]);
		CurrentParentElement.appendChild(element);

		CurrentParentElement = element;

	}

	@Override
	public void enterSENTENCE_EXPR(
			@NotNull ChemicalChunkerParser.SENTENCE_EXPRContext ctx) {

		addElementFromContext(ctx);

	}

	@Override
	public void enterNOUNPHRASE_EXPR(
			@NotNull ChemicalChunkerParser.NOUNPHRASE_EXPRContext ctx) {

		addElementFromContext(ctx);

	}

	@Override
	public void enterMULTIPLE_APPARATUS_EXPR(
			@NotNull ChemicalChunkerParser.MULTIPLE_APPARATUS_EXPRContext ctx) {

		addElementFromContext(ctx);

	}

	@Override
	public void enterDISSOLVE_PHRASE_EXPR(
			@NotNull ChemicalChunkerParser.DISSOLVE_PHRASE_EXPRContext ctx) {

		addElementFromContext(ctx);

	}

	@Override
	public void enterVERB_PHRASE_EXPR(
			@NotNull ChemicalChunkerParser.VERB_PHRASE_EXPRContext ctx) {

		addElementFromContext(ctx);

	}

	@Override
	public void enterCYCLES_EXPR(
			@NotNull ChemicalChunkerParser.CYCLES_EXPRContext ctx) {

		addElementFromContext(ctx);

	}

	@Override
	public void enterRATIO_EXPR(
			@NotNull ChemicalChunkerParser.RATIO_EXPRContext ctx) {

		addElementFromContext(ctx);

	}

	@Override
	public void enterMIXTURE_EXPR(
			@NotNull ChemicalChunkerParser.MIXTURE_EXPRContext ctx) {

		addElementFromContext(ctx);

	}

	@Override
	public void enterPREP_PHRASE_EXPR(
			@NotNull ChemicalChunkerParser.PREP_PHRASE_EXPRContext ctx) {

		addElementFromContext(ctx);

	}

	@Override
	public void enterCITATION_EXPR(
			@NotNull ChemicalChunkerParser.CITATION_EXPRContext ctx) {

		addElementFromContext(ctx);

	}

	@Override
	public void enterTIME_PHRASE_EXPR(
			@NotNull ChemicalChunkerParser.TIME_PHRASE_EXPRContext ctx) {

		addElementFromContext(ctx);

	}

	@Override
	public void enterROLE_PREP_PHRASE_EXPR(
			@NotNull ChemicalChunkerParser.ROLE_PREP_PHRASE_EXPRContext ctx) {

		addElementFromContext(ctx);

	}

	@Override
	public void enterATMOSPHERE_PHRASE_EXPR(
			@NotNull ChemicalChunkerParser.ATMOSPHERE_PHRASE_EXPRContext ctx) {

		addElementFromContext(ctx);

	}

	@Override
	public void enterTEMP_PHRASE_EXPR(
			@NotNull ChemicalChunkerParser.TEMP_PHRASE_EXPRContext ctx) {

		addElementFromContext(ctx);

	}

	@Override
	public void enterAMOUNT_EXPR(
			@NotNull ChemicalChunkerParser.AMOUNT_EXPRContext ctx) {

		addElementFromContext(ctx);

	}

	@Override
	public void enterMASS_EXPR(
			@NotNull ChemicalChunkerParser.MASS_EXPRContext ctx) {

		addElementFromContext(ctx);

	}

	@Override
	public void enterPERCENT_EXPR(
			@NotNull ChemicalChunkerParser.PERCENT_EXPRContext ctx) {

		addElementFromContext(ctx);

	}

	@Override
	public void enterVOLUME_EXPR(
			@NotNull ChemicalChunkerParser.VOLUME_EXPRContext ctx) {

		addElementFromContext(ctx);

	}

	@Override
	public void enterMOLAR_EXPR(
			@NotNull ChemicalChunkerParser.MOLAR_EXPRContext ctx) {

		addElementFromContext(ctx);

	}

	@Override
	public void enterPH_EXPR(@NotNull ChemicalChunkerParser.PH_EXPRContext ctx) {

		addElementFromContext(ctx);

	}

	@Override
	public void enterEQUIVALENT_EXPR(
			@NotNull ChemicalChunkerParser.EQUIVALENT_EXPRContext ctx) {

		addElementFromContext(ctx);

	}

	@Override
	public void enterYIELD_EXPR(
			@NotNull ChemicalChunkerParser.YIELD_EXPRContext ctx) {

		addElementFromContext(ctx);

	}

	@Override
	public void enterAPPARATUS_EXPR(
			@NotNull ChemicalChunkerParser.APPARATUS_EXPRContext ctx) {

		addElementFromContext(ctx);

	}

	@Override
	public void enterMULTIPLE_EXPR(
			@NotNull ChemicalChunkerParser.MULTIPLE_EXPRContext ctx) {

		addElementFromContext(ctx);

	}

	@Override
	public void enterOSCAR_CM_EXPR(
			@NotNull ChemicalChunkerParser.OSCAR_CM_EXPRContext ctx) {

		Element element = new Element("OSCAR-CM");

		ParserRuleContext parserRuleContext = (ParserRuleContext) ctx;

		Token token = parserRuleContext.getStop();

		element.appendChild(token.getText());

		CurrentParentElement.appendChild(element);
		CurrentParentElement = element;

	}

	@Override
	public void enterMOLECULE_EXPR(
			@NotNull ChemicalChunkerParser.MOLECULE_EXPRContext ctx) {

		addElementFromContext(ctx);

	}

	@Override
	public void enterUNNAMEDMOLECULE_EXPR(
			@NotNull ChemicalChunkerParser.UNNAMEDMOLECULE_EXPRContext ctx) {

		addElementFromContext(ctx);

	}

	@Override
	public void enterQUANTITY_EXPR(
			@NotNull ChemicalChunkerParser.QUANTITY_EXPRContext ctx) {

		addElementFromContext(ctx);

	}

	@Override
	public void enterPROCEDURE_EXPR(
			@NotNull ChemicalChunkerParser.PROCEDURE_EXPRContext ctx) {

		addElementFromContext(ctx);

	}

	@Override
	public void enterREFERENCE_TO_COMPOUND_EXPR(
			@NotNull ChemicalChunkerParser.REFERENCE_TO_COMPOUND_EXPRContext ctx) {

		addElementFromContext(ctx);

	}

	@Override
	public void enterCAPTIONLABEL_EXPR(
			@NotNull ChemicalChunkerParser.CAPTIONLABEL_EXPRContext ctx) {

		addElementFromContext(ctx);

	}

}
