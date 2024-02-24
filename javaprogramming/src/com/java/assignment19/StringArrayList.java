
package com.java.assignment19;

import java.util.ArrayList;
import java.util.Iterator;

public class StringArrayList {

	public static void main(String[] args) {

		ArrayList<String> list=new ArrayList<>();
		
		list.add("Mumbai");
		list.add("pune");
		list.add("bangalore");
		list.add("Hyderabad");
		list.add("mumbai");
		System.out.println(list);
		Iterator<String> iterator = list.iterator();		
		while(iterator.hasNext()) {
			if(iterator.next().equalsIgnoreCase("Mumbai")) {
				iterator.remove();
				
			}
			
		}		
		System.out.println(list);
		
		
		
		
		
		
	}

}
