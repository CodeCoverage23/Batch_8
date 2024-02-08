package com.task;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DatePrinter {
	public static void main(String[] args) {

		LocalDate currentDate = LocalDate.now();

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

		System.out.println("Current Date: " + formatter.format(currentDate));

		System.out.println("Previous 5 Days:");
		for (int i = 1; i <= 5; i++) {
			LocalDate previousDate = currentDate.minusDays(i);
			System.out.println(formatter.format(previousDate));
		}
	}
}