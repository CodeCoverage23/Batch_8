package com.java.selfwork;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println(" Enter a number : ");
        int num = sc.nextInt();
        
        int rev = 0;
        for ( int i = num; i >0; i/=10) {
        	int rem = i % 10;
        	rev = ( rev * 10 )+ rem;
        	
        }
        if (num== rev) {
        	System.out.println(" Its a Palindrome Number ");
        }
        else {
        	System.out.println(" Its not a Palindrome Number ");
        }
	}

}
