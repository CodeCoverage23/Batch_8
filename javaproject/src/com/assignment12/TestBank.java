package com.assignment12;
 // hierarchical Inheritance
public class TestBank {

	public static void main(String[] args) {
		
		ICICIBank icicibank = new ICICIBank();
		icicibank.getICICIBankDetail();
		
		SBIBank sbibank= new SBIBank();
		sbibank.getSBIBankDetails();
		
		HDFCBank hdfcbank = new HDFCBank();
		hdfcbank.getHDFCBankDetails();
	}

}