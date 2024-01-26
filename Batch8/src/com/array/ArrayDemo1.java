package com.array;

public class ArrayDemo1 {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		int length = arr.length;

//		for (int i = 0; i < length; i++) {
//			System.out.println(arr[i]);
//		}

		for (int i : arr) {
			System.out.println(i);
		}

	}

}
