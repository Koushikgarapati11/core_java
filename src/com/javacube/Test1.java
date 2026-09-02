package com.javacube;

public class Test1 {
//	static block
	static {

		System.out.println("Static block called");
	}

	{
		Test1 t1=new Test1();
		System.out.println("instance called1");
	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		System.out.println("main method ended");

	}

	{

		System.out.println("instance block called2");
	}

}
