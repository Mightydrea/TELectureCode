package com.techelevator;

public class Contact {

	private long contactId;
	private Address address;
	
	
	public long getContactId() {
		return contactId;
	}
	public void setContactId(long contactId) {
		this.contactId = contactId;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public String toString() {
		return "CONTACTID: " + contactId + address.toString(); 
	}
	
	
}
