package uk.ac.cam.ch.wwmm.chemicaltagger;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;

import nu.xom.Document;
import nu.xom.Element;
import nu.xom.Serializer;
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

	private Element currentElement = null;
	private Element currentTokenElement = null;

	private Deque<Element> SENTENCE_EXPR_parent = new ArrayDeque<Element>();
	private Deque<Element> NOUNPHRASE_EXPR_parent = new ArrayDeque<Element>();
	private Deque<Element> MULTIPLE_APPARATUS_EXPR_parent = new ArrayDeque<Element>();
	private Deque<Element> DISSOLVE_PHRASE_EXPR_parent = new ArrayDeque<Element>();
	private Deque<Element> VERB_PHRASE_EXPR_parent = new ArrayDeque<Element>();
	private Deque<Element> CYCLES_EXPR_parent = new ArrayDeque<Element>();
	private Deque<Element> RATIO_EXPR_parent = new ArrayDeque<Element>();
	private Deque<Element> CITATION_EXPR_parent = new ArrayDeque<Element>();
	private Deque<Element> MIXTURE_EXPR_parent = new ArrayDeque<Element>();
	private Deque<Element> PREP_PHRASE_EXPR_parent = new ArrayDeque<Element>();
	private Deque<Element> TIME_PHRASE_EXPR_parent = new ArrayDeque<Element>();
	private Deque<Element> ROLE_PREP_PHRASE_EXPR_parent = new ArrayDeque<Element>();
	private Deque<Element> ATMOSPHERE_PHRASE_EXPR_parent = new ArrayDeque<Element>();
	private Deque<Element> TEMP_PHRASE_EXPR_parent = new ArrayDeque<Element>();
	private Deque<Element> AMOUNT_EXPR_parent = new ArrayDeque<Element>();
	private Deque<Element> MASS_EXPR_parent = new ArrayDeque<Element>();
	private Deque<Element> PERCENT_EXPR_parent = new ArrayDeque<Element>();
	private Deque<Element> VOLUME_EXPR_parent = new ArrayDeque<Element>();
	private Deque<Element> MOLAR_EXPR_parent = new ArrayDeque<Element>();
	private Deque<Element> PH_EXPR_parent = new ArrayDeque<Element>();
	private Deque<Element> EQUIVALENT_EXPR_parent = new ArrayDeque<Element>();
	private Deque<Element> YIELD_EXPR_parent = new ArrayDeque<Element>();
	private Deque<Element> APPARATUS_EXPR_parent = new ArrayDeque<Element>();
	private Deque<Element> MULTIPLE_EXPR_parent = new ArrayDeque<Element>();
	private Deque<Element> OSCAR_CM_EXPR_parent = new ArrayDeque<Element>();
	private Deque<Element> MOLECULE_EXPR_parent = new ArrayDeque<Element>();
	private Deque<Element> UNNAMEDMOLECULE_EXPR_parent = new ArrayDeque<Element>();
	private Deque<Element> QUANTITY_EXPR_parent = new ArrayDeque<Element>();
	private Deque<Element> PROCEDURE_EXPR_parent = new ArrayDeque<Element>();
	private Deque<Element> REFERENCE_TO_COMPOUND_EXPR_parent = new ArrayDeque<Element>();
	private Deque<Element> CAPTIONLABEL_EXPR_parent = new ArrayDeque<Element>();

	private String[] tokenNames = null;

	XMLChemicalChunkerBaseListener(ChemicalChunkerParser parser) {

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

	private void enterCurrentExpression(String name) {
		currentElement = new Element(name);
	}

	private void exitCurrentExpression(Element newParent) {
		newParent.appendChild(currentElement);
		currentElement = newParent;
	}

	@Override
	public void enterSENTENCE_EXPR(
			@NotNull ChemicalChunkerParser.SENTENCE_EXPRContext ctx) {

		SENTENCE_EXPR_parent.push(root);
		enterCurrentExpression("Sentence");

	}

	@Override
	public void exitSENTENCE_EXPR(
			@NotNull ChemicalChunkerParser.SENTENCE_EXPRContext ctx) {
		exitCurrentExpression(SENTENCE_EXPR_parent.pop());

	}

	@Override
	public void enterNOUNPHRASE_EXPR(
			@NotNull ChemicalChunkerParser.NOUNPHRASE_EXPRContext ctx) {
		NOUNPHRASE_EXPR_parent.push(currentElement);
		enterCurrentExpression("NounPhrase");
	}

	@Override
	public void exitNOUNPHRASE_EXPR(
			@NotNull ChemicalChunkerParser.NOUNPHRASE_EXPRContext ctx) {

		exitCurrentExpression(NOUNPHRASE_EXPR_parent.pop());

	}

	@Override
	public void enterMULTIPLE_APPARATUS_EXPR(
			@NotNull ChemicalChunkerParser.MULTIPLE_APPARATUS_EXPRContext ctx) {

		MULTIPLE_APPARATUS_EXPR_parent.push(currentElement);
		enterCurrentExpression("MultipleApparatus");

	}

	@Override
	public void exitMULTIPLE_APPARATUS_EXPR(
			@NotNull ChemicalChunkerParser.MULTIPLE_APPARATUS_EXPRContext ctx) {

		exitCurrentExpression(MULTIPLE_APPARATUS_EXPR_parent.pop());

	}

	@Override
	public void enterDISSOLVE_PHRASE_EXPR(
			@NotNull ChemicalChunkerParser.DISSOLVE_PHRASE_EXPRContext ctx) {

		DISSOLVE_PHRASE_EXPR_parent.push(currentElement);
		enterCurrentExpression("DissolvePhrase");

	}

	@Override
	public void exitDISSOLVE_PHRASE_EXPR(
			@NotNull ChemicalChunkerParser.DISSOLVE_PHRASE_EXPRContext ctx) {

		exitCurrentExpression(DISSOLVE_PHRASE_EXPR_parent.pop());

	}

	@Override
	public void enterVERB_PHRASE_EXPR(
			@NotNull ChemicalChunkerParser.VERB_PHRASE_EXPRContext ctx) {

		VERB_PHRASE_EXPR_parent.push(currentElement);
		enterCurrentExpression("VerbPhrase");

	}

	@Override
	public void exitVERB_PHRASE_EXPR(
			@NotNull ChemicalChunkerParser.VERB_PHRASE_EXPRContext ctx) {

		exitCurrentExpression(VERB_PHRASE_EXPR_parent.pop());

	}

	@Override
	public void enterCYCLES_EXPR(
			@NotNull ChemicalChunkerParser.CYCLES_EXPRContext ctx) {

		CYCLES_EXPR_parent.push(currentElement);
		enterCurrentExpression("CYCLES");

	}

	@Override
	public void exitCYCLES_EXPR(
			@NotNull ChemicalChunkerParser.CYCLES_EXPRContext ctx) {

		exitCurrentExpression(CYCLES_EXPR_parent.pop());

	}

	@Override
	public void enterRATIO_EXPR(
			@NotNull ChemicalChunkerParser.RATIO_EXPRContext ctx) {
		RATIO_EXPR_parent.push(currentElement);
		enterCurrentExpression("RATIO");

	}

	@Override
	public void exitRATIO_EXPR(
			@NotNull ChemicalChunkerParser.RATIO_EXPRContext ctx) {

		exitCurrentExpression(RATIO_EXPR_parent.pop());

	}

	@Override
	public void enterCITATION_EXPR(
			@NotNull ChemicalChunkerParser.CITATION_EXPRContext ctx) {
		CITATION_EXPR_parent.push(currentElement);
		enterCurrentExpression("CITATION");

	}

	@Override
	public void exitCITATION_EXPR(
			@NotNull ChemicalChunkerParser.CITATION_EXPRContext ctx) {

		exitCurrentExpression(CITATION_EXPR_parent.pop());

	}

	@Override
	public void enterMIXTURE_EXPR(
			@NotNull ChemicalChunkerParser.MIXTURE_EXPRContext ctx) {
		MIXTURE_EXPR_parent.push(currentElement);
		enterCurrentExpression("MIXTURE");

	}

	@Override
	public void exitMIXTURE_EXPR(
			@NotNull ChemicalChunkerParser.MIXTURE_EXPRContext ctx) {

		exitCurrentExpression(MIXTURE_EXPR_parent.pop());

	}

	@Override
	public void enterPREP_PHRASE_EXPR(
			@NotNull ChemicalChunkerParser.PREP_PHRASE_EXPRContext ctx) {
		PREP_PHRASE_EXPR_parent.push(currentElement);
		enterCurrentExpression("PrepPhrase");

	}

	@Override
	public void exitPREP_PHRASE_EXPR(
			@NotNull ChemicalChunkerParser.PREP_PHRASE_EXPRContext ctx) {

		exitCurrentExpression(PREP_PHRASE_EXPR_parent.pop());

	}

	@Override
	public void enterTIME_PHRASE_EXPR(
			@NotNull ChemicalChunkerParser.TIME_PHRASE_EXPRContext ctx) {

		TIME_PHRASE_EXPR_parent.push(currentElement);
		enterCurrentExpression("TimePhrase");

	}

	@Override
	public void exitTIME_PHRASE_EXPR(
			@NotNull ChemicalChunkerParser.TIME_PHRASE_EXPRContext ctx) {

		exitCurrentExpression(TIME_PHRASE_EXPR_parent.pop());

	}

	@Override
	public void enterROLE_PREP_PHRASE_EXPR(
			@NotNull ChemicalChunkerParser.ROLE_PREP_PHRASE_EXPRContext ctx) {

		ROLE_PREP_PHRASE_EXPR_parent.push(currentElement);
		enterCurrentExpression("RolePrepPhrase");

	}

	@Override
	public void exitROLE_PREP_PHRASE_EXPR(
			@NotNull ChemicalChunkerParser.ROLE_PREP_PHRASE_EXPRContext ctx) {

		exitCurrentExpression(ROLE_PREP_PHRASE_EXPR_parent.pop());

	}

	@Override
	public void enterATMOSPHERE_PHRASE_EXPR(
			@NotNull ChemicalChunkerParser.ATMOSPHERE_PHRASE_EXPRContext ctx) {
		ATMOSPHERE_PHRASE_EXPR_parent.push(currentElement);
		enterCurrentExpression("AtmospherePhrase");

	}

	@Override
	public void exitATMOSPHERE_PHRASE_EXPR(
			@NotNull ChemicalChunkerParser.ATMOSPHERE_PHRASE_EXPRContext ctx) {

		exitCurrentExpression(ATMOSPHERE_PHRASE_EXPR_parent.pop());

	}

	@Override
	public void enterTEMP_PHRASE_EXPR(
			@NotNull ChemicalChunkerParser.TEMP_PHRASE_EXPRContext ctx) {

		TEMP_PHRASE_EXPR_parent.push(currentElement);
		enterCurrentExpression("TempPhrase");

	}

	@Override
	public void exitTEMP_PHRASE_EXPR(
			@NotNull ChemicalChunkerParser.TEMP_PHRASE_EXPRContext ctx) {

		exitCurrentExpression(TEMP_PHRASE_EXPR_parent.pop());

	}

	@Override
	public void enterAMOUNT_EXPR(
			@NotNull ChemicalChunkerParser.AMOUNT_EXPRContext ctx) {

		AMOUNT_EXPR_parent.push(currentElement);
		enterCurrentExpression("AMOUNT");

	}

	@Override
	public void exitAMOUNT_EXPR(
			@NotNull ChemicalChunkerParser.AMOUNT_EXPRContext ctx) {

		exitCurrentExpression(AMOUNT_EXPR_parent.pop());

	}

	@Override
	public void enterMASS_EXPR(
			@NotNull ChemicalChunkerParser.MASS_EXPRContext ctx) {

		MASS_EXPR_parent.push(currentElement);
		enterCurrentExpression("MASS");

	}

	@Override
	public void exitMASS_EXPR(
			@NotNull ChemicalChunkerParser.MASS_EXPRContext ctx) {

		exitCurrentExpression(MASS_EXPR_parent.pop());

	}

	@Override
	public void enterPERCENT_EXPR(
			@NotNull ChemicalChunkerParser.PERCENT_EXPRContext ctx) {

		PERCENT_EXPR_parent.push(currentElement);
		enterCurrentExpression("PERCENT");

	}

	@Override
	public void exitPERCENT_EXPR(
			@NotNull ChemicalChunkerParser.PERCENT_EXPRContext ctx) {

		exitCurrentExpression(PERCENT_EXPR_parent.pop());

	}

	@Override
	public void enterVOLUME_EXPR(
			@NotNull ChemicalChunkerParser.VOLUME_EXPRContext ctx) {

		VOLUME_EXPR_parent.push(currentElement);
		enterCurrentExpression("VOLUME");

	}

	@Override
	public void exitVOLUME_EXPR(
			@NotNull ChemicalChunkerParser.VOLUME_EXPRContext ctx) {

		exitCurrentExpression(VOLUME_EXPR_parent.pop());

	}

	@Override
	public void enterMOLAR_EXPR(
			@NotNull ChemicalChunkerParser.MOLAR_EXPRContext ctx) {

		MOLAR_EXPR_parent.push(currentElement);
		enterCurrentExpression("MOLAR");

	}

	@Override
	public void exitMOLAR_EXPR(
			@NotNull ChemicalChunkerParser.MOLAR_EXPRContext ctx) {

		exitCurrentExpression(MOLAR_EXPR_parent.pop());

	}

	@Override
	public void enterPH_EXPR(@NotNull ChemicalChunkerParser.PH_EXPRContext ctx) {

		PH_EXPR_parent.push(currentElement);
		enterCurrentExpression("PH");

	}

	@Override
	public void exitPH_EXPR(@NotNull ChemicalChunkerParser.PH_EXPRContext ctx) {

		exitCurrentExpression(PH_EXPR_parent.pop());

	}

	@Override
	public void enterEQUIVALENT_EXPR(
			@NotNull ChemicalChunkerParser.EQUIVALENT_EXPRContext ctx) {

		EQUIVALENT_EXPR_parent.push(currentElement);
		enterCurrentExpression("EQUIVALENT");

	}

	@Override
	public void exitEQUIVALENT_EXPR(
			@NotNull ChemicalChunkerParser.EQUIVALENT_EXPRContext ctx) {

		exitCurrentExpression(EQUIVALENT_EXPR_parent.pop());

	}

	@Override
	public void enterYIELD_EXPR(
			@NotNull ChemicalChunkerParser.YIELD_EXPRContext ctx) {

		YIELD_EXPR_parent.push(currentElement);
		enterCurrentExpression("YIELD");

	}

	@Override
	public void exitYIELD_EXPR(
			@NotNull ChemicalChunkerParser.YIELD_EXPRContext ctx) {

		exitCurrentExpression(YIELD_EXPR_parent.pop());

	}

	@Override
	public void enterAPPARATUS_EXPR(
			@NotNull ChemicalChunkerParser.APPARATUS_EXPRContext ctx) {

		APPARATUS_EXPR_parent.push(currentElement);
		enterCurrentExpression("APPARATUS");

	}

	@Override
	public void exitAPPARATUS_EXPR(
			@NotNull ChemicalChunkerParser.APPARATUS_EXPRContext ctx) {

		exitCurrentExpression(APPARATUS_EXPR_parent.pop());

	}

	@Override
	public void enterMULTIPLE_EXPR(
			@NotNull ChemicalChunkerParser.MULTIPLE_EXPRContext ctx) {

		MULTIPLE_EXPR_parent.push(currentElement);
		enterCurrentExpression("MULTIPLE");

	}

	@Override
	public void exitMULTIPLE_EXPR(
			@NotNull ChemicalChunkerParser.MULTIPLE_EXPRContext ctx) {

		exitCurrentExpression(MULTIPLE_EXPR_parent.pop());

	}

	@Override
	public void enterOSCAR_CM_EXPR(
			@NotNull ChemicalChunkerParser.OSCAR_CM_EXPRContext ctx) {

		OSCAR_CM_EXPR_parent.push(currentElement);
		enterCurrentExpression("OSCARCM");

	}

	@Override
	public void exitOSCAR_CM_EXPR(
			@NotNull ChemicalChunkerParser.OSCAR_CM_EXPRContext ctx) {

		exitCurrentExpression(OSCAR_CM_EXPR_parent.pop());

	}

	@Override
	public void enterMOLECULE_EXPR(
			@NotNull ChemicalChunkerParser.MOLECULE_EXPRContext ctx) {

		MOLECULE_EXPR_parent.push(currentElement);
		enterCurrentExpression("MOLECULE");

	}

	@Override
	public void exitMOLECULE_EXPR(
			@NotNull ChemicalChunkerParser.MOLECULE_EXPRContext ctx) {

		exitCurrentExpression(MOLECULE_EXPR_parent.pop());

	}

	@Override
	public void enterUNNAMEDMOLECULE_EXPR(
			@NotNull ChemicalChunkerParser.UNNAMEDMOLECULE_EXPRContext ctx) {

		UNNAMEDMOLECULE_EXPR_parent.push(currentElement);
		enterCurrentExpression("UNNAMEDMOLECULE");

	}

	@Override
	public void exitUNNAMEDMOLECULE_EXPR(
			@NotNull ChemicalChunkerParser.UNNAMEDMOLECULE_EXPRContext ctx) {

		exitCurrentExpression(UNNAMEDMOLECULE_EXPR_parent.pop());

	}

	@Override
	public void enterQUANTITY_EXPR(
			@NotNull ChemicalChunkerParser.QUANTITY_EXPRContext ctx) {

		QUANTITY_EXPR_parent.push(currentElement);
		enterCurrentExpression("QUANTITY");

	}

	@Override
	public void exitQUANTITY_EXPR(
			@NotNull ChemicalChunkerParser.QUANTITY_EXPRContext ctx) {

		exitCurrentExpression(QUANTITY_EXPR_parent.pop());

	}

	@Override
	public void enterPROCEDURE_EXPR(
			@NotNull ChemicalChunkerParser.PROCEDURE_EXPRContext ctx) {

		PROCEDURE_EXPR_parent.push(currentElement);
		enterCurrentExpression("PROCEDURE");

	}

	@Override
	public void exitPROCEDURE_EXPR(
			@NotNull ChemicalChunkerParser.PROCEDURE_EXPRContext ctx) {

		exitCurrentExpression(PROCEDURE_EXPR_parent.pop());

	}

	@Override
	public void enterREFERENCE_TO_COMPOUND_EXPR(
			@NotNull ChemicalChunkerParser.REFERENCE_TO_COMPOUND_EXPRContext ctx) {

		REFERENCE_TO_COMPOUND_EXPR_parent.push(currentElement);
		enterCurrentExpression("REFERENCETOCOMPOUND");

	}

	@Override
	public void exitREFERENCE_TO_COMPOUND_EXPR(
			@NotNull ChemicalChunkerParser.REFERENCE_TO_COMPOUND_EXPRContext ctx) {

		exitCurrentExpression(REFERENCE_TO_COMPOUND_EXPR_parent.pop());

	}

	@Override
	public void enterCAPTIONLABEL_EXPR(
			@NotNull ChemicalChunkerParser.CAPTIONLABEL_EXPRContext ctx) {

		CAPTIONLABEL_EXPR_parent.push(currentElement);
		enterCurrentExpression("CaptionLabel");

	}

	@Override
	public void exitCAPTIONLABEL_EXPR(
			@NotNull ChemicalChunkerParser.CAPTIONLABEL_EXPRContext ctx) {

		exitCurrentExpression(CAPTIONLABEL_EXPR_parent.pop());

	}

	@Override
	public void visitTerminal(@NotNull TerminalNode node) {

		if (tokenNames[node.getSymbol().getType()] != "TOKEN") {

			String name = node.getText();

			// Dealt with -LRB- and -RRB-
			name = name.replaceFirst("^-", "_-");

			currentTokenElement = new Element(name);

		} else {

			currentTokenElement.appendChild(node.getText());
			currentElement.appendChild(currentTokenElement);

		}

	}

}
