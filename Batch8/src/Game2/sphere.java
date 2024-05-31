package Game2;

import java.util.Scanner;

class sphere1{
	
	private int redius;
	public sphere1(int redius) {
		this.redius= redius;
	}
	 	
	public int getredius() {
		return redius;
	}
	public void setredius(int radius) {
		this.redius=radius;
	}
	public double surfacearea(int surfacearea) {
		return 4* Math.PI* redius*redius;
	}
	public double volume(int volume) {
		return 4/3 * Math.PI * redius*redius*redius;
	}
	
}
public class sphere {
      public static void main(String[] args) {
    	  Scanner sc = new Scanner(System.in);
    	  int redius = sc.nextInt();
		 sphere1 s = new sphere1(redius);
		
		System.out.println(s.getredius());
		System.out.println( "surfacearea of sphere is :" + s.surfacearea(0));
		System.out.println( "the volume of sphere is :" + s.volume(0));
	}
}
