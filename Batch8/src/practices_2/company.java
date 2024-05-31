package practices_2;

class Employ{
	int salary;
	String name;
	public int getsalary() {
		return salary;
	}
	public String getname() {
		return name;
	}
	public void setname(String n) {
		name = n;
	}
}
public class company {
	public static void main(String[] args) {
		Employ yash= new Employ();
		yash.setname("shreyash");
		yash.salary=567;
		System.out.println("the salary is " +  yash.getsalary());
		System.out.println("the name is " +  yash.getname());
		
	}

}
