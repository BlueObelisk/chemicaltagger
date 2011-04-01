package uk.ac.cam.ch.wwmm.chemicaltagger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import uk.ac.cam.ch.wwmm.oscar.document.Token;
import uk.ac.cam.ch.wwmm.oscar.document.TokenSequence;

/****************************************
 * A whitespace tokeniser to be used as a 
 * substitute to the OSCAR tokeniser.
 * Can be converted into OSCAR tokens.
 * @author lh359
 *
 *****************************************/
public class WhiteSpaceTokeniser {
	
	
	/*****************************
	 * Default constructor method.
	 ***************************/
	public WhiteSpaceTokeniser(){
		
	}
	
	/********************************************
	 * Converts a string into a list of tokens.
	 * @param inputText
	 * @return ArrayList
	 *****************************************/
	private List<String> tokenise(String inputText){
		
		return Arrays.asList(inputText.split("\\s+"));
	}
	

	/********************************************
	 * Tokenises a String on white space.
	 * Requires a POSContainer.
	 * @param  posContainer (POSContainer)
	 * @return posContainer (POSContainer)
	 *****************************************/
	public POSContainer tokenise(POSContainer posContainer){
		List<String> wordTokenList = tokenise(posContainer.getInputText());
		List<TokenSequence> tokenSequenceList = convertToOscarTokenSequences(wordTokenList, posContainer.getInputText());		
		posContainer.setWordTokenList(wordTokenList);
		posContainer.setTokenSequenceList(tokenSequenceList);
		return posContainer;
	}

	/*********************************************
	 * Converts a list of words into a list of Oscar TokenSequences.
	 * @param wordTokenList
	 ********************************************/
	private  List<TokenSequence> convertToOscarTokenSequences(List<String> wordTokenList, String inputText) {
		List<Token> oscarTokens = convertWordlistToOscarTokens(wordTokenList);
		List<TokenSequence> tokenSequenceList = makeTokenSequences(inputText, oscarTokens);
		return tokenSequenceList;
	}


	/*************************************************
	 * Converts a list of words into a list of Oscar Tokens.
	 * @param wordTokenList (List<String>)
	 * @return oscarTokens (List<IToken>)
	 ***********************************************/
	private List<Token> convertWordlistToOscarTokens(List<String> wordTokenList) {

		int index = 0;
		int sentenceIndex = 0;
		List<Token> oscarTokens = new LinkedList<Token>();
		boolean endFlag = true;

		for (String word : wordTokenList)  {
			int startIndex = sentenceIndex;
			int endIndex = sentenceIndex+word.length();
			Token oscarToken = new Token(word, startIndex, endIndex, null, null, null);
			
			
			oscarToken.setIndex(index);
			oscarTokens.add(oscarToken);
			sentenceIndex = endIndex+1;
			index++;
			if (word.equals(".") & !endFlag) {
				index = 0;
				endFlag = true;
			}
		}
		return oscarTokens;
	}
	
    /***************************************************
     * Creates a list of tokenSequences from the Oscar tokens. 
     * @param surfaceText (String)
     * @param oscarTokens (List<IToken>)
     * @return tokSequenceList (List<TokenSequence>)
     *****************************************************/
	private List<TokenSequence> makeTokenSequences(String surfaceText,	List<Token> oscarTokens) {

		TokenSequence tokSeq = new TokenSequence(surfaceText, 0, null, oscarTokens);
		List<TokenSequence> tokSequenceList = new ArrayList<TokenSequence>();
		tokSequenceList.add(tokSeq);
		tokSequenceList = postProcess(tokSequenceList);

		return tokSequenceList;
	}
	
	/***************************************************
     * PostProcessing the tokenSequenceList by adding tokenSequences to each token within the tokenList.
     * The TokenSequences are used by the Oscar Tokens for lookahead.
     * @param  tokSequenceList    (List<TokenSequence>)
     * @return newTokSequenceList (List<TokenSequence>)
     *****************************************************/
	private List<TokenSequence> postProcess(List<TokenSequence> tokSequenceList) {
		List<TokenSequence> newTokSequenceList = new ArrayList<TokenSequence>();
		for (TokenSequence tokenSequence : tokSequenceList) {
			for (Token token : tokenSequence.getTokens()) {
				token.setTokenSequence(tokenSequence);
			}
			TokenSequence newTokenSequence = new TokenSequence(
					tokenSequence.getSurface(), tokenSequence.getOffset(),
					tokenSequence.getDoc(), tokenSequence.getTokens());
			newTokSequenceList.add(newTokenSequence);
		}
		return newTokSequenceList;
	}
}
