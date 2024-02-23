package com.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {

		LinkedHashSet<String> l = new LinkedHashSet<String>();

		l.add("Java");
		l.add("Code");
		l.add("Java");
		l.add("Coverage");
		l.add(null);
		l.add(null);

		System.out.println(l);

		HashSet<String> h = new HashSet<String>();

		h.add("Java");
		h.add("Code");
		h.add("Java");
		h.add("Coverage");
		h.add(null);
		h.add(null);
		
		System.out.println(h);
	}

}
