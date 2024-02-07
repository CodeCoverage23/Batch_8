package com.Assignment6;


public class FactorialRecursion {
	
	public static void main(String[] args) {



		int num=5;
		int fact = FactorialRecursion.factNum(num);
	System.out.println("the factorial of "+num+" is : "+fact);

	}
	//without recusion
	public static int factNum(int num) {
		if(num>0) {
			return num*factNum(num-1);

		}else
		return 1;
	}
	
	
	   
	      }


