/**
 * Copyright 2012 Lezan Hawizy, David M. Jessop, Daniel Lowe and Peter Murray-Rust
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
import org.junit.Assert;

import org.junit.Test;

/************************************
 * Tests the Utils Class.
 * @author lh359, dmj30, dl387
 ************************************/
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
	
	@Test
	public void testRemoveMarkup(){
        String sentence  = "This is an example that uses <b>bold</b> and <i>italics</i> letters as well as <sub>sub</sub> and <sup>sup</sup>";
        String expected = "This is an example that uses bold and italics letters as well as sub and sup";
        String actual = Utils.cleanHTMLText(sentence);
        System.out.println();
        Assert.assertEquals("Removed markup",expected, actual);

		
	}
}
