package com.cg.feb22.oop;

// super 

class Parent {

	int num = 10;
	private int num5 = 50;
	static int num4 = 40;
	
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

//class GrandChild extends Child {
//	
//}

public class App {

	public static void main(String[] args) {

		Child obj = new Child();
//		System.out.println(obj.num2);
//		System.out.println(obj.num);
//		System.out.println(obj.num5);
		obj.m1();
		Parent obj2 = new Child();
//		obj2.m1();
		System.out.println(Parent.num4);
		System.out.println(Child.num4);
		Child.num4 = 45;
		System.out.println(Parent.num4);
		System.out.println(Child.num4);
		
		Parent par = new Parent();
//		par.num
	}

}
