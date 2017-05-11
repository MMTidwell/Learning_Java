package com.activities;

public class Hour4 {
	public static void main (String[] args) {
		int number = 225;
		System.out.println("The square root of 225 is: " + Math.sqrt(number));
		activity();
	}

	
	public static void activity() {
		int newNumber = 625;
		System.out.println("The square root of 225 is: " + Math.sqrt(newNumber));
		nextTest(100);
	}
	
	
	public static void nextTest(int num) {
		System.out.println("The number that was passed in as an arg was: " + num + " its square root is: " + Math.sqrt(num));
	}
}
