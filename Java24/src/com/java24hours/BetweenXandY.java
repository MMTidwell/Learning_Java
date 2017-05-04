package com.java24hours;

import java.util.*;

class BetweenXandY {
	public static void main (String[] args) {
		// generates a random number between 0 and 50
		System.out.println((int) (Math.random() * 50));
		// generates a random number between 1000 and 9999
		//		the second 1000 is the starting number
		System.out.println((int) (Math.random() * (9999 - 1000)) + 1000);
	}
}