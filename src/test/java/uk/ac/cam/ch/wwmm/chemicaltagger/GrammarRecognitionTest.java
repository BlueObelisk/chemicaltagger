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

import nu.xom.Document;
import nu.xom.Elements;

import static org.junit.Assert.*;
import org.junit.Test;

public class GrammarRecognitionTest {
	@Test
	public void unnamedMoleculeD1() {
		ChemistrySentenceParser sentenceParser =  new ChemistrySentenceParser("JJ-COMPOUND title NN-CHEMENTITY compound");
		sentenceParser.parseTags();
		Document doc = sentenceParser.makeXMLDocument();
		assertEquals("Exactly one sentence was expected", true, hasOneSentence(doc));
		assertEquals("An unnamedMolecule child was expected", true, hasOneUnnamedMoleculeInNounPhrase(doc));
	}
	
	@Test
	public void unnamedMoleculeD2() {
		ChemistrySentenceParser sentenceParser =  new ChemistrySentenceParser("CD 50 NN-MASS g IN-OF of JJ-COMPOUND resultant NN-CHEMENTITY compound");
		sentenceParser.parseTags();
		Document doc = sentenceParser.makeXMLDocument();
		assertEquals("Exactly one sentence was expected", true, hasOneSentence(doc));
		assertEquals("An unnamedMolecule child was expected", true, hasOneUnnamedMoleculeInNounPhrase(doc));
	}
	
	@Test
	public void unnamedMoleculeD3() {
		ChemistrySentenceParser sentenceParser =  new ChemistrySentenceParser("CD 50 NN-MASS g JJ-COMPOUND title NN-CHEMENTITY compound");
		sentenceParser.parseTags();
		Document doc = sentenceParser.makeXMLDocument();
		assertEquals("Exactly one sentence was expected", true, hasOneSentence(doc));
		assertEquals("An unnamedMolecule child was expected", true, hasOneUnnamedMoleculeInNounPhrase(doc));
	}
	
	@Test
	public void unnamedMoleculeD4() {
		ChemistrySentenceParser sentenceParser =  new ChemistrySentenceParser("JJ-COMPOUND title NN-CHEMENTITY compound -LRB- ( CD 50 NN-MASS g -RRB- )");
		sentenceParser.parseTags();
		Document doc = sentenceParser.makeXMLDocument();
		assertEquals("Exactly one sentence was expected", true, hasOneSentence(doc));
		assertEquals("An unnamedMolecule child was expected", true, hasOneUnnamedMoleculeInNounPhrase(doc));
	}
	
	@Test
	public void unnamedMoleculeD5() {
		ChemistrySentenceParser sentenceParser =  new ChemistrySentenceParser("JJ-COMPOUND title NN-CHEMENTITY compound IN-AS as DT a JJ red NN-STATE crystal");
		sentenceParser.parseTags();
		Document doc = sentenceParser.makeXMLDocument();
		assertEquals("Exactly one sentence was expected", true, hasOneSentence(doc));
		assertEquals("An unnamedMolecule child was expected", true, hasOneUnnamedMoleculeInNounPhrase(doc));
	}
	
	@Test
	public void unnamedMoleculeD6() {
		ChemistrySentenceParser sentenceParser =  new ChemistrySentenceParser("JJ-COMPOUND title NN-CHEMENTITY compound IN-AS as DT a JJ black NN-STATE oil -LRB- ( CD 50 NN-MASS g -RRB- )");
		sentenceParser.parseTags();
		Document doc = sentenceParser.makeXMLDocument();
		assertEquals("Exactly one sentence was expected", true, hasOneSentence(doc));
		assertEquals("An unnamedMolecule child was expected", true, hasOneUnnamedMoleculeInNounPhrase(doc));
	}

