package com.java.Assignment5;
import java.util.Scanner;

public class PositiveNegative {
	
	 public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
	System.out.println("Enter a Number");
		
			int num= sc.nextInt();
			
			if (num >= 0) {
				
	System.out.println("The no is Positive");
			} else {
				
				System.out.println("The no is Negative");
				
			}
   }
}