package com.oops;

class Bank {
	public float getRateOfInterest() {
		// rest of the part
		return 0.0f;
	}

	public void deposit() {
		System.out.println("Deposited...");
	}
}

class SBI extends Bank {

	public float getRateOfInterest() {
		return 8.2f;
	}
}

class HDFC extends Bank {

	public float getRateOfInterest() {
		return 9.2f;
	}
}

class RBL extends Bank {

	public float getRateOfInterest() {
		return 7.7f;
	}
}

public class RuntimePolymorphismDemo1 {

	public static void main(String[] args) {

		SBI s = new SBI();
		System.out.println("SBI interest rate : " + s.getRateOfInterest());

		HDFC h = new HDFC();
		System.out.println("HDFC interest rate : " + h.getRateOfInterest());

		RBL r = new RBL();
		System.out.println("RBL interest rate : " + r.getRateOfInterest());

	}

}
