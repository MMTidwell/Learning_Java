/*
 * JVM related things
 */
package com.treehouse;

import java.util.Set;
import java.util.TreeSet;

public class Systemizer {
	public static void main(String[] args) {
		// this will give you the file path
		System.out.printf("This is the classpath:  %s%n", 
				System.getProperty("java.class.path"));
		Set<String> propNames = new TreeSet<String>(
				System.getProperties()
				.stringPropertyNames());
		for (String propertyName:propNames) {
			// this will give you the property 
			System.out.printf("%s is %s%n",
					propertyName,
					System.getProperty(propertyName));
		}
	}
}
