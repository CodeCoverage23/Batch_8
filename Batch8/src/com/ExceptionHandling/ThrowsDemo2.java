package com.ExceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsDemo2{
	 public void m1() throws FileNotFoundException {

			FileReader file = new FileReader(new File("c:\\Java\\hello"));
			System.out.println(file);
		}

		public void m2() throws FileNotFoundException, IOException {
			m1();
			throw new IOException();
		}

		public void m3() throws Exception {
			m2();
		}

		public static void main(String[] args) {

			ThrowsDemo2 t = new ThrowsDemo2();
			try {
				t.m3();
			} catch (Exception e) {
				
				e.printStackTrace();
			}
	
		}
	
}
