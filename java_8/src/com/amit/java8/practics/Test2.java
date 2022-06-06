package com.amit.java8.practics;

import java.util.List;
import java.util.stream.Stream;

public class Test2 {
	
	public static void main(String[] args) throws Exception {
	List<Integer>	list=List.of(2,3);
	int f=list.parallelStream().reduce(1,(Integer::sum),(i,j)->i*j);
	System.out.println(f);
	}
}

