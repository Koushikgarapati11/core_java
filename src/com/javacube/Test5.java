package com.javacube;

public class Test5 {
	static int count = 0;

	{

		count++;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test5 t = new Test5();
		Test5 t1 = new Test5();
		Test5 t2 = new Test5();
		Test5 t3 = new Test5();
		System.out.println("main method called");
		System.out.println("Total no.of objects:" + count);
	}

}
