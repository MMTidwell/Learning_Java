package com.activities;

public class Hour9 {
	public static void main (String[] args) {
		int[][] grades = new int [3][1];
		grades = new int[0][100];
		grades = new int[1][90];
		grades = new int[2][80];
		for (int i = 0; i < grades.length; i++) {
			int current = grades[i];
			int sum = current + grades[i];
		}
		System.out.println(sum)
	}
}