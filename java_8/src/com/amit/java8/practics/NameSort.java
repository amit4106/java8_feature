package com.amit.java8.practics;

import java.util.Comparator;

public class NameSort implements Comparator<Student> {

//	@Override
//	public int compare(Student o1, Student o2) {
//		return o1.getName().compareTo(o2.getName());
//	}
	
	@Override
	public int compare(Student o1, Student o2) {
		return o1.getId()-o2.getId();
	}

}
