/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.cam.ch.wwmm.extractPhrases;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;

/**
 *
 * @author pm286
 */
public class ChemicalChunkerMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        InputStream instream = System.in;
        if (args.length > 0) {
            String filename = args[0];
            File file = new File(filename);
            System.out.println("F " + file.getAbsolutePath());
            instream = new FileInputStream(file);
            processInput(instream);
        }
        else{
            String filename = "/home/lezan/NetBeansProjects/chemicaltagger/src/main/resources/antlr/chemicalInput.txt";
            File file = new File(filename);
            System.out.println("File input " + file.getAbsolutePath());
            instream = new FileInputStream(file);
            processInput(instream);

        }

        // TODO code application logic here
    }


    private static void processInput(InputStream instream) {
        try {
            System.err.println("-----------");
            ANTLRInputStream input = new ANTLRInputStream(instream);
            ChemicalChunkerLexer lexer = new ChemicalChunkerLexer(input);
            

            CommonTokenStream tokens = new CommonTokenStream(lexer);
            System.err.println("tokens");
            ChemicalChunkerParser parser = new ChemicalChunkerParser(tokens);

            System.err.println("parser");
        } catch (Exception e) {
            throw new RuntimeException("read parse fail", e);
        }
        // TODO code application logic here
    }
}
