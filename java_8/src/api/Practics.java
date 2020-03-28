package api;

import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.List;

import com.amit.java8.array.Main;

import api.Dish.Type;

public class Practics {
	
	public static List<Dish> getMenu(){
	//Dish(String name, boolean vegetarian, int calories, Type type)
	List<Dish> menu=Arrays.asList(new Dish("Crab", false, 530, Dish.Type.SEAFOOD), new Dish("Oyster", false, 720, Dish.Type.SEAFOOD), 
			new Dish("Lobster", false, 932, Dish.Type.SEAFOOD), new Dish("Squid", false, 760, Dish.Type.SEAFOOD), 
			new Dish("POMFRET", false, 415, Dish.Type.SEAFOOD), new Dish("SALMON", false, 525, Dish.Type.SEAFOOD),
			new Dish("PORK", false, 800, Dish.Type.MEAT), new Dish("CHICKEN", false	, 490, Dish.Type.MEAT),
			new Dish("CHICKEN-NOODLE", 	false, 379, Dish.Type.MEAT), new Dish("BEEF", false, 980, Dish.Type.MEAT), 
			new Dish("PANNER", true, 250, Dish.Type.VEGITERIAN), new Dish("RICE", true, 230, Dish.Type.VEGITERIAN),
			new Dish("RAJMA", true, 430, Dish.Type.VEGITERIAN), new Dish("MUTTER-PANEER", true, 390, Dish.Type.VEGITERIAN));
	return menu;
}
	public static void main(String[] args) {
		getMenu().stream().filter(d->{return d.isVegetarian()==true;}).collect(toList()).forEach(System.out::println); 
		
	}
	}
/*
 * Collectors methods
 */
