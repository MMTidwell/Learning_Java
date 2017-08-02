package com.treehouse;

public class Pez_Dispenser {
	// if we set this variable to "private" then we can not change the value of the variable
	// final will not allow the value of the variable to be changed
	final private String characterName;
	// constant
	public static final int MAX_PEZ = 12;
	// store how many pez are in the dispenser
	private int pezCount;
	
	
	// Gives access to be able to change the characerName value
	public Pez_Dispenser(String characterName) {
		this.characterName = characterName;
		pezCount = 0;
	}
	
	// This will allow access to the characterName String
	public String getTheCharacterName() {
		return characterName;
	}
	
	// fills the Pez Dispenser
	public void fill() {
		fill(MAX_PEZ);
	}
	
	// fills the pez 
	public void fill(int pezAmount) {
		int newAmount = pezCount + pezAmount;
		if (newAmount > MAX_PEZ) {
			throw new IllegalArgumentException("Too many PEZ!!");
		}
		pezCount = newAmount;
	}
	
	public boolean dispense() {
		boolean wasDispensed = false;
		if (!isEmpty()) {
			pezCount--;
			wasDispensed = true;
		}
		return wasDispensed;
	}

	public boolean isEmpty() {
		return pezCount == 0; 
	}
}