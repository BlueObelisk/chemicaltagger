package uk.ac.cam.ch.wwmm.chemicaltagger;
/********************************************
 * A container class that stores the information
 * about OSCAR tags .
 * 
 * @author lh359
 ********************************************/
public class WWMMTag {
	public enum TagType{
		START_END,
		START,
		END,
		MIDDLE,
		NONE
	}
	String POS = "";
	public String getPOS() {
		return POS;
	}

	public void setPOS(String POS) {
		this.POS = POS;
	}

	
	public Double getConfidence() {
		return Confidence;
	}

	public TagType getType() {
		return type;
	}

	Double Confidence = null;
	TagType type = TagType.START_END;
    public WWMMTag(String POS){
    	this.POS = POS;
    	type = TagType.START_END;
	}

	public WWMMTag(String POS, TagType type){
		this.POS = POS;
		this.type = type;
	}

}
