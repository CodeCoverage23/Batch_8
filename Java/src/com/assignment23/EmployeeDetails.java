package com.assignment23;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Suppose I have Employee class that containing Id, name and city 
//now I want to sort the data based on comparable interface by using name.

public class EmployeeDetails {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<>();

		list.add(new Employee(1001, "Dhananjay Doke", "Akot"));
		list.add(new Employee(3001, "Yash Ingle", "Pune"));
		list.add(new Employee(4001, "Parag Datey", "Akot"));
		list.add(new Employee(2001, "Sanchit Patond", "Akola"));
		list.add(new Employee(5001, "Satyajeet Deshmukh", "Amravati"));

		Collections.sort(list);

		for (Employee e : list) {
			System.out.println(e);
		}

	}

}