	@Test
	public void unnamedMoleculeD7() {
		ChemistrySentenceParser sentenceParser =  new ChemistrySentenceParser("CD 500 NN-VOL ml IN-OF of JJ-COMPOUND title NN-CHEMENTITY compound -LRB- ( CD 5 NN-MOLAR M -RRB- )");
		sentenceParser.parseTags();
		Document doc = sentenceParser.makeXMLDocument();
		assertEquals("Exactly one sentence was expected", true, hasOneSentence(doc));
		assertEquals("An unnamedMolecule child was expected", true, hasOneUnnamedMoleculeInNounPhrase(doc));
	}
	
	@Test
	public void unnamedMoleculeD8() {
		ChemistrySentenceParser sentenceParser =  new ChemistrySentenceParser("JJ-COMPOUND title NN-CHEMENTITY compound CD-ALPHANUM 7a IN-AS as DT a JJ red NN-STATE oil -LRB- ( CD 50 NN-MASS g -RRB- ) IN-FROM from NN-EXAMPLE example CD 7");
		sentenceParser.parseTags();
		Document doc = sentenceParser.makeXMLDocument();
		assertEquals("Exactly one sentence was expected", true, hasOneSentence(doc));
		assertEquals("An unnamedMolecule child was expected", true, hasOneUnnamedMoleculeInNounPhrase(doc));
	}
	
	@Test
	public void unnamedMoleculeD9() {
		ChemistrySentenceParser sentenceParser =  new ChemistrySentenceParser("CD-ALPHANUM 3a -LRB- ( CD 50 NN-MASS g -RRB- ) IN-AS as DT a JJ black NN-STATE oil");
		sentenceParser.parseTags();
		Document doc = sentenceParser.makeXMLDocument();
		assertEquals("Exactly one sentence was expected", true, hasOneSentence(doc));
		assertEquals("An unnamedMolecule child was expected", true, hasOneUnnamedMoleculeInNounPhrase(doc));
	}
	
	@Test
	public void unnamedMoleculeD10() {
		ChemistrySentenceParser sentenceParser =  new ChemistrySentenceParser("NN-CHEMENTITY Compound CD 3");
		sentenceParser.parseTags();
		Document doc = sentenceParser.makeXMLDocument();
		assertEquals("Exactly one sentence was expected", true, hasOneSentence(doc));
		assertEquals("An unnamedMolecule child was expected", true, hasOneUnnamedMoleculeInNounPhrase(doc));
	}
	
	@Test
	public void unnamedMoleculeD11() {
		ChemistrySentenceParser sentenceParser =  new ChemistrySentenceParser("NN-CHEMENTITY Compound CD-ALPHANUM 3a");
		sentenceParser.parseTags();
		Document doc = sentenceParser.makeXMLDocument();
		assertEquals("Exactly one sentence was expected", true, hasOneSentence(doc));
		assertEquals("An unnamedMolecule child was expected", true, hasOneUnnamedMoleculeInNounPhrase(doc));
	}
	
	@Test
	public void unnamedMoleculeD12() {
		ChemistrySentenceParser sentenceParser =  new ChemistrySentenceParser("CD-ALPHANUM 3a");
		sentenceParser.parseTags();
		Document doc = sentenceParser.makeXMLDocument();
		assertEquals("Exactly one sentence was expected", true, hasOneSentence(doc));
		assertEquals("An unnamedMolecule child was expected", true, hasOneUnnamedMoleculeInNounPhrase(doc));
	}
	
	@Test
	public void unnamedMoleculeD13() {
		ChemistrySentenceParser sentenceParser =  new ChemistrySentenceParser("CD 500 NN-VOL ml IN-OF of DT-THE the JJ-COMPOUND title NN-CHEMENTITY compound CD-ALPHANUM 7a IN-AS as DT a JJ red NN-STATE oil");
		sentenceParser.parseTags();
		Document doc = sentenceParser.makeXMLDocument();
		assertEquals("Exactly one sentence was expected", true, hasOneSentence(doc));
		assertEquals("An unnamedMolecule child was expected", true, hasOneUnnamedMoleculeInNounPhrase(doc));
	}
	
