package com.java.program;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionExample {

	public static void findFile() throws IOException {
	  
		File newFile= new File("test.txt");
		
		FileInputStream stream =new FileInputStream(newFile);
		
	}
	
	public static void main(String[] args)  {
		
		try {
			ExceptionExample.findFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("exception handle");
		}
		System.out.println("normal flow");
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
