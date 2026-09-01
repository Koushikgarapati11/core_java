package com.javacube;

public class Cricketer {
	// Declaration
	// Static variable
	static int CountryID;
	static String CountryName;
	// instance variable
	int JersyID = 101;
	String cricketerName = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main method started!!");

		// object 1..................

		System.out.println("Object 1**********************");
		// Initialization
		CountryID = 95;
		CountryName = "India";

		// Access the static data
		System.out.println("CountryID:" + CountryID);
		System.out.println("CountryName:" + CountryName);
		// Access the instance data

		Cricketer msd = new Cricketer();

		msd.JersyID = 07;
		msd.cricketerName = "MS Dhoni";
		System.out.println("JersyID:" + msd.JersyID);
		System.out.println("cricketerName:" + msd.cricketerName);

		System.out.println("Object 2**********************");

		System.out.println("CountryID:" + CountryID);
		System.out.println("CountryName:" + CountryName);
		Cricketer vk = new Cricketer();

		vk.JersyID = 18;
		vk.cricketerName = "Virak kohili ";
		System.out.println("JersyID:" + vk.JersyID);
		System.out.println("cricketerName:" + vk.cricketerName);

		System.out.println("Object 3**********************");

		System.out.println("CountryID:" + CountryID);
		System.out.println("CountryName:" + CountryName);
		Cricketer GV = new Cricketer();

		System.out.println("JersyID:" + GV.JersyID);
		System.out.println("cricketerName:" + GV.cricketerName);

		System.out.println("Object 4**********************");

		CountryID = 96;
		CountryName = "Bharath";

		System.out.println("CountryID:" + CountryID);
		System.out.println("CountryName:" + CountryName);
		Cricketer GK = new Cricketer();

		System.out.println("JersyID:" + GK.JersyID);
		System.out.println("cricketerName:" + GK.cricketerName);

		System.out.println("Object 5**********************");

		System.out.println("CountryID:" + CountryID);
		System.out.println("CountryName:" + CountryName);
		Cricketer KR = new Cricketer();

		System.out.println("JersyID:" + KR.JersyID);
		System.out.println("cricketerName:" + KR.cricketerName);
	}

}
