package com.constructor;

import java.util.Scanner;

//Mobile Bill calculator
public class MobileBill {
	String Mobilemodel;
	double price;
	int quantity;
	double deliveryCharges;
	double mobilecost;
	double finalbill;

	MobileBill() {
		this("Unknown");
	}

	MobileBill(String Mobilemodel) {
		this(Mobilemodel, 0.0);
	}

	MobileBill(String Mobilemodel, double price) {
		this(Mobilemodel, price, 0);
	}

	MobileBill(String Mobilemodel, double price, int quantity, double deliveryCharges) {
		this.Mobilemodel = Mobilemodel;
		this.price = price;
		this.quantity = quantity;
		this.deliveryCharges = deliveryCharges;
		this.mobilecost = price * quantity;
		this.finalbill = mobilecost + deliveryCharges;
	}

	MobileBill(String Mobilemodel, double price, int quantity) {
		this(Mobilemodel, price, quantity, 0.0);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Mobile model:");
		String Mobilemodel = sc.nextLine();
		System.out.println("Enter the Price:");
		double price = sc.nextDouble();

		System.out.println("Enter the Quantity:");
		int Quantity = sc.nextInt();

		System.out.println("Enter the deliveryCharges:");
		double deliveryCharges = sc.nextDouble();

		MobileBill m1 = new MobileBill(Mobilemodel, price, Quantity, deliveryCharges);
		m1.display();
	}

	void display() {
		System.out.println("Mobilemodel:" + Mobilemodel);
		System.out.println("Price:" + price);
		System.out.println("Quantity:" + quantity);
		System.out.println("deliveryCharges:" + deliveryCharges);
		System.out.println("mobilecost:" + mobilecost);
		System.out.println("finalbill:" + finalbill);

	}

}
