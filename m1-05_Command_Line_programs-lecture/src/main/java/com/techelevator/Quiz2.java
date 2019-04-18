package com.techelevator;

public class Quiz2 {

	public static void main(String[] args) {
		
		//#2
		int answer = 0;
		for (int i = 0; i<10; i++) {
			if (i %2 == 0) {
				answer = answer + i;
			}
		}
		System.out.println(answer);
		
		
		//#3
		int sum = 0;
		
		for (int i = 10; i > 0; i -=3) {
			sum += i;
		}
		
		System.out.println(sum);
		
		
		
		
		//#6
		
		for(int i = 0; i < 5; i++) {
			int sum2 = 0;

	         sum2 += i;

	         System.out.print(sum2 + " "); 
	    }
		
		

		
		
		
		
		
	}	
	
}
