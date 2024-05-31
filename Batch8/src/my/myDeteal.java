package my;

class Employe {
	int id;
	String name;
	int salary;
	public void printDetails() {
		System.out.println("my id is "+ id);
		System.out.println("my name  is "+ name);
	
	}
	public int getsalary() {
		return salary; 
	}
}
 

public class myDeteal {
	public static void  main(String[] args) {
		System.out.println("create won class");
		Employe yash = new Employe();
		System.out.println("yash detals");
		Employe shreyash = new Employe();
		System.out.println("shreyash detals");
		
		yash.name="yashu";
		yash.id=35366;
		yash.salary=98;
		
		shreyash.name="shreyu";
		shreyash.id=7979;
		shreyash.salary=980;
		
		
		
      /*  System.out.println(yash.id);
        System.out.println(shreyash.id);
        System.out.println(yash.name);
        System.out.println(shreyash.name);
        System.out.println(yash.salary);
        System.out.println(shreyash.salary);
      */
		yash.printDetails();
		shreyash.printDetails();
		 int salary=yash.getsalary();
		 shreyash.getsalary();
	
		
	}
}
	