	//potential unnamed molecules made clear by surrounding context

	@Test
	public void unnamedMoleculeP1() {
		ChemistrySentenceParser sentenceParser =  new ChemistrySentenceParser("CD 50 NN-MASS g IN-OF of CD 5");
		sentenceParser.parseTags();
		Document doc = sentenceParser.makeXMLDocument();
		assertEquals("Exactly one sentence was expected", true, hasOneSentence(doc));
		assertEquals("An unnamedMolecule child was expected", true, hasOneUnnamedMoleculeInNounPhrase(doc));
	}
	
	@Test
	public void unnamedMoleculeP2() {
		ChemistrySentenceParser sentenceParser =  new ChemistrySentenceParser("CD 50 NN-MASS g CD 5");//not certain whether this should be recognised
		sentenceParser.parseTags();
		Document doc = sentenceParser.makeXMLDocument();
		assertEquals("Exactly one sentence was expected", true, hasOneSentence(doc));
		assertEquals("An unnamedMolecule child was not expected", true, hasOneUnnamedMoleculeInNounPhrase(doc));
	}
	
	@Test
	public void unnamedMoleculeP3() {
		ChemistrySentenceParser sentenceParser =  new ChemistrySentenceParser("CD 50 NN-MASS g IN-OF of CD 5");
		sentenceParser.parseTags();
		Document doc = sentenceParser.makeXMLDocument();
		assertEquals("Exactly one sentence was expected", true, hasOneSentence(doc));
		assertEquals("An unnamedMolecule child was not expected", true, hasOneUnnamedMoleculeInNounPhrase(doc));
	}
	
	@Test
	public void unnamedMoleculeP4() {
		ChemistrySentenceParser sentenceParser =  new ChemistrySentenceParser("CD 50 NN-MASS g IN-OF of DT-THE the NN-STATE oil");
		sentenceParser.parseTags();
		Document doc = sentenceParser.makeXMLDocument();
		assertEquals("Exactly one sentence was expected", true, hasOneSentence(doc));
		assertEquals("An unnamedMolecule child was expected", true, hasOneUnnamedMoleculeInNounPhrase(doc));
	}
	
	@Test
	public void unnamedMoleculeP5() {
		ChemistrySentenceParser sentenceParser =  new ChemistrySentenceParser("CD 50 NN-MASS g IN-OF of DT-THE the NN-STATE oil CD 50 NN-MASS g IN-FROM from NN-EXAMPLE example CD 3");
		sentenceParser.parseTags();
		Document doc = sentenceParser.makeXMLDocument();
		assertEquals("Exactly one sentence was expected", true, hasOneSentence(doc));
		assertEquals("An unnamedMolecule child was expected", true, hasOneUnnamedMoleculeInNounPhrase(doc));
	}
	
	@Test
	public void unnamedMoleculeP6() {
		ChemistrySentenceParser sentenceParser =  new ChemistrySentenceParser("CD 50 NN-MASS g IN-OF of DT-THE the NN-STATE oil -LRB- ( CD-ALPHANUM 5a -RRB- )");
		sentenceParser.parseTags();
		Document doc = sentenceParser.makeXMLDocument();
		assertEquals("Exactly one sentence was expected", true, hasOneSentence(doc));
		assertEquals("An unnamedMolecule child was expected", true, hasOneUnnamedMoleculeInNounPhrase(doc));
	}
	
	@Test
	public void unnamedMoleculeP7() {
		ChemistrySentenceParser sentenceParser =  new ChemistrySentenceParser("CD 3 -LRB- ( CD 50 NN-MASS g -RRB- ) ");
		sentenceParser.parseTags();
		Document doc = sentenceParser.makeXMLDocument();
		assertEquals("Exactly one sentence was expected", true, hasOneSentence(doc));
		assertEquals("An unnamedMolecule child was expected", true, hasOneUnnamedMoleculeInNounPhrase(doc));
	}
	
