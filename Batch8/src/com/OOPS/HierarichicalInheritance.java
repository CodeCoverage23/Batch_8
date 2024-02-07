package com.OOPS;

//Implementation of Hierarchical Inheritance

public class HierarichicalInheritance {
	
	
	public static void main(String[] args) {
		
		Kishor k = new Kishor ();
		k.salary = 22456.09;
		k.award();
		k.pramotion ();
		System.out.println(k.salary);
		
		System.out.println("***********************8");
		
		
		Sachin s = new Sachin ();
		s.bonus = 5000.00;
		s.salary = 22456.09;
		s.gift();
		System.out.println(s.bonus + s.salary);
		
	}

}
       class Employee {
    	   
    	   double salary;
    	   
    	   public void pramotion () {
    		   System.out.println("pramoted...");
    		   
    	   }
   }
       class Kishor extends Employee {
    	   
    	   public void award () {
    		   System.out.println("Awarded...");
    		   
    	   }
    }
       
       class Sachin extends Employee{
    	   double bonus;
    	   
    	   public void gift() {
    		   System.out.println("Gifted...");
    	   }
       }
       