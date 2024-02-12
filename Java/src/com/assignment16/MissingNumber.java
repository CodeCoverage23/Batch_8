package com.assignment16;

public class MissingNumber {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 5, 6, 8, 9, 10 };
		int length = a.length;
		System.out.println("Missing Number is : ");

		for (int num = 1; num <= length; num++) {
			int count = 0;
			for (int j = 0; j < length; j++) {
				if (num == a[j]) {
					count++;
				}
			}
			if (count == 0) {
				System.out.println(num);
			}
		}
	}
}
 