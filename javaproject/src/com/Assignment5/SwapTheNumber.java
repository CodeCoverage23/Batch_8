package com.Assignment5;

public class SwapTheNumber {

	public static void main(String[] args) {
		 int a= 10;
		 int b= 20;
		 int temp;
		 
		 System.out.print(" the number before Swapping : ");
         System.out.println(" a : "+a+ " & b : " +b);
         
         temp=a;
         a=b;
         b=temp;
         
         System.out.print(" the number after Swapping : ");
         System.out.println(" a : "+a+" & b : "+b);
	}

}
