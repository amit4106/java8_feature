package com.amit.java8.practics;

import java.util.Map;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Person {
	String name;
	int age;

	public Person(String name, int age) {

		this.name = name;
		this.age = age;
	}
}

class Q60 {
	public static void main(String[] args) {
		Person johan = new Person("Johan", 30);
		Person jane = new Person("Jane", 20);
		Map<String, Integer> people = Stream.of(johan, jane).collect(Collectors.toMap(p -> p.name, p -> p.age));
		BiConsumer<String, Integer> consumer = (s, i) -> {
			if (i > 25)
				System.out.println(i);
		};

	}
}