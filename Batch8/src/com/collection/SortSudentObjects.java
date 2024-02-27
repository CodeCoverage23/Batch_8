package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortSudentObjects {

	public static void main(String[] args) {

		List<Student> l = new ArrayList<>();

		Student s = new Student();
		s.setRollNo(105);
		s.setName("Jack");
		s.setAdd("Akola");

		l.add(s);

		l.add(new Student(104, "John", "Pune"));
		l.add(new Student(103, "Sam", "Delhi"));
		l.add(new Student(101, "Harry", "Pune"));
		l.add(new Student(102, "John", "Mumbai"));

		System.out.println(l);

		Collections.sort(l);

		System.out.println("Sorting by comparable " + l);
		System.out.println("********************");

		Collections.sort(l, new SortByComparator());

		System.out.println(l);

	}

}
