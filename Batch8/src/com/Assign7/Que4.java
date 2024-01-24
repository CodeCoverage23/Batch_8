package com.Assign7;
//4. Design method public int getReverseNumber(int num) which 

//return int value to that method and result print into main method.
//(Enter the no=125 then output will be 521

import java.util.Scanner;

public class Que4 {
	public int getReverseNumber(int num) {
		int rev = 0;
		while (num > 0) {
			int temp = num % 10;
			rev = rev * 10 + temp;
			num /= 10;
		}
		return rev;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to find its reverse : ");
		int num = sc.nextInt();
		Que4 q = new Que4();
		System.out.println(q.getReverseNumber(num));

	}

}
