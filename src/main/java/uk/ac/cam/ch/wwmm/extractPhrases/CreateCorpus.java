package uk.ac.cam.ch.wwmm.extractPhrases;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import org.apache.log4j.Logger;

public class CreateCorpus {

	
	private final Logger LOG = Logger.getLogger(CreateCorpus.class);
	private ChemistryPOSTagger posTag;	
	
		
	public CreateCorpus(){

	   posTag = new ChemistryPOSTagger();	     	
			
	}
	
	
	
	public String run(String filename){
	    StringBuilder contents = new StringBuilder();
	    
	    try {
	      //use buffering, reading one line at a time
	      //FileReader always assumes default encoding is OK!
	      BufferedReader input =  new BufferedReader(new FileReader(filename));
	      try {
	        String line = null; //not declared within while loop
	        /*
	        * readLine is a bit quirky :
	        * it returns the content of a line MINUS the newline.
	        * it returns null only for the END of the stream.
	        * it returns an empty String if two newlines appear in a row.
	        */
	     
	        while (( line = input.readLine()) != null){
	          if (!line.startsWith("EXPERIMENTALDATA")) {	
		          line = line.replace("REACTIONTITLE=", "").replace("REACTIONCONTENT=","");
		          System.err.println("Filename "+filename);
		          //System.err.println("LINE IS "+line);
		          
		          List<WWMMTag> tagList  =posTag.runTaggers(line).getCombinedTagsList();
		          List<String> tokenList =posTag.runTaggers(line).getTokenList();
		          
		          
		          
		          System.err.println(line);
		          for (int i = 0; i < tokenList.size(); i++) {
		        	if (!tokenList.get(i).equals("ref") & ! tokenList.get(i).toString().toLowerCase().startsWith("pageref") & ! tokenList.get(i).toString().toLowerCase().startsWith("_ref")){  
  		              
		        		contents.append(tokenList.get(i)+"_"+tagList.get(i).getPOS()+" ");
  		                System.err.println(tokenList.get(i)+"_"+tagList.get(i).getPOS()+" ");
		        	}
				}
		          contents.append(System.getProperty("line.separator"));
	          }
	        }
	      }
	      finally {
	        input.close();
	      }
	      return contents.toString();
	    }
	    catch (IOException ex){
	      ex.printStackTrace();
	      return null;
	    }
	}
		
	public static void main(String[] args) {
		
        String folderName = "/home/lh359/ThesesCorpora/Harter_ExperimentalSection";    
        String outputDir = folderName+"/taggedCorpus/" ;
        CreateCorpus corpus = new CreateCorpus();
        Utils.checkOutputDir(outputDir);
		String[] dirFiles = new File(folderName).list();
		String taggedString = "";
		for (String filename : dirFiles) {
			String inputFile = folderName+"/"+filename;
			taggedString = taggedString+corpus.run(inputFile);
		}
       try {
		FileOutputStream fileout = new FileOutputStream(outputDir+"taggedHarter");
		fileout.write(taggedString.getBytes());
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}	

}
