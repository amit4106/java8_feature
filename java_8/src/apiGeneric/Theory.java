package apiGeneric;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * String
 * StringBuffar
 * StringBuilder
 * Random
 * Math
 * Object
 * All 8 wrapper classes
 * Exception
 * Number
 * RuntimeException
 * System
 * Thread
 * Runnable
 * ArrayList(java.util.ArrayList<E>)
 * 
 * @author Dell
 *
 */
public class Theory {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("War");
		al.add(10);
		al.add("zone");
		al.add(20);
		
		ArrayList<Integer> al2=new ArrayList<>(); //ArrayList Generic<E> type
		
		al2.add(10);
		al2.add(20);
		al2.add(30);
		al2.add(40);
		
		// There are some approach to access the elements from ArrayList -

		// Approach 1: through "for loop"
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		System.out.println("__________for loop__________");

		// Approach 2: through "enhance for loop"
		for (Object obj : al) {
			System.out.print(obj + " " + "\n");
		}
		System.out.println("__________enhance for loop__________");

		// Approach 3: Using "while loop"
		int i = 0;
		while (i < al.size()) {
			System.out.println(al.get(i));
			i++;
		}
		System.out.println("__________while loop__________");

		//Approach 4: using "Iterator"
		Iterator iterator = al.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("__________iterator()__________");
		
		//Approach 5: using "for each"
		al.forEach(System.out::println);
		System.out.println("__________forEach()__________");
	}
}
