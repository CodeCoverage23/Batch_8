package com.assignment16;
//Suppose you have array that containing elements 10,20,30,10, 30,50,60 
//Find out duplicate elements into array and print it.

public class DuplicateNumber {
	
	public static void main(String[] args) {
		
		int []a = {10,20,30,10,30,50,60};
		
		
		System.out.println("duplicate values>>: ");
		
		for(int i= 1; i<a.length; i++) {
			
		
			for(int p =i+1; p<a.length;p++) {
				
				if(a[i] == a[p])
					System.out.println(" " +a[i]);
			}
			
		}
		
	}

}
