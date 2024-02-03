package com.java.assignment7;

import java.util.Scanner;

//4. Design the method public int getReverseNumber (int num) which return value to that method and
//result print into main method.
public class ReverseNumber {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number :");
		int num = sc.nextInt();
		int reverseNumber = ReverseNumber.getreversenumber(num);
		System.out.println("the reverse number "+num+ "is :"+reverseNumber);
	
	}

	private static int getreversenumber(int num) {
		int reverse=0;
		
		while(num!=0); {
		int lastdigit=num%10;
		reverse=reverse*10;
		reverse=reverse+lastdigit;
		
		num=num/10;
		
	    }
	
	
	
          return reverse;
      }


}


