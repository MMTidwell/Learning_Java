package com.activities;

class Point4DTester {
	public static void main (String[] args) {
		Point4D object1 = new Point4D (10,22,71,26);
		
		System.out.println("The 4D point is located at (" 
				+ object1.x + ", " + object1.y + ", "  + object1.z + ", "  + object1.getTime() + ")");
		System.out.println("\tIt's moveing to (10,22,71,27)");
		object1.move(10, 22, 71, 27);
		System.out.println("The 4D point is now at ("
				+ object1.x + ", " + object1.y + ", "  + object1.z + ", "  + object1.getTime() + ")");
		System.out.println("\tIt's moveing 20 units on the t axes.");
		object1.translate(0, 0, 0, 20);
		System.out.println("The 4D pint ends up at ("
				+ object1.x + ", " + object1.y + ", "  + object1.z + ", "  + object1.getTime() + ")");
	}
}
