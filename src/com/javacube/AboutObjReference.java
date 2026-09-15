package com.javacube;

public class AboutObjReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Main method called");

		AboutObjReference A1 = new AboutObjReference();
		AboutObjReference A2 = new AboutObjReference();

		System.out.println(A1);// op:n   com.javacube.AboutObjReference@2b2fa4f7

		int objvalue = 0X2b2fa4f7;
		System.out.println(objvalue);// hashcode
		System.out.println(A1.hashCode());
		System.out.println(A2.hashCode());

	}

}
