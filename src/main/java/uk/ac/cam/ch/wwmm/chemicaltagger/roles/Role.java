package uk.ac.cam.ch.wwmm.chemicaltagger.roles;

public class Role {

	private String role;
	private String sentence;

	public Role(String role, String sentence) {
		this.setRole(role);
		this.setSentence(sentence);
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getRole() {
		return role;
	}

	public void setSentence(String sentence) {
		this.sentence = sentence;
	}

	public String getSentence() {
		return sentence;
	}

}
