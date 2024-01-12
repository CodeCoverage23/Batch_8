package com.java.selfwork;

import java.util.Scanner;

public class ReverseNos {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner (System.in);
		System.out.println( " Enter any Number : ");
				int num= sc.nextInt();
				
			int reverse =0;
			while( num >0) {
				int rev = num % 10;
				reverse = ( reverse * 10) + rev;
				
				num/=10;
			}
				System.out.println(reverse);
		}
    }
