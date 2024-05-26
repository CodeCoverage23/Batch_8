package com.polymorphism;

class Bank {
	public float rateOfInterest() {
		return 7;
	}
}

class SBI extends Bank {
	public float rateOfInterest() {
		return 8;
	}
}

class HDFC extends Bank {
	public float rateOfInterest() {
		return 9;
	}
}

class ICICI extends Bank {
	public float rateOfInterest() {
		return 9.5f;
	}
}

public class OverridingTest2 {

	public static void main(String[] args) {
		SBI sbi = new SBI();
		HDFC hdfc = new HDFC();
		ICICI icici = new ICICI();

		System.out.println("SBI rate of Interest : " + sbi.rateOfInterest());
		System.out.println("HDFC rate of Interest : " + hdfc.rateOfInterest());
		System.out.println("ICICI rate of Interest : " + icici.rateOfInterest());

	}

}
