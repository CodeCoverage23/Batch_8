package com.Assignment23;

//Suppose I have Student class containing I'd, name and salary now 
//I want to sort the data based on comparator interface by using salary.

public class Student {
	int id;
	String name;
	double salary;

	public Student(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}


