package com.java.programming;

public class SummationWithWhileLoop {

	public static void main(String[] args) {
	
		
		// initialization
		int x=1; int sum=0;
		
		while(x<=10) {
			
			// execution
			
			sum+=x; // sum=sum+x
			
			//increament
			
			x++;
		}
		
		System.out.println("Summation : "+sum);
		
	}

}
