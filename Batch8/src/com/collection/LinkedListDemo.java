package com.collection;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {

		LinkedList<Integer> l = new LinkedList<Integer>();

		l.add(102);
		l.add(104);
		l.add(105);
		l.add(102);

		l.addFirst(1000);
		l.addLast(2000);

		System.out.println(l);

		System.out.println(l.getLast());

		System.out.println(l.removeFirst());

		System.out.println(l);

	}

}
