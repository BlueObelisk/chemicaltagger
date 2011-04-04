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
public final class ChemistryPOSTagger {

	static final boolean DEFAULT_PRIORITISE_OSCAR = false;
	static final boolean DEFAULT_USE_OSCAR_TOKENISER = true;
	static final boolean DEFAULT_USE_SPECTRA_TAGGER = false;
		
	private OscarTokeniser oscarTokeniser;
    private WhiteSpaceTokeniser whiteSpaceTokeniser;
	private OscarTagger oscarTagger;
	private RegexTagger regexTagger;
	private OpenNLPTagger openNLPTagger;
	
	
	

	/**************************************
	 * Private Singleton holder.
	 ***************************************/
	private static class TaggerHolder {
		private static final ChemistryPOSTagger INSTANCE = new ChemistryPOSTagger();
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

	
	/**
	 * Custom constructor for setting up non-standard ChemicalTagger operations
	 */
	public ChemistryPOSTagger (OscarTokeniser oscarTokeniser, WhiteSpaceTokeniser whiteSpaceTokeniser,
			OscarTagger oscarTagger, RegexTagger regexTagger,
			OpenNLPTagger openNLPTagger) {
		
		this.oscarTokeniser = oscarTokeniser;
		this.whiteSpaceTokeniser = whiteSpaceTokeniser;
		this.oscarTagger = oscarTagger;
		this.regexTagger = regexTagger;
		this.openNLPTagger = openNLPTagger;
	}
	
	
	private ChemistryPOSTagger() {
		Oscar oscar = new Oscar();
		whiteSpaceTokeniser = new WhiteSpaceTokeniser();
		oscarTokeniser = new OscarTokeniser(oscar);
		oscarTagger = new OscarTagger(oscar);
		regexTagger = new RegexTagger();
		openNLPTagger = OpenNLPTagger.getInstance();
	}
	


	/**************************************
	 * Getter method for OscarTokeniser.
	 * @return oscarTokeniser (OscarTokeniser)
	 ***************************************/
	public OscarTokeniser getOscarTokeniser() {
		return oscarTokeniser;
	}
	
	
	/**************************************
	 * Getter method for WhiteSpaceTokeniser.
	 * @return WhiteSpaceTokeniser (WhiteSpaceTokeniser)
	 ***************************************/
	public WhiteSpaceTokeniser getWhiteSpaceTokeniser() {
		return whiteSpaceTokeniser;
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
	 * Overloading Method for runTaggers with prioritiseOscar
	 * set to false and useOscarTokeniser set to true.
	 * 
	 * @param inputSentence(String)
	 * @return POSContainer
	 *****************************************************/
	public POSContainer runTaggers(final String inputSentence) {
		return runTaggers(inputSentence, DEFAULT_PRIORITISE_OSCAR,
				DEFAULT_USE_OSCAR_TOKENISER, DEFAULT_USE_SPECTRA_TAGGER);
	}
	
	/*****************************************************
	 * Normalises the inputSentence then runs Tokeniser and Taggers on them.
	 * and returns a POSContainer object.
	 * Prioritises OSCAR tags if prioritiseOscar is True
	 * else it prioritises regexTagger.
	 *****************************************************/
	public POSContainer runTaggers(String inputSentence, final boolean prioritiseOscar,
			boolean useOscarTokeniser, boolean useSpectraTagger) {
		
		POSContainer posContainer = new POSContainer();
		posContainer = normaliseAndTokeniseInput(inputSentence, posContainer, useOscarTokeniser, useSpectraTagger);		
		posContainer = oscarTagger.runTagger(posContainer);
		posContainer = regexTagger.runTagger(posContainer);
		posContainer = openNLPTagger.runTagger(posContainer);
		posContainer.setPrioritiseOscar(prioritiseOscar);
		posContainer.combineTaggers();	
		posContainer = RecombineTokens.recombineHyphenedTokens(posContainer);
		posContainer =  new PostProcessTags().correctCombinedTagsList(posContainer);
		return posContainer;
	}
	
	
	
	/*******************************************
	 * Normalises the inputText, extracts the spectra if required and then passes it to the relevant tokeniser.
	 * @param inputSentence (String)
	 * @param posContainer  (POSContainer)
	 * @return posContainer (POSContainer)
	 */
	private POSContainer normaliseAndTokeniseInput(String inputSentence,POSContainer posContainer,
			boolean useOscarTokeniser, boolean useSpectraTagger) {
		inputSentence = Formatter.normaliseText(inputSentence);
		posContainer.setInputText(inputSentence);
		if (useSpectraTagger){
		    posContainer = SpectraTagger.runTagger(posContainer);
		}
		if (useOscarTokeniser){
			posContainer = oscarTokeniser.tokenise(posContainer);
		}
		else {
			posContainer = whiteSpaceTokeniser.tokenise(posContainer);
		}
		return posContainer;
	}
		
		
}
