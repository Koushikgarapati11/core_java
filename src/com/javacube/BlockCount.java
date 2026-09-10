package com.javacube;

public class BlockCount {

	static {
		System.out.println("Static block called");
	}
	static int count = 0;

//  Instance block
	{
		count++;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//objects
		BlockCount B1 = new BlockCount();
		BlockCount B2 = new BlockCount();
		BlockCount B3 = new BlockCount();
		BlockCount B4 = new BlockCount();

		System.out.println("Main method called");
//  count of objects 
		System.out.println("count:" + count);

	}

}
