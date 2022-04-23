package lambdaFunction;

import java.util.function.Predicate;

public class PredicateDemo3 {
	public static void main(String[] args) {
			
			
			Predicate<Integer> pre =(i)-> {
				if(i % 2 == 0) {
					return true;
				}
				else {
					return false;
				}
			};
		
		System.out.println(pre.test(11));
	}
}
