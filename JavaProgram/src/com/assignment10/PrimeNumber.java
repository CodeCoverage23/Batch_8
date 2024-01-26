package com.assignment10;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		

		int a,b;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string Number");
		int start = sc.nextInt();
		 
		System.out.println("Enter a ending Number");
		int last = sc.nextInt();
  for (a=start; a<=last; a++) {
	  for(b=2; b<=a; b++) {
		  if(a% b==0)
			  break;
	  }
	  if (a==b) {
		  System.out.println(a +"");
		  
	  }
  }
	}

}
