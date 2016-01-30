package entities;

public abstract class Party {
	
	private String name;
	private String street;
	private String city;
	private String state;
	private String zip;
	private String email;
	
	
	public Party(String name, String street, String city, String state, String zip, String email) {
		super();
		this.name = name;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.email = email;
	}


	
	public String getName() {
		return name;
	}


	public String getStreet() {
		return street;
	}


	public String getCity() {
		return city;
	}


	public String getState() {
		return state;
	}


	public String getZip() {
		return zip;
	}


	public String getEmail() {
		return email;
	}
	


	public void setName(String name) {
		this.name = name;
	}


	public void setStreet(String street) {
		this.street = street;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public void setState(String state) {
		this.state = state;
	}


	public void setZip(String zip) {
		this.zip = zip;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
}
