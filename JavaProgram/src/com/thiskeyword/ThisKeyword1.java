package com.thiskeyword;

public class ThisKeyword1 {

	int id;
	String name;
	String cName;

	public ThisKeyword1(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public ThisKeyword1(int id, String name, String cName) {
		this(id, name); 
		this.cName = cName;
	}

}
