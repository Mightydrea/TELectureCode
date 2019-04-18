package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class ArrayListReview {

	public static void main(String[] args) {

		List<String> students = new ArrayList<String>();

		students.add("Steve"); // index 0
		students.add("Bruce"); // index 1
		students.add("Chris"); // index 2
		students.add(new String("Maulik")); // add in one line

		String s = "Christian"; // another way - by adding a string variable to list
		students.add(s);

		// System.out.println(students);

		String chrisName = students.get(2);
		students.remove(2);

		// System.out.println(students);

		// loop variation - traditional for loop
		for (int i = 0; i < students.size(); i++) {
			System.out.println(students.get(i));
		}

		// alternate loop approach using for each
		System.out.println();

		for (String x : students) {
			System.out.println(x);
		}

	}

}
