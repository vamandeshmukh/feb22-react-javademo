package com.cg.feb22.oop.encap;

public class EncapDemo {

	public static void main(String[] args) {

		Employee emp = new Employee(101, "Sonu", 50000);
		System.out.println(emp.toString());
		emp.setSalary(60000);
		System.out.println(emp.getSalary());

	}

}
