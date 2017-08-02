//MAINTAINS THE LOGIC

package com.treehouse;

class game {
	// define each string
	private String answer;
	private String hits;
	private String misses;
	public static final int MAX_MISSES = 7;
	
	// constructor 
	public game(String answer) {
		this.answer = answer;
		hits = "";
		misses = "";
	}

	public boolean applyGuess(char letter) {
		// checks to see if the guess is in the answer
		boolean isHit = answer.indexOf(letter) != -1;
		if (isHit) {
			hits += letter;
		} else {
			misses += letter;
		}
		return isHit;
	}
	
	// returns _ for unguessed letters
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
	
	// provides the number for tries
	public int getRemainingTries() {
		return MAX_MISSES - misses.length();
	}
}












