package com.java.prog;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Student {
	int id;
	String name;
	int marks;

	public Student(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
}

public class TestFunction {

	public static void main(String[] args) {

		Function<Student, String> f = s -> {
			int marks = s.marks;
			String grade = "";

			if (marks >= 80)
				grade = "=A[first class]";
			else if (marks >= 70)
				grade = "B[second class]";
			else if (marks >= 50)
				grade = "C[third class]";
			else if (marks <= 45)
				grade = "fail";

			return grade;
		};

		Predicate<Student> p = s2 -> s2.id >= 102;

		Consumer<Student> c = s1 -> {
			System.out.println("Student ID :" + s1.id);
			System.out.println("Student Name :" + s1.name);
			System.out.println("Student Marks :" + s1.marks);
			System.out.println("Student grade :" + f.apply(s1));
			System.out.println();
		};

		List<Student> s = new ArrayList<>();
		s.add(new Student(101, "shruti", 85));
		s.add(new Student(102, "sameer", 73));
		s.add(new Student(103, "pranesh", 64));
		s.add(new Student(101, "gaurav", 35));

		for (Student s1 : s) { 
			if (p.test(s1)) {
				c.accept(s1);
			}
		}
	}

}
