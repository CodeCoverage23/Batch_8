package practices_set;

public class my_practices_set {
	public static void main(String[] args) {
		float []marks = {45.7f, 45.4f, 84.5f, 98.7f, 32.7f};
		float num = 45.7f;
		boolean isInArray = false;
		for(float element:marks) {
			if (num==element) {
				isInArray = true;
				break;
			}
		}
		if (isInArray) {
			System.out.println("the value is prasent in array");
		}
		else {
			System.out.println("the value is not preasent in array");
		}
	
		}
}
