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
}
