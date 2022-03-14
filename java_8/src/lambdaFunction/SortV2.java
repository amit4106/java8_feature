package lambdaFunction;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SortV2  implements Comparator<Student2>{
	public static void main(String[] args) {
		Set<Student2> s=new TreeSet<>(new SortV2());
		s.add(new Student2(10, "Yashvani"));
		s.add(new Student2(11, "Ankush"));
		s.add(new Student2(12, "Deepu"));
		s.add(new Student2(13, "Vidya"));
		s.add(new Student2(14, "Kavya"));
		s.add(new Student2(15, "Himani"));
		Iterator<Student2> iterator = s.iterator();
		while (iterator.hasNext()) {
			Student2 next = iterator.next();
			System.out.println(next.getId() + " " + next.getName());
		}
	}

	@Override
	public int compare(Student2 o1, Student2 o2) {
		return (o1.getName().compareTo(o2.getName()));
	}

		
}
