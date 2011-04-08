package uk.ac.cam.ch.wwmm.chemicaltagger;

import java.util.regex.Pattern;

/**************************************************************
 * The Rule class . Compiles regex rules. Used later for the regex tagger.
 ***************************************************************/
public class Rule {

	private String name;
	private Pattern pattern;

	/**************************************
	 * Getter method for name.
	 * @return name (String)
	 ***************************************/
	public String getName() {
		return name;
	}

	/**************************************
	 * Getter method for pattern.
	 * @return pattern (String)
	 ***************************************/
	public Pattern getPattern() {
		return pattern;
	}

	/**************************************
	 * Public Constructor method.
	 * Sets the name and regex pattern and set caseInsensitive to true by default.
	 * @param name (String)
	 * @param regex (String)
	 ************************************/
	public Rule(String name, String regex) {
		setRule(name, regex, true);
	}

	/***************************************
	 * Public Constructor method.
	 * @param name (String)
	 * @param regex (String)
	 * @param caseInsensitive (String)
	 */
	public Rule(String name, String regex, boolean caseInsensitive) {
		setRule(name, regex, caseInsensitive);
	}

	/****************************************
	 * Compiles a new rule and sets the tag.
	 * @param name (String: name of the tag)
	 * @param regex (String: Regex Pattern)
	 * @param caseInsensitive (Boolean)
	 */
	private void setRule(String name, String regex, boolean caseInsensitive) {
		this.name = name;

		if (caseInsensitive){
			pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		}
		else {
			pattern = Pattern.compile(regex);
		}
	}
}

