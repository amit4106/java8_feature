package com.amit.java8.practics;

import java.time.LocalDate;
import java.time.MonthDay;
import java.time.Period;
import java.time.Year;

public class Test {
	public static void main(String[] args){
		Year y = Year.of(2014);
		LocalDate atMonthDay = y.atMonthDay(MonthDay.of(3	, 3));
		System.out.println(atMonthDay);
	}
	
}