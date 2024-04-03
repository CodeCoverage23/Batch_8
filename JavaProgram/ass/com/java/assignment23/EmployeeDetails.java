package com.java.assignment23;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeDetails {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<>();
		list.add(new Employee(101, "John", "Nagpur"));
		list.add(new Employee(102, "Jacky", "Pune"));
		list.add(new Employee(103, "Harry", "Banglore"));
		list.add(new Employee(104, "Sam", "Hydrabad"));
		list.add(new Employee(105, "Sunny", "Mumbai"));

		System.out.println("Before Sorting : " + list);

		Collections.sort(list);
		System.out.println("After Sorting : ");
		for (Employee e : list) {

			System.out.println(e);
		}

	}

}
