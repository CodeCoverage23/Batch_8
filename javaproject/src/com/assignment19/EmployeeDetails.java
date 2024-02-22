package com.assignment19;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeDetails {

	public static void main(String[] args) {

		ArrayList<Employee> empList = new ArrayList<>();

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {

			System.out.println("Enter Details for Employee No. " + (i + 1) + " >> ");
			System.out.println(" Id : ");
			int id = sc.nextInt();

			System.out.println(" Employee Name : ");
			String name = sc.next();

			System.out.println(" MobileNumber : ");
			String mobileNumber = sc.next();

			System.out.println(" Email Id : ");
			String email = sc.next();

			System.out.println(" Address : ");
			String address = sc.next();

			Employee emp = new Employee(id, name, mobileNumber, email, address);
			empList.add(emp);

		}

		System.out.println(" ------- Employee Class Object Calling--------- ");

		for (Employee emp : empList) {

			emp.display();
		}
	}

}
