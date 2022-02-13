package com.amit.java8.practics;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class Test {
	static Integer i;
	double d=1_1;
	public static void main(String[] args) {
		final  int MAX_VALUE=120;
		i++;
		int ar[];
		ar=new int[3];
		LocalDate ld=LocalDate.of(1991,02,03);
		//DateTimeFormatter formate=DateTimeFormatter.ofPattern("d/MMM/uuuu");
		//System.out.println(ld.format(formate));
		ld.with(ChronoField.DAY_OF_YEAR,30);
		System.out.println(ld);
		
		int j = Child.get(); // ctrl + 1 to store the value of variable.
}}
