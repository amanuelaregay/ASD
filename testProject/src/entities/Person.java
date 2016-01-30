package entities;

import java.time.LocalDate;

public class Person extends Party {

	LocalDate birthDate;
	
	public Person(String name, String street, String city, String state, String zip, String email, LocalDate birthDate) {
		super(name, street, city, state, zip, email);
		this.birthDate = birthDate;		
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}	

}
