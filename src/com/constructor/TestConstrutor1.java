package com.constructor;

public class TestConstrutor1 {

	int id;
	String Name;

	TestConstrutor1() {
		id = 101;
		Name = "Unknown";
	}

	{

		id = 1000001;
		Name = "Abishay";

		id = 10505;
		Name = "Koushik";

		System.out.println("Instance block called");
	}

	TestConstrutor1(int id, String Name) {
		System.out.println("2 args construct");
	}

	void display() {
		System.out.println("Student id :" + id);
		System.out.println("Student name :" + Name);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestConstrutor1 t = new TestConstrutor1();
		TestConstrutor1 t1 = new TestConstrutor1(1, "Karthik");
		TestConstrutor1 t2 = new TestConstrutor1(2, "Ram ");

		System.out.println("t object********************");

		t.id = 101;
		t.Name = "Koushik";
		t.display();
		System.out.println("t1 object********************");

		t1.display();
		System.out.println("t2 object********************");

		t2.display();

	}

}
