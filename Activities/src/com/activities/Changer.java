package com.activities;

public class Changer {
	public static void main (String[] args) {
		if (args.length > 0) {
			System.out.println("The original value: " + args[0]);
			// takes the arg and turns it into a float
			Float num1 = new Float(args[0]);
			// takes the float and turns it into a object
			float num2 = num1.floatValue();
			// takes the object and turns it into a int
			int num3 = (int)num2;
			System.out.println("The final value: " + num3);
		}
	}
}
