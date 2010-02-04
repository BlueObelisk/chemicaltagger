package uk.ac.cam.ch.wwmm.chemicaltagger;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

import junit.framework.Assert;

import org.antlr.runtime.tree.Tree;
import org.junit.Test;

public class FullParseTest {

	@Test
	public void testFullSentence1() throws UnsupportedEncodingException {
		String text = "A solution of 124C (7.0 g, 32.4 mmol) in concentrate H2SO4 (9.5 mL) was added to a solution of concentrate H2SO4 (9.5 mL) and fuming HNO3 (13 mL) and the mixture was heated at 60°C for 30 min. After cooling to room temperature, the reaction mixture was added to iced 6M solution of NaOH (150 mL) and neutralized to pH 6 with 1N NaOH solution. The reaction mixture was extracted with dichloromethane (4x100 mL). The combined organic phases were dried over Na2SO4, filtered and concentrated to give 124D as a solid."; 
		POSContainer posContainer = ChemistryPOSTagger.getInstance().runTaggers(text);
		String tagged = posContainer.getTokenTagTupleAsString();

		InputStream in = new ByteArrayInputStream(tagged.getBytes("UTF-8"));
		ChemistrySentenceParser chemistrySentenceParser = new ChemistrySentenceParser(
				in);

		Tree t = chemistrySentenceParser.parseTags();
		ASTtoXML ast2XML = new ASTtoXML();
		//System.err.println(ast2XML.convert(t).toXML());
		checkNodes(t);
	}
	
	@Test
	public void testFullSentence2() throws UnsupportedEncodingException {
		String text = "A mixture of 124D (0.75 g, 2.9 mmol), iron (0.48 g, 8.6 mmol) and ammonium chloride (0.46 g, 8.6 mmol) in EtOH/H2O (10 mL/3 mL) was refluxed (bath temperature 90°C) for 4 h. After cooling to room temperature, the reaction mixture was diluted with water, extracted with dichloromethane three times. The combined organic phases were dried over Na2SO4, filtered and concentrated to give 124E as a oil.";
		POSContainer posContainer = ChemistryPOSTagger.getInstance().runTaggers(text);
		String tagged = posContainer.getTokenTagTupleAsString();

		InputStream in = new ByteArrayInputStream(tagged.getBytes("UTF-8"));
		ChemistrySentenceParser chemistrySentenceParser = new ChemistrySentenceParser(
				in);

		Tree t = chemistrySentenceParser.parseTags();
		ASTtoXML ast2XML = new ASTtoXML();
		//System.err.println(ast2XML.convert(t).toXML());
		checkNodes(t);
	}
	
	@Test
	public void testFullSentence3() throws UnsupportedEncodingException {
		String text = "To a mixture of 124E (1.97 g, 9.0 mmol) and sodium iodide (0.27 g, 1.8 mmol) in 70% H2SO4 (30 mL) at 110°C under nitrogen was added acrolein (1.1 mL, 13.6 mmol) via syringe pump (1 mL/h). The reaction was stirred for another 30 min at 110°C after complete addition. After cooling to room temperature, the reaction mixture was diluted with ice water (50 mL) then added to an aqueous solution (500 mL) of Na2CO3 (60 g) slowly. This mixture was extracted with chloroform (3x200 mL). The combined organic phases were dried over Na2SO4, filtered and concentrated. The residue was purified by flush chromatography (hexanes/ethyl acetate) to give 124F as a solid.";
		POSContainer posContainer = ChemistryPOSTagger.getInstance().runTaggers(text);
		String tagged = posContainer.getTokenTagTupleAsString();

		InputStream in = new ByteArrayInputStream(tagged.getBytes("UTF-8"));
		ChemistrySentenceParser chemistrySentenceParser = new ChemistrySentenceParser(
				in);

		Tree t = chemistrySentenceParser.parseTags();
		ASTtoXML ast2XML = new ASTtoXML();
		//System.err.println(ast2XML.convert(t).toXML());
		checkNodes(t);
	}

