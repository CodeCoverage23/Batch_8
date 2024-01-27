package com.task;

import java.util.Scanner;

public class PrimeNo {
	public static boolean prime(int n) {
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count==2) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a range of prime numbers : ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		for(int i=a;i<=b;i++) {
			boolean bl=PrimeNo.prime(i);
			if(bl==true) {
				System.out.print(i+" ");
			}
		}
		

	}

}
