package com.methods;

public class TestMethods {

	public static void main(String[] args) {
		System.out.println("Main  method called");
		addition(10, 20);
		System.out.println("Main  method ended");

	}

	static void addition(int a, int b) {

		System.out.println("Addition:" + (a + b));// Addition
		int result = a + b;
		TestMethods t = new TestMethods();
		t.subtraction(result, 20);
	}

	void subtraction(int a, int b) {
		System.out.println("Subtraction:" + (a - b));// difference
		int result = a - b;
		multiplication(result, 6);
	}

	void multiplication(int a, int b) {
		System.out.println("Multipliaction:" + (a * b));// product
		int result = a * b;
		divison(result, 5);
	}

	static void divison(int a, int b) {
		System.out.println("Divison:" + (a / b));// Quotient
		int result = a % b;
		modulus(result, 7);
	}

	static void modulus(int a, int b) {
		System.out.println("Modulus:" + (a % b));// Remainder
	}

}
