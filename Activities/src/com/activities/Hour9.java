package com.activities;

public class Hour9 {
	public static void main (String[] args) {
		// Declares multidim array called student 
		int[][] student = new int[6][6];
		// declares the grades for each student based on their names
		int[] janice = {90,85,85,75,70,95};
		int[] mikey = {95,85,85,70,75,90};
		int[] nicki = {85,80,85,95,100,100};
		int[] bernice = {80,90,90,80,85,95};
		int[] ernest = {75,45,80,95,90,90};
		int[] bigMike = {90,90,90,95,70,65};
		
		// declares the students to the index of the student array
		student[0] = janice;
		student[1] = mikey;
		student[2] = nicki;
		student[3] = bernice;
		student[4] = ernest;
		student[5] = bigMike;
		
		// placeholder for each student grades summed
		int gradeSum = 0;
		// placeholder for each student grades
		int[] studentSum = new int[6];
		
		// holds the index number for each student
		for (int i = 0; i < 6; i++) {
			// prints the first line "Student: 1"
			System.out.println("Student: " + i);
			studentSum[i] = 0;
			// holds the sum of each student
			for (int j = 0; j < 6; j++) {
				// total sum for all student grades
				gradeSum += student[i][j];
				// total sum for each students grades
				studentSum[i] += student[i][j];
			}
			// displays each students average
			System.out.println(" Average grade: " + studentSum[i]/6);
		}
		// displays the average of all students
		System.out.println("\nAverage grade of all students: " + gradeSum/36);
	} 
}
