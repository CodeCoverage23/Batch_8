package com.assignment20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ElementSorting {

	public static void main(String[] args) {

		List<String> l = new ArrayList<>();

		l.add("Ram");
		l.add("Sohan");
		l.add("Ashok");
		l.add("Ajay");
		l.add("Prasanna");

		System.out.println(l);

		Collections.sort(l);
		Collections.reverse(l);
		System.out.println("Sorted List >> ");

		for (String str : l) {
			System.out.println(str);
		}

	}

}
