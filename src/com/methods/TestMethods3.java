package com.methods;

import java.util.Scanner;

public class TestMethods3 {
	static int balance = 1000;

	static void deposit(int amount) {
		balance = balance + amount;
		System.out.println(balance);
	}

	static void withdraw(int amount) {
		balance = balance - amount;
		System.out.println(balance);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Deposit :");
		int deposit = sc.nextInt();

		System.out.println("Enter the Withdraw :");
		int Withdraw = sc.nextInt();

		deposit(deposit);
		withdraw(Withdraw);
		System.out.println("Balance:" + balance);
	}

}
