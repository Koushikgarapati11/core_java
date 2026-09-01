package com.javacube;

public class Student {
//	Declaration
//	static data
	static int collegeID = 101;
	static String collegeName = "veltech";
//	Instance data
	int studentID;
	String studentName;
	int studentmarks;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		initialization
		// collegeID = 101;
		// collegeName = "veltech";
//		Access the STATIC data;
		System.out.println("collegeID:" + collegeID);
		System.out.println("collegeName:" + collegeName);
//	Access the object data	
		Student s1 = new Student();
		s1.studentID = 23;
		s1.studentName = "Koushik";
		s1.studentmarks = 100;
		System.out.println("studentID:" + s1.studentID);
		System.out.println("studentName" + s1.studentName);
		System.out.println("studentmarks:" + s1.studentmarks);

	}

}
