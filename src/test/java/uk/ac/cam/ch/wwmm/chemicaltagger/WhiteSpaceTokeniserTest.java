/**
 * Copyright 2011 Lezan Hawizy, David M. Jessop, Daniel Lowe and Peter Murray-Rust
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package uk.ac.cam.ch.wwmm.chemicaltagger;
import static uk.ac.cam.ch.wwmm.chemicaltagger.ChemistryPOSTagger.DEFAULT_PRIORITISE_OSCAR;
import static uk.ac.cam.ch.wwmm.chemicaltagger.ChemistryPOSTagger.DEFAULT_USE_SPECTRA_TAGGER;

import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import uk.ac.cam.ch.wwmm.oscar.Oscar;

/************************************
 * Tests the WhiteSpaceTokeniser Class.
 * @author lh359
 ************************************/
public class WhiteSpaceTokeniserTest {
	private static ChemistryPOSTagger posTagger; 
	@BeforeClass
	public static void setup(){
		List<Tagger> chemistryTaggers = new ArrayList<Tagger>();
		chemistryTaggers.add(new RegexTagger());
		chemistryTaggers.add(new OscarTagger(new Oscar()));
		chemistryTaggers.add(OpenNLPTagger.getInstance());
		posTagger = new ChemistryPOSTagger(new WhiteSpaceTokeniser(), chemistryTaggers);
	}
	
	@AfterClass
	public static void cleanUp(){
		posTagger = null;
	}
	
	@Test
	public void testWhiteSpaceTokenisation() {
		String sentence = "It was at Mt. xyz station (44\u00b011' N-10\u00b042' E) .";
		String expected = "PRP It VBD was IN at NNP Mt. NN xyz NN station -LRB- ( NN 44\u00b011' JJ-CHEM N-10\u00b042' NNP E -RRB- ) STOP .";
		POSContainer posContainer = posTagger.runTaggers(sentence, DEFAULT_PRIORITISE_OSCAR, DEFAULT_USE_SPECTRA_TAGGER);
        Assert.assertEquals("WhiteSpace Tokenisation result",expected, posContainer.getTokenTagTupleAsString());
	}
	
	@Test
	public void testWhiteSpaceTokenisationWithChemicals() {
		String sentence = "Water samples were collected from Mt. xyz .";
		String expected = "OSCAR-CM Water NNS samples VBD were VB-RECOVER collected IN-FROM from NNP Mt. NNP xyz STOP .";
		POSContainer posContainer = posTagger.runTaggers(sentence,DEFAULT_PRIORITISE_OSCAR, DEFAULT_USE_SPECTRA_TAGGER);
		Assert.assertEquals("WhiteSpace Tokenisation result",expected, posContainer.getTokenTagTupleAsString());
	}


}
