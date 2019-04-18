package com.techelevator.animal.abstraction;

public class AnimalApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal bird = new Bird();
		bird.getLegs();
		
		
		Bird bird2 = new Bird();
	
		
		Animal dog = new Dog();
		
		
		System.out.println(bird.eat("birdseed"));
		System.out.println(dog.eat("table scraps"));
		
		
		
		

	}

}
