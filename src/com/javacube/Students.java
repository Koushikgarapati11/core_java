package com.javacube;

public class Students {
	String name;
	int age;
	String college;

	void display() {
		System.out.println("Name:" + name);
		System.out.println("Age:" + age);
		System.out.println("College:" + college);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Object 1*******************");

		Students s1 = new Students();
		s1.name = "Koushik";
		s1.age = 22;
		s1.college = "Vel tech University";
		s1.display();
		System.out.println("Object 2*******************");
		Students s2 = new Students();
		s2.name = "Balu";
		s2.age = 23;
		s2.college = " Bharath University";
		s2.display();
		System.out.println("Object 3*******************");
		Students s3 = new Students();
		s3.name = "Ravindra";
		s3.age = 22;
		s3.college = "SRM University";
		s3.display();

	}

}
