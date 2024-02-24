package com.java.assignment12;

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