package com.java24hours;

public class Variable {
	public static void main(String[] args) {
		int tops; // whole number
		float gradePointAverage; // number with decimal 
		double pi = 3.14; // double floating point
		byte escapeKey = 27; // number between -128 and 127
		short roomNumber = 222; // range between -32,768 and 32,767
		long salary = 264_400_000; // range between -9.22 quidtillion and 9.22 quintilllion. the _ are used to make the number easier to read
		
		char key = 'C'; // single character 
		String productName = "Larvets"; // several characters
		
		boolean gameOver = false;
		
		final int TOUCHDOWN = 6; // all caps indicates that this is a constant and should not change
		
		tops = 2;
		gradePointAverage = 90;
		
		System.out.println(tops);
		System.out.println(gradePointAverage);
		System.out.println(pi);
		System.out.println(escapeKey);
		System.out.println(roomNumber);
		System.out.println(salary);
		System.out.println(key);
		System.out.println(productName);
		System.out.println(gameOver);
		System.out.println(TOUCHDOWN);
	}
}
