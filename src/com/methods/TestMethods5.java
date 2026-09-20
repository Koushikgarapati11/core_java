package com.methods;

import java.util.Scanner;

public class TestMethods5 {

	void main() {
		// TODO Auto-generated method
		System.out.println("Employee Payslip");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the employer name:");
		String en = sc.nextLine();
		String ename = enterEmployeename(en);

		System.out.println("Basic Salary:");
		double sal = sc.nextDouble();
		double BS = basicSalary(sal);

		System.out.println("Bonus:");
		double bon = sc.nextDouble();
		double bono = bonus(bon);

		System.out.println("Deduction:");
		double ded = sc.nextDouble();
		double deduct = deduction(ded);

		double gs = grossSalary(sal, bon);
		double NS = NetSalary(gs, ded);

		System.out.println("Employer Name:" + ename);
		System.out.println("Basic salary:" + BS);
		System.out.println("Bonus:" + bono);
		System.out.println("Deduction:" + deduct);

		System.out.println("Gross Salary:" + gs);

		System.out.println("Net Salary:" + NS);

		System.out.println("Main method called");

	}

	private double NetSalary(double gs, double ded) {
		// TODO Auto-generated method stub
		double NS = gs - ded;
		return NS;
	}

	double grossSalary(double sal, double bon) {
		double gs = sal + bon;
		return gs;
	}

	double deduction(double ded) {

		return ded;
	}

	double bonus(double bon) {
		// TODO Auto-generated method stub

		return bon;
	}

	double basicSalary(double sal) {
		// TODO Auto-generated method stub
		return sal;
	}

	String enterEmployeename(String en) {

		return en;
	}

}
