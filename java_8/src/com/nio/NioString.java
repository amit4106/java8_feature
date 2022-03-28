package com.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NioString {

	public static void main(String[] args) {
		Path path = Paths.get("H:\\sql\\main.txt");
		Stream<String> lines;
		try {
			lines = Files.lines(path);
			Map<String, Long> collect = lines.collect(Collectors.groupingBy(String::toString, Collectors.counting()));
			// collect.forEach((k,v)->System.out.println(k+" "+v));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Path path2 = Paths.get("H:\\core-java");
		try (Stream<Path> entry = Files.list(path2)) {
			entry.forEach(System.out::println);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
