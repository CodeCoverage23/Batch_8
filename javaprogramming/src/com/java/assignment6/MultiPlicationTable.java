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
	
	
	public static void display() {
		
		System.out.println("multiplication");
	}
	
	public void multiOutput() {
		
		int a=20;
		int b=10;
		int c=a*b;
		System.out.println("the multiplication is : "+c);
		
	
		
	}
	
	
	
	
}
