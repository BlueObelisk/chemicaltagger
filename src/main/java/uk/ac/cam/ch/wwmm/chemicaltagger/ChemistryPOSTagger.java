package uk.ac.cam.ch.wwmm.chemicaltagger;

import java.util.List;

import org.apache.commons.configuration.Configuration;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

/**************************************************************
 * 
 * Runs 3 taggers against the sentence: 
      - OSCAR: for recognising chemical entities. 
      - Regex: for recognising chemistry related words that are not recognised by OSCAR .
      - OpenNLP Brown fo recognising common english words .
 * It then combines the output of all 3 taggers and performs some simple corrections
 * 
 * @author lh359
 ***************************************************************/
public class ChemistryPOSTagger {

	private static class TaggerHolder {
		private static final ChemistryPOSTagger INSTANCE = new ChemistryPOSTagger();
	}
	
	public String sentence;
	private Configuration config = null;
	private String config_filename = "textmining.properties";
	private final Logger LOG = Logger.getLogger(ChemistryPOSTagger.class);
	private static final String FLOW_COMMAND = "recognise inline";
    
	public OscarTagger oscarTagger;
	public RegexTagger regexTagger;
	public OpenNLPTagger openNLPTagger;
	
	private ChemistryPOSTagger() {
		oscarTagger = new OscarTagger();
		regexTagger = new RegexTagger();
	    openNLPTagger = new OpenNLPTagger();	
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
		
		posContainer = oscarTagger.runTagger(posContainer,inputSentence);
		posContainer = regexTagger.runTagger(posContainer);
		posContainer = openNLPTagger.runTagger(posContainer);

		posContainer.combineTaggers();
		posContainer = correctCombinedTagsList(posContainer);
	    //posContainer.printOutTags();
		LOG.info("Tag Token Tuple: " + posContainer.getTokenTagTupleAsString());
		return posContainer;
	}





