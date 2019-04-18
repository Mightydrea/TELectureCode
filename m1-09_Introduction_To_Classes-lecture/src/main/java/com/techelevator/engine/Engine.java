package com.techelevator.engine;

public class Engine {
	
	//declaring and initializing stuff goes here
	private String fuelType;
	private int numberOfCylinders;
	private int horsepower;
	private boolean isStarted = false;
	
	public Engine (String fuelType, int horsepower) {
		this.fuelType = fuelType;
		this.horsepower = horsepower;		
	}
	
	
	public boolean isStarted() {
		return isStarted;
	}


	public void startEngine() {
		this.isStarted = true;
	}


	public String getFuelType() {
		return fuelType;
	}


	public int getNumberOfCylinders() {
		return numberOfCylinders;
	}


	public void setNumberOfCylinders(int numberOfCylinders) {
		this.numberOfCylinders = numberOfCylinders * 4;
    }
	
	
	public String shutoff() {
		String status = null;
		if (this.isStarted) {
		   this.isStarted = false;
		   status = "engine shutoff successfully";
		} 
		else {
			status = "it was already off";
		}
		return status;
	}


	public int getHorsepower() {
		return horsepower;
	}


	public void setHorsepower(int horsepower) {
		if (horsepower < 0) {
			this.horsepower = 0;
		}
		this.horsepower = horsepower;
	}


	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	
	
	
	

	


}
