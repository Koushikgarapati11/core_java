package com.methods;

public class TestMethods1 {
//	no return type with parameters 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main method started ");
		square(4);
		greetings("Koushik");
		Evenodd(678);
		studentDetails("Garapati", 24, "CSE", 97, 96, 99);
		loanDetails(65000.00, 5000.00, 4, 6000.00);
		shoppingCart(6450.00, 3460.0, 2300.0, 2000.0, 23.00);
		employeeDetails("Balu", 6450.0, 34000.0, 32.00);
		examResult("Ram", 96, 95, 89, 94, 93);

	}

//	 1:Write a Java program to create a method greet(String name) 
//	that accepts a name and prints "Hello, name".
	static void greetings(String name) {
		System.out.println(name);
	}

//2:Write a Java program to create a method square(int n)
//	that accepts a number and prints its square.
	static void square(int a) {
		System.out.println(a * a);
	}

//		 4:Write a Java program to create a method 
//	checkEvenOdd(int n) that accepts a number and prints whether it is Even or Odd.
	static void Evenodd(int n) {
		if (n % 2 == 0) {
			System.out.println(n + "is even");
		} else {

			System.out.println(n + "is odd");
		}
	}

//	Create studentDetails(String name, int age, String branch,
//	int m1, int m2, int m3) that prints student information and 
//	calculates total and average marks.
	static void studentDetails(String name, int age, String branch, int m1, int m2, int m3) {

		System.out.println("name" + name);
		System.out.println("age:" + age);
		System.out.println("branch:" + branch);
		int total = m1 + m2 + m3;
		double Avgmarks = total / 3;
		System.out.println("total:" + total);
		System.out.println("Avgmarks:" + Avgmarks);

	}

//	Create loanDetails(double principal, double rate,
//	int years, double processingFee) 
//	that calculates simple interest, total repayment,
//	and final amount including processing fee.

	static void loanDetails(double principal, double rate, int years, double processingFee) {
		double simpleinterest = (principal * rate * years) / 100;
		double totalrepayment = principal + simpleinterest;
		double finalamountwithprocessingfee = totalrepayment + processingFee;
		System.out.println("simpleinterest:" + simpleinterest);
		System.out.println("totalrepayment:" + totalrepayment);
		System.out.println("finalamountwithprocessingfee:" + finalamountwithprocessingfee);

	}
//	Create shoppingCart(double p1, double p2,
//	double p3, double p4, double gst) that 
//	calculates subtotal, GST amount, and final payable amount.

	static void shoppingCart(double p1, double p2, double p3, double p4, double gst) {
		double subtotal = p1 + p2 + p3 + p4;
		double GSTamount = (subtotal * gst) / 100;
		double finalpayableamount = subtotal + GSTamount;
		System.out.println(subtotal);
		System.out.println(GSTamount);
		System.out.println(finalpayableamount);

	}
//	Create employeeDetails(String name, double basic,
//	double bonus, double deduction) that calculates gross
//	salary and net salary.

	static void employeeDetails(String name, double basic, double bonus, double deduction) {

		double GrossSalary = basic + bonus;
		double NetSalary = GrossSalary - deduction;
		System.out.println("GrossSalary:" + GrossSalary);
		System.out.println("NetSalary:" + NetSalary);

	}

//	Create examResult(String name, int m1,
//	int m2, int m3, int m4, int m5) that prints
//the student's details, total, average, and percentage.
	static void examResult(String name, int m1, int m2, int m3, int m4, int m5) {

		int total = m1 + m2 + m3 + m4 + m5;
		int average = total / 5;
		double percentage = (total / 500.0) * 100;
		System.out.println("name:" + name);
		System.out.println("total:" + total);
		System.out.println("average:" + average);
		System.out.println("percentage:" + percentage);

	}
}
