package com.amit.java8.practics;

import java.time.ZoneId;
import java.util.function.BiConsumer;

public class Test {

	public static void main(String[] args) {
//	Stream<Client> list=Stream.of(new Client("Will","vps server",200), new Client("Rachel","java program",1200),
//								new Client("Anthony","Configuration",1000));
//				DoubleStream<Client> fun= Client::getBudget;

		BiConsumer<Integer, Integer> consumer=( i, b)->System.out.println(i+b);
}}
//
//class Client{
//	double budget;
//	String name, project;
//	Client(String n, String pr, double p){
//		budget=p;
//		name=n;
//		project =pr;
//	}
//	public double getBudget() {
//		return budget;
//	}
//	public String getName() {
//		return name;
//	}
//	public String toString() {
//		return name+" "+budget;
//	}
//}
