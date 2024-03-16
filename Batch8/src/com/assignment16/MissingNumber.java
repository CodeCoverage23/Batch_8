package com.assignment16;
//Suppose You have given an integer array containing 1 to n but one of the number from 1 to n in the array is missing.
//You need to provide optimum solution to find the missing number. Number can not be repeated in the array.

public class MissingNumber {
	
	public static void main(String[] args) {
		
		int[] a = { 1, 2, 3, 4, 5, 6, 8, 9, 10 };
		
		int length = a.length;
		System.out.println("missing number is : ");

		for (int num = 1; num <= length; num++) {

			int count = 0;

			for (int j = 0; j < length; j++) {

				if (num == a[j]) {
					count++;
				}
			}
			if (count ==0) {
				System.out.println(num);
			}
		}
	}

}
