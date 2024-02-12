package com.assignment15;

////Design another class called as SavingAccount extends Account that contain withdrawAmount. 

public class SavingAccount extends Account {
	private double withDrawAmount;

	public double getWithDrawAmount() {
		return withDrawAmount;
	}

	public void setWithDrawAmount(double withDrawAmount) {
		this.withDrawAmount = withDrawAmount;
	}

	@Override
	public String toString() {
		return "SavingAccount [withDrawAmount=" + withDrawAmount + "]";
	}

}
