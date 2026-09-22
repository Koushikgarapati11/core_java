package com.methods;

import java.util.Scanner;

public class HotelBookingMethods {
	/*
	 * Q1. Hotel Booking Bill
	 * 
	 * Take:
	 * 
	 * Customer name Room price per day Number of days Food bill Laundry bill
	 * Discount % GST %
	 */

	static Scanner sc = new Scanner(System.in);

	void main() {
		System.out.println("Hotel Booking Bill");

		System.out.println("ENTER YOUR FIRST NAME: ");
		String fn = sc.nextLine();

		System.out.println("ENTER YOUR LAST NAME: ");
		String ln = sc.nextLine();

		String customername = CustomerName(fn, ln);
		System.out.println("CUSTOMER FULL NAME: " + customername);

		System.out.println("ENTER THE  ROOM PRICE : ");
		double rp = sc.nextDouble();
		double RoomPrice = RoomPricePerDay(rp);
		System.out.println("PER DAY FOR ROOM PRICE IS :" + RoomPrice);

		System.out.println("ENTER THE HOW MANY DAYS YOU  WANT TO STAY: ");
		short d = sc.nextShort();
		short days = numberOFDays(d);
		System.out.println("THIS NUMBER OF DAYS YOU STAYED HERE: " + days);

		double tp = TotalRoomPrice(rp, d);
		

		System.out.println("ENTER THE  FOOD BILL : ");
		double fb = sc.nextDouble();
		double fbill = FoodBill(fb);
		System.out.println("YOUR FOOD BILL IS  : " + fbill);

		System.out.println("ENTER THE  LUNDARY BILL: ");
		double lb = sc.nextDouble();
		double Lbill = Laundrybill(lb);
		System.out.println("YOUR FOOD BILL IS  :" + Lbill);

		double Totalamount = TotalBill(tp, fbill, Lbill);
		

		System.out.println("ENTER THE  DISCOUNT : ");
		double dcon = sc.nextDouble();
		double dis = GetDiscount(dcon);
		System.out.println("YOUR TOTAL DISCOUNT Is : " + dis);

		double dfd = enterfd(dcon, Totalamount);

		double tamount = entertamount(Totalamount, dfd);

		System.out.println("ENTER THE  GST: ");
		double gs = sc.nextDouble();
		double gst = GetGst(gs);
		System.out.println("YOUR TOTAL GST IS   :" + gst);

		double GSTamount = enterGstamount(gst, Totalamount);

		double GTbill = enterGTbill(GSTamount, tamount);

		System.out.println("customername:"+customername);
		System.out.println("RoomPrice:"+RoomPrice);
		System.out.println("Days:"+days);
		System.out.println(tp);
		System.out.println(fbill);
		System.out.println(Lbill);
		System.out.println(Totalamount);
		System.out.println(dis);
		System.out.println(dfd);
		System.out.println(entertamount(Totalamount, dfd));
		System.out.println(gst);
		System.out.println(GSTamount);
		System.out.println("Grand Total (Net Bill):"+GTbill);

	}

	private double GetDiscount(double dcon) {
		// TODO Auto-generated method stub
		return dcon;
	}

	// Grand Total (Net Bill) = Subtotal + GST Amount
	private double enterGTbill(double gSTamount, double tamount) {
		// TODO Auto-generated method stub
		double GTbill = tamount + gSTamount;
		return 0;
	}
//	 Subtotal (Taxable Amount) = Total Before Tax & Discount − Discount Amount

	private double entertamount(double totalamount, double dfd) {
		// TODO Auto-generated method stub
		double tamount = totalamount - dfd;
		return tamount;
	}

//	 GST Amount = Subtotal × (GST % ÷ 100)
	private double enterGstamount(double gst, double Totalamount) {
		// TODO Auto-generated method stub
		double GSTamount = Totalamount * (gst / 100);
		return GSTamount;
	}

	private double GetGst(double gs) {
		// TODO Auto-generated method stub
		return gs;
	}

//	 Discount Amount = Total Before Tax & Discount × (Discount % ÷ 100)

	private double enterfd(double dcon, double Totalamount) {
		// TODO Auto-generated method stub
		double dfd = Totalamount * (dcon / 100);
		return dfd;
	}

	String CustomerName(String fn, String ln) {
		String customername = fn + ln;
		return customername;
	}

	private double RoomPricePerDay(double rp) {
		// TODO Auto-generated method stub
		return rp;
	}

	short numberOFDays(short d) {
		return d;

	}

	double TotalRoomPrice(double rp, double d) {
		double trp = rp * d;
		return trp;
	}

	double FoodBill(double fb) {
		return fb;

	}

	double Laundrybill(double lb) {
		return lb;

	}

	double TotalBill(double trp, double fb, double lb) {

		double tbill = trp + fb + lb;

		return tbill;
	}

}