package entities;

public class Company extends Party {

	private int numberOfEmployees;
	
	public Company(String name, String street, String city, String state, String zip, String email, int numberOfEmployees) {
		super(name, street, city, state, zip, email);
		this.numberOfEmployees = numberOfEmployees;		
	}

	
	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	
}