	@Test
	public void testFullSentence4() throws UnsupportedEncodingException {
		String text = "A mixture of 124G (150 mg, 0.64 mmol), 3,5-dichlorobenzylamine (153 mg, 0.87 mmol) and aluminum chloride (27 mg, 0.20 mmol) in toluene (8 mL) was refluxed for 4 h under nitrogen. After cooling to room temperature, the reaction mixture was treated with aqueous saturated NaHCO3 solution and ethylenediaminetetraacetic acid (1 g, 3.4 mmol) to pH 7. The mixture was extracted with chloroform four times. The combined organic phases were dried over Na2SO4 and concentrated. The residue was purified by preparative reverse-phase HPLC to give 124H.";
		POSContainer posContainer = ChemistryPOSTagger.getInstance().runTaggers(text);
		String tagged = posContainer.getTokenTagTupleAsString();

		InputStream in = new ByteArrayInputStream(tagged.getBytes("UTF-8"));
		ChemistrySentenceParser chemistrySentenceParser = new ChemistrySentenceParser(
				in);

		Tree t = chemistrySentenceParser.parseTags();
		ASTtoXML ast2XML = new ASTtoXML();
		//System.err.println(ast2XML.convert(t).toXML());
		checkNodes(t);
	}
	@Test
	public void testFullSentence5() throws UnsupportedEncodingException {
		String text = "A mixture of 8-hydroxyquinoline-7-carboxylic acid (0.50 g, 2.64 mmol), benzylamine (0.34 g, 3.17 mmol), 1-hydroxybenzotriazole (0.45 g, 2.91 mmol), 1-(3-dimethylaminopropyl)-3-ethylcarbodiimide hydrochloride (0.56 g, 2.91 mmol), and triethylamine (1.6 mL, 11.6 mmol) in DMF (15 mL) was heated at 80 °C overnight. The reaction mixture was concentrated under vacuum. The residue was dissolved in methanol and subjected to HPLC purification on C-18 stationary phase eluted with water/acetonitrile/TFA mobile phase. Collection and lyophilization of appropriate fractions provide the title compound as yellow solid."; 
		POSContainer posContainer = ChemistryPOSTagger.getInstance().runTaggers(text);
		String tagged = posContainer.getTokenTagTupleAsString();

		InputStream in = new ByteArrayInputStream(tagged.getBytes("UTF-8"));
		ChemistrySentenceParser chemistrySentenceParser = new ChemistrySentenceParser(
				in);

		Tree t = chemistrySentenceParser.parseTags();
		ASTtoXML ast2XML = new ASTtoXML();
		//System.err.println(ast2XML.convert(t).toXML());
		checkNodes(t);
	}
	
	@Test
	public void testFullSentence6() throws UnsupportedEncodingException {
		String text = "A slurry of the ester from example 113 step 1 (0.50g, 0.177 mmol) and 4-fluorobenzylamine (0.243g, 1.94 mmol) in toluene (2 mL) were heated at reflux for 20 hrs. Upon cooling to room temperature, the resulting solids were collected by filtration and washed with methanol (3ml) and then with diethyl ether (5ml) to afford the title compound as a white solid."; 
		POSContainer posContainer = ChemistryPOSTagger.getInstance().runTaggers(text);
		String tagged = posContainer.getTokenTagTupleAsString();

		InputStream in = new ByteArrayInputStream(tagged.getBytes("UTF-8"));
		ChemistrySentenceParser chemistrySentenceParser = new ChemistrySentenceParser(
				in);

		Tree t = chemistrySentenceParser.parseTags();
		ASTtoXML ast2XML = new ASTtoXML();
		//System.err.println(ast2XML.convert(t).toXML());
		checkNodes(t);
	}
	
	@Test
	public void testFullSentence7() throws UnsupportedEncodingException {
		String text = "A mixture of 5-chloro-8-hydroxyquinoline-7-carboxylic acid (0.50 g, 2.24 mmol), benzylamine (0.29 g, 2.68 mmol), 1-hydroxy-7-azabenzotriazole (0.36 g, 2.68 mmol), 1-(3-dimethylaminopropyl)-3-ethylcarbodiimide hydrochloride (0.51 g, 2.68 mmol), and triethylamine (0.62 mL, 4.47 mmol) in DMF (15 mL) was stirred at room temperature overnight. The reaction mixture was concentrated under vacuum. The residue was dissolved in DMSO and subjected to HPLC purification on C-18 stationary phase eluted with water/acetonitrile/TFA mobile phase. Collection and lyophilization of appropriate fractions provide the title compound as yellow solid.";
		POSContainer posContainer = ChemistryPOSTagger.getInstance().runTaggers(text);
		String tagged = posContainer.getTokenTagTupleAsString();

		InputStream in = new ByteArrayInputStream(tagged.getBytes("UTF-8"));
		ChemistrySentenceParser chemistrySentenceParser = new ChemistrySentenceParser(
				in);

		Tree t = chemistrySentenceParser.parseTags();
		ASTtoXML ast2XML = new ASTtoXML();
		//System.err.println(ast2XML.convert(t).toXML());
		checkNodes(t);
	}

