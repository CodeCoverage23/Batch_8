package com.assignment23;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentDetails {

	public static void main(String[] args) {

		List<Student> list = new ArrayList<>();

		list.add(new Student(101, "Amit Sharma", 20000.00));
		list.add(new Student(102, "Sunidhi Kapoor", 90000.00));
		list.add(new Student(103, "Prem Khanna", 35000.00));
		list.add(new Student(104, "Suresh Thakur", 70000.00));
		list.add(new Student(105, "Amar Chaudhari", 65000.00));

		System.out.println("Before Sorting : " + list);
		Collections.sort(list, new SalaryComparator());
		
		System.out.println("After Sorting On the Basis Of Salary : ");
		for (Student s : list) {
			System.out.println(s);
		}
	}

}
