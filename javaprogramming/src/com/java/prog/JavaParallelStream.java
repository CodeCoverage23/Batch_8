package com.java.prog;

import java.util.Arrays;
import java.util.List;

public class JavaParallelStream {

	public static void main(String[] args) {
		
		
		List<Integer> num=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		System.out.println("sequesntial stream>>");
		
		num.stream().forEach(f->System.out.println(f));
		
		System.out.println();
		
		System.out.println("parallel stream>>");

		num.parallelStream().forEach(System.out::println);	
		
	}
	
	
	
	
	
}
