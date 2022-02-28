package com.cg.feb22.oop;

class BasicPhone {

	void music() {
		System.out.println("Play music...");
	}
}

class SmartPhone extends BasicPhone {

	@Override
	void music() {
		System.out.println("Play dolby music...");
	}

}

public class OverrideDemo {

	public static void main(String[] args) {

		SmartPhone phone = new SmartPhone();
		phone.music();

	}
}
