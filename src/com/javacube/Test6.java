package com.javacube;

public class Test6 {

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalize called");

	}

	public static void main(String[] args) {

		Test6 t1 = new Test6();

		System.out.println("Main method called");

		t1 = null;

		Test6 t2 = new Test6();
		Test6 t3 = new Test6();

		System.gc();

	}

}
