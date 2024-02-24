package com.java.assignment19;


import java.util.ArrayList;
public class ArrayListCityName {

	
public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<>();
		
		al.add("Mumbai");
		al.add("Pune");
		al.add("Bangalore");
		al.add("Hydrabad");
		al.add("Mumbai");
		
		System.out.println(al);
		
		al.remove(0);
		System.out.println(al);
		
	}
}
