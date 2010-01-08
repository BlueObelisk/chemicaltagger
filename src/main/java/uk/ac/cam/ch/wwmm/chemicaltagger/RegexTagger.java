package uk.ac.cam.ch.wwmm.chemicaltagger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;


/*****************************************************
 * Runs the regular expression tagger .
 * @author lh359, pm286
 *****************************************************/
public class RegexTagger {

	private List<Rule> rules;
	public String tagFile = "dictionary/tags.txt";
	private final Logger LOG = Logger.getLogger(RegexTagger.class);
	
	/****************************
	 * Public Constructor
	 ***************************/
	public RegexTagger() {
       initializeRules();
	}
	
	/**************************************************************
	 * Initialises the rules for the regular expression tagger
	 ***************************************************************/
	private void initializeRules() {
		rules = new ArrayList<Rule>();
		String line;
		try {

			// BufferedReader in = new BufferedReader(new FileReader(tagFile));
			// PMR
			InputStream is = this.getClass().getClassLoader()
					.getResourceAsStream(tagFile);
			BufferedReader in = new BufferedReader(new InputStreamReader(is));

			if (!in.ready()) {
				throw new IOException();
			}

			while ((line = in.readLine()) != null) {
				if (!line.startsWith("#") && !StringUtils.isEmpty(line)) {
					try {
						String[] lineTokens = line.split("---");
						rules.add(new Rule(lineTokens[0], lineTokens[1]));
					} catch (Exception e) {
						LOG.debug("Ignoring line--> " + line);
					}
				}

			}
			in.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

		LOG.debug("Rules length-->" + rules.size());
	}
	
	
	/*****************************************************
	 * Main Function. Runs the regular expression tagger
	 * against the text and stores the tags
	 * in POSContainer
	 *****************************************************/
	public POSContainer runTagger(POSContainer posContainer) {

		List<String> tokenList = posContainer.getTokenList();
		for (String token : tokenList) {
			try {
				token = token.toLowerCase();
				Matcher m = Pattern.compile("dummy").matcher(token);

				String tag = "nil";
				for (Rule r : rules) {
					if (m.usePattern(r.pattern).lookingAt()) {
						tag = r.name;
						break;
					}
				}
				posContainer.addToRegexList(tag);

			} catch (Exception e) {
				LOG.debug("Null pointer right there" + tokenList);

			}
		}
		return posContainer;
	}

	
	/**************************************************************
	 * The Rule class . Compiles regex rules. Used later for the regex tagger.
	 ***************************************************************/
	static class Rule {

		final String name;
		final Pattern pattern;

		Rule(String name, String regex) {
			this.name = name;
			pattern = Pattern.compile(regex);
		}
	}
	
	

	
}
