package uk.ac.cam.ch.wwmm.chemicaltagger;




/**************************************************************
 * 
 * Runs 3 taggers against the sentence: - OSCAR: for recognising chemical
 * entities. - Regex: for recognising chemistry related words that are not
 * recognised by OSCAR . - OpenNLP Brown fo recognising common english words .
 * It then combines the output of all 3 taggers and performs some simple
 * corrections
 * 
 * @author lh359
 ***************************************************************/
public class ChemistryPOSTagger {

	private static class TaggerHolder {
		private static final ChemistryPOSTagger INSTANCE = new ChemistryPOSTagger();
	}

	public String sentence;
	public OscarTagger oscarTagger;
	public RegexTagger regexTagger;


	public OpenNLPTagger openNLPTagger;
	public SpectraTagger spectraTagger;
//	private final Logger LOG = Logger.getLogger(ChemistryPOSTagger.class);
	private ChemistryPOSTagger() {
		oscarTagger = new OscarTagger();
		regexTagger = new RegexTagger();
		openNLPTagger = OpenNLPTagger.getInstance();
		spectraTagger = new SpectraTagger();
	}

	public static ChemistryPOSTagger getInstance() {
		return TaggerHolder.INSTANCE;
	}

	public void setSentence(String sentence) {
		this.sentence = sentence;
	}

	/*****************************************************
	 * Main Module.
	 * 
	 * Initialises POSContainer.
	 * 
	 *****************************************************/
	public POSContainer runTaggers(String inputSentence) {

		POSContainer posContainer = new POSContainer();
		inputSentence = Utils.formatSentence(inputSentence);
		posContainer.setInputText(inputSentence);
		posContainer = spectraTagger.runTagger(posContainer);
		posContainer = oscarTagger.runTagger(posContainer);
		
		posContainer = regexTagger.runTagger(posContainer);
		posContainer = openNLPTagger.runTagger(posContainer);
	
		posContainer.combineTaggers();
		posContainer.recombineHyphenedTokens();

		posContainer =  new PostProcessTags().correctCombinedTagsList(posContainer);
		return posContainer;
	}

	public void setRegexTagger(RegexTagger regexTagger) {
		this.regexTagger = regexTagger;
	}
		public static void main(String[] args) throws Exception {

		ChemistryPOSTagger posTagger = new ChemistryPOSTagger();
		String sentence = "Synthesis of the brown dropwise Hyperbranched Macroligands via Michael Addition of Butyl or Ethyl Acrylate with HPEI. The synthetic procedure for partially EA- or BA-modified HPEI is exemplified for HPEI25K-EA0.79: 1.00 g of HPEI25K (Mn = 2.50 x 104, 23.3 mmol of amine groups) was dissolved in 5.00 mL of THF, and then 2.52 mL (23.3 mmol) of EA was added. The mixture was stirred at room temperature for 24 h and subsequently at 50 C for another 24 h.";
		posTagger.runTaggers(sentence);

		sentence = "The resulting viscous mixture was slowly added to vigorously stirred MeOH ( ca . 30 mL ) to give a white precipitate of diblock copolymer PNBE- -PSt ";
		posTagger.runTaggers(sentence);

		sentence = "Potassium carbonate ( 0.63 g , 4.56 mmol ) and thiophenol ( 0.19 g , 1.69 mmol) were added to the 2-nitrobenzene sulfonamide ( 0.50 g , 1.302)";
		posTagger.runTaggers(sentence);

		sentence = "Preparation of Sulfonated Poly(phthalazinone ether ether ketone) 7a. To a 25 mL three-necked round-bottomed flask fitted with a Dean-stark trap, a condenser, a nitrogen inlet/outlet, and magnetic stirrer was added bisphthalazinone monomer 4 (0.6267 g, 1 mmol), sulfonated difluoride ketone 5 (0.4223 g, 1 mmol), anhydrous potassium carbonate (0.1935 g, 1.4 mmol), 5 mL of DMSO, and 6 mL of toluene. Nitrogen was purged through the reaction mixture with stirring for 10 min, and then the mixture was slowly heated to 140 °C and kept stirring for 2 h. After water generated was azoetroped off with toluene. The temperature was slowly increased to 175 °C. The temperature was maintained for 20 h, and the viscous solution was cooled to 100 °C followed by diluting with 2 mL of DMSO and, thereafter, precipitated into 100 mL of 1:  1 (v/v) methanol/water. The precipitates were filtered and washed with water for three times. The fibrous residues were collected and dried at 110 °C under vacuum for 24 h. A total of 0.9423 g of polymer 7a was obtained in high yield of 93%.";
		posTagger.runTaggers(sentence);

		sentence = "Synthesis of 3 . A mixture of 2 (1.1 g, 3.6 mmol), zinc oxide (0.160 g, 0.196 mmol) and acetic anhydride (0.37 g, 3.6 mmol) in acetic acid (4.3 g, 72 mmol) was stirred at 30°C for 2 d. The reaction was quenched with saturated NaHCO3, and the mixture was extracted with Et2O. The combined organic layer was washed with H2O and dried over anhydrous Na2SO4. The solvent was removed in vacuo, and the residue was purified by flash column chromatography on silica gel (hexane/Et2OÂ =Â 2/1) to give 0.97 g of 3 as a pale yellow viscous liquid (95%).";
		posTagger.runTaggers(sentence);

	}
		
		
}
