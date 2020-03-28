package collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
	
	Set<Integer> set=new HashSet<>();	
	Set<Integer> set2=new HashSet<>();
	set.add(10);
	set.add(20);
	set.add(30);
	set.add(40);
	set2.add(10);
	set2.add(20);
	set2.add(30);
	set2.add(40);
	//System.out.println(set);
	System.out.println(set.toString());
	//System.out.println("==>> "+ se);
	set.forEach(System.out::println);
	//System.out.println(set.toArray());
	//System.out.println(set.isEmpty());
	//set.forEach(System.out::println);
	
	
	}
}
