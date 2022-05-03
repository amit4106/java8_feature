package com.amit.java8.task;

import java.util.Arrays;

public class Test {
public static void main(String[] args) {
	Value[] value= {
		Value.LOW, Value.HIGH, Value.MEDIUM
	};
	Arrays.sort(value);
	System.out.println(value[1]);
}
}

enum Value{
	HIGH(1), MEDIUM(6), LOW(3);
	private final int level;
	private Value(int levelCode) {
		level =levelCode;
	}
}
