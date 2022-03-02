package com.cg.feb22.oop.intro;

class Parent {

	private int num;
	static int num2; // static
	int num3; // non static

	void m1() {
		System.out.println("1975 model house");
		System.out.println(Parent.num2);
//		System.out.println(Parent.num3); // CE 
		System.out.println(this.num3);
	}

	static void m2() {
		Parent p = new Parent();
		System.out.println(p.num3);
//		System.out.println(Parent.num3); // CE 
//		System.out.println(this.num3); // CE
	}
}

class Class2 {
	void m1() {
		System.out.println(Parent.num2);
	}
}

class Child extends Parent {

	void printNum() {
//		System.out.println(num);
		System.out.println(Parent.num2);
	}

	@Override
	void m1() {
		System.out.println("2022 model house");
	}

}

public class Demo {

	public static void main(String[] args) {

		Child child = new Child();
		child.m1();

	}

}
