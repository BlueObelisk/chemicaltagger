package uk.ac.cam.ch.wwmm.chemicaltagger.extractText;

public class PersonContainer {

	private String name;
	private String address_street;
	private String address_city;
	private String address_country;
	private String iid;
	private String irf;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress_street() {
		return address_street;
	}
	public void setAddress_street(String addressStreet) {
		address_street = addressStreet;
	}
	public String getAddress_city() {
		return address_city;
	}
	public void setAddress_city(String addressCity) {
		address_city = addressCity;
	}
	public String getAddress_country() {
		return address_country;
	}
	public void setAddress_country(String addressCountry) {
		address_country = addressCountry;
	}
	public String getIid() {
		return iid;
	}
	public void setIid(String iid) {
		this.iid = iid;
	}
	public String getIrf() {
		return irf;
	}
	public void setIrf(String irf) {
		this.irf = irf;
	}

}
