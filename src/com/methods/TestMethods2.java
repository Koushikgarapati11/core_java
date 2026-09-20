package com.methods;

public class TestMethods2 {
//no return type no parameters 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main method called");
		calculate();
	}
//	Create a method calculate() that performs addition,
//	subtraction, multiplication, and division on two numbers and prints all four results.

	static void calculate() {
		System.out.println("calculate**************************");

		int a = 455;
		int b = 45;
		System.out.println("addition:" + (a + b));
		System.out.println("subtraction:" + (a - b));
		System.out.println("multiplication:" + (a * b));
		System.out.println("division:" + (a / b));
		studentDetails();
	}

//	Create a method studentDetails() that prints a
//	student's name, age, branch, college, and percentage in separate lines.
	static void studentDetails() {
		System.out.println("studentDetails**************************");

		System.out.println("Name:Koushik");
		System.out.println("Age:23");
		System.out.println("branch:CSE");
		System.out.println("College: Veltech");
		System.out.println("percentage: 89%");

		rectangle();
	}

//	Create a method rectangle() that calculates and 
//prints the area and perimeter of a rectangle. Use fixed values for length and breadth.

	static void rectangle() {
		System.out.println("rectangle**************************");

		int l = 5;
		int b = 8;
		System.out.println("Rectangle:" + l * b);
		circle();
	}
//	Create a method circle() that calculates and
//prints the area and circumference of a circle. Use a fixed radius.

	static void circle() {
		System.out.println("circle**************************");

		double PI = 3.14159d;
		float radius = 5.0f;
		System.out.println("Circle:" + 2 * PI * radius);
		simpleinterest();
	}

//	Create a method simpleInterest() that calculates
//and prints simple interest using fixed values of principal, rate, and time.
	static void simpleinterest() {
		System.out.println("simpleinterest**************************");

		int principal = 45;
		int rate = 20;
		int time = 3;

		System.out.println("Simple interest:" + (principal * rate * time) / 100);
		swap();
	}

//	Create a method swap() that swaps the values 
//of two variables and prints the values before and after swapping.
	static void swap() {
		System.out.println("swap**************************");

		int a = 20;
		int b = 10;
		System.out.println("Before swap: a=" + a + "b=" + b);
		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("After swap :a=" + a + "b=" + b);
		average();

	}

//	Create a method average() that calculates
//	the average of three numbers and prints the result.
	static void average() {
		System.out.println("average**************************");

		int a = 100;
		int b = 567;
		int c = 342;
		int Avg = a + b + c / 3;
		System.out.println("average of three numbers:" + Avg);
		salary();
	}
//	Create a method salary() that calculates an 
//	employee's gross salary using basic salary, HRA, and DA, and prints the result.

	static void salary() {
		System.out.println("salary**************************");

		double basicsalary = 64000.0;
		double HRA = 50000.00;
		double DA = 45000.00;
		double Grosssalary = basicsalary + HRA + DA;
		System.out.println("Grosssalary:" + Grosssalary);
		marks();
	}
//	Create a method marks() that stores marks 
//	of 5 subjects and prints the total and average.No loops.

	static void marks() {
		System.out.println("marks**************************");

		int English = 89;
		int maths = 98;
		int physics = 97;
		int chemistry = 97;
		int maths2 = 99;
		int total = English + maths + physics + chemistry + maths2;
		int Average = English + maths + physics + chemistry + maths2 / 5;
		System.out.println("Total :" + total);
		System.out.println("Average of marks :" + Average);
		temperature();
	}
//	Create a method temperature() that 
//	converts a temperature from Celsius to Fahrenheit and 
//	prints the result.

	static void temperature() {
		System.out.println("temperature**************************");

		double celsius = 25;
		double Fahrenheit = (celsius * 1.8) + 32;
		System.out.println("Fahrenheit:" + Fahrenheit);
	}

}
