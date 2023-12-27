package com.java.programming;

public class SummationWithDoWhile {

	public static void main(String[] args) {
	   
		int x=1 ; int sum=0;
		
		
		do {

			sum+=x; // sum=sum+x
			
			//increament
			
			x++;
			
		}
		
		while(x<=10) ;
		
		System.out.println("summation :"+sum);

	}

}
