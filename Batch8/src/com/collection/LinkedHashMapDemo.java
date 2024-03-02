package com.collection;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

	public static void main(String[] args) {

		Map<String, Double> m = new LinkedHashMap<>();

		m.put("Kishor", 50000.00D);
		m.put("Pavan", 25000.00D);
		m.put("Sumit", 55000.00D);
		m.put("Shubham", 520000.00D);
		m.put("Akshay", 50450.00D);

		System.out.println(m);

		for (Map.Entry<String, Double> entry : m.entrySet()) {
			double value = entry.getValue() + 10000;
			System.out.println(entry.getKey() + " " + value);
			System.out.println(entry.getValue() + 10000);
		}

	}

}