	@Test
	public void unnamedMoleculeP8() {
		ChemistrySentenceParser sentenceParser =  new ChemistrySentenceParser("CD 5 IN-AS as DT an JJ-CHEM off-white NN-STATE solid ");
		sentenceParser.parseTags();
		Document doc = sentenceParser.makeXMLDocument();
		assertEquals("Exactly one sentence was expected", true, hasOneSentence(doc));
		assertEquals("An unnamedMolecule child was expected", true, hasOneUnnamedMoleculeInNounPhrase(doc));
	}
	
	@Test
	public void unnamedMoleculeP9() {
		ChemistrySentenceParser sentenceParser =  new ChemistrySentenceParser("NN-CHEMENTITY product IN-OF of NN-EXAMPLE example CD 5");
		sentenceParser.parseTags();
		Document doc = sentenceParser.makeXMLDocument();
		assertEquals("Exactly one sentence was expected", true, hasOneSentence(doc));
		assertEquals("An unnamedMolecule child was expected", true, hasOneUnnamedMoleculeInNounPhrase(doc));
	}
	
	@Test
	public void unnamedMoleculeP10() {
		ChemistrySentenceParser sentenceParser =  new ChemistrySentenceParser("NN-STATE oil IN-FROM from NN-EXAMPLE example CD 5");
		sentenceParser.parseTags();
		Document doc = sentenceParser.makeXMLDocument();
		assertEquals("Exactly one sentence was expected", true, hasOneSentence(doc));
		assertEquals("An unnamedMolecule child was expected", true, hasOneUnnamedMoleculeInNounPhrase(doc));
	}
	
	@Test
	public void molecule1() {
		ChemistrySentenceParser sentenceParser =  new ChemistrySentenceParser("OSCAR-CM benzene");
		sentenceParser.parseTags();
		Document doc = sentenceParser.makeXMLDocument();
		System.out.println(doc.toXML());
		assertEquals("Exactly one sentence was expected", true, hasOneSentence(doc));
		assertEquals("A molecule child was expected", true, hasOneMoleculeInNounPhrase(doc));
	}
	
	@Test
	public void molecule2() {
		ChemistrySentenceParser sentenceParser =  new ChemistrySentenceParser("CD 50 NN-VOL ml OSCAR-CM benzene");
		sentenceParser.parseTags();
		Document doc = sentenceParser.makeXMLDocument();
		assertEquals("Exactly one sentence was expected", true, hasOneSentence(doc));
		assertEquals("A molecule child was expected", true, hasOneMoleculeInNounPhrase(doc));
	}
	
	@Test
	public void molecule3() {
		ChemistrySentenceParser sentenceParser =  new ChemistrySentenceParser("CD 50 NN-VOL ml IN-OF of OSCAR-CM benzene");
		sentenceParser.parseTags();
		Document doc = sentenceParser.makeXMLDocument();
		assertEquals("Exactly one sentence was expected", true, hasOneSentence(doc));
		assertEquals("A molecule child was expected", true, hasOneMoleculeInNounPhrase(doc));
	}
	
	@Test
	public void molecule4() {
		ChemistrySentenceParser sentenceParser =  new ChemistrySentenceParser("CD 50 NN-MASS g IN-OF of DT an OSCAR-CM oxime");
		sentenceParser.parseTags();
		Document doc = sentenceParser.makeXMLDocument();
		assertEquals("Exactly one sentence was expected", true, hasOneSentence(doc));
		assertEquals("A molecule child was expected", true, hasOneMoleculeInNounPhrase(doc));
	}
	
	@Test
	public void molecule5() {
		ChemistrySentenceParser sentenceParser =  new ChemistrySentenceParser("CD 50 NN-VOL ml IN-OF of DT-THE the OSCAR-CM hydroiodide");
		sentenceParser.parseTags();
		Document doc = sentenceParser.makeXMLDocument();
		assertEquals("Exactly one sentence was expected", true, hasOneSentence(doc));
		assertEquals("A molecule child was expected", true, hasOneMoleculeInNounPhrase(doc));
	}
	
