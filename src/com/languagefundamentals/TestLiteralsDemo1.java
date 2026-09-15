package com.languagefundamentals;

public class TestLiteralsDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Binary Literals");

//		Binary Literals 
		int b1 = 0b1011;
		int b2 = 0B10100011001;
		int v1 = 0b10111111;

		System.out.println(b1);
		System.out.println(b2);
		System.out.println(v1);
		System.out.println("Floating Literals");
//		Float Literals

		float f1 = 120;
		float f2 = 01634.65f;
		float f3 = 0X64532a2;
		float f4 = 01634.65f;
//		float f6=012.735; CE:Type mismatch: cannot convert from double to float

		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);
		System.out.println(f4);

		System.out.println("char Literals");
//		Char Literals 
		char c1 = 'A';
		char c2 = 89;
		char c3 = '\uabcd';

		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);

		System.out.println("Boolean Literals");
// Boolean Literals 

		boolean status = true;
		boolean status1 = false;

		if (status1) {
			System.out.println("Have a nice day");
		} else {
			System.out.println("Have a bad day");

			System.out.println("Null literals");

//			Null literals 
			String s1 = null;
			int[] a1 = null;
			TestLiteralsDemo1 t1 = null;
			Integer i1 = null;

			System.out.println(s1);
			System.out.println(a1);
			System.out.println(i1);

			System.out.println("String literals");
//			String literals 

			String s2 = "RAM GARAPATI";
			String s3 = "Koushik GARAPATI";
			String s4 = " GARAPATI";

			System.out.println(s2);
			System.out.println(s3);
			System.out.println(s4);

		}

	}

}
