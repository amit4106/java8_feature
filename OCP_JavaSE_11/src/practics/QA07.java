package practics;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class QA07 {
public static void main(String[] args) {
	Integer[] ints= {1,2,3,4,5,6,7};
	var list = Arrays.asList(ints);
//	UnaryOperator<Integer> uo=x->x*3;
	UnaryOperator<Integer >uo = (Integer x) -> x * 3;
	list.replaceAll(uo);
}
}
