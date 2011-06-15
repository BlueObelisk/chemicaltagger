package uk.ac.cam.ch.wwmm.chemicaltagger;

import uk.ac.cam.ch.wwmm.oscar.Oscar;


/**************************************************************
 * Converts string input into tokenised and tagged text.
 * 
 * Runs a tokenisers 4 taggers against the input:
 * - Spectra: recognises and pulls out spectra information. 
 * - OSCAR  : recognises chemical entities. 
 * - Regex  : recognises chemistry related words that are not
 * recognised by OSCAR . 
 * - OpenNLP: recognises common english parts of speech .
 * It then combines the output of OSCAR, Regex and OpenNLP
 * taggers and then performs postprocessing on tags
 * 
 * @author lh359, dmj30, dl387
 ***************************************************************/
public class ChemistryPOSTagger {

	static boolean DEFAULT_PRIORITISE_OSCAR = false;
	static boolean DEFAULT_USE_SPECTRA_TAGGER = false;
		
	private OscarTagger oscarTagger;
	private RegexTagger regexTagger;
	private OpenNLPTagger openNLPTagger;
	private ChemicalTaggerTokeniser ctTokeniser;
	
	/**************************************
	 * Private Singleton holder.
	 ***************************************/
	private static class TaggerHolder {
		private static ChemistryPOSTagger INSTANCE = new ChemistryPOSTagger();
	}
	
	/**************************************
	 * Gets the default ChemistryPOSTagger instance - recommended for
	 * standard ChemicalTagger processing.
	 * 
	 * @return ChemistryPOSTagger instance
	 ***************************************/
	public static ChemistryPOSTagger getDefaultInstance() {
		return TaggerHolder.INSTANCE;
	}


	 
	/*********************
	 * Custom constructor for setting up non-standard ChemicalTagger operations.
	 * @param ctTokeniser (ChemicalTaggerTokeniser)
	 * @param oscarTagger (OscarTagger)
	 * @param regexTagger (RegexTagger)
	 * @param openNLPTagger (OpenNLPTagger)
	 */
	
	public ChemistryPOSTagger (ChemicalTaggerTokeniser ctTokeniser, OscarTagger oscarTagger, RegexTagger regexTagger, OpenNLPTagger openNLPTagger) {
		
		this.ctTokeniser = ctTokeniser;
		this.oscarTagger = oscarTagger;
		this.regexTagger = regexTagger;
		this.openNLPTagger = openNLPTagger;
	}
	
	/**************************
	 * Default constructor. 
	 * Initialises all the fields.
	 */
	private ChemistryPOSTagger() {
		Oscar oscar = new Oscar();
		ctTokeniser = new OscarTokeniser(oscar);
		oscarTagger = new OscarTagger(oscar);
		regexTagger = new RegexTagger();
		openNLPTagger = OpenNLPTagger.getInstance();
	}


	/**************************************
	 * Getter method for ChemicalTaggerTokeniser.
	 * @return ctTokeniser (ChemicalTaggerTokeniser)
	 ***************************************/
	public ChemicalTaggerTokeniser getCTTokeniser() {
		return ctTokeniser;
	}
	
	/**************************************
	 * Getter method for RegexTagger.
	 * @return regexTagger (RegexTagger)
	 ***************************************/
	public RegexTagger getRegexTagger() {
		return regexTagger;
	}
	
	/**************************************
	 * Getter method for OscarTagger.
	 * @return oscarTagger (OscarTagger)
	 ***************************************/
	public OscarTagger getOscarTagger() {
		return oscarTagger;
	}
	
	/**************************************
	 * Getter method for OpenNLPTagger.
	 * @return openNLPTagger (OpenNLPTagger)
	 ***************************************/
	public OpenNLPTagger getOpenNLPTagger() {
		return openNLPTagger;
	}
	
	
	/*****************************************************
	 * Overloading method for runTaggers passing the default 
	 * flags for prioritiseOscar and useSpectraTagger to {@link ChemistryPOSTagger#runTaggers(String, boolean, boolean)} .
	 * 
	 * @param inputSentence (String)
	 * @return POSContainer (POSContainer)
	 *****************************************************/
	public POSContainer runTaggers(String inputSentence) {
		return runTaggers(inputSentence, DEFAULT_PRIORITISE_OSCAR, DEFAULT_USE_SPECTRA_TAGGER);
	}
	
	
	/*****************************************************
	 * 
	 * Normalises the inputSentence then runs the Tokeniser and Taggers against it.
	 * Prioritises OSCAR tags if prioritiseOscar is True
	 * else it prioritises regexTagger.
	 * 
	 * @param inputSentence (String)
	 * @param prioritiseOscar (boolean)
	 * @param useSpectraTagger (boolean)
	 * @return posContainer (POSContainer)
	 *****************************************************/
	
	public POSContainer runTaggers(String inputSentence, boolean prioritiseOscar, boolean useSpectraTagger) {
		
		POSContainer posContainer = new POSContainer();
		posContainer = normaliseAndTokeniseInput(inputSentence, posContainer, useSpectraTagger);		
		posContainer = oscarTagger.runTagger(posContainer);
		posContainer = regexTagger.runTagger(posContainer);
		posContainer = openNLPTagger.runTagger(posContainer);
		posContainer.setPrioritiseOscar(prioritiseOscar);
		posContainer.combineTaggers();	
		posContainer = RecombineTokens.recombineTokens(posContainer);
		posContainer =  new PostProcessTags().correctCombinedTagsList(posContainer,regexTagger.getIgnoredTags());
		return posContainer;
	}
	
	
	/*******************************************
	 * Normalises the inputText, extracts the spectra if required and then passes it to the relevant tokeniser.
	 * @param inputSentence (String)
	 * @param posContainer  (POSContainer)
	 * @param useSpectraTagger (boolean)
	 * @return posContainer (POSContainer)
	 */
	private POSContainer normaliseAndTokeniseInput(String inputSentence, POSContainer posContainer, boolean useSpectraTagger) {
		inputSentence = Formatter.normaliseText(inputSentence);
		posContainer.setInputText(inputSentence);
		if (useSpectraTagger){
		    posContainer = SpectraTagger.runTagger(posContainer);
		}
		posContainer = ctTokeniser.tokenise(posContainer);
		return posContainer;
	}
		
		
}
