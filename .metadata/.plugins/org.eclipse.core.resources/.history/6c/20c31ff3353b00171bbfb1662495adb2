// Types of Arrays:
//		String[] string_name;
//		in[] string_name;
//		boolean[] string_name;
// Arrays with values
// 		int[] string_name = new int[250];
//		int arrays start with 0
//		char arrays == '\0'
//		boolean arrays are false
//		string arrays are null
// Setting up a small array with values
//		String[] reindeerNames = {
//			"Dasher", "Dancer", "Prancer", "Vixon", "Comet", 
//			"Cupid", "Donder", "Blitzen" };
//		OR
//		String[] reindeerNames = new String[8];
//		reindeerNames[0] = "Dasher";
//		reindeerNames[1] = "Dancer";
//		reindeerNames[2] = "Prancer";
//		reindeerNames[3] = "Vixon";
//		reindeerNames[4] = "Comet";
//		reindeerNames[5] = "Cupid";
//		reindeerNames[6] = "Donder";
//		reindeerNames[7] = "Blitzen";
// Using Arrays
//		int[] elfSeniority = new int[250];
//		elfSeniority[193] += 1;
//
//		String[] niceChild = null;
//		niceChild[9428] = "Eli";
//		
//		int currentNation;
//		currentNation = 413;
//		
//		boolean[] hostileAirTravelNations;
		
//		if (hostileAirTravelNations[currentNation] == true) {
//			sendGiftByMail();
//		}
// Multidimensional Array
//		boolean[][] selectedPoint = new boolean[50][50];
//		selectedPoint[4][13] = true;
//		selectedPoint[7][6] = true;
// 		selectedPoint[11][22] = true;
// Sorting an Array
//		int temporary = numbers[5];
//		numbers[5] = numbers[6];
//		numbers[6] = temporary;


package com.java24hours;

import java.util.Arrays;

public class Array {
	public static void main(String[] args) {
		String[] reindeerNames = { "Dasher", "Dancer", "Prancer", "Vixon", "Comet", 
				"Cupid", "Donder", "Blitzen", "Rudolaph"};
		System.out.println("There are " + reindeerNames.length + " reindeer.");
		System.out.println("The reindeer names are " 
				+ reindeerNames[0] + ", "
				+ reindeerNames[1] + ", "
				+ reindeerNames[2] + ", "
				+ reindeerNames[3] + ", "
				+ reindeerNames[4] + ", "
				+ reindeerNames[5] + ", "
				+ reindeerNames[6] + ", "
				+ reindeerNames[7] + " and "
				+ reindeerNames[8] + ".");
		System.out.println();
		SpaceRemover();
	}
	
	
	public static void SpaceRemover() {
		// sores string as string
		String mostFamous = "Rudolph the Red-Nosed Reindeer";
		// creates a new char array based on the string (each letter is a element)
		char[] mfl = mostFamous.toCharArray();
		// new array is created from mfl to hold only the first word
		char[] concat = {mfl[0], mfl[1], mfl[2], mfl[3], mfl[4], mfl[5], mfl[6]};
		System.out.println(concat);
		
		System.out.println(mfl[1]);
		System.out.println(mfl[2]);
		System.out.println(mfl[3]);
		System.out.println(mfl[4]);
		System.out.println(mfl[5]);
		System.out.println(mfl[6]);
		
		// loops through the mfl char array
		for (int dex = 0; dex < mfl.length; dex++) {
			char current = mfl[dex];
			// checks if current char is not a space
			if (current != ' ') {
				System.out.print(current);
			// if current is a space
			} else {
				System.out.print(".");
			}
		}
		System.out.println();
		System.out.println();
		NameSorter();
	}
	
	
	public static void NameSorter() {
		String[] names = {"Gilmmer", "Marvel", "Rue", "Clove", "Thresh", "Foxface", "Cato", "Peeta", "Katniss"};
		System.out.println("The original order is: ");
		for (int i = 0; i < names.length; i++) {
			System.out.println(i + ": " + names[i]);
		}
		System.out.println();
		Arrays.sort(names);
		System.out.println("The new order: ");
		for (int i = 0; i < names.length; i++) {
			System.out.println(i + ": " + names[i]);
		}
		System.out.println();
		Wheel();
	}
	
	
	public static void Wheel() {
		String[] phrase = {
				"A STITCH IN TIME SAVES LIVES",
				"DON'T EAT YELLOW SNOW",
				"JUST DO IT",
				"EVERY GOOD BOY DOES FINE",
				"I WANT MY MTV",
				"I LIKE IKE",
				"PLAY IT AGAIN, SAM",
				"FROSTY THE SNOWMAN",
				"ONE MORE FOR THE ROAD",
				"HOME FIELD ADVANTAGE",
				"VALENTINE'S DAY MASSACRE",
				"FROVER CLEVELAND OHIO",
				"SPAGHETTI WESTERN",
				"AQUA TEEN HUNGER FORCE",
				"IT'S A WONDERFUL LIFE"
		};
		// created to store the number of times each letter appears
		int[] letterCount = new int[26];
		for (int count = 0; count < phrase.length; count++) {
			// current value of the element passing through
			String current = phrase[count];
			// stores all the characters in the current phrase
			char[] letters = current.toCharArray();
			for (int count2 = 0; count2 < letters.length; count2++) {
				// lett == value of current letter
				char lett = letters[count2];
				// weeds out any characters that are not alpha
				if ((lett >= 'A') & (lett <= 'Z')) {
					letterCount[lett - 'A']++;
				}
			}
		}
		for (char count = 'A'; count <= 'Z'; count++) {
			// displays the letter and letter count
			System.out.print(count + ": " + letterCount[count - 'A'] + " ");
			// breaks into a new line after M is counted
			if (count =='M') {
				System.out.println();
			}
		}
		System.out.println();
	}
}





























