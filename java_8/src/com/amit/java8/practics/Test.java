package com.amit.java8.practics;

import java.nio.file.Files;
import java.nio.file.Path;

public class Test {
	public static void main(String[] args) throws Exception{
		Path p=Path.of("test.txt");
		Files.writeString(p, "Hello");
		Files.writeString(p, "Goodbay");
		System.out.println(Files.readString(p));
		
	}
}
