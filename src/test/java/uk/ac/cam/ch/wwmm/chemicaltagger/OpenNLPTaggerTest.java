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
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

/************************************
 * Tests the OpenNLP Class.
 * @author dmj30
 *
 ***********************************/
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
