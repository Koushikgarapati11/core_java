package com.methods;

import java.util.Scanner;

public class EmployeePayroolSystem {
// EmployeePayroolSystem
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Employee name:");
		String en = sc.nextLine();
		String employeename = enterEmployername(en);

		System.out.println("Enter the Basic salary");
		double bs = sc.nextDouble();
		double basicsalary = enterbasicsalary(bs);

		System.out.println("Enter the bonus:");
		double b = sc.nextDouble();
		double bonus = enterBonus(b);

		System.out.println("Enter the HRA");
		double hra = sc.nextDouble();
		double HRA = enterHra(hra);

		double hr1 = hraOp(bs, hra);

		System.out.println("Enter the DA");
		double da = sc.nextDouble();
		double DA = enterDa(da);

		double da1 = daOp(bs, da);

		double gs = entergrosssalry(bs, hr1, da1, b);

		System.out.println("Enter the PF");
		double pf = sc.nextDouble();
		double PF = enterPf(pf);

		double pf1 = pfOp(bs, pf);

		System.out.println("Enter the Tax");
		double tax = sc.nextDouble();
		double Tax = enterTax(tax);

		double tax1 = taxOp(gs, tax);

//		Net Salary: net_salary = gross_salary - (pf + tax)
		double NS = enternetsalary(gs, pf1, tax1);

		System.out.println("Employer Name:" + employeename);
		System.out.println("Basis Salary:" + basicsalary);
		System.out.println("Bonus:" + bonus);
		System.out.println("HRA:" + HRA);
		System.out.println("hr1:" + hr1);
		System.out.println("DA:" + DA);
		System.out.println("da1:" + da1);
		System.out.println("gs:" + gs);
		System.out.println("PF:" + PF);
		System.out.println("pf1:" + pf1);
		System.out.println("Tax:" + Tax);
		System.out.println("tax1:" + tax1);
		System.out.println("NS:" + NS);

	}

//	PF: pf = basic_salary * (pf_percent / 100)
	private static double pfOp(double bs, double pf) {
		double pf1 = bs * (pf / 100);
		return pf1;
	}
//	Tax: tax = gross_salary * (tax_percent / 100)

	private static double taxOp(double gs, double Tax) {
		// TODO Auto-generated method stub
		double tax1 = gs * (Tax / 100);
		return tax1;
	}

	private static double daOp(double bs, double da) {
		// TODO Auto-generated method stub
		double daOp = bs * (da / 100);
		return daOp;
	}
//	HRA: hra = basic_salary * (hra_percent / 100)

	private static double hraOp(double bs, double hra) {
		// TODO Auto-generated method stub
		double hrOp = bs * (hra / 100);
		return hrOp;
	}

	private static double enternetsalary(double gs, double pf, double tax) {
		// TODO Auto-generated method stub
//		Net Salary: net_salary = gross_salary - (pf + tax)
		double NS = gs - (pf + tax);
		return NS;
	}

	private static double enterTax(double tax) {
		// TODO Auto-generated method stub
		return tax;
	}

	private static double enterPf(double pf) {
		// TODO Auto-generated method stub
		return pf;
	}

//	Gross Salary: gross_salary = basic_salary + hra + da + bonus
	private static double entergrosssalry(double bs, double hr1, double da1, double b) {
		// TODO Auto-generated method stub
		double gs = bs + hr1 + da1 + b;
		return gs;
	}

	private static double enterDa(double da) {
		// TODO Auto-generated method stub
		return da;
	}

//	HRA: hra = basic_salary * (hra_percent / 100)
	private static double enterHra(double hra) {
		// TODO Auto-generated method stub
		return hra;
	}

	private static double enterBonus(double b) {
		// TODO Auto-generated method stub
		return b;
	}

	private static double enterbasicsalary(double bs) {
		// TODO Auto-generated method stub
		return bs;
	}

	private static String enterEmployername(String en) {
		// TODO Auto-generated method stub
		return en;
	}

}
