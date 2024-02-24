package basic3;

public class StaticMethodDemo {

	
	String name;
	static String village = "AMRAVATI";

	public StaticMethodDemo(String name) {
		this.name = name;
	}

	public void display() {

		System.out.println(name + " " + village);
	}

	public static void main(String[] args) {

		StaticMethodDemo s1 = new StaticMethodDemo("Kalyani");
		StaticMethodDemo s2 = new StaticMethodDemo("Shubhangi");

		s1.display();
		s2.display();
	}

}
