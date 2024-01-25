package com.assignment6;
//2. Design method void multiplication (int no) 
//and print the multiplication table. ( Example enter the no=5 then output like
//5*1=5.......5*10=50)
public class Assignment6Q2 {
	
	
	public static void main(String[] args) {
		Assignment6Q2.multiplication(5);

	}

	public static void multiplication(int num) {

		for (int i = 1; i <= 10; i++) {
			System.out.println("the multiplication table for" + num);
			System.out.println(num + "*" + i + "=" + (num * i));
		}
	}

}
