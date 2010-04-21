package uk.ac.cam.ch.wwmm.chemicaltagger;

import java.util.Iterator;

import nu.xom.Document;
import nu.xom.Element;
import nu.xom.Node;
import nu.xom.Text;

import org.apache.commons.configuration.Configuration;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

import uk.ac.cam.ch.wwmm.oscar3.Oscar3Props;
import uk.ac.cam.ch.wwmm.oscar3.flow.OscarFlow;
import uk.ac.cam.ch.wwmm.ptclib.scixml.TextToSciXML;

/*****************************************************
 * Runs the OSCAR tagger .
 * @author lh359, dmj30,jat45
 *****************************************************/

public class OscarTagger {

	private Configuration config = null;
	private String config_filename = "textmining.properties";
	private final Logger LOG = Logger.getLogger(OscarTagger.class);
	private static final String FLOW_COMMAND = "recognise inline";

	/****************************
	 * Public Constructor
	 ***************************/
	public OscarTagger() {
		initialiseOSCAR();

	}

	/*****************************************************
	 * Creates the OSCAR workspace Taken from the Spectra-T textmining modules
	 * 
	 * @author jat45
	 *****************************************************/
	private void initialiseOSCAR() {
		try {
			config = new PropertiesConfiguration(config_filename);
		} catch (ConfigurationException e1) {
			e1.printStackTrace();
		}
		Oscar3Props.getInstance();
		Iterator<String> iterator = config.getKeys();
		while (iterator.hasNext()) {
			String name = iterator.next();
			String value = config.getString(name);
			Oscar3Props.setProperty(name, value);
		}
		try {
			Oscar3Props.configureWorkspace();
			System.out.println("workspace configured");
		} catch (Exception e) {
			LOG.error("Problem setting up OSCAR3: " + e.getMessage());
			throw new RuntimeException("Problem setting up OSCAR3: "
					+ e.getMessage(), e);
		}
	}

	/*****************************************************
	 * Main Function.
	 * Runs OSCAR over a string and process the XML output Stores the tokens and
	 * tags to the POSContainer class which is returned
	 * 
	 * @author dmj30, lh359
	 *****************************************************/
	public POSContainer runTagger(POSContainer posContainer,String sentence) {

		Document doc = TextToSciXML.textToSciXML(sentence);
		OscarFlow oscarFlow = new OscarFlow(doc);
		try {
			oscarFlow.runFlow(FLOW_COMMAND);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
		Document parsed = oscarFlow.getInlineXML();
		Node paragraph = parsed.query("//P").get(0);

		for (int i = 0; i < paragraph.getChildCount(); i++) {

			if (paragraph.getChild(i) instanceof Text) {
				Text textnode = (Text) paragraph.getChild(i);
				String textContent = textnode.getValue().toString().trim();
				processOSCARTextNodes(posContainer, textContent.split(" "));
			} else if (paragraph.getChild(i) instanceof Element) {
				Element ne = (Element) paragraph.getChild(i);
				processOSCARNENodes(posContainer, ne);
			}
		}

		return posContainer;
	}

	/*****************************************************
	 * Converts XML NE nodes into POS Tags and Tokens which are then stored in
	 * POSContainer
	 *****************************************************/
	private void processOSCARNENodes(POSContainer posContainer, Element ne) {

		if (ne.getAttributeValue("type") != null
				&& ne.getAttributeValue("surface") != null) {

			String surface = ne.getAttributeValue("surface").trim();
			String type = ne.getAttributeValue("type").trim();
			String[] surfaceTokens = surface.split(" ");
			if (surfaceTokens.length == 1) {
				posContainer.wordTokenList.add(surface);
				posContainer.addToOSCARList(type);

			} else if (surfaceTokens.length > 1) {
				for (int i = 0; i < surfaceTokens.length; i++) {
					String surfaceToken = surfaceTokens[i];
					posContainer.wordTokenList.add(surfaceToken);
					if (i == 0) {
						posContainer
								.addToOSCARList(type, WWMMTag.TagType.START);
					} else if (i == surfaceTokens.length - 1) {
						posContainer.addToOSCARList(type, WWMMTag.TagType.END);
					} else {
						posContainer.addToOSCARList(type,
								WWMMTag.TagType.MIDDLE);
					}

				}

			}

		}

	}

	/*****************************************************
	 * Converts XML textNodes into POS Tags and Tokens which are then stored in
	 * POSContainer
	 *****************************************************/
	private void processOSCARTextNodes(POSContainer posContainer,
			String[] textString) {
		for (String string : textString) {
			if (!StringUtils.isEmpty(string)) {
				try {
					posContainer.addToTokenList(string);
					posContainer.addToOSCARList("nil");
				} catch (Exception e) {
					LOG.debug(e.getMessage());
					e.printStackTrace();
				}
			}
		}

	}

}
