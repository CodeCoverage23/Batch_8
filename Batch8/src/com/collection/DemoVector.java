package com.collection;

import java.util.Vector;

public class DemoVector {

	public static void main(String[] args) {

		Vector<Integer> v = new Vector<>();

		for (int i = 1; i <= 10; i++) {

			if (i % 2 == 0) {
				v.add(i);
			}

		}

		v.addElement(102);

		System.out.println(v);
	}

}
