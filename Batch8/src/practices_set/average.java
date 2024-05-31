package practices_set;

public class average {
	public static void main(String[] args) {
		int[]marks = {78, 45, 45, 84, 78, 78}; 
		int sum =0;
		for(int element:marks) {
			sum = sum + element;
		}
		System.out.println("the value of everage marks is " + sum/marks.length);
	}

}
