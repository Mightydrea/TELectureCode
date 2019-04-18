package com.techelevator;

import java.util.Scanner;

/*
Write a simple program that prompts the user for a distance, then asks the user
for a unit of measurement (k) for kilometers,  (m) for miles.  
After they submit the information, calculate the response: 
    If miles, convert to km. If km, convert to miles. If they enter something other than k or m, print 
    You goofed!

Then ask them if they want to do another (Y/N). If they answer Y, repeat, 
if N, exit.

(distance in kilometers) ≈ distance in miles / 0.62137
(distance in miles) ≈ 0.6214 * (distance in kilometers)
*/

public class KilometersAndMiles {

	public static void main(String[] args) {
		
		try (Scanner scanner = new Scanner(System.in)) {
			
			
			
			boolean shouldWeLoop = true;
			
			while (shouldWeLoop) {
			
			
				System.out.println("Enter a distance to convert (in whole numbers)");
				String distanceToConvert = scanner.nextLine();
				int distanceAsInteger = Integer.parseInt(distanceToConvert);
			
				System.out.println("Enter a unit of measurement (m) for miles, (k) for kilometers.");
				String unitOfMeasurement = scanner.nextLine();
	        
				System.out.println(unitOfMeasurement);
	        
				if (unitOfMeasurement.equalsIgnoreCase("m")) {
					// convert miles to kilometers
					float  km = distanceAsInteger / 0.62137f;
					System.out.println(distanceAsInteger + " in miles is: " + km + " kilometers");
				}
				else if (unitOfMeasurement.equalsIgnoreCase("k")) {
					//convert to miles
					float miles = distanceAsInteger * 0.6214f;
					System.out.println(distanceAsInteger + " in miles is: " + miles);
				}
				else {
					System.out.println("Try again. You can't follow directions");
				}
				
				System.out.println("Do you want to continue? (Y)es or (N)o");
				String answer = scanner.nextLine();
				if (answer.equalsIgnoreCase("N")) {
					shouldWeLoop = false;
				}
				
			} //end of while loop
			
			
			
		}
		

		
	}		
		

}
