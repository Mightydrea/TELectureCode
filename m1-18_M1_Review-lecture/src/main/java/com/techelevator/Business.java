package com.techelevator;

public class Business extends Contact{
	
	private String businessName;
	private String doingBusinessAs;
	
	public String getBusinessName() {
		return businessName;
	}
	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}
	public String getDoingBusinessAs() {
		return doingBusinessAs;
	}
	public void setDoingBusinessAs(String doingBusinessAs) {
		this.doingBusinessAs = doingBusinessAs;
	}
	
	public String toString() {
	     return "\nBUSINESS NAME: " + businessName + 
	    		 "\nDBA NAME: " + doingBusinessAs +
	    		 super.toString();
	}
	

}
