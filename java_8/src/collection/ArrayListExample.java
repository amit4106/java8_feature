package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample<T> extends ArrayList<Student>{
	
	public boolean add(Student s) {
		if(size()>4) {
			throw new RuntimeException("upto 10 elements are allowed");
			}
		super.add(s);
		return true;
	}

	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<>();
		al.ensureCapacity(2);
		ArrayList<Student> al1 = new ArrayList<>();
		al1.ensureCapacity(3);
		Student s1 = new Student(25, "Yogi", 91);
		al1.add(s1);
		al1.add(new Student(26, "Bhoomi", 68));

		al.add(new Student(10, "Vikash", 70));
		al.add(s1);
		al.add(new Student(12, "Sachin", 72));
		al.add(new Student(13, "Putin", 81));
		al.add(new Student(14, "Ran Vijay", 69));
		al.add(new Student(15, "Amit", 80));
		al.add(new Student(16, "Wiskey", 88));
		System.out.println(">> " + al1.contains(s1));
		System.out.println(">>> " +al.size());
		System.out.println(">>>> "+ al1.indexOf(s1));
		al.retainAll(al1);
		Object[] array = al.toArray();
		for(Object obj: array) {
			System.out.println("toArray --> "+obj);
		}
//		Iterator<Student> iterator = al.iterator();
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
		// al.size();
		al.forEach(System.out::println);
		// al.remove(1);
		// al.removeAll(al);
		// al1.removeAll(al1);
		// System.out.println(al.remove(s1));
		// System.out.println("===========");
//		System.out.println("--->>" + al.get(3));
//		System.out.println("-->>" + al.getClass());// this method need to disscuss
//		System.out.println(" ++ " + al.indexOf(al));//
//		al.forEach(System.out::println);

	}

}
