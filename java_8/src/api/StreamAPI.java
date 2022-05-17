package api;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

import streamAPI.Dish;

/**
 * forEach() map() collect() filter() findFirst() toArray() flatMap() peek()
 * sorted() distinct() allMatch() anyMatch() noneMatch() Specialized Operations
 * Reduction Operations reduce() reducing() joining() toSet() toCollection()
 * summarizingDouble() partitioningBy() groupingBy() mapping() Parallel
 * Streams() iterate()
 *
 */

public class StreamAPI {
	public static List<Dish> getMenu() {
		List<Dish> menu = Arrays.asList(new Dish("Pork", false, 800, Dish.Type.MEAT),
				new Dish("Beef, ", false, 700, Dish.Type.MEAT), new Dish("French Fries, ", true, 530, Dish.Type.OTHER),
				new Dish("Rice, ", true, 350, Dish.Type.OTHER), new Dish("Season Fruit, ", true, 120, Dish.Type.OTHER),
				new Dish("Pizza, ", true, 550, Dish.Type.OTHER), new Dish("Chicken, ", false, 400, Dish.Type.MEAT),
				new Dish("Prawns, ", false, 300, Dish.Type.MEAT), new Dish("Salmon, ", false, 450, Dish.Type.MEAT));
		return menu;
	}

	public static void main(String[] args) {
		
//	Fetch all those dieses which has high calories(>400).
//	 boolean test(T t);
		Predicate<Dish> p = (d) -> {System.out.println();
			return d.getCalories() > 400;
		};
		Predicate<Dish> p1 = d -> d.getCalories() > 400;
		List<Dish> collect = getMenu().stream().filter(d -> d.getCalories() > 400).collect(toList());
//		 void accept(T t);
		Consumer<Dish> c=(d) -> d.getCalories();
		getMenu().stream().filter(d -> d.getCalories() > 400).peek(c).forEach(System.out::println);

	}

}
