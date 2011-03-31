package uk.ac.cam.ch.wwmm.chemicaltagger;

import java.io.IOException;
import java.io.InputStream;

import junit.framework.Assert;
import nu.xom.Builder;
import nu.xom.Document;
import nu.xom.Element;
import nu.xom.Nodes;
import nu.xom.ParsingException;
import nu.xom.ValidityException;

import org.junit.Test;


/************************************
 * Tests the PostProcessingTrees Class.
 * @author lh359
 ************************************/
public class PostProcessTreesTest {
	

	@Test
	public void testProcessACTAFile() throws ValidityException, ParsingException, IOException{
		PostProcessTrees postProcess = new PostProcessTrees();
		InputStream xmlStream = Utils.getInputStream(getClass(),"/uk/ac/cam/ch/wwmm/chemicaltagger/postProcessTrees/ACTA-f-00fc0883.xml");
		Document doc = new Builder().build(xmlStream);
		Document newDoc = postProcess.process(doc);
		
        Assert.assertEquals(doc.getValue(), newDoc.getValue());
		
	}
	
	@Test
	public void testProcessParagraph() throws ValidityException, ParsingException, IOException{
		PostProcessTrees postProcess = new PostProcessTrees();
		InputStream xmlStream = Utils.getInputStream(getClass(),"/uk/ac/cam/ch/wwmm/chemicaltagger/postProcessTrees/file5.xml");
		Document doc = new Builder().build(xmlStream);
		Document newDoc = postProcess.process(doc);
        Assert.assertEquals(doc.getValue(), newDoc.getValue());

	}
	@Test
	public void purifyPatternTest(){
		
		String sentence = "the mixture was purified by column chromatography (hexane/AcOEt, 7/3) and added to the solution.";
		Document doc = Utils.runChemicalTagger(sentence);
		Nodes solvents = doc.query(".//MOLECULE[@role='Solvent']");
		Assert.assertEquals(2,solvents.size());
	}
	
	@Test
	public void rolePrepPhraseTest(){
		String sentence = "the mixture was purified using hexane as an eluent";
		Document doc = Utils.runChemicalTagger(sentence);
		Nodes roles = doc.query(".//MOLECULE[@role='Solvent']");
		Assert.assertEquals(1,roles.size());
	}
	
	
	@Test
	public void testActionPhraseWithNoVerbPhrase(){
		String sentence = "Purification by flash chromatography (Isco CombiFlash) (0-20% heptane/EtOAc) yielded 4-(4-chlorobenzyl)thiophene-2-carbaldehyde: 835 mg, 28% yield.";
		Document doc = Utils.runChemicalTagger(sentence);
		Assert.assertEquals(1,doc.query(".//ActionPhrase[@type='Purify']").size());//has NN-PURIFY instead of VB-PURIFY
		Assert.assertEquals(1,doc.query(".//ActionPhrase[@type='Yield']").size());
	}

	@Test
	public void testNNExamplePrecludingActionPhrase(){
		String sentence = "An example of the synthesis of foo is as follows.";
		Document doc = Utils.runChemicalTagger(sentence);
		Assert.assertEquals(0,doc.query(".//ActionPhrase").size());
	}
	
	@Test
	public void testCommaNotIncludedInActionPhrases(){
		String sentence = "Something was synthesised, then something was added.";
		Document doc = Utils.runChemicalTagger(sentence);
		Nodes children = doc.query("//Sentence/*");
		Assert.assertEquals(5,children.size());
		for (int i = 0; i < children.size(); i++) {
			if (i==0){
				Assert.assertEquals("ActionPhrase",((Element)children.get(i)).getLocalName());
			}
			else if (i==1){
				Assert.assertEquals("COMMA",((Element)children.get(i)).getLocalName());
			}
			else if (i==2){
				Assert.assertEquals("RB-CONJ",((Element)children.get(i)).getLocalName());
			}
			else if (i==3){
				Assert.assertEquals("ActionPhrase",((Element)children.get(i)).getLocalName());
			}
			else if (i==4){
				Assert.assertEquals("STOP",((Element)children.get(i)).getLocalName());
			}
		}
	}
	
	//Time phrase and multiple apparatus have special treatment
	@Test
	public void testTimeActionPhrase1(){
		String sentence = "The chemical reaction took 5 minutes.";
		Document doc = Utils.runChemicalTagger(sentence);
		Assert.assertEquals(1,doc.query(".//ActionPhrase[@type='Wait']").size());
	}
	
	@Test
	public void testTimeActionPhrase2(){//Wait action phrase should end at the comma
		String sentence = "After 5 minutes, something happened";
		Document doc = Utils.runChemicalTagger(sentence);
		Assert.assertEquals(1,doc.query(".//ActionPhrase[@type='Wait'][following-sibling::*[1][local-name()='COMMA']]").size());
	}

	@Test
	public void testApparatusAction(){
		String sentence = "ethylene and 4-fluoroanisole as an internal standard were placed in a Teflon sealed tube.";
		Document doc = Utils.runChemicalTagger(sentence);
		Nodes actionPhraseNode = doc.query(".//ActionPhrase[@type='ApparatusAction']");
		Assert.assertEquals(1, actionPhraseNode.size());
		Assert.assertEquals(1, actionPhraseNode.get(0).query(".//NN-APPARATUS[text()='tube']").size());
	}
	@Test
	public void testApparatusAction2(){
		String sentence = "The chemical reaction was performed in a conical flask.";
		Document doc = Utils.runChemicalTagger(sentence);
		Assert.assertEquals(1,doc.query(".//ActionPhrase[@type='ApparatusAction']").size());
	}

}
