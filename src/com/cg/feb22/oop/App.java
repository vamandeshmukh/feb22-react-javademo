package com.cg.feb22.oop;

// super 

class Parent {

	int num = 10;
}

class Child extends Parent {

	int num2 = 20;
	int num = 15;

//	super();

	public void m1() {
		System.out.println(num);
		System.out.println(this.num);
		System.out.println(super.num);
	}
}

public class App {

	public static void main(String[] args) {

		Child obj = new Child();
//		System.out.println(obj.num2);
//		System.out.println(obj.num);
		obj.m1();

	}

}
