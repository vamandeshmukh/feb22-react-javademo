package com.cg.feb22.oop.abs;

// concrete method - normal method 
// method signature and method body 

// What to do?  - target - method signature - add two integers 
// How to do it? - process - method body - actual process of adding tow integers 

//abstract 
//abstract method -  
//has abstract keyword 
// only method signature  
//What to do?  - target - method signature - add two integers 
// can be created within abstract class in interface  

// concrete class - normal class 

// abstract class 
// has abstract keyword 
// its object can not be created 
// its can be inherited and abstract method can be overridden in the child class 

abstract class AbsClass {

	abstract public void addNums(int i, int j);

}

public class AbsDemo extends AbsClass {

	@Override
	public void addNums(int i, int j) {
		System.out.println(i + j);
	}

	public static void main(String[] args) {
//		AbsClass obj = new AbsClass(); // CE -Cannot instantiate the type AbsClass 
		AbsDemo obj = new AbsDemo();
		obj.addNums(10, 20);

	}

}
