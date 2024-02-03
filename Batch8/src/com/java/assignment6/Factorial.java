package com.java.assignment6;

//Design method int factorial (int no) which returns int value to that method.
//print the results into main method (example enter no as 5, factorialmeans 5*4*3*2*1 then output.
public class Factorial {
	
	public static void main(String[] args) {
    int num=8;
    int fact = Factorial.fact(num);
    System.out.println("the factorial of "+num+"is :"+fact);
    
    }
	//without recusion
	public static int fact(int num) {
		int fact = 1;
		for(int i=1;i<=num;i++) {
			
//      for(int i = num; i > 0; i--) {
			fact = fact * i;
			
		}
		return  fact;
		
		
	}	
		
}
