package com.collection;

public class Employee implements Comparable<Employee>{

	private String name;
	private String add;
	private int salary;

	public Employee(String name, String add, int salary) {
		
		super();
		this.name=name;
		this.add=add;
		this.salary=salary;

	}

	public Employee() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", add=" + add + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.getSalary()-o.getSalary();
	}

	
}
