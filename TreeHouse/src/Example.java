import java.util.Arrays;
import java.util.Date;

import com.teamtreehouse.Treet;
import com.teamtreehouse.Treets;


public class Example {
	public static void main(String[] args) {
		// creates a new instance of treet
//		Treet treet = new Treet(
//				"craigsdennis",
//				"Want to be famous? Simply tweet about Java and use the hashtag #treet. Ill use your tweet in a new @treehouse course about data structures.",
//				new Date(1421849732000L)
//		);
//		
//		Treet secondTreet = new Treet(
//				"journeytocode",
//				"@treehouse makes learning Java soooooo fun! #treet",
//				new Date(1421878767000L)
//		);
//		
//		// prints
//		System.out.printf("This is a new Treet: %s\n", treet);
//		System.out.println("The words are:");
//		
//		// prints each word in the array
//		for (String word: treet.getWords()) {
//			System.out.println(word);
//		}
//		
//		// creates treets array
//		Treet[] treets = {treet, secondTreet};
//		// sorts treets
//		Arrays.sort(treets);
//		
//		// prints out each treet based on the array
//		for (Treet exampleTreet : treets) {
//			System.out.println(exampleTreet);
//		}
//		Treets.save(treets);
		Treet[] reloadedTreets = Treets.load();
		for (Treet reloaded : reloadedTreets) {
			System.out.println(reloaded);
		}
	}
}



