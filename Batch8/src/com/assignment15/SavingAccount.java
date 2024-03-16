package com.assignment15;
//Design another class called as SavingAccount extends Account that contain withdrawAmount. 

public class SavingAccount extends Account {
	
	private double withdrawAmount;
	
	public double getWithdrawAmount() {
		return withdrawAmount;
	}
	
	public void setWithrawAmount(double withdrawAmount) {
		this.withdrawAmount = withdrawAmount;
	}

	public void setWithdrawAmount(double withdrawAmount) {
		this.withdrawAmount = withdrawAmount;
	}

	@Override
	public String toString() {
		return "SavingAccount [withdrawAmount=" + withdrawAmount + "]";
	}
	
	

}
