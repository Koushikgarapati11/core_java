package com.constructor;

class Vehicle {

	String Vehicletype;

	Vehicle(String Vehicletype) {
		this.Vehicletype = Vehicletype;
	}

}

class Car extends Vehicle {

	String brand;
	double price;

	Car(String Vehicletype, String brand, double price) {
		super(Vehicletype);
		this.brand = brand;
		this.price = price;
	}

}

public class ElectricCar extends Car {
	int batteryCapacity;

	ElectricCar(String Vehicletype, String brand, double price, int batteryCapacity) {
		super(Vehicletype, brand, price);
		this.batteryCapacity = batteryCapacity;

	}

	public static void main(String[] args) {
		ElectricCar e = new ElectricCar("Manual", "br", 900750, 5);
		e.display();
	}

	void display() {
		System.out.println("brand:" + brand);
		System.out.println("price:" + price);
		System.out.println("Vehicletype:" + Vehicletype);
		System.out.println("BatteryCapacity:" + batteryCapacity);

	}

}
