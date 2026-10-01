package com.constructor;

public class BankAccount {

	long accountnumber;
	String accountholdername;
	double balance;
	String branch;

	BankAccount(long accountnumber, String accountholdername, double balance, String branch) {

		this.accountnumber = accountnumber;
		this.accountholdername = accountholdername;
		this.balance = balance;
		this.branch = branch;
	}

	BankAccount(BankAccount B1, double balance, String branch) {

		this.accountnumber = B1.accountnumber;
		this.accountholdername = B1.accountholdername;
		this.balance = balance;
		this.branch = branch;
	}

	BankAccount(BankAccount B2, long accountnumber, String accountholdername) {

		this.accountnumber = accountnumber;
		this.accountholdername = accountholdername;
		this.balance = B2.balance;
		this.branch = B2.branch;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAccount B1 = new BankAccount(98476759, "Bharath", 50000.00, "KPHB");
		B1.display();

		BankAccount B2 = new BankAccount(B1, 60000.00, "SR NAGAR");
		B2.display();

		BankAccount B3 = new BankAccount(B2, 98476760, "Vamsi");
		B3.display();

	}

	public void display() {
		System.out.println("*********************************");
		System.out.println("Accountnumber:" + accountnumber);
		System.out.println("Accountholdername:" + accountholdername);
		System.out.println("Balance:" + balance);
		System.out.println("branch:" + branch);

	}
}
