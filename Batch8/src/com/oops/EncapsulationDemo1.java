package com.oops;

/**
 * Data hiding
 */

class Student {

	private int rollNo;
	private String name;
	private String add;

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
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

}

public class EncapsulationDemo1 {

	public static void main(String[] args) {
		Student s = new Student();

		s.setAdd("Akola");
		System.out.println(s.getAdd());

		s.setRollNo(101);
		System.out.println(s.getRollNo());

		s.setName("Sam");
		System.out.println(s.getName());
	}

}
