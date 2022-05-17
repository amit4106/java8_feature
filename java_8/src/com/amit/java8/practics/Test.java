package com.amit.java8.practics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
	Stream<Client> list=Stream.of(new Client("Will", "vps server", 200),new Client("Rachel", "java program", 1200),
			new Client("Anthony", "Configuration", 10000), new Client("Rachel", "PHP script", 900));
		List list1=new ArrayList<>();
		list1.add(new Client("Will", "vps server", 200));
		list1.add(new Client("Rachel", "java program", 1200));
		list1.add(new Client("Raj", "PHP server", 750));
		Collections.sort(list1, Comparator.comparing(Client::getName));
		System.out.println(list1);
		
			
	}
}

class Client{
	double budget;
	String name, project;
	public Client(String n, String pr, double p) {
		budget =p;
		name =n;
		project =pr;
		}
	public String getName() {return name;}
	
	public String toString() {
		return name+" "+budget;
	}
}
	