package com.constructor;

public class Mobile {

	String brand;
	String model;
	double price;
	int ram;
	int storage;

	Mobile(String brand, String model, double price, int ram, int storage) {
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.ram = ram;
		this.storage = storage;

	}

	public Mobile(Mobile m) {
		// TODO Auto-generated constructor stub
		this.brand = m.brand;
		this.model = m.model;
		this.price = m.price;
		this.ram = m.ram;
		this.storage = m.storage;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mobile m = new Mobile("Iphone", "Iphone18 ", 50000, 256, 8);
		m.display();

		Mobile m1 = new Mobile(m);
		m1.display();

//		Mobile m2 = new Mobile(m1);
//		m2.display();
	}

	void display() {
		System.out.println("***********************************");
		System.out.println("Brand:" + brand);
		System.out.println("Model:" + model);
		System.out.println("Price:" + price);
		System.out.println("Ram:" + ram);
		System.out.println("Storage:" + storage);

	}

}
