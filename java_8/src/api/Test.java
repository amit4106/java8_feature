package api;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class Test {
	public static void main(String[] args) {
//		Stream<String> stream=Stream.of("A","B","C");
//		boolean allMatch = stream.peek(System.out::print).allMatch(s-> s.length()==1);
//		System.out.println(allMatch);
		LocalDate ld= LocalDate.of(2012, 2, 29).plusYears(2);
		System.out.println(ld.getDayOfMonth());
		}
}