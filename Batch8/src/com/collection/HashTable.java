package com.collection;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Hashtable;
import java.util.Map.Entry;

public class HashTable {

	public static void main(String[] args) {

		Hashtable<Integer, String> h = new Hashtable<>();

		h.put(123, "Java");
		h.put(124, "COde");
		h.put(125, "Coverage");

		System.out.println(h);
		String string = null;
		if (h.containsKey(123)) {
			string = h.get(123);
		}

		for (Entry<Integer, String> t : h.entrySet()) {
			System.out.println(t.getKey() + " : " + t.getValue());

			if (t.getKey() == 125) {
				int hashCode = t.getKey().hashCode();
				System.out.println(hashCode);
				System.out.println(hashCode & 11);
			}

		}

		int hashCode = String.valueOf(12.0).hashCode();
		System.out.println(hashCode);

		int year = LocalDateTime.now().getYear();
		System.out.println(LocalDateTime.now());

		System.out.println(string);
	}

}
