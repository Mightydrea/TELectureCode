package com.techelevator.backup;

public class Contact {
	
	private String name;
	private Address address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	} 
	
	public String toString() {
		return "\nName: " + name 
			 + "\nAddress Line1: " + address.getAddressLine1() 
			 + "\nAddress Line2: " + address.getAddressLine2()
			 + "\nCity: " + address.getCity()
			 + "\nState: " + address.getState() 
			 + "\nZip: " + address.getZip() 
			 + "\n";
	}

}
