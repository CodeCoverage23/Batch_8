package com.assignment16;

public class DuplicateArray {

	public static void main(String[] args) {

		int a[] = { 10, 20, 30, 10, 30, 50, 60 };
		
		System.out.println(" Duplicate Element in Array : ");

		for (int i = 0; i <a.length; i++) {

			for (int j = i+1; j < a.length; j++) {

				if (a[i] == a[j]) {
					
					System.out.println(" " +a[j]);
				}
			}
		}

	}

}