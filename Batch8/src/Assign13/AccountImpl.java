package Assign13;

import java.util.Scanner;

//1. Design the interface which contain below method public void getSavingAccount();
//public void getUserDetails(String name,float balance); Then design the new class called as 
//AccountImpl and implement that method, below input should be taken from user as name 
//and balance into getSavingAccount method and pass input and print it into getUserDetails method.
public class AccountImpl implements Account {
	public static void main(String[] args) {
		AccountImpl a = new AccountImpl();
		a.getSavingAccount();
	}
	@Override
	public void getSavingAccount() {
		Scanner Sc = new Scanner(System.in);
		System.out.println("enter a name : ");
		String name = Sc.nextLine();
		System.out.println("enter a balance : ");
		float balance = Sc.nextFloat();
		getUserDetail(name, balance);
		
	}
	@Override
	public void getUserDetail(String name, float balance) {
		System.out.println("name :" +name);
		System.out.println("balance :" +balance);
	}
	

}
