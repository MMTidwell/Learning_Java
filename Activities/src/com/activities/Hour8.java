package com.activities;

public class Hour8 {
	public static void main (String[] args) {
		double max = 400;
		int count = 0;
		while (count <= max) {
			if ((count % 13) == 0) {
				System.out.print(count + " ");
			}
			count++;
		}
	}
}
