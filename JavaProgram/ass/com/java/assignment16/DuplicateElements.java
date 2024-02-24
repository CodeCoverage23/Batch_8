package com.java.assignment16;

//  Suppose you have array that containing elements 10,20,30,10, 30,50,60 Find out duplicate elements into array and print it.

public class DuplicateElements {

	public static void main(String[] args) {
		int[] a = { 10, 90, 95, 10, 90, 50, 96, 32, 55, 55 };
		System.out.println("Duplicate Values : ");

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					System.out.println(a[i]);
				}
			}
		}
	}
}
