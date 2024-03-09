package com.assignment14;

//1.Write a java program to print the all multiplication table from * 2, 3, 4.... to 20.

public class Table {

	
	public static void main(String[] args) {

		for (int i = 2; i <=20; i++) {


			for (int j = 1; j <=10; j++) {

				int multi = i*j;

				System.out.println(multi+"\t");
			}

			System.out.println();
		}
	}

}
