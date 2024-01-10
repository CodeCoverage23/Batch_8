package com.Assignment5;

import java.util.Scanner;

public class NumberGreaterThan100 {

	public static void main(String[] args) {
		
     System.out.print(" Enter a Number to Check Greater Or Smaller Than 100 : ");

      Scanner sc= new Scanner(System.in);
      int i =sc.nextInt();
      
      if(i>100) {
    	  System.out.println("  The Number Is Greater Than 100");
      }else if (i<100){
    	  System.out.println("  The Number Is Smaller than 100");
      }else {
    	  System.out.println(" The Number 100");
      }
	}

}
