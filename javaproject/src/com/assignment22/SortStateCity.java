package com.assignment22;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortStateCity {

	public static void main(String[] args) {

		Map<String, ArrayList<String>> stateCity = new HashMap<>();

		ArrayList<String> mhCity = new ArrayList<>();
		mhCity.add("Mumbai");
		mhCity.add("Pune");
		mhCity.add("Nagpur");

		ArrayList<String> krCity = new ArrayList<>();
		krCity.add("Banglore");
		krCity.add("Mysore");

		ArrayList<String> mpCity = new ArrayList<>();
		mpCity.add("Bhopal");
		mpCity.add("Indore");

		stateCity.put("Maharashtra", mhCity);
		stateCity.put("Karnataka", krCity);
		stateCity.put("MadhyaPradesh", mpCity);

		System.out.println(stateCity);
		System.out.println("---------------------------------------");

		for (Map.Entry<String, ArrayList<String>> entry : stateCity.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

	}

}
