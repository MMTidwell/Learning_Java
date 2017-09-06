package com.treehouse;

// Game Class is used for game logic
public class Game {
	public static final int MAX_MISSES = 7;
	private String answer;
	private String hits;
	private String misses;
	
	// constructor
	public Game(String answer) {
		this.answer = answer.toLowerCase();
		hits = "";
		misses = "";
	}
	
	public String getAnswer() {
		return answer;
	}
	
	// normalizes the input, so that you are forced to enter a lower case letter
	private char normalizeGuess(char letter) {
		// Checks that the scanner in is a letter and not something crazy
		if (!Character.isLetter(letter)) {
			throw new IllegalArgumentException("a letter is required.");
		}
		letter = Character.toLowerCase(letter);
		
		// Checks to see if the guess has already been guessed
		if (misses.indexOf(letter) != -1 || hits.indexOf(letter) != -1) {
			throw new IllegalArgumentException(letter +  " has already been guessed.");
		}
		return letter;
	}
	
	// Checks that there is a letter in the string that is passed
	public boolean applyGuess(String letters) {
		if (letters.length() == 0) {
			throw new IllegalArgumentException("no letter was found.");
		}
		return applyGuess(letters.charAt(0));
	}
	
	// checks to see if guessed letter is in the answer
	public boolean applyGuess(char letter) {
		letter = normalizeGuess(letter);
		
		// boolean created to use in if statement bellow
		boolean isHit = answer.indexOf(letter) != -1;
		if (isHit) {
			hits += letter;
		} else {
			misses += letter;
		}
		return isHit;
	}
	
	// displays the current progress
	public String getCurrentProgress() {
		String progress = "";
		for (char letter : answer.toCharArray()) {
			char display = '_';
			if (hits.indexOf(letter) != -1) {
				display = letter;
			}
			progress += display;
		}
		return progress;
	}
	
	// How many tries are left??
	public int getRemainingTries() {
		return MAX_MISSES - misses.length();
	}
	
	public boolean isWon() {
		return getCurrentProgress().indexOf('_') == -1;
	}
}











