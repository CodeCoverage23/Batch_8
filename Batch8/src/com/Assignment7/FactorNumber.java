package com.Assignment7;

import java.util.Scanner;

// Design method public int getNumberCube(int num), return int value to that method and result should be into main method.
 

public class FactorNumber {
	
	//design method to print factors of given number (Enter no = 6 then
			//factors should be displayed like 1,2,3,6
			
public static void main(String[] args) {
	
	Scanner sc = new Scanner (System.in);
	
	 System.out.println("enter a number: ");
	 int num = sc.nextInt();
	 
	 System.out.println("the factors of "+num+ " is  : ");
	 FactorNumber.getNumber(num);
	 
	 }
          public static void getNumber(int num) {
        	  
        	  
        	  int i = 1;
        	  while (i <= num) {
        		  
        		  
        		  if (num%i == 0) {
        			  
        			  System.out.println(i);
        			  
        		  }
        		  
        		    i++; 
        	  }
          }

}
