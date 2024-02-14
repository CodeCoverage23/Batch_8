package com.collection;

import java.util.ArrayList;

public class ArrayListDemo1 {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();

		al.add(10);
		al.add(18);
		al.add(10);
		al.add(null);
		al.add("Java");
		al.add(12.0);
		al.add(false);

		System.out.println(al);

		ArrayList a2 = new ArrayList(al);
		a2.add(45);
		System.out.println(a2);

	}

}
