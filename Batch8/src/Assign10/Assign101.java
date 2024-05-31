package Assign10;

import java.util.Scanner;

//1. Write Java program to check whether number is prime or not. ( Prime means a number which is
//divisible by only two numbers: 1 and itself. So, if any number is divisible by any other number, it is not a
//prime number.)
public class Assign101 {
	public static boolean isPrime(int n) {
		int count = 0;
		for(int i = 1; i<= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			return true;
		}
		return false;
		
	}
	public static void main (String [] arge) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check whether it is prime or not : ");
		int n = sc.nextInt();
		boolean ans = isPrime(n);
		if (ans == true) {
			System.out.println(n + "is a prime number .");
		}
		else {
			System.out.println(n + "is not prime number .");
		}
	}

}
