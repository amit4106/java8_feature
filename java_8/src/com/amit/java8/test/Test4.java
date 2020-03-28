package com.amit.java8.test;

import java.util.ArrayList;
import java.util.Comparator;

public class Test4 {
public static void main(String []args) {
	ArrayList<Integer> al=new ArrayList<>();
	al.add(10);
	al.add(20);
	al.add(30);
	al.add(40);
	al.add(50);
	al.remove(2);
	al.add(1, 60);
	System.out.println(al.size());
	al.forEach(System.out::println);
    ArrayList<Integer> al2=new ArrayList<>();
    al2.add(70);
    al2.add(80);
    al2.add(90);
    al2.addAll(al); //[70, 80, 90, 10, 60, 20, 40, 50]
    al2.retainAll(al); //[10, 60, 20, 40, 50]
    System.out.println(al2);
    //al2.clear();
    //System.out.println(al2);
    Comparator<Integer> sort =new Comparator<Integer>() {

		@Override
		public int compare(Integer o1, Integer o2) {
			return o2-o1;
		}
	};
    al2.sort(sort);
    System.out.println(al2);
    boolean a=al.contains(90);
   System.out.println(a);
   al.remove(3);
   al.add(15);
   System.out.println(al);
   System.out.println(al2);
   boolean b=al2.containsAll(al);
   System.out.println(b);
}
}