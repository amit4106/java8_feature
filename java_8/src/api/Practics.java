package api;

import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import streamAPI.Dish;
/**
 * forEach() map() collect() filter() findFirst() toArray() flatMap() peek()
 * sorted() distinct() allMatch() anyMatch() noneMatch() Specialized Operations
 * Reduction Operations reduce() reducing() joining() toSet() toCollection()
 * summarizingDouble() partitioningBy() groupingBy() mapping() Parallel
 * Streams() iterate()
 *
 */
public class Practics {
	public static List<Dish> getMenu() {
		List<Dish> menu = Arrays.asList(new Dish("Pork,", false, 800, Dish.Type.MEAT),
				new Dish("Beef, ", false, 700, Dish.Type.MEAT), new Dish("French Fries, ", true, 530, Dish.Type.OTHER),
				new Dish("Rice, ", true, 350, Dish.Type.OTHER), new Dish("Season Fruit, ", true, 120, Dish.Type.OTHER),
				new Dish("Pizza, ", true, 550, Dish.Type.OTHER), new Dish("Chicken, ", false, 400, Dish.Type.MEAT),
				new Dish("Prawns, ", false, 300, Dish.Type.MEAT), new Dish("Salmon, ", false, 450, Dish.Type.MEAT),
				new Dish("Sea Food, ", false, 422, Dish.Type.MEAT), new Dish("Diary Product, ", true, 180, Dish.Type.OTHER),
				new Dish("Sea Food, ", false, 422, Dish.Type.MEAT), new Dish("Diary Product, ", true, 180, Dish.Type.OTHER));
		return menu;
	}
	
	public static void main(String[] args) {
		List<Integer> number=Arrays.asList(10,20,30,40,50);
	}
}
