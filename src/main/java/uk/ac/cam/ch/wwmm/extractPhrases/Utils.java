package uk.ac.cam.ch.wwmm.extractPhrases;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Utils {

	
	public static void checkOutputDir(String outputDir){
		 if (!new File(outputDir).exists()){
		     new File(outputDir).mkdir();
		 }
	}

	public static List addToList(String string) {
		List<String> arrayList = new ArrayList<String>();
		
		for (String item : string.split(" ")) {
			arrayList.add(item);
		}
		return arrayList;
	}
}
