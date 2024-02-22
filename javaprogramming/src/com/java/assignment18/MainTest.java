package com.java.assignment18;

import java.util.Scanner;

public class MainTest {
public static void main(String[] args) {
	
	Product product=new Product();
	
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the Product Weight");
	int weight = sc.nextInt();
	try {
		System.out.println("weight"+weight);
	product.productCheck(weight);
	System.out.println("exception occur");
	}		
catch(ProductException e) {
	
	System.out.println(e);
	
}
	System.out.println("normal flow");
	
	
}
	
	
	
	
}
