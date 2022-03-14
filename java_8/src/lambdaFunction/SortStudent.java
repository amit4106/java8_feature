package lambdaFunction;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * sorting performed using Comparable -
 *
 */
public class SortStudent  {
	public static void main(String[] args) {
		Set<Student> s = new TreeSet<>();
		s.add(new Student(10, "Yashvani"));
		s.add(new Student(11, "Ankush"));
		s.add(new Student(12, "Deepu"));
		s.add(new Student(13, "Vidya"));
		s.add(new Student(14, "Kavya"));
		s.add(new Student(15, "Himani"));
		Iterator<Student> iterator = s.iterator();
		while (iterator.hasNext()) {
			Student next = iterator.next();
			System.out.println(next.getId() + " " + next.getName());
		}
	}

}
