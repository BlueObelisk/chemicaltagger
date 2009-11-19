import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;

import uk.ac.cam.ch.wwmm.extractPhrases.*;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        ChemicalChunkerLexer lex = new ChemicalChunkerLexer(new ANTLRFileStream("/home/lezan/NetBeansProjects/chemicaltagger/src/main/antlr/grammar/__Test___input.txt"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        ChemicalChunkerParser g = new ChemicalChunkerParser(tokens, 49100, null);
        try {
            g.sentence();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}