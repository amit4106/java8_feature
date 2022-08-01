package practics;

import java.util.ArrayList;
import java.util.List;

public class QA41 {
	@SuppressWarnings("all")
	public static void main(String[] args) {
		List l=new ArrayList();
		l.add("hello");
		l.add("world");
		
		print(l);
	}
	@SuppressWarnings("all")
	private static void print(List<String>... args) {
		for(List<String> str: args) {
			System.out.println(str);
		}	
	}
}
