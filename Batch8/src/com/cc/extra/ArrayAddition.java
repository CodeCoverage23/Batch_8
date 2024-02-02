package com.cc.extra;

public class ArrayAddition {

	public static void main(String[] args) {

		int[] a = { 45661, 86452, 4563, 5649464 };

		int sum = 0;
		for (int arr : a) {
			sum += arr;
		}
		System.out.println(sum);
	}

}
