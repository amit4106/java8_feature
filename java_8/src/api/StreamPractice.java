package api;
import java.util.Arrays;
import java.util.List;
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
public class StreamPractice {
	public static void main(String[] args) {
		List<Dish> meatMenu = Arrays.asList(new Dish("pork", false, 800, Dish.Type.MEAT),
				new Dish("beef", false, 700, Dish.Type.MEAT), new Dish("chicken", false, 400, Dish.Type.MEAT));
				List<Dish> otherMenu = Arrays.asList(new Dish("french fries", true, 530, Dish.Type.OTHER),
				new Dish("rice", true, 350, Dish.Type.OTHER), new Dish("season fruit", true, 120, Dish.Type.OTHER),
				new Dish("pizza", true, 550, Dish.Type.OTHER));
				List<Dish> fishMenu = Arrays.asList(new Dish("prawns", false, 300, Dish.Type.MEAT),
				new Dish("salmon", false, 450, Dish.Type.MEAT));

	}

}
