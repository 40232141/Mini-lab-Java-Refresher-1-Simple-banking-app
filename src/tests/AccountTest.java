package tests;

import java.util.Date;

import model.Account;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account testAccount = new Account ("1234","Supel", "Saving",
				new Date());
		System.out.println(testAccount.toString());

	}
	
	

}
