package com.cg.feb22.oop.intro;

//final 
//variables - value can not change 
// method - can not be overridden 
// class - can not be extended 

class ParentClass {

	final void m1() {
		System.out.println("m1");
	}

}

class ChildClass extends ParentClass {

//	@Override
//	void m1() {
//		System.out.println("m1");
//	}

}

final class Class3 {

	int num;

}

//class Class4 extends Class3 {
//
//}

public class FinalDemo {

}
