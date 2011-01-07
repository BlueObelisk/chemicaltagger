package uk.ac.cam.ch.wwmm.chemicaltagger;

import java.util.ArrayList;
import java.util.List;

import opennlp.tools.lang.english.TreebankParser;
import uk.ac.cam.ch.wwmm.oscar.document.NamedEntity;
import uk.ac.cam.ch.wwmm.oscar.document.TokenSequence;

/*****************************************************
 * Runs the OSCAR tagger .
 * 
 * @author lh359, dmj30,jat45
 *****************************************************/

public class ChemicalTreeBankParser {


	/****************************
	 * Public Constructor
	 ***************************/
	public ChemicalTreeBankParser() {
		initialise();

	}

	/*****************************************************
	 * 
	 *****************************************************/
	private void initialise() {

	
	}

	/*****************************************************
	 * Main Function. Runs OSCAR over a string and process the XML output Stores
	 * the tokens and tags to the POSContainer class which is returned
	 * 
	 * @author dmj30, lh359
	 *****************************************************/
	public POSContainer runTagger(POSContainer posContainer, String sentence) {

		List<NamedEntity> neList = new ArrayList<NamedEntity>();
		List<TokenSequence> tokens = new ArrayList<TokenSequence>();
	    TreebankParser treebankParser = new TreebankParser();
//	    treebankParser.


			
		
		return posContainer;
		// return processOSCARTags(posContainer, neList, sentence);

	}

	public static void main(final String[] args)  {
		ChemicalTreeBankParser tbParser = new ChemicalTreeBankParser();
	}

}
