package com.methods;

import java.util.Scanner;

public class TestMethodsDemo2 {
//	Loan Calculation
//	Take loan amount, interest rate, and number of years. 
//	Pass them to a 
//	method and calculate simple interest and total repayment.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Loan Calculation");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the loan amount:");
		double lm = sc.nextDouble();
		double lamount = enterLoanamount(lm);

		System.out.println("Enter the interest rate:");
		float ir = sc.nextFloat();
		float irate = enterInterestrate(ir);

		System.out.println("Enter no of years:");
		byte Ny = sc.nextByte();
		byte Noofyears = enterNoofyears(Ny);

//	SI = (P × R × T) / 100
		double sp = Simpleinterest(lm, Ny, ir);
//	Total Repayment = P + (P × R × T) / 100	
		double Rp = Repayment(lm, Ny, ir);

		System.out.println("Loan amount:" + lm);
		System.out.println("Interest rate:" + ir);
		System.out.println("No of  years:" + Ny);
		System.out.println("Simple interest:" + sp);
		System.out.println("Repayment:" + Rp);

	}

	private static double Repayment(double lm, byte ny, float ir) {
		// TODO Auto-generated method stub
		double Rp = lm + (lm * ir * ny) / 100;
		return Rp;
	}

	private static double Simpleinterest(double lm, byte ny, float ir) {
		// TODO Auto-generated method stub
		double sp = (lm * ir * ny) / 100;
		return sp;
	}

	private static float enterInterestrate(float ir) {
		// TODO Auto-generated method stub
		return ir;
	}

	private static byte enterNoofyears(byte ny) {
		// TODO Auto-generated method stub
		return ny;
	}

	private static double enterLoanamount(double lm) {
		// TODO Auto-generated method stub
		return lm;
	}

}
