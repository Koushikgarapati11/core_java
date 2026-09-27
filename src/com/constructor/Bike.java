package com.constructor;

public class Bike {
	String brand;
	int price;
	String colour;

	Bike() {
		this("Unknown");

	}

	Bike(String brand) {
		this(brand, 0);
	}

	Bike(String brand, int price) {
		this(brand, price, "unknown");

	}

	Bike(String brand, int price, String colour) {
		this.brand = brand;
		this.price = price;
		this.colour = colour;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bike b1 = new Bike();
		b1.display();

		Bike b2 = new Bike("Pulsar");
		b2.display();

		Bike b3 = new Bike("Pulsar", 50000, "Red");
		b3.display();

	}

	void display() {
		System.out.println("******************************");

		System.out.println("Brand:" + brand);
		System.out.println("Price:" + price);
		System.out.println("Colour:" + colour);

	}

}
