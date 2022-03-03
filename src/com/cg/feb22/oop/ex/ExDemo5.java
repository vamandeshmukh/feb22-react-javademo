package com.cg.feb22.oop.ex;

//import java.util.Scanner;

public class ExDemo5 {

	static void checkEligibility(int age) {
		if (age >= 18)
			System.out.println("You may vote");
		else
			throw new RuntimeException("You may not vote!");
	}

	public static void main(String[] args) {
		System.out.println("Start");

//		Scanner sc = new Scanner(System.in);
//		String str =sc.nextLine(); Vaman Deshmukh 
//		String str2 = sc.next(); Vaman 

		try {
			ExDemo5.checkEligibility(17);
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("End");
	}
}

//package com.cg.feb22.oop.ex;
//
//public class ExDemo5 {
//
//	static void checkEligibility(int age) {
//		if (age >= 18)
//			System.out.println("You may vote");
//		else
//			System.out.println("You can not vote!");
//	}
//
//	public static void main(String[] args) {
//		System.out.println("Start");
//		ExDemo5.checkEligibility(17);
//		System.out.println("End");
//	}
//}

//package com.cg.feb22.oop.ex;
//
//public class ExDemo5 {
//
////	throw 
//
//	static void checkEligibility(int age) {
//		RuntimeException obj = new RuntimeException();
//		if (age >= 18)
//			System.out.println("You may vote");
//		else
//			throw obj;
//	}
//
//	public static void main(String[] args) {
//		System.out.println("Start");
//		ExDemo5.checkEligibility(17);
//		System.out.println("End");
//
//	}
//
//}
