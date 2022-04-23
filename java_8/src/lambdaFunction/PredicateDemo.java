package lambdaFunction;

import java.util.function.Predicate;

public class PredicateDemo implements Predicate<Integer> {

	@Override
	public boolean test(Integer i) {
		if(i % 2 == 0)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		Predicate<Integer> pre=new PredicateDemo();
		System.out.println(pre.test(11));
	}

}
