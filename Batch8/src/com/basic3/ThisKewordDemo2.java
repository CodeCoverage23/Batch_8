package com.basic3;

public class ThisKewordDemo2 {

	int id;
	String name;
	String cName;

	public ThisKewordDemo2(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public ThisKewordDemo2(int id, String name, String cName) {
		this(id, name);
		this.cName = cName;
	}

}
