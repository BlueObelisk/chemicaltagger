#ChemicalTagger Overview

ChemicalTagger is a tool for semantic text-mining in chemistry; the associated publication can be found [here](http://dx.doi.org/10.1186/1758-2946-3-17).

#A. Components:
This package is used for marking up experimental sections in chemistry papers:
It has 3 main classes:

##I. ChemistryPOSTagger:
This class takes a sentence and runs it against (by default) three taggers:
    * OSCAR4 (for chemical entities)
    * Regex (for recognising key words)
    * OpenNLP (for English parts of speech)

##II. ChemistrySentenceParser:
This class converts a tagged sentence into a parseTree. It uses a lexer and parser generated
by the Antlr grammar.

##III. ASTtoXML:
This class converts a parseTree into an XML document.


#B. Running ChemicalTagger:

    :::java
    public void parseChemicalSentence(){

        String text = "A solution of 124C (7.0 g, 32.4 mmol) in concentrate H2SO4 (9.5 mL) was added to a solution of concentrate H2SO4 (9.5 mL) and fuming HNO3 (13 mL) and the mixture was heated at 60°C for 30 min. After cooling to room temperature, the reaction mixture was added to iced 6M solution of NaOH (150 mL) and neutralized to pH 6 with 1N NaOH solution. The reaction mixture was extracted with dichloromethane (4x100 mL). The combined organic phases were dried over Na2SO4, filtered and concentrated to give 124D as a solid.";
        // Calling ChemistryPOSTagger

        POSContainer posContainer = ChemistryPOSTagger.getDefaultInstance().runTaggers(text);

        // Returns a string of TAG TOKEN format (e.g.: DT The NN cat VB sat IN on DT the NN matt)
        // Call ChemistrySentenceParser either by passing the POSContainer or by InputStream

        ChemistrySentenceParser chemistrySentenceParser = new ChemistrySentenceParser(posContainer);


        // Create a parseTree of the tagged input
        chemistrySentenceParser.parseTags();
        // Return an AST
        Tree t = chemistrySentenceParser.getParseTree();
        // Return an XMLDoc
        Document doc = chemistrySentenceParser.makeXMLDocument();

        Utils.writeXMLToFile(doc,"target/file1.xml");
    }

