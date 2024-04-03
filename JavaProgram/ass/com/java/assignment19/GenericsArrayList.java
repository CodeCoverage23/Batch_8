package com.java.assignment19;

//Design the generics arraylist for string and add five cities into it and iterate that using for each loop.

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class GenericsArrayList {

	public static void main(String[] args) {

		List<String> al = new ArrayList<>();

		for (int i = 0; i < 5; i++) {

			System.out.println(" Enter city Name : ");
			Scanner sc = new Scanner(System.in);
			String cities = sc.nextLine();
			al.add(cities);

		}

		System.out.println(" Itrating the Element by using Foreach Loop");
		for (String city : al) {

			System.out.println(city);
		}
	}

}
