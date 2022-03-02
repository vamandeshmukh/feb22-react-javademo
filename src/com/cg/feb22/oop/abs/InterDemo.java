package com.cg.feb22.oop.abs;

interface Int1 {

	int num = 10;
//	private int num2 = 20; // CE
	final int num3 = 30;

//	final void m3();

//	void m1();

}

class Class5 {

	void m1() {

	}
}

interface Int2 {

	public abstract void m1();

	public abstract void m2();

	public static void m3() {
		System.out.println("static method in interface");
	}

	public static void m33() {
		System.out.println("static method in interface 2");
	}

	public default void m4() {
		System.out.println("default method from interface");
	}

}

interface Int3 extends Int1 {
	
}


class Class10 implements Int1, Int2 {

	@Override
	public void m1() {
		// TODO Auto-generated method stub

	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub

	}

}

class Class9 implements Int2 {

	@Override
	public void m1() {
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub

	}

}

public class InterDemo {

	public static void main(String[] args) {
		Int2.m3();
		Int2.m33();
		Class9 obj = new Class9();
		obj.m4();

	}

}
