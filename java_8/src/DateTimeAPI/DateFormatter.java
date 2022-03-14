package DateTimeAPI;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class DateFormatter {
	public static void main(String[] args) {
		String[] dateFormats = { "d-M-y", "dd-MM-yy", "dd-MMM-yyy", "dd-MM-yyyy", "D-MM-yyyy", "DD-MM-yyyy",
				"DDD-MM-yyyy", "d - MMM- Y", "w'th week of' YY", "w'th week of' YYY", "E, dd'th' MMMM,YYYY",
				"EE, dd'th' MMMM,YYYY", "EEE, dd'th' MMMM,YYYY", "EEEE, dd'th' MMMM,YYYY" };
		Arrays.stream(dateFormats)
				.forEach(i -> System.out.println(DateTimeFormatter.ofPattern(i).format(LocalDate.now())));

	}
}
