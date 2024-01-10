package com.Assignment5;

import java.util.Scanner;

public class ChackNumber {

	public static void main(String[] args) {
	
   Scanner sc= new Scanner(System.in);
   System.out.print(" Enter any Number : ");
   
     int a= sc.nextInt();
   
		if (a >=0) {
			 System.out.println(" : the Number is Positive");
		}
		else {
			 System.out.println(" : The NUmber is Negative");
		}
		
	}

}
