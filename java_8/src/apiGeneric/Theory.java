package apiGeneric;

import java.util.ArrayList;
import java.util.Iterator;
//import java.util.*; //but not recommended

/**
 * String StringBuilder StringBuffer Random Math Object
 *
 * All 8 Wrapper classes Exception Number RuntimeException System Thread
 * Runnable ArrayList(java.util.ArrayList<E>)
 * 
 * @author Yashwani
 *
 */

public class Theory {
	public static void main(String[] args) {

		ArrayList arr = new ArrayList(); // by default iska object hogga.
		arr.add("Ankush");
		arr.add(10);
		arr.add("Bhopal");
		arr.add("Sirt");
		ArrayList<String> al=new ArrayList<String>();
		ArrayList<String> al2=new ArrayList<>();
		ArrayList<Integer> al3=new ArrayList<>();
		al2.add("Yashvani");
		al3.add(20);
		//int a=(int)arr.get(0);
		//System.out.println(a);
		String a=al2.get(0); 
		System.out.println(a);
		
		
		// Access array list
		// Approach 1:Using normal for loop.
		for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}
		System.out.println("***************");
		// Approach 2: while loop
		int i = 0;
		while (i < arr.size()) {
			System.out.println(arr.get(i));
			i++;

		}
		System.out.println("************");
		//Approach 3:Enhance for loop
		for(Object o:arr) {
			System.out.println(o);
		}
		System.out.println("****************");
		//Approach 4: Using iterator
		Iterator iterator = arr.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("*************");
		System.out.println("Approoach 5");
		arr.forEach(System.out::println);
		

	}

}