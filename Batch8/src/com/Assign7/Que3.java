package com.Assign7;
//3. Design method to print factors of given number
//( Enter no = 6 then factors should be displayed like 1,2,3,6.

import java.util.Scanner;

public class Que3 {
	public void factors(int n) {
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				System.out.print(i+" ");
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to find its factors : ");
		int n = sc.nextInt();
		Que3 q=new Que3();
		q.factors(n);
	}

}
