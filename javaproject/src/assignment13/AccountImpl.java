package assignment13;

import java.util.Scanner;

public class AccountImpl implements Account {

	public static void main(String[] args) {
	
		AccountImpl impl= new AccountImpl();
		impl.getSavingAccount();
	}

	@Override
	public void getSavingAccount() {
		
		String name;
		float balance;
		Scanner sc= new Scanner (System.in);
		
		System.out.println(" enter Saving Account Name>> ");
		name=sc.next();
		
		System.out.println(" Enter Balance>> ");
		balance=sc.nextFloat();
		
		getUserDetails(name,balance);
	}

	@Override
	public void getUserDetails(String name, float balance) {
		
		System.out.println(" Name : "+name);
		System.out.println(" Balance : "+balance);
	}

}
