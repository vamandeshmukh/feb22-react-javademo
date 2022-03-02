package com.cg.feb22.oop;

// method overloading 
// same name and return type 
// but the arguments should be different 
// applicable to static and non-static 
// can be done in same class or super-sub classes 

public class PolyDemo {

	public static void main(String[] args) {

		Calc calc = new Calc();
		calc.add(10, 20);
		calc.add(10, 20, 30);
		calc.add(10, 20, 30, 40);

	}

}
