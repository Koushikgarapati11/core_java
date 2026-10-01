package com.constructor;

class Animal {

	String breedname;
	int age;
	char gender;

	Animal() {
		System.out.println("No arg called from Animal");

	}

	Animal(String breedname, int age, char gender) {
		this.breedname = breedname;
		this.age = age;
		this.gender = gender;

	}

	public static void main(String[] args) {

	}
}

public class Dog extends Animal {

	Dog() {

		super("Germansheepad", 24, 'M');
		System.out.println("No arg called from dog");
	}

	public Dog(String breedname, int age, char gender) {
		this.breedname = breedname;
		this.age = age;
		this.gender = gender;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Main method called ");
		Dog d1 = new Dog();
		d1.display();

		Dog d2 = new Dog("Hypa", 14, 'F');
		d2.display();
		System.out.println("Main method ended ");

	}

	void display() {
		System.out.println("Breedname:" + breedname);
		System.out.println("Age:" + age);
		System.out.println("Gender:" + gender);

	}

}
