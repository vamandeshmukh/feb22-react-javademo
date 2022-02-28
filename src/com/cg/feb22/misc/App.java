package com.cg.feb22.misc;

public class App {

	public static void main(String[] args) {

		State MH = State.MAHARASHTRA;
		System.out.println(MH);

		for (State state : State.values()) {
			System.out.println(state);
		}
		State myState = State.MAHARASHTRA;
		System.out.println(myState);
		System.out.println(myState.getStateCode());

		String language = "Kannada";
		State theState;

		switch (language) {
		case "Marathi":
			theState = State.MAHARASHTRA;
			break;
		case "Kannada":
			theState = State.KARNATAKA;
			break;
		case "Telugu":
			theState = State.TELANGANA;
			break;
		default:
			theState = State.OTHER_STATE;
		}
		System.out.println(theState);
	}
}
