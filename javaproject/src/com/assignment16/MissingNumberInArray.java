package com.assignment16;

public class MissingNumberInArray {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 5, 6, 7, 9, 10 };

		System.out.println(" Missing Number : ");
		
		for (int num = 1; num <= a.length; num++) {

			int count = 0;

			for (int j = 0; j < a.length; j++) {
				
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
