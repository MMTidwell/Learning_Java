// To run this program you must run configurations and enter a number argument 
package com.activities;

public class VirusLab1 {
	// main class, needed in order to run the program
	public static void main(String[] arguments) {
		Virus1 smash = new Virus1();
		Virus1 crash = new Virus1();
		Virus1 crumble = new Virus1();
		
		System.out.println("There are " + Virus1.getVirusCount()
				+ " viruses.");
		System.out.println("Attempting to change the value of newSeconds"
				+ "	to 20.");
		
		if (smash.setNewSeconds(30) == true) {
			System.out.println("Attempt succeeded.");
		} else {
			System.out.println("Attempt failed.");
		}
		
		System.out.println("The smash Virus1 object has a newSeconds value"
				+ " of " + smash.getNewSeconds());
		System.out.println("Attempting to change the valueof newSeconds"
				+ " to 90.");
		
		if (smash.setNewSeconds(90) == true) {
			System.out.println("Attempt succedded.");
		} else {
			System.out.println("Attempt failed");
		}
		
		System.out.println("The smash Virus1 object has a new newSeconds"
				+ " value of " + smash.getNewSeconds());
	}
}
