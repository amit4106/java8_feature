package com.amit.java.collecton;

import java.util.TreeSet;

public class TreeSetDemo {


	public static void main(String[] args) {
		TreeSet<Integer> ts=new TreeSet<>();
		
		ts.add(30);
		ts.add(40);
		ts.add(20);
		ts.add(10);
		ts.add(5);
		//System.out.println(ts);
		
//		ts.forEach(System.out::println);
//		ts.stream().forEach(System.out::println);
//		ts.stream().forEach(System.out::println);
		TreeSet<Employee> ts2=new TreeSet<>(Sort.sort);
		
		Employee emp1=new Employee("amit", 240);
		ts2.add(emp1);
		ts2.add(new Employee("vivek", 1000));
		ts2.add(new Employee("raju", 5000));
		ts2.add(new Employee("ravi", 200));
		ts2.add(new Employee("bini", 900));
		System.out.println(ts2);
		
		ts2.forEach(System.out::println);
		
		for(Employee emp:ts2 ) {
			System.out.println(emp.getName()+" "+ emp.getSalary());
		}
		
		}

}
