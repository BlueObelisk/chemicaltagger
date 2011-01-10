package uk.ac.cam.ch.wwmm.chemicaltagger.webdemo;

import java.util.Set;

public class CheckBoxContent {

	public String name ;
	public Set<String> checkboxItems;
	public Set<String> getCheckBoxItems() {
		return checkboxItems;
	}
	public void setCheckboxItems(Set<String> checkboxes) {
		this.checkboxItems = checkboxes;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		
	}

}
