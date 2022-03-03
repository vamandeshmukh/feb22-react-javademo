package com.cg.feb22.oop.ex;

import java.util.Scanner;

public class ExDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("--- integer division app ---");
		System.out.println("Enter num1 ");
		int num1 = sc.nextInt();
		System.out.println("Enter num2 ");
		int num2 = sc.nextInt();
		int num3 = 0;

		try {
			num3 = num1 / num2;
		} catch (ArithmeticException e) {
			System.out.println("Do not divide by zero!");
		}

		// Exception in thread "main" java.lang.ArithmeticException: / by zero
		// at com.cg.feb22.oop.ex.ExDemo.main(ExDemo.java:18)

		System.out.println(num3);
		System.out.println("--- thanks for using this app ---");
		sc.close();

	}
}
