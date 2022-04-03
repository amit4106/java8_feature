package com.amit.java8.practics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.IntStream;

public class Test{
	static int i=100;
	public static void main(String[] args) {
	Runnable tast=()->i--;
	IntStream.range(1, 10).forEach(m-> new Thread(tast).run());
	System.out.println(i);
}	
}

//ctrl + 1 to store the value of variable.