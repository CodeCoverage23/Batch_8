package com.Assignment16;

//we have given an integer array containing 1 to n but one of the number from 1 to n int the
//array is missing.you need to provide optimum solution to find the missing number.

//Number can not be repeated in the array.

public class MissingNumber {
	
	private static int length;

	public static void main(String[] args) {
		
		int [] a = {1, 2, 3, 4, 5, 6, 8, 9, 10};
		
		int lenghth = a.length;
		System.out.println("missing number is : ");
		
		
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
