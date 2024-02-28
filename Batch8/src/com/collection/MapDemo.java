package com.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {

		/// without generic or old way

		Map map = new HashMap();

		map.put(1, 5);
		map.put("45", 6);
		map.put(2, 5);
		map.put(5, 51);
		map.put(4, 52);
		map.put(6, 56);
		map.put(null, 56);

		System.out.println(map);

		Set set = map.entrySet();

		Iterator itr = set.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		// With Generic or new way

		Map<Integer, String> m = new HashMap<>();

		m.put(10, "java");
		m.put(11, "Code");
		m.put(15, "Program");
		m.put(19, "python");
		m.put(12, "java");

		System.out.println(m);

		for (Map.Entry<Integer, String> entry : m.entrySet()) {

			System.out.println(entry.getKey() + " " + entry.getValue());

		}

	}

}
