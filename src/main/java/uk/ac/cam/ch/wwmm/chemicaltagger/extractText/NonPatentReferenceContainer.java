package uk.ac.cam.ch.wwmm.chemicaltagger.extractText;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;

public class NonPatentReferenceContainer {

	private String bookTitle = "";
	private String serTitle = "";
	private String articleTitle = "";

	private String vid = "";
	private String edate = "";
	private String sdate = "";
	private List<String> authorNames = new ArrayList<String>();

	public List<String> getAuthorNames() {
		return authorNames;
	}

	public void setAuthorNames(List<String> authorNames) {
		this.authorNames = authorNames;
	}

	public String getArticleTitle() {
		return articleTitle;
	}

	public void setArticleTitle(String articleTitle) {
		this.articleTitle = articleTitle;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getVid() {
		return vid;
	}

	public void setVid(String vid) {
		this.vid = vid;
	}

	public String getEdate() {
		return edate;
	}

	public void setEdate(String edate) {
		this.edate = edate;
	}

	public String getSdate() {
		return sdate;
	}

	public void setSdate(String sdate) {
		this.sdate = sdate;
	}

	public void setSerTitle(String serTitle) {
		this.serTitle = serTitle;
	}

	public String getSerTitle() {
		return serTitle;

	}

	public boolean isEmpty() {
		boolean emptyFlag = true;

		if ((StringUtils.isNotEmpty(bookTitle))
				|| (StringUtils.isNotEmpty(serTitle))
				|| (StringUtils.isNotEmpty(articleTitle))
				|| (authorNames.size() > 0)) {
			emptyFlag = false;
		}

		return emptyFlag;
	}

}
