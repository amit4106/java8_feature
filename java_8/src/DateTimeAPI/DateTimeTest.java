package DateTimeAPI;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class DateTimeTest {

	public static void main(String[] args) {

		LocalDate ld = LocalDate.now();
		System.out.println(ld);

		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String date = df.format(ld);

		System.out.println(date);

		LocalTime lt = LocalTime.now();
		System.out.println(lt);

		LocalDate localDate = ld.plusYears(2);
		System.out.println(localDate.getDayOfWeek());

		ZoneId systemDefault = ZoneId.systemDefault();
		System.out.println(systemDefault);
		Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
		// availableZoneIds.stream().forEach(System.out::println);
		// availableZoneIds.forEach(System.out::println);
		ZoneId newtime = ZoneId.of("Europe/Athens");
		System.out.println(newtime);
		LocalTime justnow = LocalTime.now(newtime);
		System.out.println(justnow);

	}
}
