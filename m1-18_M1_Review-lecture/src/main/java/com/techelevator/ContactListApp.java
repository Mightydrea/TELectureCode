package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContactListApp {
	
	private static final String ADD_CONTACT = "1";
	private static final String WRITE_FILE = "2";
	private static final String EXIT = "3";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ContactListApp myApp = new ContactListApp();

		List<Contact> contacts = new ArrayList<Contact>();

		try (Scanner userInputScanner = new Scanner(System.in)) {
			
			printMenu();
			String choice = userInputScanner.nextLine();
			
			int counter = 0;

			while (!choice.equals(EXIT)) {
				
				if (counter > 0) {
				   printMenu();
				   choice = userInputScanner.nextLine();	
				}  

				if (choice.equals(ADD_CONTACT)) {

					System.out.println("Is this contact a (B)usiness or (I)ndividual?");
					String type = userInputScanner.nextLine();

					if (type.equalsIgnoreCase("B")) {

						contacts.add(retrieveBusinessContactInformation(userInputScanner));

					} else if (type.equalsIgnoreCase("I")) {

						contacts.add(retrieveIndividualContactInformation(userInputScanner));

					} else {
						System.out.println("Wrong. Try again!");
					}
				}	
				else if (choice.equals(WRITE_FILE)) {
					//go write a file
					System.out.println("Go write the file!");
					writeToFile(contacts);
					
					System.exit(0);
				}
				counter++;

			}

			System.out.println("LIST SIZE:" + contacts.size());

		}

	}
	
	private static void writeToFile(List<Contact> contactsToPrint) {
		
		
		File outputFile = new File("outputFile.txt");
		try(PrintWriter writer = new PrintWriter(outputFile)) {
			for (Contact c : contactsToPrint) {
								
//				if (c instanceof IndividualContact) {

				writer.write(c.toString());
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	private static void printMenu() {
		System.out.println("***************");
		System.out.println("1.  Add a contact");
		System.out.println("2.  Export contact list to file");
		System.out.println("3.  Exit");
		
	}

	private static Address retrieveAddressInformation(Scanner userInputScanner) {
		Address address = new Address();

		System.out.println("What is your Address Line1?");
		address.setAddressLine1(userInputScanner.nextLine());

		System.out.println("What is your Address Line2?");
		address.setAddressLine2(userInputScanner.nextLine());

		System.out.println("What is your City?");
		address.setCity(userInputScanner.nextLine());

		System.out.println("What is your State?");
		address.setState(userInputScanner.nextLine());

		System.out.println("What is your Zip");
		address.setZip(userInputScanner.nextLine());

		return address;

	}

	private static Contact retrieveIndividualContactInformation(Scanner userInputScanner) {

		IndividualContact ind = new IndividualContact();
		System.out.println("What is your first name?");
		ind.setFirstName(userInputScanner.nextLine());

		System.out.println("What is your last name?");
		ind.setLastName(userInputScanner.nextLine());

		System.out.println("What is your contact id?");
		String id = userInputScanner.nextLine();
		ind.setContactId(new Long(id).longValue());

		ind.setAddress(retrieveAddressInformation(userInputScanner));

		return ind;

	}

	private static Contact retrieveBusinessContactInformation(Scanner userInputScanner) {
		Business businessContact = new Business();
		System.out.println("What is your business name?");
		businessContact.setBusinessName(userInputScanner.nextLine());

		System.out.println("What is your DBA name?");
		businessContact.setDoingBusinessAs(userInputScanner.nextLine());

		System.out.println("What is your contact id?");
		String id = userInputScanner.nextLine();
		try {
			businessContact.setContactId(new Long(id).longValue());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			businessContact.setContactId(-1);
		}

		businessContact.setAddress(retrieveAddressInformation(userInputScanner));

		return businessContact;
	}

}
