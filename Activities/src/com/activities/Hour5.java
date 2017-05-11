package com.activities;

class Hour5 {
	public static void main (String[] args) {
		double weight = 178;
		double mercury = weight * .378;
		double moon = weight * .166;
		double jupoter = weight * 2.364;
		double venus = weight * .907;
		double uranus = weight * .889;
		
		System.out.println("Your weight on Earth is: " + weight);
		System.out.println("Your weight on Mercury is: " + mercury);
		System.out.println("Your weight on the Moon is: " + moon);
		System.out.println("Your weight on Jupiter is: " + jupoter);
		System.out.println("Your weight on Venus is: " + venus);
		System.out.println("Your weight on Uranus is: " + uranus);
		
		math(123, 225);
	}
	
	
	public static void math (int x, double y) {
//		y = Math.sqrt(y);
//		System.out.println("Y is: " + y + " after it is squared.");
//		System.out.println(x + y);
		System.out.println(x + (Math.sqrt(y)));
	}
}
