//DEALS WITH THE IO

package com.treehouse;

import java.util.Scanner;

public class prompter {
	// creates new game object
	private game game;
	
	// constructor 
	public prompter(game game) {
		this.game = game;
	}
	

	public boolean promptForGuess() {
		// calls the scanner method from util
		Scanner scanner = new Scanner(System.in);
		// asks for input from the user
		System.out.println("Enter a letter");
		// gets the input from the user
		String guessInput = scanner.nextLine();
		// checks to see if it is a letter
		char guess = guessInput.charAt(0);
		// returns the guess
		return game.applyGuess(guess);
	}
	
	// shows the user how many tires they have left, by using methods from the game class	
	public void displayProgress() {
		System.out.printf("You have %d tries left to solve: %s%n", 
						   game.getRemainingTries(), 
						   game.getCurrentProgress());
	}
}















