package com.Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet<String> l=new LinkedHashSet<String>();
		l.add("jiya");
		l.add("java");
		l.add("code");
		l.add("code");
		l.add(null);
		l.add(null);
		System.out.println(l);
		
		HashSet<String> h=new HashSet<String>();
		h.add("jiya");
		h.add("jiya");
		h.add("java");
		h.add("code");
		h.add("code");
		h.add(null);
		h.add(null);
		System.out.println(h);
		
		

	}

}
