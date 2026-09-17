package com.languagefundamentals;

public class TestVariables {

//		Static variable declaration
	static int schoolid;
	static String schoolname;

//		instance Variable declaration

	int studentid;
	String studentname;

	static void show() {
		int s;
		s = 100;
		System.out.println("S:" + s);
	}

	public static void main(String[] args) {
		show();
//			local variable
		int z = 2000;
		System.out.println("Z:" + z);

		var x = 7453;
		var y = "Koushik";
		var c = 'a';
		var h = 65.8f;
		var r = true;
		var u = 7464.8D;

		System.out.println("X:" + x);
		System.out.println("Y:" + y);
		System.out.println("C:" + c);
		System.out.println("H:" + h);
		System.out.println("R:" + r);
		System.out.println("U:" + u);

		TestVariables t1 = new TestVariables();
//			Initialization
		schoolid = 2910;
		schoolname = "SASI";

//			How we can Accessing the static data in different ways?? 
		System.out.println("Directly");
//			directly
		System.out.println("schoolid:" + schoolid);
		System.out.println("schoolname:" + schoolname);
		System.out.println("with class name");
//			with class name 
		System.out.println("schoolid:" + TestVariables.schoolid);
		System.out.println("schoolname:" + TestVariables.schoolname);
		System.out.println("With object reference variable ");
//			with object reference variable 

		System.out.println("schoolid:" + t1.schoolid);
		System.out.println("schoolname:" + t1.schoolname);

		t1.studentid = 26432;
		t1.studentname = "Ram";

//			t1 = null; 
//			we can keep for object reference as null then no problem 
//			for static data ..but the instance data has come error like 
//			"java.lang.NullPointerException"

//			Now we can access the instance data 
		System.out.println("studentId:" + t1.studentid);
		System.out.println("student name:" + t1.studentname);

	}

}
