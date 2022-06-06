package com.amit.java8.practics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test {
	public static void main(String[] args) {
	ArrayList<Dog> dogList=new ArrayList<>();
	dogList.add(new Dog("Lazy", "John", 3));
	dogList.add(new Dog("White", "Henry", 2)); 
	dogList.add(new Dog("Blacky", "Bert", 5));
	dogList.add(new Dog("Tazan", "Jack", 1));
	
	Sort1 s1=new Sort1();
	Collections.sort(dogList, s1);
	System.out.println(s1);
	}
	
	static class Sort1 implements Comparator<Dog>{

		@Override
		public int compare(Dog first, Dog second) {
			return first.name.compareTo(second.name);
		}
		
	}
}

class Dog{
	String name; 
	String owner;
	int age;
	Dog(String n, String o, int a){
		name=n; owner=o; age=a;
	}
	public String toString() {
		return owner;
	}
}
