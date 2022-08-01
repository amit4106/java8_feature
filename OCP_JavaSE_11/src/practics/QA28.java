package practics;

import java.util.List;

public class QA28 {
	public static void main(String[] args) {
		List<Integer> numbers=List.of(2,3,0,8,1,9,5,7,6,4);
//		Integer reduce = numbers.stream().reduce(0,(n,m)->n+m);
		Integer reduce = numbers.stream().parallel().reduce (0, (n, m) -> n + m);
		System.out.println(reduce);
	}
}
