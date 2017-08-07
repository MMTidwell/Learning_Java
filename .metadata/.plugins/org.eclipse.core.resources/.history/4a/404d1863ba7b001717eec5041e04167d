//MAIN FILE AND USES THE PROMPTER AND GAME FILES

package com.treehouse;

public class hangman {
	public static void main (String[] args) {
		if (args.length == 0) {
			System.out.println("Usage:   Java Hangman <answer>");
			System.out.println("answer is required");
			System.out.println("Change the args in Run Configerations");
			System.exit(1);
		}
		
		// holds the answer
		game game = new game(args[0]);
		// creates new prompter object
		prompter prompter = new prompter(game);
		
		// uses the prompter class to determine how many tires you have left
		while (game.getRemainingTries() > 0 && !game.isWon()) {
			// calls the displayProgress method from the prompter class
			prompter.displayProgress();
			prompter.promptForGuess();
		}
		prompter.displayOutcome();
		
		
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




















