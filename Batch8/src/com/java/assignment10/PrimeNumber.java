package com.java.assignment10;
//1. Write Java program to check whether number is prime or not. ( Prime means a number which is
//divisible by only two numbers: 1 and itself. So, if any number is divisible by any other number, 
//it is not a prime number.)

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args)
	   {
	      int a, b, c=0;
	      Scanner s = new Scanner(System.in);
	      
	      System.out.print("Enter a Number: ");
	      a = s.nextInt();
	      
	      for(b=2; b<a; b++)
	      {
	         if(a%b == 0)
	         {
	            c++;
	            break;
	         }
	      }
	      
	      if(c==0)
	         System.out.println("It is a Prime Number.");
	      else
	         System.out.println("It is not a Prime Number.");
	   }
}
	
	
	
	
	
	
	
