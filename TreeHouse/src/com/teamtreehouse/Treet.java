/*
 * We are building a tweet counter. Here are some things that we will need to consider
 * 		- Author
 * 		- When it was posted
 * 		- Description
 */

package com.teamtreehouse;

import java.util.Date;

public class Treet {
	// declaring the private variables that are listed above
	private String mAuthor;
	private String mDiscription;
	private Date mCreationDate;
	
	// constructor
	public Treet(String author, String discription, Date creationDate) {
		mAuthor = author;
		mDiscription = discription;
		mCreationDate = creationDate;
	}
	
	// Override will tell the compiler that we are intending to 
		// override the method
	@Override
	// returns a string representation of the obj
	public String toString() {
		return "Treet:  \"" + mDiscription + "\" - @" + mAuthor + "\n\n";
	}
	
	// creating the getters for author, description, and creationDate
	// we are not creating setters with these in order to make them immutable
	public String getAuthor() {
		return mAuthor;
	}
	
	public String getDiscription() {
		return mDiscription;
	}
	
	public Date getDate() {
		return mCreationDate;
	}
}