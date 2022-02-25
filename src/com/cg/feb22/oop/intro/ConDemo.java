package com.cg.feb22.oop.intro;

// constructor 
// It is a special type of method 
// it does not have any return type 
// name is same as class name 
// Each class has a default constructor (provided by java)
// we can create our own constructors (one or more)
// if we create our own constructor - 
// - java will not provide default constructor 
// constructor is necessary to create objects 

public class ConDemo {

	public static void main(String[] args) {

		Employee e1 = new Employee();
		e1.eid = 101;
		e1.firstName = "Sonu";
		e1.salary = 50000;
		System.out.println(e1.toString());
		e1.work();

		Employee e2 = new Employee();
		e2.eid = 102;
		e2.firstName = "Monu";
		e2.salary = 60000;
		System.out.println(e2.toString());

		Employee e3 = new Employee(103, "Tonu", 55000);
		System.out.println(e3.toString());
		
	}

}



