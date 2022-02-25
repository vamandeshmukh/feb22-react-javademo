package com.cg.feb22.oop.intro;

public class Employee {

	int eid;
	String firstName;
	double salary;

	Employee() {
		System.out.println("constructor called");
	}

	Employee(int a, String b, double c) {
		System.out.println("constructor called");
	}

	void work() {
		System.out.println(firstName + " works...");
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", firstName=" + firstName + ", salary=" + salary + "]";
	}

}
