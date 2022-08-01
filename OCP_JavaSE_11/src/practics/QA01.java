package practics;
import java.util.stream.IntStream;

public class QA01 {
	public static String convert(int x) {
		if(x%15==0) return "FizzBuzz";
		else if(x%3==0) return "Fizz";
		else if(x%5==0) return "Buzz";
		else return Integer.toString(x);
	}
	public static void main(String[] args) {
//		for(int i=0;i<101;i++) {
//			System.out.println(convert(i));
//		}
		
		
	}
}
