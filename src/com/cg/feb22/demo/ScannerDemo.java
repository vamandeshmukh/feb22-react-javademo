package com.cg.feb22.demo;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your name:");
		String name = sc.next();

		System.out.println(name);
		System.out.println("Enter your salary:");
		double salary = sc.nextDouble();
		System.out.println(salary);
		sc.close();
		
		
		
		// random 
		

	}

}
