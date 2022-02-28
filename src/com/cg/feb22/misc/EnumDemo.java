package com.cg.feb22.misc;

// types == datatypes 
// primitive types - 8 - raw types, contain only one value  

// reference types - ~ made up of primitives or reference types -  user defined 
// class interface enum array String... 

enum SomeEnum {
	
	_120, _130, _140 

}

public class EnumDemo {

	public static void main(String[] args) {

//		int num = 10; //
//		num = 15;
////		variable 
////		constant 
//
//		final int numOfValue = 20;
		final int NUM_OF_VALUE = 20;
////		num2 = 25;
//
//		String[] weekDays = { "Mon", "Tue", "Wed" };
//		System.out.println(weekDays[0]);
//		weekDays[0] = "Abc";
//		System.out.println(weekDays[0]);

		WeekDays today = WeekDays.MONDAY;
		System.out.println(today);
//		WeekDays womensDay = WeekDays.
//		today.
		System.out.println(WeekDays.values().toString());

	}

}
