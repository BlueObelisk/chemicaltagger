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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

import uk.ac.cam.ch.wwmm.oscar.document.Token;

/*****************************************************
 * Runs the regular expression tagger .
 * 
 * @author lh359, dl387, pm286
 *****************************************************/
public class RegexTagger implements Tagger{

	private List<Rule> rules;
    private String tagFilePath = "/uk/ac/cam/ch/wwmm/chemicaltagger/regexTagger/regexTags.txt";
	private static Logger LOG = Logger.getLogger(RegexTagger.class);
    private List<String> ignoredTags;

	/****************************
	 * Public Constructor.
	 ***************************/
	public RegexTagger() {
		ignoredTags = new ArrayList<String>();
		initializeRules();
	}

	/**********************
	 * Public Constructor.
	 * Sets a tagFile.
	 * @param tagFile (String)
	 */
	public RegexTagger(String tagFile) {
		this.tagFilePath = tagFile;
	}

	/**************************************
	 * Getter method for rules.
	 * @return rules (List<Rule>)
	 ***************************************/
	public List<Rule> getRules() {
		return rules;
	}

	/**************************************
	 * Setter method for rules.
	 * @param rules (List<Rule>)
	 ***************************************/
	public void setRules(List<Rule> rules) {
		this.rules = rules;
	}

	
	/**************************************************************
	 * Initialises the rules for the regular expression tagger.
	 ***************************************************************/
	protected void initializeRules() {
		rules = new ArrayList<Rule>();
		String line;
		try {

			InputStream is = Utils.getInputStream(getClass(), tagFilePath);
			BufferedReader in = new BufferedReader(new InputStreamReader(is,
					Charset.forName("UTF-8")));

			if (!in.ready()) {
				throw new IOException();
			}

			while ((line = in.readLine()) != null) {
				if (!line.startsWith("#") && !StringUtils.isEmpty(line)) {
					String[] lineTokens = line.split("---");
					if (lineTokens.length > 1 ) {
						rules.add(new Rule(lineTokens[0], lineTokens[1]));
					}

				}

			}
			in.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/*********************************************************
	 * Runs the regular expression tagger against a list of tokens and returns a list of tags
	 * @param tokenList (List<Token>)
	 * @param inputSentence (String)
	 * @return tagList (List<String>)
	/*********************************************************/
	public List<String> runTagger(List<Token> tokenList, String inputSentence) {

		List<String> tagList = new ArrayList<String>();
		for (Token token : tokenList) {
			try {
				Matcher m = Pattern.compile("dummy").matcher(token.getSurface());

				String tag = "nil";
				for (Rule r : rules) {
					if (m.usePattern(r.getPattern()).lookingAt()&& ! (ignoredTags.contains(r.getName()))) {
						tag = r.getName();
						break;
					}
				}
				tagList.add(tag);

			} catch (Exception e) {
				LOG.debug("Null pointer right there" + tokenList);

			}
		}
		return tagList;
	}

	public List<String> getIgnoredTags() {
        return ignoredTags;      
	}

	public void setIgnoredTags(List<String> ignoredTags) {
        this.ignoredTags = ignoredTags;
	}

}
