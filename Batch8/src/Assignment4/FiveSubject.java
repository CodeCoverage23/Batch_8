package Assignment4;
//5. Write the Java Program to calculate total of five subject marks and average of it.
public class FiveSubject {
	public static void main(String[] arge) {
		int math = 90;
		int marathi =50;
		int english  =80;
		int science  = 60;
		int chemistry =40;
		
		int total = math+marathi+english+science+chemistry;
		  System.out.println("total of five sub:" +total);
		 int average = total/5;
		 System.out.println("average of five sub:" +average);
	}

}
