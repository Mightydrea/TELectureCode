package com.techelevator.backup;

import java.util.ArrayList;
import java.util.List;

public class ContactList {
	
	private List<Contact> contactList = new ArrayList<Contact>();
	
	
    public int getListSize() {
    	return contactList.size();
    }
	
	
	public void addContact(Contact contact) {

		contactList.add(contact);
	}
	
	

}
