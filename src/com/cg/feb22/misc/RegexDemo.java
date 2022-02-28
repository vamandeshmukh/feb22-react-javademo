package com.cg.feb22.misc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {

	public static void main(String[] args) {

//		String input = "abcd";
//		String regex = "BC";
//
//		Pattern pat = Pattern.compile(regex);
//
//		Matcher mat = pat.matcher(input);
//
//		System.out.println(mat.matches()); // false 
//		System.out.println(mat.find()); // true 
//		System.out.println(mat.lookingAt()); // false

		String input = "1234";// "ABCDE1234F";
		String regex = "[0-9]"; // [0-9]   \\d    [a-zA-Z]   \\p

//		String input = "aac2324aa"; // "ABCDE1234F";
//		String regex = "\\p{Upper}{5}\\d{4}\\p{Upper}{1}"; // ???

		String panCard = "all uppercase five letters four digits one letter";

		Pattern pat = Pattern.compile(regex);

		Matcher mat = pat.matcher(input);

		System.out.println(mat.matches()); // false

	}

}
