package com.cg.feb22.oop.ex;

public class ExDemo6 {

	static void checkEligibility(int age) {
		if (age >= 18)
			System.out.println("You may vote");
		else
			throw new VoterNotEligibleException("You may not vote!");
	}

	public static void main(String[] args) {
		System.out.println("Start");

		try {
			ExDemo5.checkEligibility(17);
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("End");
	}
}
