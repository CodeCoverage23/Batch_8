package com.java.oops;

/**
* Implementation of Hierarchical inheritance
*/
	
	public class Inheritance3 {

		public static void main(String[] args) {

			Kishor k = new Kishor();
			k.salary = 22456.09;
			k.award();
			k.pramotion();
			System.out.println(k.salary);
			
			System.out.println("***********************");

			Sachin s = new Sachin();
			s.bonus = 5000.00;
			s.salary = 22456.09;
			s.gift();
			System.out.println(s.bonus + s.salary);

		}
	}

	class Employee {

		double salary;

		public void pramotion() {
			System.out.println("Pramoted...");
		}
	}

	class Kishor extends Employee {

		public void award() {
			System.out.println("Awarded...");
		}

	}

	class Sachin extends Employee {
		double bonus;

		public void gift() {
			System.out.println("Gifted...");
		}


}
