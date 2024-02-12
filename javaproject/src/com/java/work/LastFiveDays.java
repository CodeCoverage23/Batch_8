package com.java.work;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LastFiveDays {

	public static void main(String[] args) {

		LocalDate today = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		System.out.println("todays Date is: " + formatter.format(today));
		System.out.println();

		for (int i = 1; i <= 5; i++) {

			LocalDate previousDate = today.minusDays(i);

			System.out.println("Date " + (i) + "days ago:" + formatter.format(previousDate));
		}

	}

}
