package com.inheritance;

// Aggregation in java 
// if a class have a entity reference
//it represents HAS-A relationship
// here relationship is employee HAS-A Address
class Address{
	String city;
	String state;
	String country;
	public Address(String city,String state,String country) {
		this.city=city;
		this.state=state;
		this.country=country;
	}
}
public class Employee {
	int id;
	String name;
	Address ad;
	public Employee(int id,String name,Address ad) {
		this.id=id;
		this.name=name;
		this.ad=ad;
	}
	void display() {
		System.out.println(id + " "+name);
		System.out.println(ad.city+ " "+ad.state+" "+ad.country);
	}
	public static void main(String[] args) {
		Address a1=new Address("Amravati","Maharashtra", "India");
		Address a2=new Address("Pune","Maharashtra", "India");
		
		Employee e1 = new Employee(1,"Jiya",a1);
		Employee e2 = new Employee(2,"niyati",a2);
		e1.display();
		e2.display();

	}

}
