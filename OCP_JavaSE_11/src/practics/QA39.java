package practics;

import java.util.function.Function;

public class QA39 {
public static void main(String[] args) {
	Function tripler =x-> {return (Integer) x*3;};
	QA39.printValue(tripler, 4);
}
public static <T> void printValue(Function  f, T num) {
	System.out.println(f.apply(num));
}
}
