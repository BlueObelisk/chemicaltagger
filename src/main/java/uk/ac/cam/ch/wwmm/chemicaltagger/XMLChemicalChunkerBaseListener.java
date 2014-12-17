package uk.ac.cam.ch.wwmm.chemicaltagger;

import java.io.IOException;

import nu.xom.Document;
import nu.xom.Element;
import nu.xom.Serializer;

import org.antlr.v4.runtime.ParserRuleContext;

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

	private Element currentParentElement = root;

	private Element currentTokenElement = null;

	private String[] ruleNames = null;
	private String[] tokenNames = null;

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

	private void addElementFromContext(ParserRuleContext ctx, String name) {

		Element element = new Element(name);
		currentParentElement.appendChild(element);

		currentParentElement = element;

	}

	@Override
	public void enterSENTENCE_EXPR(
			@NotNull ChemicalChunkerParser.SENTENCE_EXPRContext ctx) {

		addElementFromContext(ctx, "Sentence");

	}

	@Override
	public void enterNOUNPHRASE_EXPR(
			@NotNull ChemicalChunkerParser.NOUNPHRASE_EXPRContext ctx) {

		addElementFromContext(ctx, "NounPhrase");

	}

	@Override
	public void enterMULTIPLE_APPARATUS_EXPR(
			@NotNull ChemicalChunkerParser.MULTIPLE_APPARATUS_EXPRContext ctx) {

		addElementFromContext(ctx, "MultipleApparatus");

	}

	@Override
	public void enterDISSOLVE_PHRASE_EXPR(
			@NotNull ChemicalChunkerParser.DISSOLVE_PHRASE_EXPRContext ctx) {

		addElementFromContext(ctx, "DissolvePhrase");

	}

	@Override
	public void enterVERB_PHRASE_EXPR(
			@NotNull ChemicalChunkerParser.VERB_PHRASE_EXPRContext ctx) {

		addElementFromContext(ctx, "VerbPhrase");

	}

	@Override
	public void enterCYCLES_EXPR(
			@NotNull ChemicalChunkerParser.CYCLES_EXPRContext ctx) {

		addElementFromContext(ctx, "CYCLES");

	}

	@Override
	public void enterRATIO_EXPR(
			@NotNull ChemicalChunkerParser.RATIO_EXPRContext ctx) {

		addElementFromContext(ctx, "RATIO");

	}

	@Override
	public void enterCITATION_EXPR(
			@NotNull ChemicalChunkerParser.CITATION_EXPRContext ctx) {

		addElementFromContext(ctx, "CITATION");

	}

	@Override
	public void enterMIXTURE_EXPR(
			@NotNull ChemicalChunkerParser.MIXTURE_EXPRContext ctx) {

		addElementFromContext(ctx, "MIXTURE");

	}

	@Override
	public void enterPREP_PHRASE_EXPR(
			@NotNull ChemicalChunkerParser.PREP_PHRASE_EXPRContext ctx) {

		addElementFromContext(ctx, "PrepPhrase");

	}

	@Override
	public void enterTIME_PHRASE_EXPR(
			@NotNull ChemicalChunkerParser.TIME_PHRASE_EXPRContext ctx) {

		addElementFromContext(ctx, "TimePhrase");

	}

	@Override
	public void enterROLE_PREP_PHRASE_EXPR(
			@NotNull ChemicalChunkerParser.ROLE_PREP_PHRASE_EXPRContext ctx) {

		addElementFromContext(ctx, "RolePrepPhrase");

	}

	@Override
	public void enterATMOSPHERE_PHRASE_EXPR(
			@NotNull ChemicalChunkerParser.ATMOSPHERE_PHRASE_EXPRContext ctx) {

		addElementFromContext(ctx, "AtmospherePhrase");

	}

	@Override
	public void enterTEMP_PHRASE_EXPR(
			@NotNull ChemicalChunkerParser.TEMP_PHRASE_EXPRContext ctx) {

		addElementFromContext(ctx, "TempPhrase");

	}

	@Override
	public void enterAMOUNT_EXPR(
			@NotNull ChemicalChunkerParser.AMOUNT_EXPRContext ctx) {

		addElementFromContext(ctx, "AMOUNT");

	}

	@Override
	public void enterMASS_EXPR(
			@NotNull ChemicalChunkerParser.MASS_EXPRContext ctx) {

		addElementFromContext(ctx, "MASS");

	}

	@Override
	public void enterPERCENT_EXPR(
			@NotNull ChemicalChunkerParser.PERCENT_EXPRContext ctx) {

		addElementFromContext(ctx, "PERCENT");

	}

	@Override
	public void enterVOLUME_EXPR(
			@NotNull ChemicalChunkerParser.VOLUME_EXPRContext ctx) {

		addElementFromContext(ctx, "VOLUME");

	}

	@Override
	public void enterMOLAR_EXPR(
			@NotNull ChemicalChunkerParser.MOLAR_EXPRContext ctx) {

		addElementFromContext(ctx, "MOLAR");

	}

	@Override
	public void enterPH_EXPR(@NotNull ChemicalChunkerParser.PH_EXPRContext ctx) {

		addElementFromContext(ctx, "PH");

	}

	@Override
	public void enterEQUIVALENT_EXPR(
			@NotNull ChemicalChunkerParser.EQUIVALENT_EXPRContext ctx) {

		addElementFromContext(ctx, "EQUIVALENT");

	}

	@Override
	public void enterYIELD_EXPR(
			@NotNull ChemicalChunkerParser.YIELD_EXPRContext ctx) {

		addElementFromContext(ctx, "YIELD");

	}

	@Override
	public void enterAPPARATUS_EXPR(
			@NotNull ChemicalChunkerParser.APPARATUS_EXPRContext ctx) {

		addElementFromContext(ctx, "APPARATUS");

	}

	@Override
	public void enterMULTIPLE_EXPR(
			@NotNull ChemicalChunkerParser.MULTIPLE_EXPRContext ctx) {

		addElementFromContext(ctx, "MULTIPLE");

	}

	@Override
	public void enterOSCAR_CM_EXPR(
			@NotNull ChemicalChunkerParser.OSCAR_CM_EXPRContext ctx) {

		addElementFromContext(ctx, "OSCARCM");

	}

	@Override
	public void enterMOLECULE_EXPR(
			@NotNull ChemicalChunkerParser.MOLECULE_EXPRContext ctx) {

		addElementFromContext(ctx, "MOLECULE");

	}

	@Override
	public void enterUNNAMEDMOLECULE_EXPR(
			@NotNull ChemicalChunkerParser.UNNAMEDMOLECULE_EXPRContext ctx) {

		addElementFromContext(ctx, "UNNAMEDMOLECULE");

	}

	@Override
	public void enterQUANTITY_EXPR(
			@NotNull ChemicalChunkerParser.QUANTITY_EXPRContext ctx) {

		addElementFromContext(ctx, "QUANTITY");

	}

	@Override
	public void enterPROCEDURE_EXPR(
			@NotNull ChemicalChunkerParser.PROCEDURE_EXPRContext ctx) {

		addElementFromContext(ctx, "PROCEDURE");

	}

	@Override
	public void enterREFERENCE_TO_COMPOUND_EXPR(
			@NotNull ChemicalChunkerParser.REFERENCE_TO_COMPOUND_EXPRContext ctx) {

		addElementFromContext(ctx, "REFERENCETOCOMPOUND");

	}

	@Override
	public void enterCAPTIONLABEL_EXPR(
			@NotNull ChemicalChunkerParser.CAPTIONLABEL_EXPRContext ctx) {

		addElementFromContext(ctx, "CaptionLabel");

	}

	@Override
	public void visitTerminal(@NotNull TerminalNode node) {
		
		//System.out.println(node + " " + tokenNames[node.getSymbol().getType()]);

		if (tokenNames[node.getSymbol().getType()] != "TOKEN") {

			String name = node.getText();
			// Work around for invalid - chararcter in <-LRB->(</-LRB->
			currentTokenElement = new Element(name.replace('-', '_'));

		} else {

			currentTokenElement.appendChild(node.getText());

			currentParentElement.appendChild(currentTokenElement);

		}

	}

}
