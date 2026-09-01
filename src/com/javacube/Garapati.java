package com.javacube;

public class Garapati {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub

		System.out.println("main method started");

		System.out.println("Welcome to java world");

		Class.forName("java.lang.String");
		Class.forName("java.lang.System");
		Class.forName("com.javacube.Garapati");
		Class.forName("com.mysql.cj.jdbc.Driver");

		System.out.println("main method ended");

	}

}
