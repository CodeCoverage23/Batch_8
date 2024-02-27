package com.collection;

public class Student implements Comparable<Student> {

	private int rollNo;
	private String name;
	private String add;

	public Student(int rollNo, String name, String add) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.add = add;
	}

	public Student() {

	}

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

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", add=" + add + "]";
	}

	@Override
	public int compareTo(Student o) {

		return o.rollNo - this.rollNo;
	}

}
