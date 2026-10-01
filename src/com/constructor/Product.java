package com.constructor;

public class Product {
	int productId;
	String productName;
	double price;
	int quantity;

	Product(int productId, String productName, double price, int quantity) {
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}

	Product(Product b2, int quantity) {
		this.productId = b2.productId;
		this.productName = b2.productName;
		this.price = b2.price;
		this.quantity = quantity;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1 = new Product(84645, "Plate", 60, 3);
		p1.display();
		p1.calculateTotal();

		Product p2 = new Product(p1, 5);
		p2.display();

		p2.calculateTotal();
	}

	void display() {
		System.out.println("*********************************************");
		System.out.println("productId:" + productId);
		System.out.println("productName:" + productName);
		System.out.println("price:" + price);
		System.out.println("quantity:" + quantity);

	}

	void calculateTotal() {
		double total = (price * quantity);
		System.out.println(" total price of both products:" + total);
	}

}
