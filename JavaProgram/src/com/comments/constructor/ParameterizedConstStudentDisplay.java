package com.comments.constructor;

/**
 * This class is used to provide the values of student class variable.
 */
public class ParameterizedConstStudentDisplay {

	public static void main(String[] args) {

		ParameterizedConstStudent s1 = new ParameterizedConstStudent(101, "John");
		ParameterizedConstStudent s2 = new ParameterizedConstStudent(102, "Johnny");

		s1.display();
		s2.display();

	}

}