	@Test
	public void molecule6() {
		ChemistrySentenceParser sentenceParser =  new ChemistrySentenceParser("CD 50 NN-VOL ml IN-OF of CD 1 COLON : CD 1 OSCAR-CM octanol DASH / OSCAR-CM water");
		sentenceParser.parseTags();
		Document doc = sentenceParser.makeXMLDocument();
		assertEquals("Exactly one sentence was expected", true, hasOneSentence(doc));
		assertEquals("A molecule child was expected", true, hasOneMoleculeInNounPhrase(doc));
	}
	
	@Test
	public void molecule7() {
		ChemistrySentenceParser sentenceParser =  new ChemistrySentenceParser("-LRB- ( CD 30 NN-VOL ml COMMA , CD 5 NN-AMOUNT mmol -RRB- ) OSCAR-CM 2-methylpropane");
		sentenceParser.parseTags();
		Document doc = sentenceParser.makeXMLDocument();
		assertEquals("Exactly one sentence was expected", true, hasOneSentence(doc));
		assertEquals("A molecule child was expected", true, hasOneMoleculeInNounPhrase(doc));
	}
	
	@Test
	public void molecule8() {
		ChemistrySentenceParser sentenceParser =  new ChemistrySentenceParser("OSCAR-CM benzene -LRB- ( CD 5 -RRB- )");
		sentenceParser.parseTags();
		Document doc = sentenceParser.makeXMLDocument();
		assertEquals("Exactly one sentence was expected", true, hasOneSentence(doc));
		assertEquals("A molecule child was expected", true, hasOneMoleculeInNounPhrase(doc));
	}
	
	@Test
	public void molecule9() {
		ChemistrySentenceParser sentenceParser =  new ChemistrySentenceParser("OSCAR-CM benzene CD 5");
		sentenceParser.parseTags();
		Document doc = sentenceParser.makeXMLDocument();
		assertEquals("Exactly one sentence was expected", true, hasOneSentence(doc));
		assertEquals("A molecule child was expected", true, hasOneMoleculeInNounPhrase(doc));
	}
	
	@Test
	public void molecule10() {
		ChemistrySentenceParser sentenceParser =  new ChemistrySentenceParser("OSCAR-CM benzene -LRB- ( NNP Sigma NNP Aldrich -RRB- )");
		sentenceParser.parseTags();
		Document doc = sentenceParser.makeXMLDocument();
		assertEquals("Exactly one sentence was expected", true, hasOneSentence(doc));
		assertEquals("A molecule child was expected", true, hasOneMoleculeInNounPhrase(doc));
	}
	
	@Test
	public void molecule11() {
		ChemistrySentenceParser sentenceParser =  new ChemistrySentenceParser("OSCAR-CM benzene -LRB- ( CD 50 NN-AMOUNT mmol -RRB- )");
		sentenceParser.parseTags();
		Document doc = sentenceParser.makeXMLDocument();
		assertEquals("Exactly one sentence was expected", true, hasOneSentence(doc));
		assertEquals("A molecule child was expected", true, hasOneMoleculeInNounPhrase(doc));
	}
	
	@Test
	public void molecule12() {
		ChemistrySentenceParser sentenceParser =  new ChemistrySentenceParser("OSCAR-CM benzene -LRB- ( CD 20 NN-MASS kg COMMA , CD 93 NN-PERCENT % NN-YIELD yield -RRB- )");
		sentenceParser.parseTags();
		Document doc = sentenceParser.makeXMLDocument();
		assertEquals("Exactly one sentence was expected", true, hasOneSentence(doc));
		assertEquals("A molecule child was expected", true, hasOneMoleculeInNounPhrase(doc));
	}
	
