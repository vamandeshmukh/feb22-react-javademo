package com.cg.feb22.misc;

public class Demo {

	// applicable to static and non-static members
	// applicable to fields, methods, constructors
	// applicable to classes, enums, interfaces

	public static int publicMember = 10; // accessible from anywhere in the app
	protected static int protectedMember = 20; // subclasses and within the package
	static int packageMember = 30; // within the package
	private static int privateMember = 40; // only within the class

	public static void main(String[] args) {

		System.out.println(Demo.publicMember);
		System.out.println(Demo.protectedMember);
		System.out.println(Demo.packageMember);
		System.out.println(Demo.privateMember);

	}

}
