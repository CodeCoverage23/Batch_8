package Game2;

class Animal2{
	 public char fourlag;
	 public  char onetall;
	 public String getfourlag() {
		return "dog have fourlage";
	}
	 public void setfourlag(char fourlag) {
		 this.fourlag = fourlag;
	 }
	
	public String getonetall() {
		return "dog have onetall";
	}
	public void setonetall(char onetall) {
		this.onetall = onetall;
	}
}	
class Dog extends Animal2{
		public char bhuuubhauu;
		
	 public char getbhuuubhauu() {
		return bhuuubhauu;
	}
	 public void setbhuubhauu(char bhuuubhauu) {
		 this.bhuuubhauu = bhuuubhauu;
	 }
	
}

public class Animal {
	public static void main(String[] arge) {
	    Dog A=new Dog(); 
	     A.setbhuubhauu(A.bhuuubhauu);
		System.out.println(A.getfourlag());
	   
		System.out.println(A.getonetall());
		
		
		System.out.println(A.getbhuuubhauu());
	}

}
