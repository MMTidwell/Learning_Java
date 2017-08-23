package com.teamtreehouse;

import java.util.Date;

public class Treet {
	// Member variables
	private String mAuthor;
	private String mDescription;
	private Date mCreationDate;
	
	// Constructor
	public Treet(String author, String description, Date creationDate) {
		mAuthor = author;
		mDescription = description;
		mCreationDate = creationDate;
	}
	
	// Override forces the method to be used, else a error occurs
	@Override
	public String toString() {
		return "Treet: \"" + mDescription + "\" - @" + mAuthor;
	}
	
	// Getter methods to get the info needed
	public String getAuthor() {
		return mAuthor;
	}
	
	public String getDescription() {
		return mDescription;
	}
	
	public Date getCreationDate() {
		return mCreationDate;
	}	
}