package com.Assign6;

import java.util.Scanner;

//Design method void multiplication (int no) and print the multiplication table.
//( Example enter the no=5 then output like 
//5*1=5.......5*10=50)

public class Que2 { 
	public void multiplication(int no) {
		System.out.println("table of a " + no);
		for (int i = 1; i <= 10; i++) {
			System.out.println(no + "*" + i + "=" + no * i);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();

		Que2 obj = new Que2();
		obj.multiplication(n);

	}

}
