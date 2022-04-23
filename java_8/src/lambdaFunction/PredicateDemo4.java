package lambdaFunction;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateDemo4 {
	public static void main(String[] args) {
//		Example:1
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		Predicate<Integer> predicate = (i) -> i > 5;
		Predicate<Integer> predicate2 = (i) -> i < 8;
//		list.stream().filter(predicate).collect(Collectors.toList()).forEach(System.out::print);
//		list.stream().filter(predicate.and(predicate2)).collect(Collectors.toList()).forEach(System.out::println);
		
//		Example:2
		List<String> list2= Arrays.asList("A","AA","AAA","B","BB","BBB");
		Predicate<String> length=(s)->s.length()==2;
		Predicate<String> startWith=(s)->s.startsWith("A");
//		list2.stream().filter(predicate3).collect(Collectors.toList()).forEach(System.out::println);
//		list2.stream().filter(length.or(startWith)).collect(Collectors.toList()).forEach(System.out::println);
		List<String> collect=list2.stream().filter(length.or(startWith)).collect(Collectors.toList());
		System.out.println(collect);
		
	}
}