	@Test
	public void testFullSentence8() throws UnsupportedEncodingException {
		String text = "Into a 10 mL pressure vessel equipped with a magnetic stir bar was placed 0.1 g (.266 mmol) 5-bromo-N-(4-fluorobenzyl)-8-hydroxy-1,6-naphthyridine-7-carboxamide (see Example 126), 0.031 g (.27 mmol) N,N-dimethyl-2-(methylamino)acetamide, .726 mL (.8 mmol) N,N-diisopropylethylamine and 5 mL DMF. The vessel was sealed and heated on an oil bath to 135°C for 18 hrs., after which the mixture was cooled and the solvent removed in vacuo. The residue was purified by reverse phase HPLC on a C18 column using acetonitrile/water as eluent to give 5-[[2-(dimethylamino)-2-oxoethyl](methyl)amino]-N-(4-fluorobenzyl)-8-hydroxy-1,6-naphthyridine-7-carboxamide."; 
		POSContainer posContainer = ChemistryPOSTagger.getInstance().runTaggers(text);
		String tagged = posContainer.getTokenTagTupleAsString();

		InputStream in = new ByteArrayInputStream(tagged.getBytes("UTF-8"));
		ChemistrySentenceParser chemistrySentenceParser = new ChemistrySentenceParser(
				in);

		Tree t = chemistrySentenceParser.parseTags();
		ASTtoXML ast2XML = new ASTtoXML();
		//System.err.println(ast2XML.convert(t).toXML());
		checkNodes(t);
	}
	

	@Test
	public void testFullSentence9() throws UnsupportedEncodingException {
		String text = "Isopropyl 3-(hydroxymethyl)pyridine-2-carboxylate, (200 g, 1.02 mol; prepared as in −P. Ornstein et. al. J. Med. Chem. 1989, 32, 827), methyl N-[(4-methylphenyl)sulfonyl]glycinate (249g, 1.02 mol), and triphenylphosphine (403g, 1.5 mol) were dissolved in dry THF (3000mls) and cooled to zero degrees under N2. The diethylazodicarboxylate (DEAD) (267.6 g, 1.5 mol) was dissolved in dry THF (250 mls) and placed in a 500 ml addition funnel. The DEAD was added dropwise over 1 hour. The ice bath was removed and the reaction was allowed to warm slowly to RT . After 2 hours, the reaction was checked by HPLC and some glycinate remained. More starting reagents were added and the reaction was left to stir at RT. After 30 min, the reaction was checked again and saw a very small amount of the glycinate remaining. Concentrated reaction down to a reddish-orange oil that was carried onto the next step. Addition of 10 mL methanol."; 
		POSContainer posContainer = ChemistryPOSTagger.getInstance().runTaggers(text);
		String tagged = posContainer.getTokenTagTupleAsString();
        
		InputStream in = new ByteArrayInputStream(tagged.getBytes("UTF-8"));
		ChemistrySentenceParser chemistrySentenceParser = new ChemistrySentenceParser(
				in);

		Tree t = chemistrySentenceParser.parseTags();
		ASTtoXML ast2XML = new ASTtoXML();
		//System.err.println(ast2XML.convert(t).toXML());
		checkNodes(t);
	}
	
	
	
	/*****************************
	 * CheckNodes(Tree astTree)
	 * 
	 * @param astTree
	 *            Goes through the nodes of a tree and checks for unexpected
	 *            tokens(when type=0)
	 *****************************/
	private void checkNodes(Tree astTree) {
		int nodeCount = astTree.getChildCount();
		for (int i = 0; i < nodeCount; i++) {
			String text = astTree.getChild(i).getText();
			int type = astTree.getChild(i).getType();
			//Log.info("****Text=" + text + " type==" + type);
			Assert.assertNotSame("Antlr Parse Fails for the for the text '"
					+ text + "'", 0, type);
			checkNodes(astTree.getChild(i));

		}
	}
}