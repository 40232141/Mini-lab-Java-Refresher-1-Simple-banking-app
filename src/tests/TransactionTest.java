package tests;

import java.util.Date;

import model.Transaction;

public class TransactionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Transaction testTransaction = new Transaction ("77",2.50, new Date());
		//would personally use a Calendar object and then initialise the Date object here
		//But for the lab's sake we can use Date's deprecated constructor
		System.out.println(testTransaction.toString());
	}

}
