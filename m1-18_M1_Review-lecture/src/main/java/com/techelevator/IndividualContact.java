package com.techelevator;

public class IndividualContact extends Contact {
	
	private String firstName;
	private String lastName;

	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	//derived method
	public String getFullName() {
		return firstName + " " + lastName;
	}
	
	public String toString() {
		return "\nFULL NAME: " + getFullName() + super.toString();
	}
	
	
	

}
