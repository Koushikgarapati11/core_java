package com.methods;

import java.util.Scanner;

public class BankAccount {

//	Bank Account Management
//	Take account holder name, initial balance, deposit amount, 
//	and withdrawal amount.
//	Create methods for:
//	Deposit
//	Withdrawal
//	Balance calculation
//	Transaction summary
//

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Account Holder Name:");
		String Ahname = sc.nextLine();
		String Accountname = enterAccountHoldername(Ahname);

		System.out.println("Enter the Intial balance:");
		double balance = sc.nextDouble();
		double Intialbalance = enterIntialBalance(balance);

		System.out.println("Enter how much amount you want to with draw:");
		double wAmount = sc.nextDouble();
		balance = enterWithDraw(wAmount, balance);
		System.out.println("Amount After with draw:" + balance);

		System.out.println("Enter how much amount you want to deposit:");
		double dAmount = sc.nextDouble();
		balance = enterDeposit(dAmount, balance);
		System.out.println("Amount After with deposit:" + balance);

		double finalAmount = checkbalance(balance);
		System.out.println("Account Balance:" + finalAmount);

		System.out.println("Accountname:" + Accountname);
		System.out.println("Intialbalance:" + Intialbalance);
		System.out.println("wAmount:" + wAmount);
		System.out.println("dAmount:" + dAmount);
		System.out.println("finalAmount:" + finalAmount);

	}

//	Previous_Balance + Deposits - Withdrawals
	private static double checkbalance(double balance) {
		// TODO Auto-generated method stub

//		double finalAmount = balance + dAmount - wAmount;
		return balance;
	}

	private static double enterDeposit(double dAmount, double balance) {
		// TODO Auto-generated method stub
		if (dAmount >= 100) {
			balance = balance + dAmount;
		} else {
			System.out.println("minumum amount you want to give >100");
		}
		return balance;
	}

	private static double enterWithDraw(double wAmount, double balance) {
		// TODO Auto-generated method stub
		if (wAmount > 0 && wAmount <= balance) {
			balance = balance - wAmount;
		} else {
			System.out.println("insufficient balance");

		}

		return balance;
	}

	private static double enterIntialBalance(double balance) {
		// TODO Auto-generated method stub
		return balance;
	}

	private static String enterAccountHoldername(String ahname) {
		// TODO Auto-generated method stub
		return ahname;
	}

}
