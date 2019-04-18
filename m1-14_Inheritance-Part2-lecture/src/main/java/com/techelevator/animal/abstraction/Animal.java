package com.techelevator.animal.abstraction;

public abstract class Animal implements IPoop{

	private int legs;
	
	public String eat(String food) {
		return food + " is good";
	}

	@Override
	public void poop() {
		// TODO Auto-generated method stub
		
	}

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}
	
	public abstract void breathe(); 
	
	
	public final String yawn() {
		return "yawn";
	}
	
	
}
