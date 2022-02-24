package com.cg.feb22.oop.intro;

public class Demo3 {

//	static void m1() {
//		
//	}

	public static void main(String[] args) {

		;

		Demo3.addNums(10, 20);
//		Demo3.addNums(10); // CE
//		Demo3.addNums(10, 20, 30); // CE
//		Demo3.addNums(10.5, 20.5); // CE 
		int sum = Demo3.addNumsAndReturnSum(50, 60);
		System.out.println(sum);

	}

	static void addNums(int i, int j) {
		System.out.println(i + j);
	}

	static int addNumsAndReturnSum(int i, int j) {
		return i + j;
	}

//	static void voidMethodTriesToReturnAValue(int i, int j) {
//		System.out.println("abc");
//		return;
//	}

}
