package com.techelevator.engine;

public class EngineApp {

	public static void main(String[] args) {
	
		System.out.println("This is my awesome engine app");
		
		Engine fordEngine = new Engine("gas", 9000);
		
		boolean isStartedYet = fordEngine.isStarted();
		System.out.println("Is my engine started: " + isStartedYet);
		fordEngine.startEngine();
		fordEngine.setNumberOfCylinders(4);
		System.out.println(fordEngine.getNumberOfCylinders());
		String status = fordEngine.shutoff();
		System.out.println("Status: " + status);		
		
		System.out.println("Is my engine started now?: " + fordEngine.isStarted());
		
		//Engine chevyEngine = new Engine()
		//chevyEngine.setFuelType("gas");
		
		
		
		

	}

}
