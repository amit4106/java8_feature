package DateTimeAPI;

import java.time.LocalDate;
import java.time.LocalTime;

public class Test {
public static void main(String[] args) {
	LocalDate today=LocalDate.now();
	System.out.println(today);
	LocalTime now=LocalTime.now();
	System.out.println(now);
}
}
