package Game2;

import java.util.Scanner;

class cylinder1{
	private int redius;
	private int hight;

	public cylinder1(int redius,int hight) {
		this.redius= redius;
		this.hight= hight;
		
	}
	
	public cylinder1(String string) {
		// TODO Auto-generated constructor stub
	}

	public int getredius() {
		return redius;
	}
	public void setredius(int redius) {
		this.redius= redius;
	}
	
	public int gethight() {
      return hight;
	}
	public void sethight(int hight) {
		this.hight = hight;
	}
	
	public double surfacearea() {
		return 2 *Math.PI  *redius* hight+2 *Math.PI*redius*redius;
	}
	public double volume() {
		return Math.PI*redius *redius * hight;
	}
}
public class cylinder {
      public static void main(String[] args) {
    	  Scanner sc = new Scanner(System.in);
    	  int redius= sc.nextInt();
    	  int hight= sc.nextInt();
		cylinder1 c = new cylinder1(redius , hight);
	
	   // c.setredius(12);
		System.out.println(c.getredius());
	    //c.sethight(8);
		System.out.println(c.gethight());
		System.out.println("the surfacearea is :"+ c.surfacearea());
		System.out.println("the volume is :" + c.volume());
	}
}
