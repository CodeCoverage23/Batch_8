package com.Assign16;
//1. Suppose You have given an integer array containing 1 to n but one of the number from 1 to n

//in the array is missing. You need to provide optimum solution to find the missing number. 
//Number can not be repeated in the array.

public class Q1MissingElement {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 8, 9, 10 };
		System.out.println("Missing Value :");
		for (int i = 1; i <= a.length + 1; i++) {
			int count = 0;
			for (int j = 0; j < a.length; j++) {
				if (i == a[j]) {
					count++;
				}
			}
			if (count == 0) {
				System.out.println(i);
			}

		}

	}

}
