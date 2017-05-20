package com.java24hours;

// new object
class NewRoot {
	public static void main (String[] args) {
		// int variable
		int number = 100;
		// checks to see if there are any arguments passed when running the program
		if (args.length > 0) {
			// creates an integer value based on the contents of the string
			// when you pass in an arg via the terminal or the configurations the 
				// arg is passed in as a string and must be cast into a int
			number = Integer.parseInt(args[0]);
		}
		System.out.println("The square root of "
				+ number
				+ " is "
				+ Math.sqrt(number)
		);
	}
}
