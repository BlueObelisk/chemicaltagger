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
		posContainer.createPosTagListFromStringArray(posTags);
		List<String> posTagList =posContainer.getPosTagList();
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
		posContainer.setOscarTagList(Arrays.asList(new String[]{"nil", "OSCAR-CM", "OSCAR-ASE","nil"}));
		posContainer.setRegexTagList(Arrays.asList(new String[]{"nil", "NN-TIME", "nil","nil"}));
		posContainer.setPosTagList(Arrays.asList(new String[]{"CC", "NN", "NN","RBR"}));
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
		posContainer.setOscarTagList(Arrays.asList(new String[]{"nil", "OSCAR-CM", "OSCAR-ASE","nil"}));
		posContainer.setRegexTagList(Arrays.asList(new String[]{"nil", "NN-TIME", "nil","nil"}));
		posContainer.setPosTagList(Arrays.asList(new String[]{"CC", "NN", "NN","RBR"}));
		posContainer.combineTaggers();
		List<String> combinedTagList =posContainer.getCombinedTagsList();
		assertEquals(4, combinedTagList.size());
		assertEquals("CC", combinedTagList.get(0));
		assertEquals("NN-TIME", combinedTagList.get(1));
		assertEquals("OSCAR-ASE", combinedTagList.get(2));
		assertEquals("RBR", combinedTagList.get(3));
	}
}
