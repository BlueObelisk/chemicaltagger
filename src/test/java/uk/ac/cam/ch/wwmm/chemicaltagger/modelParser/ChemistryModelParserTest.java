package uk.ac.cam.ch.wwmm.chemicaltagger.modelParser;

import org.junit.Test;


public class ChemistryModelParserTest {

	
	@Test
	public void testModelParsing() {
		String sentence = "Potassium carbonate ( 0.63 g , 4.56 mmol ) and thiophenol ( 0.19 g , 1.69 mmol) were dissolved in 2-nitrobenzene sulfonamide ( 0.50 g , 1.302 mmol )";
		ChemistryModelParser chemistryModel = new ChemistryModelParser();
		chemistryModel.parseSentence(sentence);
	}
}
