package com.statickeyword;

public class StaticVariable1 {

	int id;
	String name;
	static String cName = "XYZ";

	public StaticVariable1(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public static void main(String[] args) {

		StaticVariable1 s1 = new StaticVariable1(1022, "Priya");
		StaticVariable1 s2 = new StaticVariable1(1032, "Sameer");

		s1.print();
		s2.print();
	}

	public void print() {
		System.out.println(id + " " + name + " " + cName);
	}
}
