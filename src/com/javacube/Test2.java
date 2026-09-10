package com.javacube;

//a) Create 4 methods – 2 static and 2 instance methods. 
//Write a statement inside each method to identify which method is called.

//b) Call only one method inside main(), but the output 
//should display statements from all 4 methods.
//

public class Test2 {

	static void show() {
		System.out.println("Static 1 method called.....");
	}

	void method2() {
		show();
		System.out.println("Instance 2 method called.....");
	}

	static void special() {
		Test2 t = new Test2();
		t.method1();
		System.out.println("Static 2 method called.....");
	}

	void method1() {
		Test2 t = new Test2();
		t.method2();
		System.out.println("Instance 1 method called.....");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		special();
		System.out.println("Main method called");

	}

}
