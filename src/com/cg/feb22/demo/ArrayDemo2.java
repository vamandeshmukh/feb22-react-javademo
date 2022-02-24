package com.cg.feb22.demo;

import java.util.Scanner;

public class ArrayDemo2 {

	public static void main(String[] args) {

//		int[] arr = new int[5];
//		int arr2[] = new int[5];
//		int[] arr3 = new int[5];
////		[]int  arr3 = new int[5];
//
//		for (int a : arr)
//			System.out.println(a);

//		int[] arr4 = { 10, 20, 30, 40, 50 };
//
//		for (int a : arr4)
//			System.out.println(a);
//
//		arr4[2] = 35;
//
//		for (int a : arr4)
//			System.out.println(a);
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter size of array");
		int sizeOfArray = sc.nextInt();
		int[] arr = new int[sizeOfArray];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Please enter element: " + (i + 1));
			arr[i] = sc.nextInt();
		}

		for (int a : arr) {
			System.out.println(a);
		}
		sc.close();

	}

}
