package com.java24hours;

public class Virus11 {
	// "public" - access from another program that is using the Virus11 object
	// "protected" - access only in the same class, any subclass of that class, or by classes in the same package
	// "private" - can only use in the same class
	public int newSeconds = 86;
	public String author = "Sam Snett";
	// w/o "public" makes it to where this variable can only be used within this class
	int maxFileSize = 30000;
	// "static" - creates class variables
	static int virusCount = 0;
}
