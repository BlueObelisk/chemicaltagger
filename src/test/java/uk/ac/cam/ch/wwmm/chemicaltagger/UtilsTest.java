package uk.ac.cam.ch.wwmm.chemicaltagger;

import static junit.framework.Assert.assertEquals;

import org.junit.Test;


public class UtilsTest {

	@Test
	public void readSentence() {
		String actual = Utils.readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/utilsTest/simple.txt"); 
		String expected = "The quick brown fox jumps over the lazy dog";
		assertEquals(expected, actual);
	}
	
	@Test
	public void utf8Encoding() {
		String string = Utils.readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/utilsTest/utf-8.txt");
		assertEquals(2, string.length());
	}
}
