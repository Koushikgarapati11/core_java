package com.constructor;

public class TestCountObject {

	static int Count = 0;

	TestCountObject() {
		Count++;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestCountObject t = new TestCountObject();
		TestCountObject t1 = new TestCountObject();
		TestCountObject t2 = new TestCountObject();
		TestCountObject t3 = new TestCountObject();
		System.out.println("Count of objects:" + Count);
	}

}
