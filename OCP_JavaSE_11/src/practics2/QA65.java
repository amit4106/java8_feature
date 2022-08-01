package practics2;

import java.util.List;
import java.util.Optional;

public class QA65 {
	public static void main(String[] args) {
		var nums=List.of(1,2,3,4,5,6,7,8,9,10);
		Optional<Integer> reduce = nums.stream().filter(x->x%3!=0).reduce((i,j)->i+j);
		reduce.ifPresent(System.out::print);
	}
}
