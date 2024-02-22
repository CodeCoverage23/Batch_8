package com.assignment19;

import java.util.ArrayList;

//Suppose I have arraylist which contain elements as [mumbai, pune, Bangalore, Hyderabad, mumbai],
//now I want to remove the mumbai from list and print that data.

public class ArrayListCity {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();

		al.add("Mumbai");
		al.add("Pune");
		al.add("Bangalore");
		al.add("Hyderabad");
		al.add("Mumbai");

		al.remove("Mumbai");

		for (String s : al) {

			System.out.println(s);

		}

	}

}
