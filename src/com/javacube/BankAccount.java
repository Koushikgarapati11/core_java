package com.javacube;

public class BankAccount {
//static variable
	static long accountnumbergenerator = 454866526;
//	instance variable 
	long accountnumber;
	String accountholdername;
	int balance;

	{
		accountnumbergenerator++;
	}

	public static void main(String[] args) {

		System.out.println("Object 1 ***************");
		BankAccount BA = new BankAccount();

		BA.accountnumber = accountnumbergenerator;
		BA.accountholdername = "Koushik";
		BA.balance = 40000;

		System.out.println("Account number:" + BA.accountnumber);
		System.out.println("Account holder name:" + BA.accountholdername);
		System.out.println("Balance:" + BA.balance);

		System.out.println("Object 2 ***************");
		BankAccount BA1 = new BankAccount();
		BA1.accountnumber = accountnumbergenerator;
		BA1.accountholdername = "Ravindra";
		BA1.balance = 50000;

		System.out.println("Account number:" + BA1.accountnumber);
		System.out.println("Account holder name:" + BA1.accountholdername);
		System.out.println("Balance:" + BA1.balance);

		System.out.println("Object 3 ***************");
		BankAccount BA2 = new BankAccount();
		BA2.accountnumber = accountnumbergenerator;
		BA2.accountholdername = "Balu";
		BA2.balance = 80000;

		System.out.println("Account number:" + BA2.accountnumber);
		System.out.println("Account holder name:" + BA2.accountholdername);
		System.out.println("Balance:" + BA2.balance);

		System.out.println("Object 4 ***************");
		BankAccount BA3 = new BankAccount();
		BA3.accountnumber = accountnumbergenerator;
		BA3.accountholdername = "Koushik";
		BA3.balance = 40000;

		System.out.println("Account number:" + BA3.accountnumber);
		System.out.println("Account holder name:" + BA3.accountholdername);
		System.out.println("Balance:" + BA3.balance);

		System.out.println("Object 5 ***************");
		BankAccount BA4 = new BankAccount();
		BA4.accountnumber = accountnumbergenerator;
		BA4.accountholdername = "Koushik";
		BA4.balance = 40000;

		System.out.println("Accountnumber:" + BA4.accountnumber);
		System.out.println("Account holder name:" + BA4.accountholdername);
		System.out.println("Balance:" + BA4.balance);

	}

}
