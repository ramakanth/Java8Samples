package com.java8.defaultmethods;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateUtility {
	public static  String formatTodayDateToMMddyyyy() {
		DateTimeFormatter FOMATTER = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		LocalDate localDate = LocalDate.now();
		//Get formatted String
		String dateString = FOMATTER.format(localDate);
		return dateString;
	}
	public static void main(String[] args) {
		String todayDate = DateUtility.formatTodayDateToMMddyyyy();
		System.out.println("Today date in MM/dd/yyyy format :  "+todayDate);
	}

}