	@Test
	public void molecule13() {
		ChemistrySentenceParser sentenceParser =  new ChemistrySentenceParser("OSCAR-CM benzene IN-FROM from NN-EXAMPLE example CD 3");
		sentenceParser.parseTags();
		Document doc = sentenceParser.makeXMLDocument();
		assertEquals("Exactly one sentence was expected", true, hasOneSentence(doc));
		assertEquals("A molecule child was expected", true, hasOneMoleculeInNounPhrase(doc));
	}

	@Test
	public void molecule14() {
		ChemistrySentenceParser sentenceParser =  new ChemistrySentenceParser("OSCAR-CM benzene IN-FROM from NN-METHOD method CD-ALPHANUM 2b -LRB- ( CD 3.7 NN-MASS g -RRB- )");
		sentenceParser.parseTags();
		Document doc = sentenceParser.makeXMLDocument();
		assertEquals("Exactly one sentence was expected", true, hasOneSentence(doc));
		assertEquals("A molecule child was expected", true, hasOneMoleculeInNounPhrase(doc));
	}
	
	@Test
	public void molecule15() {
		ChemistrySentenceParser sentenceParser =  new ChemistrySentenceParser("OSCAR-CM tin NN-STATE powder -LRB- ( CD 50 NN-MASS g -RRB- )");
		sentenceParser.parseTags();
		Document doc = sentenceParser.makeXMLDocument();
		assertEquals("Exactly one sentence was expected", true, hasOneSentence(doc));
		assertEquals("A molecule child was expected", true, hasOneMoleculeInNounPhrase(doc));
	}
	
	@Test
	public void molecule16() {
		ChemistrySentenceParser sentenceParser =  new ChemistrySentenceParser("OSCAR-CM benzene -LRB- ( CD 30 NN-AMOUNT mmol -RRB- ) COMMA , -LRB- ( CD 35 NN-PERCENT % NN-YIELD yield -RRB- )");
		sentenceParser.parseTags();
		Document doc = sentenceParser.makeXMLDocument();
		assertEquals("Exactly one sentence was expected", true, hasOneSentence(doc));
		assertEquals("A molecule child was expected", true, hasOneMoleculeInNounPhrase(doc));
	}
	
	@Test
	public void molecule17() {
		ChemistrySentenceParser sentenceParser =  new ChemistrySentenceParser("CD -200 NN-VOL ml IN-OF of JJ-CHEM anhydrous OSCAR-CM ether");
		sentenceParser.parseTags();
		Document doc = sentenceParser.makeXMLDocument();
		assertEquals("Exactly one sentence was expected", true, hasOneSentence(doc));
		assertEquals("A molecule child was expected", true, hasOneMoleculeInNounPhrase(doc));
	}

	private boolean hasOneSentence(Document doc) {
		Elements children = doc.getRootElement().getChildElements();
		if (children.size() !=1 ){
			return false;
		}
		if (!children.get(0).getLocalName().equals("Sentence")){
			return false;
		}
		return true;
	}
	
	private boolean hasOneUnnamedMoleculeInNounPhrase(Document doc) {
		Elements phrases = doc.getRootElement().getChildElements().get(0).getChildElements();
		if (phrases.size() !=1 ){
			return false;
		}
		if (!phrases.get(0).getLocalName().equals("NounPhrase")){
			return false;
		}
		Elements els = phrases.get(0).getChildElements();
		if (els.size() !=1 ){
			return false;
		}
		if (!els.get(0).getLocalName().equals("UNNAMEDMOLECULE")){
			return false;
		}
		return true;
	}
	
	private boolean hasOneMoleculeInNounPhrase(Document doc) {
		Elements phrases = doc.getRootElement().getChildElements().get(0).getChildElements();
		if (phrases.size() !=1 ){
			return false;
		}
		if (!phrases.get(0).getLocalName().equals("NounPhrase")){
			return false;
		}
		Elements els = phrases.get(0).getChildElements();
		if (els.size() !=1 ){
			return false;
		}
		if (!els.get(0).getLocalName().equals("MOLECULE")){
			return false;
		}
		return true;
	}
}
