package com.java.assignment6;
//Design method void multiplication (int no) and print the multiplication table.

public class MultiplicationTable {

	public static void main(String[] args) {
		MultiplicationTable.Mulitication(1);

	}

	public static void Mulitication(int num) {
		for (int i = 1; i <= 9; i++) {

			System.out.println("the multiplication tablee for " + num);
			System.out.println(num + " * " + i + " = " + (num * i));

		}

	}
}