package uk.ac.cam.ch.wwmm.chemicaltagger;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

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
	
	
	@Test
	public void tagText1() {
		String text = "the cat sat on the mat";
		String [] tags = OpenNLPTagger.getInstance().getTagger().tag(text.split("\\s"));
		assertEquals(6, tags.length);
//		DT NN VBD IN DT NN
		String [] expectedTags = new String[] {"DT", "NN", "VBD", "IN", "DT", "NN"};
		for (int i = 0; i < tags.length; i++) {
			assertEquals(expectedTags[i], tags[i]);
		}
	}
	
	@Test
	public void tagText2() {
		String text = "time flies like an arrow";
		String [] tags = OpenNLPTagger.getInstance().getTagger().tag(text.split("\\s"));
		assertEquals(5, tags.length);
		String [] expectedTags = new String[] {"NN", "VBZ", "IN", "DT",	"NN"};	
		for (int i = 0; i < tags.length; i++) {
			assertEquals(expectedTags[i], tags[i]);
		}
	}
	
	@Test
	public void tagText3() {
		String text = "fruit flies love a banana";
		String [] tags = OpenNLPTagger.getInstance().getTagger().tag(text.split("\\s"));
		assertEquals(5, tags.length);
		String [] expectedTags = new String[] {"NN", "NNS", "VBP", "DT",	"NN"};	
		for (int i = 0; i < tags.length; i++) {
			assertEquals(expectedTags[i], tags[i]);
		}
	}
	

}
