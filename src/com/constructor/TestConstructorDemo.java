package com.constructor;

public class TestConstructorDemo {
	int id;
	String Name;

	TestConstructorDemo() {
		System.out.println("No args constructor called ");
	}

	TestConstructorDemo(int id, String Name) {
		this.id = id;
		this.Name = Name;
	}
	{
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestConstructorDemo t = new TestConstructorDemo();
		t.employee();

		TestConstructorDemo t1 = new TestConstructorDemo(2, "Java");
		t1.employee();

	}

	void employee() {
		System.out.println("Student id :" + id);
		System.out.println("Student id :" + Name);

	}

}
