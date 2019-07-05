package com.amit.java.collecton;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
	
	public static void main(String args[]) {
		
		HashMap<Integer, Student> hm=new HashMap<>(); 
		
		hm.put(1, new Student("Ashok","Fail", 1));	
		hm.put(2, new Student("Mukesh","Pass", 2));
		hm.put(3, new Student("MOHAN","Pass", 3));
		hm.put(4, new Student("Rohit","Fail", 4));
		hm.put(5, new Student("Prem","Pass", 5));
		
		for(Map.Entry<Integer, Student> map:hm.entrySet()) {
			System.out.println(map.getKey()+ " "+ map.getValue());
			
		}
	
	Student student = hm.get(3);
	System.out.println(student.getName()+" "+student.getStatus());
	
	hm.forEach((k,v)->System.out.println(k+" "+ v));
	
	}

}
