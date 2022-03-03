package com.cg.feb22.oop.ex;

class Demo {

	public static void yourFriendsUnclesCar() throws ArithmeticException, NumberFormatException {
		System.out.println("Car is running...");
		// some other code
		System.out.println(10 / 0);
	}

	static void yourFriendsUncle() {
		Demo.yourFriendsUnclesCar();
	}

	static void yourFriend() {
		Demo.yourFriendsUncle();
	}

	static void you() {
		Demo.yourFriend();
	}
}

public class ExDemo3 {

	public static void main(String[] args) {
		System.out.println("Start");
		Demo.you();
		System.out.println("End");
	}

}
