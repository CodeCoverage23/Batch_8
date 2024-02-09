package com.ExceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

//use for declaring exception
public class ThrowsKeyword {

	public static void main(String[] args) throws FileNotFoundException {
		File file=new File("");
		FileReader fr=new FileReader(file);
	

	}

}
