package com.techelevator.animal.abstraction;

public class Bird extends Animal {
	
	private int feather;
	
	
	public void fly() {
		System.out.println("I am flying");
	}
	
	public String eat(String food) {
		return "Pecking at: " + food;
	}

	@Override
	public void breathe() {
		// TODO Auto-generated method stub

		
	}

}
