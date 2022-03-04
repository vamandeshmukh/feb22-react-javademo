package com.cg.feb22.oop.ex;

// checked exception 
public class VoterNotEligibleException extends Exception {

	// ignore
	private static final long serialVersionUID = 1L;

	public VoterNotEligibleException() {

	}

	public VoterNotEligibleException(String message) {
		super(message);
	}

//	public VoterNotEligibleException(int message) {
//		// code 
//		super(message);
//	}
}

//package com.cg.feb22.oop.ex;
//
//// unchecked exception 
//public class VoterNotEligibleException extends RuntimeException {
//
//	private static final long serialVersionUID = 1L;
//
//	public VoterNotEligibleException() {
//
//	}
//
//	public VoterNotEligibleException(String message) {
//		super(message);
//
//	}
//
//}
