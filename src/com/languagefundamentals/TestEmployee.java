package com.languagefundamentals;

public class TestEmployee {
	int empid;
	String empname;
	double salary;

	void display() {
		System.out.println("EmployeeId:" + empid);
		System.out.println("Employeename:" + empname);
		System.out.println("salary:" + salary);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestEmployee t1 = new TestEmployee();
		t1.empid = 1011;
		t1.empname = "Abhishey";
		t1.salary = 65000;
		t1.display();

		TestEmployee t2 = new TestEmployee();
		t2.empid = 1012;
		t2.empname = "Koushik";
		t2.salary = 75000;
		t2.display();

		TestEmployee t3 = new TestEmployee();
		t3.empid = 1013;
		t3.empname = "Ram";
		t3.salary = 85000;
		t3.display();
	}

}
