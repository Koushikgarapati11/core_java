package com.constructor;

public class BankApplication {
	long accountNumber;
	String customerName;
	String accountType;
	double balance;

//	A Banking Application wants to maintain customer account details. 
//	Create a Java class BankAccount with the following variables:
//		accountNumber
//		customerName
//		accountType
//		balance
//		Requirements:
//		Create a parameterized constructor to initialize all account details.
//		Use the this keyword to differentiate instance variables
//	from constructor parameters.
//		Create two objects with different account details.
//		Display the details of both bank accounts.

	BankApplication(long accountNumber, String customerName, String accountType, double balance) {
		this.accountNumber = accountNumber;
		this.customerName = customerName;
		this.accountType = accountType;
		this.balance = balance;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankApplication b1 = new BankApplication(65473l, "Balu", "Saving", 5000);
		b1.display();

		BankApplication b2 = new BankApplication(654732, "Abhishay", "Current", 30000);
		b2.display();

	}

	void display() {
		System.out.println("******************************************");
		System.out.println("AccountNumber:" + accountNumber);
		System.out.println("CustomerName:" + customerName);
		System.out.println("AccountType:" + accountType);
		System.out.println("Balance:" + balance);

	}

}
