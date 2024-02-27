package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsClassDemo {

	public static void main(String[] args) {

		List<Integer> l = new ArrayList<>();

		l.add(321);
		l.add(123);
		l.add(258);
		l.add(852);
		l.add(951);
		l.add(159);
		l.add(34);
		l.add(357);
		l.add(456);
		l.add(256);
		l.add(512);

		System.out.println(l);

		Collections.sort(l);

		System.out.println("Min " + Collections.min(l));
		System.out.println("Max " + Collections.max(l));

		System.out.println(l);

	}

}
