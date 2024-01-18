package com.java.assignment6;
//write a program  to print all even number from 50 to 75.
public class EvenNumbers {

	public static void main(String[] args) {

		int num = 75;
		System.out.print("Even numbers from 50 to "+ num +": ");
		
		for (int i = 50; i <= num; i++) {
		
		if (i % 2 == 0) {
		System.out.print(i + " ");
	}

}
	}
}