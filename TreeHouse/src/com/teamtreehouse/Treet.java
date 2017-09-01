package com.teamtreehouse;

// process of translating objects into a format that can be stored and recreated later in the same or different environment
import java.io.Serializable;
import java.util.Date;

public class Treet implements Comparable<Treet>, Serializable {
	// Stabilizes the serialization
	private static final long serialVersionUID = 7146681148113043748L;
	// Member variables
	private boolean mBreakIt = true;
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
		return String.format("Treet:  \"%s\" by %s on %s",
				mDescription, mAuthor, mCreationDate);
	}
	
	// compares the treets by mCreationDate and mDescription
	@Override
	public int compareTo(Treet other) {
		// check it is == to other
		if (equals (other)) {
			return 0;
		}
		
		// checks the creation date
		int dateCmp = mCreationDate.compareTo(other.mCreationDate);
		if (dateCmp == 0) {
			return mDescription.compareTo(other.mDescription);
		}
		return dateCmp;
	}
	
	// Getter methods to get the info needed
	public String getAuthor() {
		return mAuthor;
	}
	
	// gets the description string
	public String getDescription() {
		return mDescription;
	}
	
	// gets the creation date
	public Date getCreationDate() {
		return mCreationDate;
	}
	
	// takes the string and splits it based on the spaces and special characters
	public String[] getWords() {
		return mDescription.toLowerCase().split("[^\\w#@']");
	}
}