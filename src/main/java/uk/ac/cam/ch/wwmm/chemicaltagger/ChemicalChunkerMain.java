/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.cam.ch.wwmm.chemicaltagger;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import org.apache.commons.lang.time.StopWatch;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.Tree;

/**
 *
 * @author pm286
 */
public class ChemicalChunkerMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        String filename = null;
        InputStream instream = System.in;
        if (args.length > 0) {
            filename = args[0];
        } else {
            filename = "src/main/resources/antlr/chemicalInput2.txt";
        }
        File file = new File(filename);
        System.out.println("File input " + file.getAbsolutePath());
        instream = new FileInputStream(file);
        processInput(instream);


        // TODO code application logic here
    }


    private static void processInput(InputStream instream) {
        try {
            System.err.println("-----------");
            StopWatch stopWatch = new StopWatch();
            ANTLRInputStream input = new ANTLRInputStream(instream);
            ChemicalChunkerLexer lexer = new ChemicalChunkerLexer(input);


            stopWatch.start();
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            stopWatch.stop();
            System.out.println("Tokens processed in "+stopWatch.getTime());
            stopWatch.reset();
            stopWatch.start();
            ChemicalChunkerParser parser = new ChemicalChunkerParser(tokens);
            ChemicalChunkerParser.document_return result = parser.document();
            Tree t = (Tree) result.getTree();
            System.out.println("@@@@@@@@@@@@@@@@@@"+t.toStringTree());
            stopWatch.stop();
            System.out.println("Parsing done in "+stopWatch.getTime());
        } catch (Exception e) {
            throw new RuntimeException("read parse fail", e);
        }
        // TODO code application logic here
    }
}
