package com.inheritance;
//parent class
class A{
	public void m1() {
		System.out.println("single inheritance : one class inherits one class.");
	}
}
public class Single extends A{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Single s = new Single();
		s.m1();

	}

}
