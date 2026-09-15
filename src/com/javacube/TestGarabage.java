package com.javacube;

public class TestGarabage {
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize method called");
	}

	void display() {
		TestGarabage t6 = new TestGarabage();
		System.out.println("Have a nice day brooooooo");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestGarabage t1 = new TestGarabage();
		TestGarabage t2 = new TestGarabage();
		TestGarabage t3 = new TestGarabage();

		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);

//        1)Nullifying the object
		t1 = null;
		System.gc();
//2) Re assigning the objects
		TestGarabage t4 = new TestGarabage();
		t4 = t2;
		System.out.println(t4);

		System.gc();
//  3)Anonymous objects 
		new TestGarabage().display();
//		4)out of scope 
		t3.display();
		System.gc();
		System.out.println("After*****GC ");

		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		System.out.println(t4);
	}

}
