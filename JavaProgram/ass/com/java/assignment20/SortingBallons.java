package com.java.assignment20;

//.Suppose I have one container that contain  different colors of ballons such as Red, Blue, Green, Red,Blue,Red, Blue, Green in this order, now sort that baloon in such manner so Red baloon will be added first then Blue baloon and last is Green balloons. Use the proper collection.

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

