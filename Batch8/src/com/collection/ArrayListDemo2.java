package com.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo2 {

	public static void main(String[] args) {

		List<Integer> l = new ArrayList<>();
		l.add(120);
		l.add(1206);
		l.add(3221);
		l.add(1208);
		l.add(1206);
		l.add(4120);

		System.out.println(l);

		for (Integer i : l) {
			System.out.println(i + 2);
		}

		ArrayList<String> al = new ArrayList<String>();

		al.add("code");
		al.add("coverage");
		al.add(1, "Java"); // code, null, coverage
		al.remove(0);
		int indexOf = al.indexOf("coverage");
		System.out.println(indexOf);

		System.out.println(al);

	}
}
