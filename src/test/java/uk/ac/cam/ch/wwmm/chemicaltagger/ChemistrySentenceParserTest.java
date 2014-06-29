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

import java.io.IOException;
import java.io.InputStream;

import org.junit.Assert;
import nu.xom.Document;

import org.antlr.runtime.tree.Tree;
import org.apache.commons.io.IOUtils;
import org.junit.Test;

/*****************************
 * Passes Tagged Sentences to the antlr chunker. Then checks the output of the
 * AST tree using the checkNodes(astTree) module.
 * 
 * @author lh359, dl387
 *****************************/

public class ChemistrySentenceParserTest {

	@Test
	public void testSentence1() throws IOException {
		String input = Utils.readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/sentenceParserTest/sentence1.txt");

		ChemistrySentenceParser chemChunkParser = new ChemistrySentenceParser(input);
		chemChunkParser.parseTags();
		Tree t = chemChunkParser.getParseTree();
		UtilityMethods.checkForErrorNodes(t);
		UtilityMethods.checkTreeText(t, input);
	}

	@Test
	public void testSentence2() throws IOException {
		String input = Utils.readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/sentenceParserTest/sentence2.txt");
		ChemistrySentenceParser chemChunkParser = new ChemistrySentenceParser(input);
		chemChunkParser.parseTags();
		Tree t = chemChunkParser.getParseTree();
		UtilityMethods.checkForErrorNodes(t);
		UtilityMethods.checkTreeText(t, input);
	}

	@Test
	public void testSentence3() throws IOException {
		String input = Utils.readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/sentenceParserTest/sentence3.txt");
		ChemistrySentenceParser chemChunkParser = new ChemistrySentenceParser(input);
		chemChunkParser.parseTags();
		Tree t = chemChunkParser.getParseTree();
		UtilityMethods.checkForErrorNodes(t);
		UtilityMethods.checkTreeText(t, input);
	}

	@Test
	public void testSentence4() throws IOException {
		String input = Utils.readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/sentenceParserTest/sentence4.txt");
		ChemistrySentenceParser chemChunkParser = new ChemistrySentenceParser(input);
		chemChunkParser.parseTags();
		Tree t = chemChunkParser.getParseTree();
		UtilityMethods.checkForErrorNodes(t);
		UtilityMethods.checkTreeText(t, input);
	}

	@Test
	public void testSentence5() throws IOException {
		String input = Utils.readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/sentenceParserTest/sentence5.txt");
		ChemistrySentenceParser chemChunkParser = new ChemistrySentenceParser(input);
		chemChunkParser.parseTags();
		Tree t = chemChunkParser.getParseTree();
		UtilityMethods.checkForErrorNodes(t);
		UtilityMethods.checkTreeText(t, input);
	}

	@Test
	public void testSentence6() throws IOException {
		String input = Utils.readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/sentenceParserTest/sentence6.txt");
		ChemistrySentenceParser chemChunkParser = new ChemistrySentenceParser(input);
		chemChunkParser.parseTags();
		Tree t = chemChunkParser.getParseTree();
		UtilityMethods.checkForErrorNodes(t);
		UtilityMethods.checkTreeText(t, input);
	}

	@Test
	public void testSentence7() throws IOException {
		String input = Utils.readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/sentenceParserTest/sentence7.txt");
		ChemistrySentenceParser chemChunkParser = new ChemistrySentenceParser(input);
		chemChunkParser.parseTags();
		Tree t = chemChunkParser.getParseTree();
		UtilityMethods.checkForErrorNodes(t);
		UtilityMethods.checkTreeText(t, input);
	}

	@Test
	public void testSentence8() throws IOException {
		String input = Utils.readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/sentenceParserTest/sentence8.txt");
		ChemistrySentenceParser chemChunkParser = new ChemistrySentenceParser(input);
		chemChunkParser.parseTags();
		Tree t = chemChunkParser.getParseTree();
		UtilityMethods.checkForErrorNodes(t);
		UtilityMethods.checkTreeText(t, input);
	}

	@Test
	public void testEmptyInput() {
		InputStream in = IOUtils.toInputStream("");
		ChemistrySentenceParser chemChunkParser = new ChemistrySentenceParser(in);
		chemChunkParser.parseTags();
		Document doc = chemChunkParser.makeXMLDocument();
        Assert.assertEquals("Document should be empty", 0, doc.getRootElement().getChildElements().size());

	}

}
