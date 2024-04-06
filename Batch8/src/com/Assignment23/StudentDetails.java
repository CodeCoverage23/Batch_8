package com.Assignment23;

//Suppose I have Student class containing I'd, name and salary now 
//I want to sort the data based on comparator interface by using salary.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class StudentDetails {public static void main(String[] args) {

	List<Student> list = new ArrayList<>();

	list.add(new Student(102, "Aman Gupta", 500000.0));
	list.add(new Student(101, "Anupam Mittal", 300000.0));
	list.add(new Student(103, "Peyush Bansal", 400000.0));
	list.add(new Student(105, "Namita Thapar", 200000.0));
	list.add(new Student(102, "Vineeta Singh", 250000.0));

	Collections.sort(list, new SalaryComparator());

	for (Student s : list) {
		System.out.println(s);
	}

}

}


