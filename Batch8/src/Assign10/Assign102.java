package Assign10;

import java.util.Scanner;

//2. Write a java program to display the Fibonacci series up to given number. (Fibonacci series mean next
//number is the sum of previous two numbers for example 0,1,1,2,3,5,8,13,21,34,55 etc. If enter no as 5
//then output is 0,1,1,2,3).
public class Assign102 {
	public static void fibo(int n) {
		int firstTerm = 0 , secondTerm =1;
		for (int i =0; i < n; i++) {
			System.out.println(firstTerm + " ");
			int nextTerm = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;
			
		}
	}
	public static void main(String[] arge) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of term for fibonacci series :");
		int n = sc.nextInt();
		Assign102.fibo(n);
	}

}
