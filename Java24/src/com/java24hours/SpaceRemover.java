package com.java24hours;

public class SpaceRemover {
	public static void main(String[] args) {
		String mostFamous = "Rudolph the Red-Nosed Reindeer";
		char [] mfl = mostFamous.toCharArray();
		for (int dex = 0; dex < mfl.length; dex++) {
			char current = mfl[dex];
			// removes the space between words
			if (current != ' ') {
				System.out.print(current);
			} else {
				// adds the . between each word
				System.out.print(".");
			}
		}
		System.out.println();
		multiArray();
	}
	
	
	public static void multiArray() {
		boolean [] [] selectedPoint = new boolean [50] [50];
		selectedPoint[4][13] = true;
		selectedPoint[7][6] = true;
		selectedPoint[11][22] = true;
	}
}
