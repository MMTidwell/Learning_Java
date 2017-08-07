//MAIN FILE AND USES THE PROMPTER AND GAME FILES

package com.treehouse;

public class hangman {
	public static void main (String[] args) {
		// holds the answer
		game game = new game("treehouse");
		// creates new prompter object
		prompter prompter = new prompter(game);
		
		// uses the prompter class to determine how many tires you have left
		while (game.getRemainingTries() > 0) {
			// calls the displayProgress method from the prompter class
			prompter.displayProgress();
			prompter.promptForGuess();
		}
		
		
// Psudocode 		
		// method called from the prompter class to have the user guess
//		boolean isHit = prompter.promptForGuess();
		
		// checks if the user guessed correctly and displays output 
//		if (isHit) {
//			System.out.println("We got a hit!");
//		} else {
//			System.out.println("Opps missed");
//		}
//		prompter.displayProgress();
	}
}




















