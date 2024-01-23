package com.Assignment5;

import java.util.Scanner;


public class NameMultiple {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a value to print name of perticular multiple : ");
		
		int number = sc.nextInt();
		
		for (int i = 1; i<= number; i++) {
			
			if (i % 5 == 0 && i %6 ==0) {
				
				System.out.println(i +"  : Nilima Shejav");
				
			}
			else if (i % 5 == 0) {
				System.out.println(i +  " : Nilima");}
			else if (i % 6 == 0) {
				System.out.println(i+ " : Shejav");
				
			} else
				           System.out.println(i);
		}
	}

}
