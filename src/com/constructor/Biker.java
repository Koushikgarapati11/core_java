package com.constructor;

public class Biker {
	String brand;
	int price;
	String colour;

	Biker() {
		this("Honda");
	}

	Biker(int price, String brand) {
		this(price, brand, "black");

	}

	Biker(String brand) {
		this(7000, brand);
	}

	Biker(int price, String brand, String colour) {
		System.out.println("Price:" + price);
		System.out.println("Brand:" + brand);
		System.out.println("Colour:" + colour);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Biker b1 = new Biker();

	}

}
