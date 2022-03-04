package DateTimeAPI;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.chrono.ChronoZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Set;

public class DateTimeAPI {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println(date);
		LocalDate date1 = LocalDate.of(1990, 05, 10);
		System.out.println(date1);
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String format2 = format.format(date1);
		System.out.println(format2);
		ZoneId id = ZoneId.systemDefault();
		System.out.println(id);
		Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
// 		availableZoneIds.stream().forEach(System.out::println);
// 		availableZoneIds.forEach(System.out::println);
		ZoneId id1 = ZoneId.of("America/Chihuahua");
		LocalTime now = LocalTime.now(id1);
		System.out.println(now);
		System.out.println(LocalTime.now());
		LocalDate date2 = date1.plusMonths(14);
		System.out.println(date1);
		System.out.println(date2);
		String s1 = "anu";
		String concat = s1.concat("dubey");
		System.out.println(concat);
		LocalDate date3 = date2.minusMonths(10);
		System.out.println(date3);
		LocalDate date4 = date1.withMonth(14);
		System.out.println(date4);
	}
}
