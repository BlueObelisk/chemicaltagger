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

/*****************************************************
 * Runs the regular expression tagger .
 * 
 * @author lh359, pm286
 *****************************************************/
public class RegexTagger {

	protected List<Rule> rules;
	public String tagFile = "dictionary/tags.txt";
	private final Logger LOG = Logger.getLogger(RegexTagger.class);

	/****************************
	 * Public Constructor
	 ***************************/
	public RegexTagger() {
		initializeRules();
	}

	public RegexTagger(String tagFile) {
		this.tagFile = tagFile;
	}
	/**************************************************************
	 * Initialises the rules for the regular expression tagger
	 ***************************************************************/
	protected void initializeRules() {
		rules = new ArrayList<Rule>();
		String line;
		try {

			// BufferedReader in = new BufferedReader(new FileReader(tagFile));
			// PMR
			InputStream is = this.getClass().getClassLoader()
					.getResourceAsStream(tagFile);
			BufferedReader in = new BufferedReader(new InputStreamReader(is,
					Charset.forName("UTF-8")));

			if (!in.ready()) {
				throw new IOException();
			}

			while ((line = in.readLine()) != null) {
				if (!line.startsWith("#") && !StringUtils.isEmpty(line)) {
					String[] lineTokens = line.split("---");
					if (lineTokens.length > 1) {
						rules.add(new Rule(lineTokens[0], lineTokens[1]));
					}

				}

			}
			in.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/*****************************************************
	 * Main Function. Runs the regular expression tagger against the text and
	 * stores the tags in POSContainer
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
	protected static class Rule {

		final String name;
		final Pattern pattern;

		public Rule(String name, String regex) {
			this.name = name;
			pattern = Pattern.compile(regex);
		}
	}

}
