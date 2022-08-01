package practics;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class QA47 {
public static void main(String[] args) {
	LocalDate d1=LocalDate.of(1997, 2, 7);
	DateTimeFormatter dtf=DateTimeFormatter.ofPattern("eeee d'th of' MMMM yyyy");
	System.out.println(d1.format(dtf));
}
}
