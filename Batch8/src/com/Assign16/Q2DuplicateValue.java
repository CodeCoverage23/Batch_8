package com.Assign16;
//2. Suppose you have array that containing elements 10,20,30,10, 30,50,60 

//Find out duplicate elements into array and print it.

public class Q2DuplicateValue {

	public static void main(String[] args) {
		int[] a = { 10, 20, 30, 10, 30, 50, 60 };
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
