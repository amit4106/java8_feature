package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Ques 1. Difference between List and Set.
 * Ans  :  a. List allows duplicate elements where as Set don't.
 *         b. In List order are preserved where as Set don't maintain the order.
 *         
 * Ques 2. Difference between ArrayList and LinkedList.
 * Ans  :  a. In ArrayList searching is faster than LinkedList.
 *         b. In ArrayList write opration is costly compared to LinkedList
 *         c. ArrayList is implemented on Array data structure but LinkedList is implemented on doubly LinkedList.
 * 
 * Ques 3. How does ArrayList internally work?
 * 
 * Ques 4. Difference between iterator() and listIterator().
 * Ans  :  a. Iteretor has only three (03) methods where as listIterator has nine (09).
 *         b. In iterator(), it moves only in forward direction only but listIterator moves in multi directions (forward/backward).
 *         c. Iterator can work for Set and Map but listIterator work only for List.
 *		   **Note:-> Iterator and listIterator both are interface and they belongs to java.util package. 
 *
 * 
 * 
 * --->>>  Important methods of List -
 * add()
 * get()
 * remove()
 * clear()
 * contains()
 * isEmpty()
 * iterator()
 * lastIndexOf()
 * replaceAll()
 * size()
 * subList()
 * toArray()
 * addAll()
 * set()
 * containsAll()
 * listIterator()
 * removeAll()
 * retainAll();
 * sort()
 * 
 * @author Dell
 *
 */

public class MyList {
public static void main(String[] args) {
	List<Integer> list=new ArrayList<>();
	list.add(40);
	list.add(30);
	list.add(20);
	list.add(10);
	List<Integer> list2=new ArrayList<>();
//	list2.add(10);
	list2.add(20);
	list2.add(30);
//	list2.add(40);
//	list2.add(40);
//	list2.add(50); list2.add(60);
	
	Integer value = list.get(1);
//	System.out.println(value);
//	list.remove(1);
//	list.removeAll(list2);
//	System.out.println(list);
//	list.clear();
//	System.out.println(list);
//	boolean empty = list.isEmpty();
//	System.out.println(empty);
//	Iterator<Integer> i = list.iterator();
//	while(i.hasNext()) {
//	System.out.println(i.next());
//	}
	
//	System.out.println(list.lastIndexOf(list));
//	System.out.println(list.size());
//	System.out.println(list.subList(1, 4));
//	list.addAll(list2);
//	System.out.println(list);
//	list.set(3, 50);
//	System.out.println(list);
//	list.retainAll(list2);
//	System.out.println(list);
	
	
	
	
	
}
}
