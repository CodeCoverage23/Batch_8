package com.collection.cursors;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {

		LinkedList<String> l = new LinkedList<String>();

		l.add("code");
		l.add("Java");
		l.add("Coverage");
		l.add("Program");

		System.out.println(l);

		ListIterator<String> listIterator = l.listIterator();

		while (listIterator.hasNext()) {

			String s = listIterator.next();

			if (s.equals("code")) {
				listIterator.set("Complex part");
			}

			if (s.equals("Program")) {
				listIterator.remove();
			}

		}

		System.out.println(l);

	}

}
