package com.Assign6;

import java.util.Scanner;

//4. Design method int fact orial(int no)  which returns int value to that method.
//print the results into main method (Example enter no as 5, factorial means 5*4*3*2*1 
//then output is 120)

public class Que4 {
	public int factorial(int no) {
		int fact = 1;
		if (no == 1 || no == 0) {
			return 1;
		}

		return no*factorial(no - 1);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int no = sc.nextInt();
		Que4 o = new Que4();

		System.out.println(no + "!=" + o.factorial(no));

	}

}
