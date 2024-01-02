package com.basic3;

/**
 * Example of Employee
 */
public class StaticVariableDemo2 {

	int id;
	String name;
	static String cName = "XYZ";

	public StaticVariableDemo2(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public static void main(String[] args) {

		StaticVariableDemo2 s1 = new StaticVariableDemo2(1010, "Sachin");
		StaticVariableDemo2 s2 = new StaticVariableDemo2(1011, "Ram");

		s1.print();
		s2.print();

	}

	public void print() {
		System.out.println(id + " " + name + " " + cName);
	}

}
