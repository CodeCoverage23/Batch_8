package examples.program;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LastFiveDays {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		System.out.println("Today's Date is: " + formatter.format(today));

		for (int i = 0; i < 5; i++) {
			LocalDate previousDate = today.minusDays(i);
			System.out.println("Date " + (i + 1) + " days ago: " + formatter.format(previousDate));

		}
	}
}
