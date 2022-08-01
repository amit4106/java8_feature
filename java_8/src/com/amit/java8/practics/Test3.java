package com.amit.java8.practics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public  class Test3{

		
	public static void main(String[] args) {
	
		ArrayList<String> list = new ArrayList<String>();
        list.add("Sagio Mane");
        list.add("Karius");
        list.add("Mo Salah");
        list.add("Firmino");
        list.add("Lovren");
        list.add("Steven Gerrard");
        list.add("Karius");
        list.add("Mo Salah");
        
        int[] arr= {1,6,8,5,4 ,6,5,64,1,2,4,};
        Set<Integer> s=new HashSet<>();
        for(Integer name: arr) {
        	if(s.add(name)==false) {
        		System.out.println(name);
        	}
        }
	}

}


