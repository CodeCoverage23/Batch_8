package com.java.assignment20;

import java.util.LinkedList;

//2.Suppose I have one container that contain  different colors of ballons
//such as Red, Blue, Green, Red,Blue,Red, Blue, Green in this order,
//now sort that baloon in such manner so Red baloon will be added first then Blue baloon 
//and last is Green balloons.
//Use the proper collection.
public class SortBalloon {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("Red");
		list.add("Blue");
		list.add("Green");
		list.add("Red");
		list.add("Blue");
		list.add("Red");
		list.add("Blue");
		list.add("Green");

		LinkedList<String> list1 = new LinkedList<>();
		System.out.println("Elements in list container>>");
		System.out.println(list);
		for (String str : list) {
			if (str.equals("Red")) {
				list1.addFirst("Red");
			} else if (str.equals("Blue")) {
				list1.add("Blue");
			} }
		for(String str : list) {
			if(str.equals("Green")) {
			list1.add("Green");
		}
		}
		System.out.println("output of list is>>");
		System.out.println(list1);

	}

}
