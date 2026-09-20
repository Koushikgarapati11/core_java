package com.methods;

import java.util.Scanner;

public class TestMethodsDemo1 {
//	Movie Ticket Bill
//	Take movie name, ticket price, number of tickets, 
//	and snack price.
//	Pass them to a method and calculate the final bill.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Movie name:");
		String Mn = sc.nextLine();
		String moviename = enterMoviename(Mn);

		System.out.println("Enter the ticket price:");
		double Tp = sc.nextInt();
		double TicketPrice = enterTicketprice(Tp);

		System.out.println("Enter the number  of tickets:");
		byte nt = sc.nextByte();
		byte Nooftickets = numberOftickets(nt);

		System.out.println("Enter the Snacks Price:");
		double Sp = sc.nextInt();
		double Snackprice = enterThesnacksPrice(Sp);

		double fp = FinalPrice(Sp, nt, Tp);

		System.out.println("Movie Name:" + moviename);
		System.out.println("Ticket Price:" + TicketPrice);
		System.out.println("No of tickets:" + Nooftickets);
		System.out.println("Snacks price:" + Snackprice);
		System.out.println("Final Price:" + fp);

	}

	 static double FinalPrice(double sp, byte nt, double tp) {
		// TODO Auto-generated method stub
		double fp = tp + sp + nt * tp;

		return fp;
	}

	static double enterThesnacksPrice(double sp) {
		// TODO Auto-generated method stub
		return sp;
	}

	private static byte numberOftickets(byte nt) {
		// TODO Auto-generated method stub
		return nt;
	}

	static double enterTicketprice(double Tp) {
		// TODO Auto-generated method stub
		return Tp;
	}

	static String enterMoviename(String mn) {
		// TODO Auto-generated method stub
		return mn;
	}

}
