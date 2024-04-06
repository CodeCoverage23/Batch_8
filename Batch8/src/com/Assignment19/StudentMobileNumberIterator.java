package com.Assignment19;

//1. Write program to add the five students mobile number 
//into arraylist and iterate that elements using iterator. 

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class StudentMobileNumberIterator {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Mobile Number: ");

		for (int i = 0; i < 5; i++) {
			String mobileNumber = sc.next();
			if (mobileNumber.length() == 10) {
				al.add(mobileNumber);
			} else {
				System.out.println("Enter Valid MobileNumber");
			}

		}
		Iterator itr = al.iterator();
		System.out.println("Iterating the elements using iterator...");
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}


