package practics;

import java.util.Arrays;
import java.util.Comparator;

public class QA17 {
	public static void main(String[] args) {
		String[] towns = { "boston", "paris", "bangkok", "oman" };
		Comparator<String> ms=(a,b)-> b.compareTo(a);
		Arrays.sort(towns, ms);
		System.out.println(Arrays.binarySearch(towns, "oman", ms));
	}
}
