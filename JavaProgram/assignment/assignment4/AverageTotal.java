package com.java.assignment4;
//Write the Java program to calculate total of five subject marks and average of it.
import java.util.Scanner;

public class AverageTotal {

	public static void main(String[] args) {

        Scanner Sc = new Scanner(System.in);
        
        System.out.println("Enter the marks of 5 subjects : ");

		int A = Sc.nextInt();
		int B = Sc.nextInt();
		int C = Sc.nextInt();
		int D = Sc.nextInt();
		int E = Sc.nextInt();

		int sum = A + B + C + D + E;
		System.out.println("Total marks : " + sum);

		int avg = sum / 5;
		System.out.println("Average marks : " + avg);

	}

}
