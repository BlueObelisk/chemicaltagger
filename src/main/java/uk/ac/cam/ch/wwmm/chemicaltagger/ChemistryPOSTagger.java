package uk.ac.cam.ch.wwmm.chemicaltagger;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import nu.xom.Document;
import nu.xom.Element;
import nu.xom.Node;
import nu.xom.Text;
import opennlp.tools.lang.english.PosTagger;
import opennlp.tools.postag.POSDictionary;

import org.apache.commons.configuration.Configuration;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

import org.xmlcml.euclid.Util;
import uk.ac.cam.ch.wwmm.oscar3.Oscar3Props;
import uk.ac.cam.ch.wwmm.oscar3.flow.OscarFlow;
import uk.ac.cam.ch.wwmm.ptclib.scixml.TextToSciXML;

public class ChemistryPOSTagger {

    public String sentence;
    public String tagFile = "src/main/resources/dictionary/tags.txt";
    private Configuration config = null;
    private List<Rule> rules;
    private String config_filename = "src/main/resources/textmining.properties";
    private final Logger LOG = Logger.getLogger(ChemistryPOSTagger.class);
    private static final String FLOW_COMMAND = "recognise inline";

    /****************************
     * Public Constructor
     ***************************/
    public ChemistryPOSTagger() {
        initializeRules();
        initialiseOSCAR();
    }

