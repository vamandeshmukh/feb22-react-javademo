package com.cg.feb22.oop.intro;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateDemo {

	public static void main(String[] args) {

		LocalDate date = LocalDate.now();
		System.out.println(date);

		LocalDate joiningDate = LocalDate.of(2022, 02, 18);
		System.out.println(joiningDate);

		System.out.println(joiningDate.getYear());
		System.out.println(joiningDate.getDayOfWeek());

//		LocalDateTime ldt = LocalDateTime.now();
//		System.out.println(ldt);

		DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);

		LocalDate currentDate = LocalDate.now();

		System.out.println(currentDate.format(formatter));

	}

}
