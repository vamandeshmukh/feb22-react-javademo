package com.cg.feb22.demo;

public class MultiDemo {

	public static void main(String[] args) {

//		int[] arr4 = { 10, 20, 30, 40, 50 };
//		System.out.println(arr4);

		int[][] arr2D = new int[3][3];

		for (int i = 0; i < arr2D.length; i++) {
			for (int j = 0; j < arr2D.length; j++) {
				arr2D[i][j] = (i + j + 123);
			}
		}

		for (int i = 0; i < arr2D.length; i++) {
			for (int j = 0; j < arr2D.length; j++) {
				System.out.print(arr2D[i][j] + " ");
			}
			System.out.println(" ");
		}

	}

}
