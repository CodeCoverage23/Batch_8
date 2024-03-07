package com.assignment20;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SortingBallons {

	public static void main(String[] args) {

		List<String> l = new ArrayList<>();

		l.add("Red");
		l.add("Blue");
		l.add("Green");
		l.add("Red");
		l.add("Blue");
		l.add("Red");
		l.add("Blue");
		l.add("Green");

		System.out.println(l);

		LinkedList<String> l1 = new LinkedList<>();

		for (String s : l) {
			if (s.equals("Red")) {
				l1.addFirst("Red");

			} else if (s.equals("Blue")) {
				l1.add("Blue");
			}
		}
		for (String s : l) {
			if (s.equals("Green")) {
				l1.add("Green");

			}
		}
		System.out.println("Sorted List :" + l1);

	}
}
