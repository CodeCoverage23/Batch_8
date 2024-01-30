package com.cc.extra;

public class CountEvenNumbers {

	public static void main(String[] args) {

		int a[] = { 11, 54, 23, 66, 8, 89, 7, 21, 45, 64 };

		int count = 0;

		for (int arr : a) {

			if (arr % 2 == 0) {
				count++;
			}

		}

		System.out.println("Count of even numbers : " + count);

	}

}
