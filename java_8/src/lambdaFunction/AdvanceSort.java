package lambdaFunction;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class AdvanceSort {
public static void main(String[] args) {
	Set<Student2> s=new TreeSet<>((s1,s2)-> s1.getName().compareTo(s2.getName()));
	
	s.add(new Student2(10, "Yashvani"));
	s.add(new Student2(11, "Ankush"));
	s.add(new Student2(12, "Deepu"));
	s.add(new Student2(13, "Vidya"));
	s.add(new Student2(14, "Kavya"));
	s.add(new Student2(15, "Himani"));
	
	Iterator<Student2> iterator = s.iterator();
	while(iterator.hasNext()) {
		Student2 next = iterator.next();
		System.out.println(next.getId()+" "+next.getName());
	}
}
}
