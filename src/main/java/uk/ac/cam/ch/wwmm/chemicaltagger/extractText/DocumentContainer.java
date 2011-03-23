package uk.ac.cam.ch.wwmm.chemicaltagger.extractText;



/********************************************
 * A container class to store information
 * for an XML Patent.
 * 
 * @author lh359
 ********************************************/
public class DocumentContainer {

    private String id = "";
    private String title = "";
    private String taggedTitle = "";
    private String content = "";
    private String taggedContent = "";
    private String nmr = "";
    private String tlc ="";




	public String getContent() {
		content = content.replace("\t", " ");
        return content;
    }

    public void setContent(String Content) {
        this.content = Content;
    }

    public String getId() {
        return id;
    }

    public void setId(String Id) {
        this.id = Id;
    }

    public String getNMR() {
        return nmr;
    }

    public void setNMR(String NMR) {
        this.nmr = NMR;
    }

    public String getTaggedContent() {
        return taggedContent;
    }

    public void setTaggedContent(String TaggedContent) {
        this.taggedContent = TaggedContent;
    }

    public String getTaggedTitle() {
        return taggedTitle;
    }

    public void setTaggedTitle(String TaggedTitle) {
        this.taggedTitle = TaggedTitle;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String Title) {
        this.title = Title;
    }

	public String getTLC() {
		// TODO Auto-generated method stub
		return tlc;
	}

	public void setTLC(String tlc) {
		this.tlc = tlc;
		
	}




	
}
