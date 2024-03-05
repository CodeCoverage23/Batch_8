package com.assign18;

import java.util.Scanner;

public class MainProduct {

	public static void main(String[] args) {
		Product p=new Product();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter weight of the product : ");
		int weight=sc.nextInt();
		
		System.out.println("weight : "+weight);
		try {
			p.productCheck(weight);
			System.out.println("Exception not occur");
		}catch(ProductException e){
			System.out.println(e);
			
		}
		System.out.println("rest of the code...");
	

	}

}
