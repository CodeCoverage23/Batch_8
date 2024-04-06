package com.Assignment23;

//Suppose I have Employee class that containing Id, name and city 
//now I want to sort the data based on comparable interface by using name.


public class Employee implements Comparable<Employee> {
	int id;
	String name;
	String city;

	public Employee(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", city=" + city + "]";
	}

	@Override
	public int compareTo(Employee o) {

		return this.name.compareTo(o.name);
	}

}


