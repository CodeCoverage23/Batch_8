package com.inheritance;

class D {
	public void m1() {
		System.out.println("Hello");
	}
}

class B extends D {
	public void m2() {
		System.out.println("Keep Going");
	}
}

class C extends B {
	public void m3() {
		System.out.println("All the best");
	}
}

public class Multilevel extends C{

	public static void main(String[] args) {
		
		Multilevel p = new Multilevel();		// methods of all  class including multilevel class can be access 
//		C p = new Multilevel();					// methods of  class upto C class can be access
//		B p = new Multilevel();					// methods of all  class upto B class can be access
//		D p = new Multilevel();					// methods of all  class upto D class can be access
		p.m1();
		p.m2();
		p.m3();
		p.m4();

	}
	public void m4() {
		System.out.println("Multilevel inheritance : chain of inheritance ");
	}

}
