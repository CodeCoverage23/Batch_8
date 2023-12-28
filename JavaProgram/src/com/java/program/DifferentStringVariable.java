package com.java.program;

public class DifferentStringVariable {

	public static void main(String[] args) {

		System.out.println(DifferentStringVariable.getFullName("Yogeshwari"));

	}

	public static String getFullName(String name) {
		String fullname = name.concat("Patil");
		return fullname;
	}

}
