package com.collection.cursors;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();

		al.add(11);
		al.add(33);
		al.add(88);
		al.add(55);
		al.add(22);
		al.add(44);

		Iterator<Integer> itr = al.iterator();
		while (itr.hasNext()) {
			Integer integer = itr.next();
			System.out.println(integer);
		}

	}

}
