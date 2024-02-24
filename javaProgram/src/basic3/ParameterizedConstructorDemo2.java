package basic3;

import com.basic3.Student;

public class ParameterizedConstructorDemo2 {

	
	public static void main(String[] args) {

		Student s1 = new Student(101, "John");
		Student s2 = new Student(102, "Sam");

		s1.display();
		s2.display();

	}


}
