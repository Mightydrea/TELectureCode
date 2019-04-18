package com.techelevator.backup;

import java.util.Scanner;

public class ContactListApp {

	private static Scanner inputScanner;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContactList contactList = new ContactList();

		inputScanner = new Scanner(System.in);

		while (true) {
			printMenu();
			String choice = inputScanner.nextLine();

			if (choice.equals("1")) {
				contactList.addContact(createContact());
			} else if (choice.equals("2")) {
				System.out.println("NOT IMPLEMENTED");
			} else if (choice.equals("3")) {
				System.out.println("bye!");
				System.exit(1);
			} else {
				System.out.println("You have entered an invalid input");
			}

			System.out.println("List size: " + contactList.getListSize());
		}
	}

	private static Contact createContact() {

		Contact contact = new Contact();
		Address address = new Address();

		System.out.println("Please enter a name: ");
		String name = inputScanner.nextLine();
		contact.setName(name);

		System.out.println("Please enter address line 1: ");
		String addressLine1 = inputScanner.nextLine();
		address.setAddressLine1(addressLine1);

		System.out.println("Please enter address line 2: ");
		String addressLine2 = inputScanner.nextLine();
		address.setAddressLine2(addressLine2);

		System.out.println("Please enter a city: ");
		String city = inputScanner.nextLine();
		address.setCity(city);

		System.out.println("Please enter state: ");
		String state = inputScanner.nextLine();
		address.setState(state);

		System.out.println("Please enter zip: ");
		String zip = inputScanner.nextLine();
		address.setZip(zip);

		// set address object inside contact object
		contact.setAddress(address);

		System.out.println(contact.toString());

		return contact;
	}

	private static void printMenu() {

		System.out.println("********************");
		System.out.println("(1) Add a contact to list");
		System.out.println("(2) Export list to file");
		System.out.println("(3) Exit");
		System.out.println("********************");
	}

}
