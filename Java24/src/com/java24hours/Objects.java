// Objects contain 2 things
	// Attributes - things that describe the object and show how it is diff 
		// from other objects
	// Behaviors - what an object does
// Syntax
	// public class Name {}
// Calling an object
	// Modem device = new Modem();
// Set objects variables and call methods
	// device.speed = 28800;
// Calling on a method from object
	// device.displaySpeed();
// Extending from another class
	// public class Name extends Original_Object {}
// Casting
	// float source = 7.06F;
	// int destination = (int) source;
// Subclass calling a class
	// public void paintComponenet (Graphics comp) {
		// Graphics2D comp2D = (Graphics2D) comp;
	// }

package com.java24hours;

public class Objects {
	// objects attributes
	// called instance variables or member variables
	static int speed;
	
	public static void main (String[] args) {
		// class's behavior
		System.out.println("Speed: " + speed);
	}
}
