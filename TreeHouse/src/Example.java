import java.util.ArrayList;
import java.util.Arrays;
//import java.awt.List;
import java.util.List;
import java.util.Date;
// imports sets
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
// imports maps
import java.util.HashMap;
import java.util.Map;


// we are importing the package because it is in another package
import com.teamtreehouse.Treet;
import com.teamtreehouse.Treets;


public class Example {
//	// first method ran
//	public static void main(String[] args) {
//		// creating new Treet obj and passing in params
//		Treet treet = new Treet("Craig", 
//				"Want to be famous? Simply tweet about Java and use the hashtag #treet."
//				+ " I'll use your tweet int he new @treehouse course about data "
//				+ "structures.",
//				new Date(1421871332000L));
//		Treet secondTreet = new Treet("jjourneytocode", 
//				"@treehouse make learning Java soooo fun! #treet",
//				new Date(1421878767000L));
//		
//		System.out.printf("This is a new Treet: %s\n", treet);
//		
//		System.out.println("The words are: ");
//		// each time through the loop, it will take a word and place it into the word
//			// variable. Then we are going to print out each word.
//		for (String word : treet.getWords()) {
//			System.out.println(word);
//		}
//		
//		// creates trees obj holding both treet and secondTreet obj
//		Treet[] treets = {treet, secondTreet};
//		// sorts the treets obj
//		Arrays.sort(treets);
//		for (Treet exampleTreet : treets) {
//			System.out.println(exampleTreet);
//		}
//		
//		// used for Serializable
//		Treets.save(treets);
//		Treet[] reloadedTreets = Treets.load();
//		for (Treet reloaded : reloadedTreets) {
//			System.out.println(reloaded);
//		}
//	}
	
	// THIS METHOD WILL ONLY RETURN 1 HASHTAG AS IT IS ONLY LOOKING AT THE FIRST TWEET
	public static void main(String[] args) {
		// Treets are loading from twitter
		Treet[] treets = Treets.load();
		System.out.printf("There are %d treets.%n", treets.length);
		
		// // NO LONGER NEEDED SINCE WE HAVE THE TWEET LOADING AUTOMATICALLY
//		// This is the original treets variable
//		Treet originalTreet = treets[0];
//		System.out.println("Hashtas:");
//		// Looping through originalTreet using the .getHashTags method from Treet class
//		for (String hashtag : originalTreet.getHashTags()) {
//			System.out.println(hashtag);
//		}
		
		// Creates new set (Hash and Tree)
		Set<String> allHashTags = new HashSet<String>();
		Set<String> allMentions = new TreeSet<String>();
		
		// loops through the treets and counts each one
		// THIS SHOULD BE PRINTING OUT ALL OF THE TWEETS HASHES AND MENTIONS, BUT DUE
			// TO NOT LOADING TWITTER IT IS NOT WORKING..
 		for (Treet treet : treets) {
			allHashTags.addAll(treet.getHashTags());
			allMentions.addAll(treet.getHashTags());
		}
		System.out.printf("Hashtags: %s %n", allHashTags);
		System.out.printf("Mentions: %s %n", allMentions);
		
		// find the most popular hashtag
		Map<String, Integer> hashTagCounts = new HashMap<String, Integer>();
		for (Treet treet : treets) {
			for (String hashTag : treet.getHashTags()) {
				Integer count = hashTagCounts.get(hashTag);
				if (count == null) {
					count = 0;
				}
				count++;
				hashTagCounts.put(hashTag, count);
			}
		}
		System.out.printf("Hash tag counts: %s %n", hashTagCounts);
		
		// getting the treet by author
		Map<String, List<Treet>> treetsByAuthor = new HashMap<String, List<Treet>>();
		for (Treet treet : treets) {
			List<Treet> authoredTreets = treetsByAuthor.get(treet.getAuthor());
			if (authoredTreets == null) {
				authoredTreets = new ArrayList<Treet>();
				treetsByAuthor.put(treet.getAuthor(), authoredTreets);
			}
			authoredTreets.add(treet);
		}
		System.out.printf("Treets by author: %s %n", treetsByAuthor);
		System.out.printf("Treets by Craig: %s%n", treetsByAuthor.get("Craig"));
	}
}










