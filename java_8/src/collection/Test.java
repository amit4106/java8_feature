package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		
		Set<Student> set=new HashSet<>();
		Student st=new Student(15, "Prakash", 78);
		Student st2=new Student(15, "Prakash", 78);
		Student st3=new Student(15, "Prakash", 78);
		set.add(st);
		set.add(st2);
		set.add(st3);
		System.out.println(set);
		
		Set<Integer> set5=new HashSet<>();
		set5.add(10);
		set5.add(20);
		set5.add(30);
		System.out.println(set5);
		
		Set<Integer> set6=new LinkedHashSet<>();
		set6.add(10);
		set6.add(20);
		set6.add(30);
		System.out.println(set6);
		
		Set<Integer> set7=new TreeSet<>();
		System.out.println(set7.add(20));
		set7.add(30);
		set7.add(10);
		System.out.println(set7.add(30));
		System.out.println("-->"+ set7);
	}

}
