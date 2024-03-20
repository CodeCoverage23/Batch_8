package com.java.prog;

interface Supplier<Integer>{
	
	public Integer get();
}

public class TestSupplier {

	public static void main(String[] args) {
		
     
//		Supplier<Integer> s=()->{return 5*5;};
//		System.out.println(s.get());
		
		Supplier<String> s=()->{
			String  otp="";
			for( int i=0;i<6;i++) {
				
				otp=otp+(int)(Math.random()*10);
			}
			return otp;
		};

		System.out.println(s.get());
		System.out.println(s.get());

//		System.out.println(Math.random());
//		System.out.println(Math.random()*10);
//		System.out.println((int)(Math.random()*10));


		
	}

}
