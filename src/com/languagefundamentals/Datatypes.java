package com.languagefundamentals;

public class Datatypes {
//  Primitive data types Datatypes
	byte b;
	short s;
	int i;
	long l;

	float f;
	double d;

	char c;
	boolean bomb = true;

	boolean bomb1 = true;
	boolean bomb2 = false;
//
//	boolean bombs1 = 0;
//	boolean bombs2 = 1;
//
//	boolean bom1 = TRUE;
//	boolean bom2 = FALSE;
//
//	boolean bombw1 = True;
//	boolean bombw2 = False;
//
//	boolean bomby1 = "true";
//	boolean bomby2 = "false";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Datatypes d1 = new Datatypes();
		System.out.println("Main method started...");

		System.out.println("Byte value:" + d1.b);// 0
		System.out.println("Short value:" + d1.s);// 0
		System.out.println("Integer value:" + d1.i);// 0
		System.out.println("Long value:" + d1.l);// 0

		System.out.println("Float value:" + d1.f);// 0.0
		System.out.println("Double value:" + d1.d);// 0.0

		System.out.println("Char value:" + d1.c);// space

		if (d1.bomb2) {
			System.out.println("Good morning");// false
		}
		System.out.println("Byte value:" + d1.bomb);// false
	}

}
