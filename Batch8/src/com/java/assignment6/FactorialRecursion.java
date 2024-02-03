package com.java.assignment6;

public class FactorialRecursion {
	
	public static void main(String[] args) {
		
		
		
		int num=5;
		int fact = FactorialRecursion.factnum(num);
System.out.println("the factorial of"+num+" is : "+fact);

}
//without recursion
	public static int factnum(int num) {
		if(num>0) {
			return num*factnum(num=1);
			
		}else
		return 1;
}
}
