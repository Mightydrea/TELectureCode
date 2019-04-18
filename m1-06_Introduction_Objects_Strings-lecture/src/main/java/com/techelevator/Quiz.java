package com.techelevator;

public class Quiz {

	public static void main(String[] args) {

		
		
		//  #10  QUIZ   
		
		int answer = 0; 

		for(int i = 0; i < 10; i++) { 

		    if(i % 3 != 0) { 

		        answer = answer + i; 

		    } 

		} 

		System.out.println(answer);		
		
		
		
		// #11
		int sum = 0;

		for(int i = 10; i > 0; i -= 5) {

		    sum += i;

		}

		System.out.println(sum);
		
		// # 12
		int[] numbers = new int[10];

		int sum2 = 0;

		for(int ix = 0; ix < numbers.length; ix++) {

		    sum2 += ix;

		    numbers[ix] = sum2;

		}

		int result = numbers[4];	
		System.out.println(result);
		
		
		
		

	}

}
