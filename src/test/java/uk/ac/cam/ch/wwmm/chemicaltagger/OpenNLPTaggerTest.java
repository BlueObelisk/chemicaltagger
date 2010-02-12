package uk.ac.cam.ch.wwmm.chemicaltagger;

import static org.junit.Assert.*;

import org.junit.Test;

public class OpenNLPTaggerTest {

	@Test
	public void setUpOk() {
		OpenNLPTagger tagger = OpenNLPTagger.getInstance();
		assertNotNull(tagger.getTagger());
		
	}
	
	
	@Test
	public void tagText() {
		String text = "the quick brown fox climbs over the lazy dog";
		//jumps and leaps are tagged as NNS(!)
		String [] tags = OpenNLPTagger.getInstance().getTagger().tag(text.split("\\s"));
		assertEquals(9, tags.length);
//		DT JJ JJ NN VBZ IN DT JJ NN
		String [] expectedTags = new String[] {"DT", "JJ", "JJ", "NN", "VBZ", "IN", "DT", "JJ", "NN"};
		for (int i = 0; i < tags.length; i++) {
			assertEquals(expectedTags[i], tags[i]);
		}
	}
}
