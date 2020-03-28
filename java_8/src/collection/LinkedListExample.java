package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String args[]) {
		List ld = new LinkedList();
		LinkedList<Integer> ld1 = new LinkedList<>();
		ld1.add(91);
		//ld.add(10);
		ld.add(20);
		ld.add(30);
		ld.add(40);
		ld.add(91);
		ld.add(10);
		ld.forEach(System.out::println);
		//ld.forEach(System.out::println);
		
		System.out.println("-->> "+ ld.toString());
		//ld.forEach(System.out::println);
		// ld.forEach(System.out::println);
		// ld.add(01, 15);
		
		
		//	Iterator<Integer> iterator = ld.descendingIterator();
		//	while(iterator.hasNext()) {
		//	System.out.println(iterator.next());
		//		}

		// System.out.println(">>" + ld.element());
		// System.out.println(ld.equals(ld) + " " + ld1.equals(ld1));
		// ld.forEach(System.out::println);
		// System.out.println("getIndex--> "+ ld.get(0) + " getFirst-->> " +
		// ld.getFirst() + " getLast-->> " + ld.getLast()+ " getClass-->> "
		// +ld.getClass());
		// System.out.println(ld1.isEmpty());
		// System.out.println(ld.peekLast());
		// System.out.println(ld.pollFirst());
		// ld.pop();
		// System.out.println(ld.indexOf(ld));
		// System.out.println(">>"+ld.removeLastOccurrence(ld));
		// ld.forEach(System.out::println);
		// ld.forEach(System.out::println);
	}
}
