package com.methods;

public class TestMethods {

	public static void main(String[] args) {
		System.out.println("Main  method called");
		addition(10, 20);
		System.out.println("Main  method ended");

	}

// Addition
	static void addition(int a, int b) {

		System.out.println("Addition:" + (a + b));// Addition
		int result = a + b;
		subtraction(result, 20);
	}
	// Subtraction

	static void subtraction(int a, int b) {
		System.out.println("Subtraction:" + (a - b));// difference
		int result = a - b;
		multiplication(result, 6);
	}

// Multiplication
	static void multiplication(int a, int b) {
		System.out.println("Multipliaction:" + (a * b));// product
		int result = a * b;
		division(result, 5);
	}

//  Division
	static void division(int a, int b) {
		System.out.println("Division:" + (a / b));// Quotient
		int result = a % b;
		modulus(result, 7);
	}

// Modulus
	static void modulus(int a, int b) {
		System.out.println("Modulus:" + (a % b));// Remainder
	}

}
