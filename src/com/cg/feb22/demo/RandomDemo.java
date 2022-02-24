package com.cg.feb22.demo;

import java.util.Random;

public class RandomDemo {

	public static void main(String[] args) {

		Random ran = new Random();

//		System.out.println(ran.nextInt());

		for (int i = 1; i <= 10; i++) {
			int num = ran.nextInt(100);
			if (num > 50) {
				System.out.println(num);
			}
		}
	}
}
