package com.Assignment19;

import java.util.ArrayList;
import java.util.Scanner;


public class EmployeeDetails {
	
	public static void main(String[] args) {

			ArrayList<Employee> empList = new ArrayList<>();

			Scanner sc = new Scanner(System.in);

			for (int i = 0; i < 4; i++) {

				System.out.println("Enter details for Employee " + (i + 1) + ":");
				System.out.println("Id: ");
				int id = sc.nextInt();

				System.out.println("EmpName: ");
				String name = sc.next();

				System.out.println("EmpEmail: ");
				String email = sc.next();

				System.out.println("EmpMobNo: ");
				String mobileNumber = sc.next();

				System.out.println("EmpAddress: ");
				String address = sc.next();

				Employee emp = new Employee(id, name, email, mobileNumber, address);
				empList.add(emp);

			}
			System.out.println("-----Employee Objects-----");
			for (Employee emp : empList) {
				emp.display();
			}

		}

	}
	
	

