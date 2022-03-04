package DateTimeAPI;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.Arrays;
import java.util.Date;

public class DateTimeAPIDemo {

	public static void main(String[] args) {

		LocalDate ld = LocalDate.now();
		System.out.println(ld);
		LocalDate ld1 = LocalDate.of(1991, 03, 20);
		System.out.println(ld1);

		System.out.println(ld1.getDayOfYear());
		System.out.println(ld1.getMonth());

		DateTimeFormatter df = DateTimeFormatter.ofPattern("DD/MM/yyyy");
		String date = ld1.format(df);
		System.out.println(date);

		Period dr = Period.between(ld1, ld);
		System.out.println(dr.get(ChronoUnit.YEARS));
		String[] dateFormats = { "d-M-y", "dd-MM-yy", "dd-MMM-yyy", "dd-MM-yyyy", "D-MM-yyyy", "DD-MM-yyyy",
				"DDD-MM-yyyy", "d - MMM- Y", "w'th week of' YY", "w'th week of' YYY", "E, dd'th' MMMM,YYYY",
				"EE, dd'th' MMMM,YYYY", "EEE, dd'th' MMMM,YYYY", "EEEE, dd'th' MMMM,YYYY" };
		Arrays.stream(dateFormats)
				.forEach(i -> System.out.println(DateTimeFormatter.ofPattern(i).format(LocalDate.now())));

	}
}

/*
 * PERIOD
 * 
 */