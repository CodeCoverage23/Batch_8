package com.java.assignment19;

//Write program to add the five students mobile number into arraylist and iterate that elements using iterator. 

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class MobileNumber {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		for (int i = 0; i < 5; i++) {

			System.out.println(" Enter Mobile Number>>");
			Scanner sc = new Scanner(System.in);
			String mobileNumber = sc.next();

			if (mobileNumber.length() == 10) {
				list.add(mobileNumber);

			} else {
				System.out.println(" Enter a valid MobileNumber>>");
			}
		}
		System.out.println(" Iterating element by using Iterator >> ");
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {

			System.out.println(iterator.next());
		}

	}

}
