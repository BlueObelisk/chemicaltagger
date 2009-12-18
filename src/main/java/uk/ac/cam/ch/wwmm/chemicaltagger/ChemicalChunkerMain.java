/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.cam.ch.wwmm.chemicaltagger;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import nu.xom.Document;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.Tree;
import org.apache.commons.lang.time.StopWatch;
import org.apache.log4j.Logger;

/**
 *
 * @author pm286
 */
public class ChemicalChunkerMain {

    private InputStream taggedTokenInStream = null;
    private final Logger LOG = Logger.getLogger(ChemicalChunkerMain.class);

    public ChemicalChunkerMain(String taggedTokenInputFilename) {

        File file = new File(taggedTokenInputFilename);
        try {
            this.taggedTokenInStream = new FileInputStream(file);
        } catch (FileNotFoundException ex) {

            LOG.debug("Exception : " + ex.getMessage());
        }

    }

    public ChemicalChunkerMain(InputStream taggedTokenInStream) {
        this.taggedTokenInStream = taggedTokenInStream;
    }

    /*********************
     * 
     * @param outputFilename
     *********************/
    public void processTags(String outputFilename) {
        try {


            StopWatch stopWatch = new StopWatch();
            /**************************
             * Pass File to Antlr
             *************************/
            ANTLRInputStream input = new ANTLRInputStream(taggedTokenInStream);
            ChemicalChunkerLexer lexer = new ChemicalChunkerLexer(input);
            stopWatch.start();
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            stopWatch.stop();
            System.out.println("Tokens processed in " + stopWatch.getTime());
            stopWatch.reset();
            stopWatch.start();
            ChemicalChunkerParser parser = new ChemicalChunkerParser(tokens);


            /*****************************************
             * Pass parser to Tree and Convert to XML
             *****************************************/
            ChemicalChunkerParser.document_return result = parser.document();
            Tree t = (Tree) result.getTree();
            ASTtoXML astToXML = new ASTtoXML();
            Document doc = astToXML.convert(t);
            Utils.writeXMLToFile(doc, outputFilename);
            stopWatch.stop();
            System.out.println("Parsing done in " + stopWatch.getTime());

        } catch (Exception e) {
            throw new RuntimeException("read parse fail", e);
        }

    }

    /*********************
     * 
     * @param outputFilename
     *********************/
    public Document processTagsToDocument() {
    	Document doc = null;
        try {
            ANTLRInputStream input = new ANTLRInputStream(taggedTokenInStream);
            ChemicalChunkerLexer lexer = new ChemicalChunkerLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            ChemicalChunkerParser parser = new ChemicalChunkerParser(tokens);
            ChemicalChunkerParser.document_return result = parser.document();
            Tree t = (Tree) result.getTree();
            doc = new ASTtoXML().convert(t);
         } catch (Exception e) {
            throw new RuntimeException("read parse fail", e);
        }
         return doc;
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        String taggedTokenInputFilename = null;
        String outputXMLFilename = null;

        if (args.length > 1) {
            taggedTokenInputFilename = args[0];
            outputXMLFilename = args[1];

        } else {
            taggedTokenInputFilename = "src/main/resources/antlr/chemicalInput.txt";
            outputXMLFilename = "target/astTree.xml";

        }
        ChemicalChunkerMain chemicalChunkerMain = new ChemicalChunkerMain(taggedTokenInputFilename);
        chemicalChunkerMain.processTags(outputXMLFilename);

    }
}
