package com.methods;

import java.util.Scanner;

class Student {
	int id;
	String name;
	double height;
}

class Customer {
	int id;
	String name;
	long phonenumber;
	int zipcode;
}

class Employee {
	int id;
	String name;
	String job;
	double sal;
}

public class TestDemoFactoryMethods {

	public static Student getstudentInfo() {
		Student s = new Student();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the student id:");
		s.id = sc.nextInt();
		System.out.println("Enter the student name:");

		sc.nextLine();
		s.name = sc.nextLine();
		System.out.println("Enter the height :");

		s.height = sc.nextDouble();
		return s;
	}

	static Customer getcustomerinfo() {
		Customer c = new Customer();
		c.id = 1023;
		c.name = "Lohith";
		c.phonenumber = 8886312754L;
		c.zipcode = 534301;
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student sd = getstudentInfo();

		System.out.println("Student id :" + sd.id);
		System.out.println("Student name:" + sd.name);
		System.out.println("Student height:" + sd.height);

		Customer cd = getcustomerinfo();
		System.out.println("Customer id :" + cd.id);
		System.out.println("Customer name:" + cd.name);
		System.out.println("Customer phonenumber:" + cd.phonenumber);
		System.out.println("Customer Zipcode :" + cd.zipcode);

	}

}
