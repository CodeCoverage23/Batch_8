package com.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsDemo1 {
	
	public static void main(String[] args) {
		
		File file = new File("D:\\Java Batches\\Eclipse Workspace");
		
		
		try {
			FileReader fr = new FileReader(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("rest of the code");
	}

}
