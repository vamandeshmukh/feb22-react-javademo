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

class SuperClass {

	void addNums(int i, int j) {
		System.out.println(i + j);
	}
}

class SubClass extends SuperClass {

	@Override
	void addNums(int i, int j) {
		int gst = 18;
		System.out.println(i + j + gst);
	}
	// 
}

public class OverrideDemo {

	public static void main(String[] args) {

		SubClass obj = new SubClass();
		obj.addNums(10, 20); // 30

		SuperClass obj2 = new SubClass();
		obj2.addNums(10, 20);

//		SmartPhone phone = new SmartPhone();
//		phone.music();

	}
}
