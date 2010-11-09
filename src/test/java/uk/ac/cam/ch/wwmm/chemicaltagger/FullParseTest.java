package uk.ac.cam.ch.wwmm.chemicaltagger;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

import junit.framework.Assert;
import nu.xom.Document;

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
		Utils.writeXMLToFile(ast2XML.convert(t),"target/file1.xml");
		
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
		Utils.writeXMLToFile(ast2XML.convert(t),"target/file2.xml");
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
		Utils.writeXMLToFile(ast2XML.convert(t),"target/file3.xml");
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
		Utils.writeXMLToFile(ast2XML.convert(t),"target/file4.xml");
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
		Utils.writeXMLToFile(ast2XML.convert(t),"target/file5.xml");
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
		Utils.writeXMLToFile(ast2XML.convert(t),"target/file6.xml");
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
		Utils.writeXMLToFile(ast2XML.convert(t),"target/file7.xml");
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
		Utils.writeXMLToFile(ast2XML.convert(t),"target/file8.xml");
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
		Utils.writeXMLToFile(ast2XML.convert(t),"target/file9.xml");
		checkNodes(t);
	}
	
	@Test
	public void testFullSentence10() throws UnsupportedEncodingException {
		String text = "A solution of tetraol 113 (74 mg, 0.30 mmol) was taken up in dry DMF (2 mL) and cooled to 0ºC. Imidazole (40 mg, 0.60 mmol) was added and allowed to dissolve followed by a solution of TIPSCl (0.08 mL, 0.36 mmol) and DMAP (2.0 mg, 20 ?mol) in DMF (1 mL). The reaction mixture was heated at 50 ºC for 18 hrs then quenched by addition of saturated NH4Cl(aq)  (2 mL) and diluted with  (3 mL). The aqueous layer was extracted with EtOAc (3 x 10 mL) and the combined organic layers washed with 10% aqueous LiCl (5 x 10 mL), saturated brine (5 mL), dried (MgSO4), filtered and concentrated in vacuo to give the crude product as a yellow oil. Flash chromatography using CH2Cl2/MeOH (98:2) afforded the title compound 115 as a clear oil (101 mg, 83%); Rf 0.56 (CH2Cl2/MeOH 90:10);  +16.0 (c 0.3 in CHCl3); IR (film) ?max/cm–1 3380 (OH), 2943 (CH), 2924 (CH), 2893 (CH), 2866 (CH), 1464, 1382, 1247, 1094, 1035, 1013, 996, 945, 883, 770, 734,  and 658; 1H (600 MHz), CDCl3: ? = 4.98 (1H, s, 37C=CHAHB), 4.89 (1H, s, 37-C=CHAHB), 4.13 (1H, br s, OH), 4.07 (1H, s, 38-CH), 3.86 (1H, dt, J = 10.2, 4.9 Hz, 45-CHAHB), 3.76 (1H, td, J = 10.2, 3.6 Hz, 45-CHAHB), 3.29–3.24 (1H, m, 42-CH), 3.20 (2H, obs. t, J = 8.0 Hz, 43CH, 41-CH), 3.15 (1H, dd, J = 10.2, 1.4 Hz, 39-CH), 2.84 (1H, br s, OH), 2.38 (1H, br s, OH), 1.99–1.86 (2H, m, 44CHAHB, 40-CH), 1.86–1.78 (1H, m, 44-CHAHB), 1.74 (3H, s, 36-CH3) and 1.14?1.02 (24H, m, 40CHCH3, ((SiCH(CH3)2)3); 13C (150 MHz), CDCl3: ? = 145.7 (37C=CH2), 111.0 (37C=CH2), 81.2 (39-CH), 78.2 (43-CH or 41CH), 77.8 (42-CH), 75.6 (43-CH or 41-CH), 73.1 (38-CH), 60.2 (45-CH2), 37.9 (40-CH), 36.8 (44-CH2), 19.3 (36CH3), 17.9 (6C, SiCH(CH3)2), 12.8 (40-CHCH3) and 11.8 (3C, SiCH(CH3)2); m/z (+ESI) Found [M+H]+ 403.2898; C21H43O5Si requires 403.2880, ? 4.5 ppm. "
			+"(2-((2R,3R,4R,5R,6R)-3,4-Bis(4-methoxybenzyloxy)-6-((R)-1-(4-methoxy benzyloxy)-2-methylallyl)-5-methyltetrahydro-2H-pyran-2-yl)ethoxy)(tert-butyl)dimethylsilane 116 "
			+"A solution of triol 114 (60 mg, 0.17 mmol) in dry DMF (2 mL) was cooled to 0 ºC.  (41 mg, 1.0 mmol) was added and "
			+"the suspension was allowed to warm to room temperature. After 1 h, PMBBr (0.15 mL, 1.0 mmol) and TBAI (11 mg, 30 ?mol)"
			+ "were added sequentially and the reaction mixture was stirred for 18 h at ambient temperature. " 
			+ "The reaction was then cooled to 0 ºC and quenched by addition of saturated NH4Cl(aq) (5 mL) and diluted "
			+ "with  (5 mL). The aqueous layer was extracted with EtOAc (3 x 30 mL) and the combined organic layers "
			+ "washed with 10% aqueous LiCl (3 x 30 mL), saturated brine (30 mL), dried (MgSO4) and concentrated under reduced "
			+ "pressure to give the crude product as a yellow oil. Flash chromatography @" 
			+ " using petrol/EtOAc (95:5) afforded the title compound 116 as a white foam (105 mg, 85%) ; ";
			
			//(2-((2R,3R,4R,5R,6R)-3,4-Bis(4-methoxybenzyloxy)-6-((R)-1-(4-methoxy benzyloxy)-2-methylallyl)-5-methyltetrahydro-2H-pyran-2-yl) ethoxy) triisopropylsilane 117"; 
		POSContainer posContainer = ChemistryPOSTagger.getInstance().runTaggers(text);
		String tagged = posContainer.getTokenTagTupleAsString();
        
		InputStream in = new ByteArrayInputStream(tagged.getBytes("UTF-8"));
		ChemistrySentenceParser chemistrySentenceParser = new ChemistrySentenceParser(
				in);

		Tree t = chemistrySentenceParser.parseTags();
		ASTtoXML ast2XML = new ASTtoXML();
		Utils.writeXMLToFile(ast2XML.convert(t),"target/file10.xml");
		checkNodes(t);
	}
	
	
	@Test
	public void testFullSentence11() throws UnsupportedEncodingException {
		String text = "The residue was dissolved in 5.1ml toluene and tetrakis[2-(2-pyridinyl- N)phenyl- C]-di- -chlorodiiridium (III) (0.20 g, 0.19 mmol) and triethylamine (43.8 µl, 0.32 mmol) were added." ;
		text = "The residue was dissolved in 5.1ml toluene and tetrakis[2-(2-pyridinyl-N)phenyl-C]-di-chlorodiiridium(III) (0.20 g, 0.19 mmol) and triethylamine (43.8 µl, 0.32 mmol) were added." ;
		
		POSContainer posContainer = ChemistryPOSTagger.getInstance().runTaggers(text);
		String tagged = posContainer.getTokenTagTupleAsString();
        
		InputStream in = new ByteArrayInputStream(tagged.getBytes("UTF-8"));
		ChemistrySentenceParser chemistrySentenceParser = new ChemistrySentenceParser(
				in);

		Tree t = chemistrySentenceParser.parseTags();
		ASTtoXML ast2XML = new ASTtoXML();
		Utils.writeXMLToFile(ast2XML.convert(t),"target/file11.xml");
		checkNodes(t);
	}
	@Test
	public void testFullSentence20() throws UnsupportedEncodingException {
		String text = "the cat sat on the mat";
		POSContainer posContainer = ChemistryPOSTagger.getInstance().runTaggers(text);
		String tagged = posContainer.getTokenTagTupleAsString();

		InputStream in = new ByteArrayInputStream(tagged.getBytes("UTF-8"));
		ChemistrySentenceParser chemistrySentenceParser = new ChemistrySentenceParser(
				in);

		Tree t = chemistrySentenceParser.parseTags();
		Document doc = new ASTtoXML().convert(t);
//		CMLUtil.debug(doc.getRootElement(), "DDDDD");
	}
	
	@Test
	public void testFullSentence21() throws UnsupportedEncodingException {
		String text = "the cat slept on the mat";
		POSContainer posContainer = ChemistryPOSTagger.getInstance().runTaggers(text);
		String tagged = posContainer.getTokenTagTupleAsString();

		InputStream in = new ByteArrayInputStream(tagged.getBytes("UTF-8"));
		ChemistrySentenceParser chemistrySentenceParser = new ChemistrySentenceParser(
				in);

		Tree t = chemistrySentenceParser.parseTags();
		Document doc = new ASTtoXML().convert(t);
//		CMLUtil.debug(doc.getRootElement(), "DDDDD");
	}
	

	
	
	@Test
	public void testFullSentence22() throws UnsupportedEncodingException {
		String text = "HyperBranched Polymerization . A typical polymerization procedure was as follows . Cp 2 TiCl 2 ( 25 mg , 0.1 × 10 -3 M ) , Zn ( 7 mg , 0.1 × 10 -3 M ) and dioxane ( 0.5 mL ) were added into a 5 mL glass tube , and then the reaction solution was degassed using three freeze-vacuum-thaw cycles , and reacted at room temperature for 10 min , until the solution turned lime green . GMA ( 0.355 g , 2.5 × 10 -3 M ) , St ( 0.260 g , 2.5 × 10 -3 M ) , CuBr 2 ( 23 mg , 0.1 × 10 -3 M ) and bpy ( 48 mg , 0.3 × 10 -3 M ) were added into the reaction solution , and the tube was again degassed using three freeze-vacuum-thaw cycles . The tube was then sealed under a vacuum , and the sealed tube was immersed in an oil bath at 90 °C . After polymerization for 4 h , the tube was rapidly cooled to room temperature . The polymer solution in THF was passed through a short column of neutral alumina to remove the metal salt . After two precipitations by addition of the polymer solution into petroleum ether ( 30- 60 °C ) , the hyperbranched P(GMA - co -St ) -Br n ( HP(GMA-St)-Br n ) was obtained in a 51 % yield after filtration and drying in a vacuum oven at 30 °C overnight . The monomer conversion was determined gravimetrically . was 78 000 and was 1.19 .";

        POSContainer posContainer = ChemistryPOSTagger.getInstance().runTaggers(text);
		String tagged = posContainer.getTokenTagTupleAsString();
        System.out.println(tagged);
		InputStream in = new ByteArrayInputStream(tagged.getBytes("UTF-8"));
		ChemistrySentenceParser chemistrySentenceParser = new ChemistrySentenceParser(
				in);

		Tree t = chemistrySentenceParser.parseTags();
		Document doc = new ASTtoXML().convert(t,true);
		Utils.writeXMLToFile(doc, "target/testExperiment.xml");
	}
	
	@Test
	public void testFullSentence23() throws UnsupportedEncodingException {
		String text = "The influence of halogen oxidation on the variabilities of ozone (O3) and volatile organic compounds (VOCs) within the Arctic and sub-Arctic atmospheric boundary layer was investigated using field measurements from multiple campaigns conducted in March and April 2008 as part of the POLARCAT project. For the ship-based measurements, a high degree of correlation (r = 0.98 for 544 data points collected north of 68° N) was observed between the acetylene to benzene ratio, used as a marker for chlorine and bromine oxidation, and O3 signifying the vast influence of halogen oxidation throughout the ice-free regions of the North Atlantic . Concurrent airborne and ground-based measurements in the Alaskan Arctic substantiated this correlation and were used to demonstrate that halogen oxidation influenced O3 variability throughout the Arctic boundary layer during these springtime studies. Measurements aboard the R/V Knorr in the North Atlantic and Arctic Oceans provided a unique view of the transport of O3-poor air masses from the Arctic Basin to latitudes as far south as 52° N. FLEXPART, a Lagrangian transport model, was used to quantitatively determine the exposure of air masses encountered by the ship to first-year ice (FYI), multi-year ice (MYI), and total ICE (FYI+MYI). O3 anti-correlated with the modeled total ICE tracer (r = −0.86) indicating that up to 73% of the O3 variability measured in the Arctic marine boundary layer could be related to sea ice exposure. ";
        POSContainer posContainer = ChemistryPOSTagger.getInstance().runTaggers(text);
		String tagged = posContainer.getTokenTagTupleAsString();
        System.out.println(tagged);
		InputStream in = new ByteArrayInputStream(tagged.getBytes("UTF-8"));
		ChemistrySentenceParser chemistrySentenceParser = new ChemistrySentenceParser(
				in);

		Tree t = chemistrySentenceParser.parseTags();
		Document doc = new ASTtoXML().convert(t,true);
		Utils.writeXMLToFile(doc, "target/testExperiment.xml");
	}
	
	@Test
	public void testFullSentence24() throws UnsupportedEncodingException{
		String text = "γ-Tocotrienol and γ-Tocopherol Are Primarily Metabolized to Conjugated 2-(β-carboxyethyl)-6-Hydroxy-2,7,8-Trimethylchroman and Sulfated Long-Chain Carboxychromanols in Rats and eaten for breakfast";
	      POSContainer posContainer = ChemistryPOSTagger.getInstance().runTaggers(text);
		  String tagged = posContainer.getTokenTagTupleAsString();
	      System.out.println(tagged);
		  InputStream in = new ByteArrayInputStream(tagged.getBytes("UTF-8"));
		  ChemistrySentenceParser chemistrySentenceParser = new ChemistrySentenceParser(
					in);

		  Tree t = chemistrySentenceParser.parseTags();
		  Document doc = new ASTtoXML().convert(t);
		  Utils.writeXMLToFile(doc, "target/testMetabolism.xml");

		  Assert.assertEquals(1,doc.query("//Sentence").size());
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
//			Log.info("****Text=" + text + " type==" + type);
			Assert.assertNotSame("Antlr Parse Fails for the for the text '"
					+ text + "'", 0, type);
			checkNodes(astTree.getChild(i));

		}
	}
}
