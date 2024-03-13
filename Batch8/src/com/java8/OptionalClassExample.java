package com.java8;

import java.util.Optional;

public class OptionalClassExample {
	
	public static Optional<String> getName(){
		return Optional.of("Code Coverage");
	}

	public static void main(String[] args) {
		String str="Java";
		
		
//		if(str==null) {
//			System.out.println("the value is null");
//		}
//		else {
//			System.out.println(str.length());
//		}
		
		Optional<String> optional=Optional.ofNullable(str);
		System.out.println(optional.isPresent());
		System.out.println(optional.orElse("No value present"));
		System.out.println(optional.get());
		
		Optional<String> name = getName();
		System.out.println(name.orElse("No value return"));

	}

}
