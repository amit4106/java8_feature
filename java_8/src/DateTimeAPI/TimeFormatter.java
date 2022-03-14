package DateTimeAPI;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class TimeFormatter {
	public static void main(String[] args) {
		String[] timeFormats = { "h:mm", "hh 'o''clock'", "H:mm a", "hh:mm:ss:SS", "K:mm:ss a" };
		Arrays.stream(timeFormats)
				.forEach(i -> System.out.println(DateTimeFormatter.ofPattern(i).format(LocalTime.now())));
	}
}
