package com.java.assignment6;
//2. Design method void multiplication (int no) and print the multiplication table. 

public class MultiPlicationTable {

	public static void main(String[] args) {
		MultiPlicationTable.Mulitication(0);

	}

	
	public static void Mulitication(int num) {
		for(int i=0;i<=10;i++) {
			
			System.out.println("the multiplication tablee for "+num);
			System.out.println(num+" * "+i+" = "+(num*i));
			
		}
		
		
	}
	
	
	
	
	
	
	
	
}
