package com.cg.feb22.demo;

public class PromoDemo {

	public static void main(String[] args) {

//		byte b1 = 10, b2 = 20, b3 = b1 + b2;
		byte b1 = 100; // -128 to 127
		byte b2 = 28;
//		int b3 = b1 + b2; // byte short int char 
		byte b3 = (byte) (b1 + b2); // -1 -128 

		System.out.println(b3);

	}

}
