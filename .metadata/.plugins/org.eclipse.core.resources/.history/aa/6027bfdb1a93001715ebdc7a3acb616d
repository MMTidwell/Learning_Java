package com.treehouse;

// Game Class is used for game logic
public class Game {
	private String answer;
	private String hits;
	private String misses;
	
	// constructor
	public Game(String answer) {
		this.answer = answer;
		hits = "";
		misses = "";
	}
	
	// checks to see if guessed letter is in the answer
	public boolean applyGuess(char letter) {
		boolean isHit = answer.indexOf(letter) != -1;
		
		if (isHit) {
			hits += letter;
		} else {
			misses += letter;
		}
		return isHit;
	}
}
