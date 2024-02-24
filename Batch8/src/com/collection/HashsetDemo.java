package com.collection;

import java.util.HashSet;

public class HashsetDemo {
	
	public static void main(String[] args) {
		
		HashSet<Integer> h = new Hashset();
		
		h.add(12);
		h.add(44);
		h.add(4);
		h.add(44);
		h.add(11);
		h.add(45);
		h.add(96);
		h.add(null);
		
		System.out.println(h.add(12));
		System.out.println(h.add(10));
		System.out.println(h.add(10));
		
		
		System.out.println(h);
		System.out.println("Hash code value : "+ h.hashCode());
	}

}
