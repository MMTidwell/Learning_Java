package com.java24hours;

class Root {
	public static void main(String[] arguments) {
		// declares an integer
		int number = 225;
		System.out.println("The square root of "
			// concatenating 
			+ number
			+ " is "
			// square root function called
			+ Math.sqrt(number)
		);
	}
}