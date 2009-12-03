package uk.ac.cam.ch.wwmm.chemicaltagger;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import uk.ac.cam.ch.wwmm.chemicaltagger.extractText.DocumentContainer;
import uk.ac.cam.ch.wwmm.chemicaltagger.extractText.ExtractFromPatent;

public class TagPatents {

    public TagPatents() {
    }

    public static void main(String[] args) {
        List docs = new ArrayList<DocumentContainer>();
        String path = "src/main/resources/patents/";
        File patentDirectory = new File(path);
        String[] patentDir = patentDirectory.list();
        ChemistryPOSTagger posTagger = new ChemistryPOSTagger();
        String outputPath = "src/main/resources/antlr/taggedPatents/";
        //for (String file : patentDir) {
            String file = "paragraph0070.xml";
            String resourcePath = path + file;
            /************************
             *  Get text from Patent
             ************************/
            ExtractFromPatent extract = new ExtractFromPatent();
            DocumentContainer docContainer = extract.getContent(resourcePath);
            String patentContent = docContainer.getContent();
            /************************
             *  Get Parts of Speech
             ************************/
            POSContainer posContainer = posTagger.runTaggers(patentContent);
            docContainer.setTaggedContent(posContainer.getTokenTagTupleAsString());
            docs.add(docContainer);

            /****************
             * Write to File
             ****************/
            try {
                // Create file
                FileWriter fstream = new FileWriter(outputPath+docContainer.getId());
                BufferedWriter out = new BufferedWriter(fstream);
                out.write(docContainer.getTaggedContent());
                //Close the output stream
                out.close();
            } catch (Exception e) {//Catch exception if any
                System.err.println("Error: " + e.getMessage());
            }


        }

    //}
}
