package com.java24hours;

public class Wheel {
	public static void main (String[] args) {
		String phrase[] = {
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
		// created with 26 elements and is used to store the count for each letter as it appears
		int letterCount[] = new int[26];
		// cycles through the phrase 
		for (int count = 0; count < phrase.length; count++) {
			// sets the value to the current element of the phrase array
			String current = phrase[count];
			// stores all of the characters in the current array
			char  letters[] = current.toCharArray();
			// cycles through the letters of the current phrase
			for (int count2 = 0; count2 < letters.length; count2++) {
				// created with the value of the current letter
				char lett = letters[count2];
				// if statement weeds out any characters that are not letters
				if ((lett >= 'A') & (lett <= 'Z')) {
					letterCount[lett - 'A']++;
				}
			}
		}
		// cycles through the alphabet from A to Z
		for (char count = 'A'; count <= 'Z'; count++) {
			System.out.print(count + ": " + letterCount[count - 'A'] + " ");
			// Separates output onto 2 lines
			if (count == 'M') {
				System.out.println();
			}
		}
		System.out.println();
	}
}
