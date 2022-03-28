package streamAPI;

import java.util.Arrays;

import java.util.List;
import java.util.Locale.FilteringMode;
import java.util.Map;
import static java.util.stream.Collectors.*;
import java.util.stream.Stream;

import streamAPI.Dish.Type;

/*
 Q1. select vegetarians menu?
 Q2. select all non vegetarians menu?
 Q3. sort menu by calories?
 Q4. group menu by type?
 Q5. select highest calories meal?
 Q6. select lowest calories meal?
 Q7. select highest calories vegetarian meal?
 Q8. select highest calories non vegetarian meal?
 Q9. select first three dishes that have more than 300 calories?
 Q10. find out whether the menu is healthy (all dishes are below 100 calories)?
 Q11. find out whether the menu is not healthy(calories>=100)?
 Q12. find a dish that is vegetarian?
 
 */
public class DiashPractics {

	public static List<Dish> getMenu() {
		List<Dish> menu = Arrays.asList(new Dish("pork", false, 800, Dish.Type.MEAT),
				new Dish("beef", false, 700, Dish.Type.MEAT), new Dish("french fries", true, 530, Dish.Type.OTHER),
				new Dish("rice", true, 350, Dish.Type.OTHER), new Dish("season fruit", true, 120, Dish.Type.OTHER),
				new Dish("pizza", true, 550, Dish.Type.OTHER), new Dish("chicken", false, 400, Dish.Type.MEAT),
				new Dish("prawns", false, 300, Dish.Type.MEAT), new Dish("salmon", false, 450, Dish.Type.MEAT));

		return menu;

	}

	public static void main(String[] args) {
		// Q1. select vegetarians menu?
		getMenu().stream().filter(d -> {
			return d.isVegetarian() == true;
		}).collect(toList()).forEach(System.out::println);
		// Q2. select all non vegetarians menu?
		// getMenu().stream().filter(t->{return
		// t.isVegetarian()==false;}).collect(Collectors.toList()).forEach(System.out::println);
		Stream<Dish> stream = getMenu().stream();
		Map<Type, List<Dish>> collect = stream.collect(groupingBy(Dish::getType));
		/**
		 * for(Map.Entry<Type, List<Dish>> entry:collect.entrySet()) {
		 * System.out.println(entry.getKey()+ " " +entry.getValue()); }
		 **/
		Map<Type, List<Dish>> collect2 = getMenu().stream().collect(groupingBy(d -> d.getType()));
		// collect.entrySet().forEach((key,value)->System.out.println(key +" "+value););
		// collect2.forEach((k,v)->System.out.println(k+ " "+v));
		// q. group the menu by type having more than 500 calories?
		// getMenu().stream().filter(p->{return
		// p.getCalories()>500;}).collect(Collectors.groupingBy(Dish::getType)).forEach((key,value)->System.out.println(key+
		// " "+value));
		//	getMenu().stream().collect(groupingBy(Dish::getType,filtering(p->{return p.getCalories()>500;}),toList()));
		Map<Type, Map<Boolean, List<Dish>>> collect3 = getMenu().stream()
				.collect(groupingBy(Dish::getType, groupingBy(Dish::isVegetarian)));
		for (Map.Entry<Type, Map<Boolean, List<Dish>>> e : collect3.entrySet()) {

			for (Map.Entry<Boolean, List<Dish>> e1 : e.getValue().entrySet()) {
				System.out
						.println("Type : " + e.getKey() + " isVegeterian :" + e1.getKey() + " Menu :" + e1.getValue());
			}
		}
		collect3.forEach((k1, v1) -> v1.forEach((k2, v2) -> System.out.println((k1 + " " + k2 + " " + v2))));
		Map<Boolean, List<Dish>> collect4 = getMenu().stream().collect(partitioningBy(d -> d.getCalories() > 500));
		collect4.forEach((k, v) -> System.out.println(k + " " + v));
		for (Map.Entry<Boolean, List<Dish>> a : collect4.entrySet()) {
			System.out.println(a.getKey() + " " + a.getValue());
		}
		getMenu().stream().filter(d -> d.getCalories() > 500).peek(System.out::println).collect(toList());
		Map<Type, Long> collect5 = getMenu().stream().collect(groupingBy(Dish::getType, counting()));
		collect5.forEach((k, v) -> System.out.println(k + " " + v));
	}
}
