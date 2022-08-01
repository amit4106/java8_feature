package com.amit.java8.practics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentTest {

	public static void main(String[] args) {
		List<Student> list=new ArrayList<>();
//		list.add(new Student(6, "Amit Sharma", 9693));
//		list.add(new Student(3, "Prakash Pandey", 8482));
//		list.add(new Student(1, "Pankaj Choudhary", 7284));
//		list.add(new Student(4, "Vinod Jatav", 9600));
//		list.add(new Student(9, "Rahul Prakhar", 9122));
//		Collections.sort(list);
//		list.forEach(System.out::println);
		List<Student> list1=new ArrayList<>(list);
		Collections.sort(list1, new NameSort());
		list1.forEach(System.out::println);
	}
	
}
