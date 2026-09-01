package com.javacube;

public class Blocks {

	static {

		System.out.println("Static block called");

	}
	{
		System.out.println("instance block1 called");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Main method ");

	}

	 static Blocks b1 = new Blocks();

	{
		System.out.println("instance block2 called");
	}

}
