package com.java24hours;

import java.util.*;

public class NameSorter {
	public static void main (String[] args) {
		String names[] = {"Gilmmer", "Marvel", "Rue", "Clove", "Thresh", "Foxface", "Cato", "Peeta", "Katniss"};
		System.out.println("The original order: ");
		for (int i = 0; i < names.length; i++) {
			System.out.println(i + ": " + names[i]);
		}
		System.out.println();
		// sorts the array
		Arrays.sort(names);
		System.out.println("The new order: ");
		for (int i = 0; i < names.length; i++) {
			System.out.println(i + ": " + names[i]);
		}
		System.out.println();
	}
}
