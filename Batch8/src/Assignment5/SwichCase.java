package Assignment5;
// 4.Write a program to print month of year. Case 1 January case 2 February case n....use switch case
public class SwichCase {
	
	public static void main(String[] arge) {
		
		int num = 7;
		String month = "";
		
		switch (num) {
		case 1:
			month = "january";
			break;
		case 2:
			month = "february";
			break;
		case 3:
			month = "march";
			break;
		case 4:
			month = "april";
	break;
				default:
					System.out.println("please enter a valid number ");
					
		}
		System.out.println(month);
		
}
	
}