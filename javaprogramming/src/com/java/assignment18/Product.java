package com.java.assignment18;
//1. Design the Product class in which design void productCheck(int weight) in check 
//whether weight is less than 100, then throw the ProductException  with a meaningful message. 

public class Product {

	public void productCheck(int weight) {
		
		if (weight<100) {
			
			throw new ProductException("invalid Weight ,weight must be above 100");
			
		}
		else {
			
			System.out.println("Satisfied weight");
		}
	}
	
	
	
}
