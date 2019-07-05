package com.amit.java.collecton;

import java.util.HashMap;
import java.util.Map;

public class Interview {

static Map<String, Integer> dublicateWordCount(String[] array){
	Map<String, Integer> map=new HashMap<>();
	
	for(String str: array) {
		if(map.containsKey(str)) {
			int value=map.get(str);
			map.put(str, value+1);
				}
		else {
			map.put(str, 1);
		}
	}
	return map;
	
}
	public static void main(String[] args) {

		String array[]= {"a", "b", "a", "c", "b", "c", "d"};
		Map<String, Integer> dublicateWordCount = dublicateWordCount(array);
		
		for(Map.Entry<String, Integer> entry: dublicateWordCount.entrySet()) {
			System.out.println(entry.getKey() +" "+ entry.getValue());
		}
	}

}

// VVI ques: 
// Question is to find the dublicate letter/word from array(ques basd on HashMap).