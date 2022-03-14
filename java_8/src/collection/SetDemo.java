package collection;

/**
 * Ques 1. Difference b/w HashSet/ LinkedHashSet/ TreeSet -
 * Ans  :  a. All three ( HashSet/ LinkedHashSet/ TreeSet) don't allow duplicate elements.
 * 		   b. In HashSet and TreeSet elements order not preserved but LinkedHashSet maintain the order.
 *         c. Null value allowed in HashSet and LinkedHashSet but not in TreeSet.
 *add
 *remove
 *copyOf
 *clear
 *isEmpty
 *size
 *toArray
 *iterator
 *of
 *contains
 *addAll
 *removeAll
 *retainAll
 *containsAll
 */
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

public static void main(String[] args) {
	Set<Integer> hs=new HashSet<>(); // Duplicate value not allowed
	Set<Integer> lhs=new LinkedHashSet<>();
	Set<Integer> ts=new TreeSet<>();
	
}
}
