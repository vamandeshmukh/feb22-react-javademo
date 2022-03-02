package com.cg.feb22.oop.abs;

abstract class Rbi {

	int interest;

	void payInterest() {
		System.out.println("pay interest");
	}

	abstract void doKyc();
}

class Hdfcbank extends Rbi {

	@Override
	void doKyc() {
		System.out.println("Aadhaar");
	}
}

class AxisBank extends Rbi {

	@Override
	void doKyc() {
		System.out.println("PAN Card");
	}
}

public class BankDemo {

	public static void main(String[] args) {

		Hdfcbank obj = new Hdfcbank();
		obj.payInterest();
		obj.doKyc();
		AxisBank obj2 = new AxisBank();
		obj2.payInterest();
		obj2.doKyc();
	}

}
