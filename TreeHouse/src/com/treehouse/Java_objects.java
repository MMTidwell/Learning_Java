package com.treehouse;

public class Java_objects {
	public static void main (String[] args) {
		System.out.println("We are making a new PEZ Dispenser.");
		System.out.printf("There are %d PEZ allowed in every dipenser. %n", Pez_Dispenser.MAX_PEZ);
		
		// Pulls in the Pez_Dispenser.java class with out importing because it is in the same Package
		// new Pez_Dispenser(); creates a child of Pez_Dispenser
		Pez_Dispenser dispenser = new Pez_Dispenser("Donatello");
		System.out.printf("The dispenser is %s. %n", dispenser.getTheCharacterName());
		
		// uses the fill method from pez_disponsor.java
		System.out.println("Filling the dipsoenser with delicious PEZ...");
		dispenser.fill();
		
		// checks if the dispenser is empty
		if (dispenser.isEmpty()) {
			System.out.println("Dispenser is empty.");
		}
		
		if (!dispenser.isEmpty()) {
			System.out.println("Dispenser is not empty.");
		}
		
		//  eating all of the pez
		while (dispenser.dispense()) {
			System.out.println("Chomp!");
		}
		
		if (dispenser.isEmpty()) {
			System.out.println("I ate all of my PEZ!");
		}
		
		// fills pez by using the fill method in the pez_dispenser
		dispenser.fill(4);
		dispenser.fill(2);
		while (dispenser.dispense()) {
			System.out.println("Chomp!!!!");
		}
		
		// try to over fill the dispenser
		try {
			dispenser.fill(2000);
			System.out.println("This will never happen!");
		} catch (IllegalArgumentException iae){
			System.out.println("Whoa there!");
			System.out.printf("the error was %s.", iae.getMessage());
		}
		
		
		// We can change or override the contents of the variable
//		dispenser.getTheCharacterName() = "Darth Vader";
//		System.out.printf("The dispenser is %s.", dispenser.getTheCharacterName());
	}
}
