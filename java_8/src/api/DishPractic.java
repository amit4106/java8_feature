package api;

import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import streamAPI.Dish;
/*
Q1. select vegetarians menu?
Q2. select all non vegetarians menu?
Q3. sort menu by calories more than 200?
Q4. group menu by type?
Q5. select highest calories meal more than 400?
Q6. select lowest calories meal less than 400?
Q7. select highest calories vegetarian meal?
Q8. select highest calories non vegetarian meal?
Q9. select first three dishes that have more than 300 calories?
Q10. find out whether the menu is healthy (all dishes are below 100 calories)?
Q11. find out whether the menu is not healthy(calories>=100)?


*/

public class DishPractic {

	public static List<Dish> getMenu(){
		List<Dish> menu= Arrays.asList(new Dish("Pork", false, 800, Dish.Type.MEAT),
				new Dish("Beef, ", false, 700, Dish.Type.MEAT), new Dish("French Fries, ", true, 530, Dish.Type.OTHER),
				new Dish("Rice, ", true, 350, Dish.Type.OTHER), new Dish("Season Fruit, ", true, 120, Dish.Type.OTHER),
				new Dish("Pizza, ", true, 550, Dish.Type.OTHER), new Dish("Chicken, ", false, 400, Dish.Type.MEAT),
				new Dish("Prawns, ", false, 300, Dish.Type.MEAT), new Dish("Salmon, ", false, 450, Dish.Type.MEAT));
		return menu;
	}
	
	public static void main(String[] args) {
		
//		1. select all vegetarian menu.
//		getMenu().stream().filter(p -> {return p.isVegetarian() == true;}).collect(toList()).forEach(System.out::println);
		
//		2. select all non-vegetarian menu.
//		getMenu().stream().filter(d -> {return d.isVegetarian() == false;}).collect(toList()).forEach(System.out::print );
		
//		3. sort menu by calories.
//		getMenu().stream().filter(p -> {return p.getCalories() >=200;}).collect(Collectors.toList()).forEach(System.out::print);
		
//		Map<Character, List<Dish>> collect = getMenu().stream()
//				.collect(Collectors.groupingBy(g -> new Character(g.getName().charAt(0))));
//		collect.forEach((k, v) -> System.out.println(k + " " + v));
//		System.out.println("_________________________________________________________________________");
//		getMenu().stream().collect(Collectors.groupingBy(g -> new Character(g.getName().charAt(0)))).forEach((k,v)-> System.out.println(k +" "+ v));
		
//		Q4. group menu by type
		getMenu().stream().collect(Collectors.groupingBy(p -> new Character(p.getName().charAt(0))))
		.forEach((k,v)-> System.out.println(k+" "+v));
		
	}
}
