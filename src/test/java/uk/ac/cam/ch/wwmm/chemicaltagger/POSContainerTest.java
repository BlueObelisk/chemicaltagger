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

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

/************************************
 * Tests the POS Container Class.
 * This class acts as container for the results from the taggers
 * but also deals with merging the tagger outputs
 * @author dl387
 ************************************/
public class POSContainerTest {

	@Test
	public void testCreatePosTagListFromStringArray() {
		POSContainer posContainer = new POSContainer();
		String[] posTags = new String[]{"#","NNP",":", "PRP$",",", "VBD", "", "VBG", "."};
		posContainer.registerTagList(OpenNLPTagger.getInstance().createPosTagListFromStringArray(posTags));
		List<String> posTagList =posContainer.getTagListContainer().get(0);
		assertEquals(9, posTagList.size());
		assertEquals("NN", posTagList.get(0));
		assertEquals("NNP", posTagList.get(1));
		assertEquals("COLON", posTagList.get(2));
		assertEquals("PRP$", posTagList.get(3));
		assertEquals("COMMA", posTagList.get(4));
		assertEquals("VBD", posTagList.get(5));
		assertEquals("NN", posTagList.get(6));
		assertEquals("VBG", posTagList.get(7));
		assertEquals("STOP", posTagList.get(8));
	}
	
	@Test
	public void testCombineTaggersPrioritiseOscar() {
		POSContainer posContainer = new POSContainer();
		posContainer.setPrioritiseOscar(true);
		posContainer.registerTagList(Arrays.asList(new String[]{"nil", "OSCAR-CM", "OSCAR-ASE","nil"}));
		posContainer.registerTagList(Arrays.asList(new String[]{"nil", "NN-TIME", "nil","nil"}));
		posContainer.registerTagList(Arrays.asList(new String[]{"CC", "NN", "NN","RBR"}));
		posContainer.combineTaggers();
		List<String> combinedTagList =posContainer.getCombinedTagsList();
		assertEquals(4, combinedTagList.size());
		assertEquals("CC", combinedTagList.get(0));
		assertEquals("OSCAR-CM", combinedTagList.get(1));
		assertEquals("OSCAR-ASE", combinedTagList.get(2));
		assertEquals("RBR", combinedTagList.get(3));
	}
	
	@Test
	public void testCombineTaggersDontPrioritiseOscar() {
		POSContainer posContainer = new POSContainer();
		posContainer.setPrioritiseOscar(false);
		posContainer.registerTagList(Arrays.asList(new String[]{"nil", "NN-TIME", "nil","nil"}));
		posContainer.registerTagList(Arrays.asList(new String[]{"nil", "OSCAR-CM", "OSCAR-ASE","nil"}));
		posContainer.registerTagList(Arrays.asList(new String[]{"CC", "NN", "NN","RBR"}));
		posContainer.combineTaggers();
		List<String> combinedTagList =posContainer.getCombinedTagsList();
		assertEquals(4, combinedTagList.size());
		assertEquals("CC", combinedTagList.get(0));
		assertEquals("NN-TIME", combinedTagList.get(1));
		assertEquals("OSCAR-ASE", combinedTagList.get(2));
		assertEquals("RBR", combinedTagList.get(3));
	}
}
