package com.java24hours;

public class Nines {
	public static void main (String[] args) {
		for (int dex = 0; dex <= 200; dex++) {
			int multiple = 9 * dex;
			System.out.print(multiple + " ");
		}
		System.out.println("");
		System.out.println("");
		whileLoop();
	}
	
	
	public static void whileLoop() {
		int limit = 5;
		int count = 0;
		 while (count <= limit) {
			 System.out.println("Count: " + count);
			 count++;
		 }
		System.out.println("");
		doWhileLoop();
	}
	
	
	public static void doWhileLoop() {
		int limit = 0;
		int count = 5;
		do {
			System.out.println("Count: " + count);
			count--;
		} while (count >= limit);
		System.out.println("");
		breakLoops();
	}
	
	
	public static void breakLoops() {
		int points = 0;
		int target = 100;
		
		targetLoop:
			while (target <= 100) {
				for (int i = 0; i < target; i++){
					if (points > 50) {
						break targetLoop;
					}
					points++;
				}
			}
		System.out.println(points);
		System.out.println("");
		complexFor();
	}


	private static void complexFor() {
		int i, j;
		for (i = 0, j = 0; i * j < 1000; i++, j += 2) {
			System.out.println(i + " * " + j + " = " + (i * j));
		}
	}
}
