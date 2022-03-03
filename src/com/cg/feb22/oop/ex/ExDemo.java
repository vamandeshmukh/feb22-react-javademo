package com.cg.feb22.oop.ex;

import java.util.Scanner;

public class ExDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s1, s2;
		int num1 = 0, num2 = 0, num3 = 0;

		System.out.println("--- integer division app ---");
		System.out.println("Enter num1 ");
		s1 = sc.next();
		try {
			num1 = Integer.parseInt(s1);
		} catch (NumberFormatException e) {
			System.out.println("Please enter only integers:");
			s1 = sc.next();
			num1 = Integer.parseInt(s1);
		}
		System.out.println("Enter num2 ");
		s2 = sc.next();
		try {
			num2 = Integer.parseInt(s2);
		} catch (NumberFormatException e) {
			System.out.println("Please enter only integers:");
			s2 = sc.next();
			num2 = Integer.parseInt(s2);
		}
		try {
			num3 = num1 / num2; // code that may lead to exception
		} catch (ArithmeticException abc) {
//			abc.printStackTrace(); // recovery code  
			System.out.println("Do not divide by zero!");
		} finally {
			sc.close();
			System.out.println(num3);
		}

		System.out.println("--- thanks for using this app ---");

		// Exception in thread "main" java.lang.ArithmeticException: / by zero
		// at com.cg.feb22.oop.ex.ExDemo.main(ExDemo.java:18)

	}
}

//package com.cg.feb22.oop.ex;
//
//import java.util.Scanner;
//
//public class ExDemo {
//
//	public static void main(String[] args) {
//
//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("--- integer division app ---");
//		System.out.println("Enter num1 ");
//		int num1 = sc.nextInt();
//		System.out.println("Enter num2 ");
//		int num2 = sc.nextInt();
//		int num3 = 0;
//
//		try {
//			num3 = num1 / num2; // code that may lead to exception
//		} catch (ArithmeticException abc) {
////			abc.printStackTrace(); // recovery code  
//			System.out.println("Do not divide by zero!");
//		} finally {
//			sc.close();
//			System.out.println(num3);
//		}
//
//		System.out.println("--- thanks for using this app ---");
//
//		// Exception in thread "main" java.lang.ArithmeticException: / by zero
//		// at com.cg.feb22.oop.ex.ExDemo.main(ExDemo.java:18)
//
//	}
//}
