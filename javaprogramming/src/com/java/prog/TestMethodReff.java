package com.java.prog;

import com.java.assignment6.MultiPlicationTable;

interface MethodReff{
	public void m1();
	
	
}


public class TestMethodReff {

	public static void main(String[] args) {

		// with static 
		MethodReff reff=MultiPlicationTable::display;	
		reff.m1();
		
		//without static
		MultiPlicationTable multi=new MultiPlicationTable();
		 // first way:
		MethodReff reff1= new MultiPlicationTable()::multiOutput;	
		reff1.m1();
		// second way
		MethodReff reff2=multi::multiOutput;
		reff2.m1();
	}

}
