package com.methods;

import java.util.*;

public class TestMethods4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the a values :");
		int a = sc.nextInt();
		System.out.println("Enter the a values :");
		int b = sc.nextInt();

		Addition(a, b);
		subtraction(a, b);
		System.out.println("Main method called");
	}

	static void Addition(int a, int b) {

		int Addition = a + b;
		System.out.println("Addition:" + Addition);
	}

	static void subtraction(int a, int b) {
		int Subtraction = a - b;
		System.out.println("subtraction:" + Subtraction);
	}

}