	/**************************************************
	 * Corrects MisNamed Tags
	 * 
	 * Needs to be refactored and/or separated into different modules.
	 **************************************************/
	private POSContainer correctCombinedTagsList(POSContainer posContainer) {

		List<String> tokenList = posContainer.getTokenList();
		List<WWMMTag> combinedTags = posContainer.getCombinedTagsList();

		for (int i = 0; i < combinedTags.size(); i++) {
			String currentTag = combinedTags.get(i).getPOS();
			String currentToken = tokenList.get(i);
			String newTag = combinedTags.get(i).getPOS();

			if ((StringUtils.equalsIgnoreCase(currentTag, "oscar-cm")|| StringUtils.equalsIgnoreCase(currentTag, "oscar-ont"))
					
					&& StringUtils.equalsIgnoreCase(currentToken, "a")) {
				newTag = "DT";
			}


			if (StringUtils.equalsIgnoreCase(currentTag, "oscar-cm")
					&& currentToken.contains("°C")) {
				newTag = "NN-TEMP";
			}
			if (StringUtils.equalsIgnoreCase(currentTag, "oscar-cm")
					&& StringUtils.equalsIgnoreCase(currentToken, "atrp")) {
				newTag = "NN-SYNTHESIZE";
			}
			if (StringUtils.equalsIgnoreCase(currentTag, "oscar-cm")
					&& StringUtils.equalsIgnoreCase(currentToken, "romp")) {
				newTag = "NN-SYNTHESIZE";
			}
			if (StringUtils.equalsIgnoreCase(currentTag, "oscar-cm")
					&& StringUtils.equalsIgnoreCase(currentToken, "ml")) {
				newTag = "NN-VOL";
			}
			if (StringUtils.equalsIgnoreCase(currentTag, "oscar-cm")
					&& StringUtils.equalsIgnoreCase(currentToken, "°C")) {
				newTag = "NN-TEMP";
			}
			if (StringUtils.equalsIgnoreCase(currentTag, "nnp")
					&& StringUtils.equalsIgnoreCase(currentToken, "M")) {
				newTag = "NN-AMOUNT";
			}
			if (StringUtils.equalsIgnoreCase(currentTag, "''")) {
				newTag = "FW";
			}
			
			if (StringUtils.equalsIgnoreCase(currentTag, "cd")) {
				List beforeList = Utils
						.addToList("in-of jj nn-chementity comma");
				List afterList = Utils.addToList("-lrb- stop comma");
				if (stringbefore(beforeList, i, combinedTags)
						&& (stringafter(afterList, i, combinedTags) || i == combinedTags
								.size())) {
					newTag = "OSCAR-CD";
				}
			}
			// polymerization should not be chementity
			if (currentTag.toLowerCase().startsWith("vb-")
					|| currentTag.toLowerCase().startsWith("nn")) {
				if (!currentTag.toLowerCase().startsWith("nn-state")
						&& !currentTag.toLowerCase().startsWith("nn-apparatus")
						&& !currentTag.toLowerCase().startsWith("nn-temp")
						&& !currentTag.toLowerCase().startsWith("nn-pressure")) {
					List beforeList = Utils.addToList("dt jj");
					List afterList = Utils
							.addToList("vbd jj nn-chementity nn-mixture nn-apparatus nn comma");

					if (stringbefore(beforeList, i, combinedTags)
							&& (stringafter(afterList, i, combinedTags) || i == combinedTags
									.size())) {
						newTag = "NN-CHEMENTITY";
					}
				}
			}

			if (currentTag.toLowerCase().startsWith("vb-precipitate")) {
				List beforeList = Utils.addToList("jj oscar-cj");
				List afterList = Utils.addToList("in-of");

				if (stringbefore(beforeList, i, combinedTags)
						&& (stringafter(afterList, i, combinedTags) || i == combinedTags
								.size())) {
					newTag = "NN-CHEMENTITY";
				}
			}

			if (currentTag.toLowerCase().startsWith("vbn")
					|| currentTag.toLowerCase().startsWith("vbg")) {

				List afterList = Utils.addToList("oscar-cm nns nn-chementity oscar-cj");
				List beforeList = Utils.addToList("dt rb");
				if (stringafter(afterList, i, combinedTags)
						&& stringbefore(beforeList, i, combinedTags)) {
					newTag = "OSCAR-CJ";
				}

			}

			if (currentTag.toLowerCase().startsWith("vb")
					&& currentToken.toLowerCase().endsWith("ing")) {

				List afterList = Utils.addToList("nn oscar-cm nns nn-chementity oscar-cj jj nnp");
				List beforeList = Utils.addToList("dt rbr rb");
				if (stringafter(afterList, i, combinedTags)
						&& stringbefore(beforeList, i, combinedTags)) {
					newTag = "JJ";
				}

			}

			if (currentTag.toLowerCase().startsWith("vb-")
					&& !currentToken.toLowerCase().endsWith("ing")) {

				List afterList = Utils.addToList("nn oscar-cm nns nn-chementity oscar-cj jj nnp nn-state");
				List beforeList = Utils.addToList("dt in-in in-by in-of in stop ");
				if (stringafter(afterList, i, combinedTags)
						&& stringbefore(beforeList, i, combinedTags)) {
					newTag = "JJ";
				}

			}
			
			if (currentToken.equals("M")) {

				List beforeList = Utils.addToList("cd");

				if (stringbefore(beforeList, i, combinedTags)) {
					newTag = "NN-AMOUNT";
				}
			}

			if (currentTag.toLowerCase().equals("cd")) {

				List afterList = Utils.addToList("stop comma -lrb-");

				if (stringafter(afterList, i, combinedTags)) {
					newTag = "OSCAR-CD";
				}
			}

			if (currentTag.toLowerCase().equals("oscar-cd")) {

				List afterList = Utils.addToList("nn-vol nn-mass");

				if (stringafter(afterList, i, combinedTags)) {
					newTag = "CD";
				}
			}
			
			combinedTags.get(i).setPOS(newTag);
		}

		return posContainer;
	}

	/***********************************
	 * A boolean function that checks for the tokens before the current token
	 * 
	 * @param beforeList
	 * @param index
	 * @param combinedTags
	 * @return before(boolean)
	 ***********************************/
	private boolean stringbefore(List beforeList, int index,
			List<WWMMTag> combinedTags) {
		boolean before = false;
		if (index != 0) {
			int beforeIndex = index - 1;
			if (beforeList.contains(combinedTags.get(beforeIndex).getPOS()
					.toLowerCase())) {
				before = true;
			}

		}
		return before;
	}

	/**********************************
	 * A boolean function that checks for the tokens after the current token
	 * 
	 * @param afterList
	 * @param index
	 * @param combinedTags
	 * @return
	 **********************************/
	private boolean stringafter(List afterList, int index,
			List<WWMMTag> combinedTags) {
		boolean after = false;
		int afterIndex = index + 1;
		if (afterIndex < combinedTags.size()) {
			if (afterList.contains(combinedTags.get(afterIndex).getPOS()
					.toLowerCase())) {
				after = true;
			}

		}
		return after;
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
