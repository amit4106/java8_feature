package com.amit.java.collecton;

import java.util.Comparator;

public class Sort {

	public static Comparator<Employee> sortByName =new Comparator<Employee>() {

		@Override
		public int compare(Employee o1, Employee o2) {
			int result = o1.getName().compareTo(o2.getName());
			
			return result;
		}
	};
	
	public static Comparator<Employee> sortBySalary =new Comparator<Employee>() {

		@Override
		public int compare(Employee o1, Employee o2) {
			int result=-(o1.getSalary()-o2.getSalary());
			return result;
		}
	}; 
	
	public static Comparator<Employee> sort=(e1,e2)->e1.getSalary()-e2.getSalary();
}
