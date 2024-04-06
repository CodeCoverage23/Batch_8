package com.Asssignment22;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class SortStateCities {
	
	public static void main(String[] args) {

		HashMap<String, ArrayList<String>> stateCity = new HashMap<>();

		ArrayList<String> mhCity = new ArrayList<>();
		mhCity.add("Mumbai");
		mhCity.add("Pune");
		mhCity.add("Nagpur");

		ArrayList<String> kaCity = new ArrayList<>();
		kaCity.add("Bangalore");
		kaCity.add("Mysore");

		ArrayList<String> mpCity = new ArrayList<>();
		mpCity.add("Bhopal");
		mpCity.add("Indore");

		stateCity.put("Maharashtra", mhCity);
		stateCity.put("Karnataka", kaCity);
		stateCity.put("Madhya Pradesh", mpCity);

		System.out.println(stateCity);

		/*
		 * for (Map.Entry<String, ArrayList<String>> entry : stateCity.entrySet()) {
		 * System.out.println(entry.getKey() + " " + entry.getValue()); }
		 */

		System.out.println("==============================");

		for (String s : stateCity.keySet()) {
			System.out.println(s + ": " + stateCity.get(s));
		}
	}

}


