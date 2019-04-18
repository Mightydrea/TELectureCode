package com.techelevator;

import java.util.Scanner;

public class InputASequenceOfNumbersAndParse {
	
	public static void main(String[] args) {
		
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Please enter in a series of numeric values (separated by commas): ");

			String input = scanner.nextLine();
			String[] numbers = input.split(",");          // note: these are String representation of numbers....
			for (int i=0; i<numbers.length; i++) {
				System.out.println("i = " + numbers[i]);
			}
		}
	}
	
}
