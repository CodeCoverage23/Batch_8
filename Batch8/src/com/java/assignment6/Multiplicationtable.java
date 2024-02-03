package com.java.assignment6;
//2.Design method void multiplication (int no) and print the multiplication table.

public class Multiplicationtable {
	
	public static void main(String[] args) {
		Multiplicationtable.multiplication(0);
		
	}
	
	
	public static void multiplication(int num) {
		for(int i=0;i<=10;i++) {
			
			System.out.println("the multiplication table for "+num);
			System.out.println(num+" = "+i+ "= "+(num*i));
	
		}
		
		
		
    }
}