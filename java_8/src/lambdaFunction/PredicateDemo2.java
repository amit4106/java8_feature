package lambdaFunction;

import java.util.function.Predicate;

public class PredicateDemo2 {
	public static void main(String[] args) {
		Predicate<Integer> pre = new Predicate<Integer>() {

			@Override
			public boolean test(Integer i) {
				if (i % 2 == 0)
					return true;
				else
					return false;
			}
		};
		System.out.println(pre.test(11));
	}
}
