package com.cg.feb22.oop.ex;





public class ExDemo7 {

	static void checkEligibility(int age) throws VoterNotEligibleException, ArithmeticException {
//		System.out.println(10 / 0);
		if (age >= 18)
			System.out.println("You may vote");
		else
			throw new VoterNotEligibleException("You may not vote!\nYou may not vote!2\nYou may not vote!3");
	}

	public static void main(String[] args) {
		System.out.println("Start");

//		ExDemo7.checkEligibility(17);

		try {
			ExDemo7.checkEligibility(17);
		} catch (VoterNotEligibleException e) {
//			someOytherMethod();
			System.out.println(e.getMessage());
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("End");
	}
}
