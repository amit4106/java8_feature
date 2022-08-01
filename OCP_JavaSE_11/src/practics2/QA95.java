package practics2;

import java.util.List;
import java.util.stream.Collectors;

public class QA95 {
public static void main(String[] args) {
	var numbers = List.of(0,1,2,3,4,5,6,7,8,9);
	double avg = numbers.stream().collect(Collectors.averagingDouble(n -> n));
	System.out.println(avg);
}
}
