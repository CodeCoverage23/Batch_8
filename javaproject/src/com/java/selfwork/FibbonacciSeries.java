package com.java.selfwork;

import java.util.Scanner;

public class FibbonacciSeries {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner ( System.in);
				System.out.println(" Enter a number to create series");
		 int num = sc.nextInt();
		 
		 if ( num> 0) {
			int n1=0;
			int n2=1;
			  for (int i = 0; i<num; i++ ) {
				 int n3=n1+n2;
				 n1=n2;
				 n2=n3;
				 
				 System.out.print(n1+" ");  
			  }
		 } else {
			 
			 System.out.println(" enter a valid number");
		 }
		

	}

}
