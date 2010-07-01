package uk.ac.cam.ch.wwmm.chemicaltagger.extractText;

import java.util.ArrayList;
import java.util.List;


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

    private String pubDate ="";
	private List<NonPatentReferenceContainer> nonPatentRefContainerList = new ArrayList<NonPatentReferenceContainer>();
	private List<String> patentRefList = new ArrayList<String>();

	public void setInventorContainerList(List<PersonContainer> inventorContainerList) {
		this.inventorContainerList = inventorContainerList;
	}

	public void setGranteeContainerList(List<PersonContainer> granteeContainerList) {
		this.granteeContainerList = granteeContainerList;
	}

	public void setAttorneyContainerList(List<PersonContainer> attorneyContainerList) {
		this.attorneyContainerList = attorneyContainerList;
	}

	private List<PersonContainer> inventorContainerList = new ArrayList<PersonContainer>();
	private List<PersonContainer> granteeContainerList= new ArrayList<PersonContainer>();
	private List<PersonContainer> attorneyContainerList= new ArrayList<PersonContainer>();





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

	public void setPubDate(String pubDate) {
		this.pubDate = pubDate;
		
	}
    public String getPubDate() {
		return pubDate;
	}
    
	public List<String> getPatentRefList() {
		return patentRefList;
	}

	public void addToPatentRefList(String patentRef) {
		patentRefList.add(patentRef);
	}
    
	public List<NonPatentReferenceContainer> getNonPatentRefContainerList() {
		return nonPatentRefContainerList;
	}

	public void addToNonPatentContainerRefList(NonPatentReferenceContainer nonPatentReference) {
		nonPatentRefContainerList.add(nonPatentReference);
	}

	public List<PersonContainer> getInventorContainerList() {
		return inventorContainerList;
	}

	public void addToInventorContainerList(PersonContainer inventor) {
		inventorContainerList.add(inventor);
	}

	public List<PersonContainer> getGranteeContainerList() {
		return granteeContainerList;
	}

	public void addToGranteeContainerList(PersonContainer grantee) {
		granteeContainerList.add(grantee);
	}

	public List<PersonContainer> getAttorneyContainerList() {
		return attorneyContainerList;
	}

	public void addToAttorneyContainerList(PersonContainer attorney) {
		attorneyContainerList.add(attorney);
	}

	
}
