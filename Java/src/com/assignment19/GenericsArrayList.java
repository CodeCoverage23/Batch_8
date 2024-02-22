package com.assignment19;

import java.util.ArrayList;
import java.util.Scanner;

//Design the generics arraylist for string and add five cities 
//into it and iterate that using for each loop

public class GenericsArrayList {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Cities:");
		for (int i = 0; i < 5; i++) {

			String cities = sc.next();
			al.add(cities);
		}

		System.out.println("Iterating through for each loop...!");
		for (String city : al) {

			System.out.println(city);
		}

	}

}