    private boolean isNumeric(String input) {
        boolean flag = false;

        try {
            Integer.parseInt(input);
            return true;
        } catch (Exception e) {
            return false;
        }


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

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    /**************************************************************
     * Initialises the rules for the regular expression tagger
     ***************************************************************/
    private void initializeRules() {
        rules = new ArrayList<Rule>();
        String line;
        try {

            BufferedReader in = new BufferedReader(new FileReader(tagFile));

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
     * Creates the OSCAR workspace Taken from the Spectra-T textmining modules
     *
     * @author jat45
     *****************************************************/
    private void initialiseOSCAR() {
        try {
            config = new PropertiesConfiguration(config_filename);
            System.err.println(config_filename);
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
            throw new RuntimeException("Problem setting up OSCAR3: " + e.getMessage(), e);
        }
    }

    /*****************************************************
     * Main Module.
     *
     * Initialises POSContainer. Runs 3 taggers against the sentence: - OSCAR
     * for recognising chemical entities. - Regex for recognising chemistry
     * related words that are not recognised by OSCAR - OpenNLP Brown for
     * recognising common english words It then combines the output of all 3
     * taggers and performs some simple corrections
     *
     *****************************************************/
    public POSContainer runTaggers(String sentence) {

        POSContainer posContainer = new POSContainer();
        this.sentence = cleanSentence(sentence);
        posContainer = runOSCARTagger(posContainer);
        posContainer = runRegexTagger(posContainer);
        posContainer = runOpenNLPTagger(posContainer);

        posContainer.combineTaggers();
        posContainer = correctCombinedTagsList(posContainer);
        //posContainer.printOutTags();
        LOG.info("Tag Token Tuple: " + posContainer.getTokenTagTupleAsString());
        return posContainer;
    }

    /************************************
     * First attempt at tidying up sentences
     * Separates words conjealed together
     *
     * @param sentence
     * @return newSentence
     */
    private String cleanSentence(String sentence) {
        StringBuilder newSentence = new StringBuilder();
        sentence = sentence.replace("%", " %").replace(";", " ;");
        String[] words = sentence.split(" ");

        for (String string : words) {
            //System.err.println("Word ="+string+"--- ends with )="+string.endsWith(")"));
            String prefix = " ";
            String suffix = " ";
            if (string.endsWith(".")) {
                string = string.substring(0, string.length() - 1);
                suffix = " ." + suffix;
            }
            if (string.endsWith(",")) {
                string = string.substring(0, string.length() - 1);
                suffix = " ," + suffix;
            }

            if (string.startsWith("(")) {
                String subString = string.substring(1, string.length());
                int i = Util.indexOfBalancedBracket(')', string);
                if (i == -1) {

                    string = subString;
                    prefix = prefix + "( ";
                }

            } else if (string.trim().endsWith(")")) {
                String subString = string.substring(0, string.length() - 1);
                int i = Util.indexOfBalancedBracket('(', string);
                if (i == -1) {

                    string = subString;
                    suffix = " )" + suffix;
                }

            }

            newSentence.append(prefix + string + suffix);
        }

        return newSentence.toString();
    }

    /*****************************************************
     *
     * Runs OSCAR over a string and process the XML output Stores the tokens and
     * tags to the POSContainer class which is returned
     *
     * @author dmj30, lh359
     *****************************************************/
    private POSContainer runOSCARTagger(POSContainer posContainer) {

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

        if (ne.getAttributeValue("type") != null && ne.getAttributeValue("surface") != null) {

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
                        posContainer.addToOSCARList(type, WWMMTag.TagType.START);
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

    /*****************************************************
     * Runs the OpenNLP brown tagger against the text and stores the tags in
     * POSContainer
     *****************************************************/
    public POSContainer runOpenNLPTagger(POSContainer posContainer) {
        POSDictionary tagDict;
        String[] tags = null;
        List<String> tokenList = posContainer.getTokenList();

        String[] token = new String[tokenList.size()];
        for (int i = 0; i < tokenList.size(); i++) {
            token[i] = tokenList.get(i);
        }
        try {

            tagDict = new POSDictionary(
                    "src/main/resources/openNlpResources/tagdict");
            PosTagger posTagger = new PosTagger(
                    "src/main/resources/openNlpResources/tag.bin", tagDict);

            tags = posTagger.tag(token);
            posContainer.addToBrownListFromStringArray(tags);

        } catch (Exception e) {
            LOG.error("Exception " + e.getMessage());
            e.printStackTrace();
            throw new RuntimeException(e);
        }

        return posContainer;

    }

    /*****************************************************
     * Runs the regular expression tagger against the text and stores the tags
     * in POSContainer
     *****************************************************/
    public POSContainer runRegexTagger(POSContainer posContainer) {

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

    /**************************************************
     * Corrects MisNamed Tags
     *
     * Needs to be refactored and/or separated into
     * different modules.
     **************************************************/
    private POSContainer correctCombinedTagsList(POSContainer posContainer) {

        List<String> tokenList = posContainer.getTokenList();
        List<WWMMTag> combinedTags = posContainer.getCombinedTagsList();

        for (int i = 0; i < combinedTags.size(); i++) {
            String currentTag = combinedTags.get(i).getPOS();
            String currentToken = tokenList.get(i);
            String newTag = combinedTags.get(i).getPOS();

            if (StringUtils.equalsIgnoreCase(currentTag, "oscar-cm") && StringUtils.equalsIgnoreCase(currentToken, "a")) {
                newTag = "DT";
            }

            if (StringUtils.equalsIgnoreCase(currentTag, "oscar-ont") && StringUtils.equalsIgnoreCase(currentToken, "a")) {
                newTag = "DT";
            }
            if (StringUtils.equalsIgnoreCase(currentTag, "oscar-cm") && currentToken.contains("°C")) {
                newTag = "NN-TEMP";
            }
            if (StringUtils.equalsIgnoreCase(currentTag, "oscar-cm") && StringUtils.equalsIgnoreCase(currentToken, "atrp")) {
                newTag = "NN-SYNTHESIZE";
            }
            if (StringUtils.equalsIgnoreCase(currentTag, "oscar-cm") && StringUtils.equalsIgnoreCase(currentToken, "romp")) {
                newTag = "NN-SYNTHESIZE";
            }
            if (StringUtils.equalsIgnoreCase(currentTag, "oscar-cm") && StringUtils.equalsIgnoreCase(currentToken, "ml")) {
                newTag = "NN-VOL";
            }
            if (StringUtils.equalsIgnoreCase(currentTag, "oscar-cm") && StringUtils.equalsIgnoreCase(currentToken, "°C")) {
                newTag = "NN-TEMP";
            }
            if (StringUtils.equalsIgnoreCase(currentTag, "nnp") && StringUtils.equalsIgnoreCase(currentToken, "M")) {
                newTag = "NN-MOL";
            }

            if (StringUtils.equalsIgnoreCase(currentTag, "cd")) {
                List beforeList = Utils.addToList("in-of jj nn-chementity comma");
                List afterList = Utils.addToList("-lrb- stop comma");
                if (stringbefore(beforeList, i, combinedTags) && (stringafter(afterList, i, combinedTags) || i == combinedTags.size())) {
                    newTag = "OSCAR-CD";
                }
            }
            // polymerization should not be chementity
            if (currentTag.toLowerCase().startsWith("vb-") || currentTag.toLowerCase().startsWith("nn")) {
                if (!currentTag.toLowerCase().startsWith("nn-state") && !currentTag.toLowerCase().startsWith("nn-apparatus") && !currentTag.toLowerCase().startsWith("nn-temp") && !currentTag.toLowerCase().startsWith("nn-pressure")) {
                    List beforeList = Utils.addToList("dt jj");
                    List afterList = Utils.addToList("vbd jj nn-chementity nn-mixture nn-apparatus nn comma");

                    if (stringbefore(beforeList, i, combinedTags) && (stringafter(afterList, i, combinedTags) || i == combinedTags.size())) {
                        newTag = "NN-CHEMENTITY";
                    }
                }
            }

            if (currentTag.toLowerCase().startsWith("vb-precipitate")) {
                List beforeList = Utils.addToList("jj oscar-cj");
                List afterList = Utils.addToList("in-of");

                if (stringbefore(beforeList, i, combinedTags) && (stringafter(afterList, i, combinedTags) || i == combinedTags.size())) {
                    newTag = "NN-CHEMENTITY";
                }
            }

            if (currentTag.toLowerCase().startsWith("vb-")) {
                if (!currentTag.toLowerCase().startsWith("vb-use")) {
                    List afterList = Utils.addToList("oscar-cj oscar-cm nns nn-chementity");
                    List notList = Utils.addToList("rb in-after");
                    if (stringafter(afterList, i, combinedTags) && !stringbefore(notList, i, combinedTags)) {
                        newTag = "oscar-cj";
                    }
                }
            }
            if (currentTag.toLowerCase().startsWith("vbn") || currentTag.toLowerCase().startsWith("vbg")) {

                List afterList = Utils.addToList("oscar-cm nns nn-chementity");
                List beforeList = Utils.addToList("dt");
                if (stringafter(afterList, i, combinedTags) && stringbefore(beforeList, i, combinedTags)) {
                    newTag = "oscar-cj";
                }

            }

            if (currentToken.equals("M")) {

                List beforeList = Utils.addToList("cd");

                if (stringbefore(beforeList, i, combinedTags)) {
                    newTag = "NN-MOL";
                }
            }

            if (currentTag.toLowerCase().equals("cd")) {

                List afterList = Utils.addToList("stop comma -lrb-");

                if (stringafter(afterList, i, combinedTags)) {
                    newTag = "OSCAR-CD";
                }
            }

            combinedTags.get(i).setPOS(newTag);
        }

        return posContainer;
    }

    /***********************************
     * A boolean function that checks
     * for the tokens before the current
     * token
     *
     * @param beforeList
     * @param index
     * @param combinedTags
     * @return before(boolean)
     ***********************************/
    private boolean stringbefore(List beforeList, int index,
            List<WWMMTag> combinedTags) {
        boolean before = false;
        if (index != 0) {
            int beforeIndex = index - 1;
            if (beforeList.contains(combinedTags.get(beforeIndex).getPOS().toLowerCase())) {
                before = true;
            }

        }
        return before;
    }

    /**********************************
     * A boolean function that checks 
     * for the tokens after the current
     * token
     * @param afterList
     * @param index
     * @param combinedTags
     * @return
     **********************************/
    private boolean stringafter(List afterList, int index,
            List<WWMMTag> combinedTags) {
        boolean after = false;
        int afterIndex = index + 1;
        if (afterIndex < combinedTags.size()) {
            if (afterList.contains(combinedTags.get(afterIndex).getPOS().toLowerCase())) {
                after = true;
            }

        }
        return after;
    }

    public static void main(String[] args) throws Exception {

        ChemistryPOSTagger posTagger = new ChemistryPOSTagger();
        String sentence = "Synthesis of the brown dropwise Hyperbranched Macroligands via Michael Addition of Butyl or Ethyl Acrylate with HPEI. The synthetic procedure for partially EA- or BA-modified HPEI is exemplified for HPEI25K-EA0.79: 1.00 g of HPEI25K (Mn = 2.50 x 104, 23.3 mmol of amine groups) was dissolved in 5.00 mL of THF, and then 2.52 mL (23.3 mmol) of EA was added. The mixture was stirred at room temperature for 24 h and subsequently at 50 C for another 24 h.";
        posTagger.runTaggers(sentence);

        sentence = "The resulting viscous mixture was slowly added to vigorously stirred MeOH ( ca . 30 mL ) to give a white precipitate of diblock copolymer PNBE- -PSt ";
        posTagger.runTaggers(sentence);

        sentence = "Potassium carbonate ( 0.63 g , 4.56 mmol ) and thiophenol ( 0.19 g , 1.69 mmol) were added to the 2-nitrobenzene sulfonamide ( 0.50 g , 1.302)";
        posTagger.runTaggers(sentence);

        sentence = "Preparation of Sulfonated Poly(phthalazinone ether ether ketone) 7a. To a 25 mL three-necked round-bottomed flask fitted with a Dean-stark trap, a condenser, a nitrogen inlet/outlet, and magnetic stirrer was added bisphthalazinone monomer 4 (0.6267 g, 1 mmol), sulfonated difluoride ketone 5 (0.4223 g, 1 mmol), anhydrous potassium carbonate (0.1935 g, 1.4 mmol), 5 mL of DMSO, and 6 mL of toluene. Nitrogen was purged through the reaction mixture with stirring for 10 min, and then the mixture was slowly heated to 140 °C and kept stirring for 2 h. After water generated was azoetroped off with toluene. The temperature was slowly increased to 175 °C. The temperature was maintained for 20 h, and the viscous solution was cooled to 100 °C followed by diluting with 2 mL of DMSO and, thereafter, precipitated into 100 mL of 1:  1 (v/v) methanol/water. The precipitates were filtered and washed with water for three times. The fibrous residues were collected and dried at 110 °C under vacuum for 24 h. A total of 0.9423 g of polymer 7a was obtained in high yield of 93%.";
        posTagger.runTaggers(sentence);

        sentence = "Synthesis of 3 . A mixture of 2 (1.1 g, 3.6 mmol), zinc oxide (0.160 g, 0.196 mmol) and acetic anhydride (0.37 g, 3.6 mmol) in acetic acid (4.3 g, 72 mmol) was stirred at 30°C for 2 d. The reaction was quenched with saturated NaHCO3, and the mixture was extracted with Et2O. The combined organic layer was washed with H2O and dried over anhydrous Na2SO4. The solvent was removed in vacuo, and the residue was purified by flash column chromatography on silica gel (hexane/Et2OÂ =Â 2/1) to give 0.97 g of 3 as a pale yellow viscous liquid (95%).";
        posTagger.runTaggers(sentence);

    }
}
