package uk.ac.cam.ch.wwmm.chemicaltagger;

import static uk.ac.cam.ch.wwmm.chemicaltagger.Utils.readSentence;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class RegexTaggerTest {
	
	
    private RegexTagger regexTagger;
	private final static String SPACE = " ";
	@Before
	public void setUp() {
		if (regexTagger == null) {
			regexTagger = new RegexTagger();
		}
	}
	
	@Test
	public void sentence1() {
		String sentence = readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/regexTest/sentence1.txt");
        String regexTaggedSentence = regexTag(sentence);
		String ref = readSentence("uk/ac/cam/ch/wwmm/chemicaltagger/regexTest/ref1.txt");
		Assert.assertEquals(ref,regexTaggedSentence);


	}
	
	private String regexTag(String sentence) {
		StringBuilder regexTaggedSentence = new StringBuilder(); 
        String cleanSentence = Formatter.normaliseText(sentence);
        POSContainer posContainer = new POSContainer();
        posContainer.createWordTokenListFromSentence(cleanSentence);
        posContainer = regexTagger.runTagger(posContainer);
        
        /****************************
         * Check that lengths of 
         * token and tags are the same
         ****************************/
        Assert.assertEquals(posContainer.getWordTokenList().size(), posContainer.getRegexTagList().size());
        
        /************************
         * Append the tokens recoginesed
         * by the regexTagger to regexTaggedSentence
         ***********************/
        
		for (int i = 0; i < posContainer.getRegexTagList().size(); i++) {
			if (!posContainer.getRegexTagList().get(i).getPOS().equals("nil")){
				regexTaggedSentence.append(posContainer.getRegexTagList().get(i).getPOS());
				regexTaggedSentence.append(SPACE);
				regexTaggedSentence.append(posContainer.getWordTokenList().get(i));
				regexTaggedSentence.append(SPACE);

			}
			
		}
        
		return regexTaggedSentence.toString().trim();
	}


}
