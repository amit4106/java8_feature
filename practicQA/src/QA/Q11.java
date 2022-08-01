package QA;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * COUNT THE CHARACTER OF STRING. 
 * 
 * EXAMPLE HELLO
 * {H=1, E=1, L=2, O=1}
 * @author dell
 *
 */
public class Q11 {
	
	public static void countFrequencyOfCharacter() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = sc.nextLine();
		LinkedHashMap<String, Long> count = Arrays.stream(str.split("")).map
				(String::toLowerCase).collect(Collectors.groupingBy(s->s, LinkedHashMap::new, Collectors.counting()));
		System.out.println("Count of String Character is : "+count);
	}
	public static void countFrequencyOfCharacter2() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = sc.nextLine();
		LinkedHashMap<Character, Integer> charFrequency=new LinkedHashMap<>();
		for(int i=0; i<str.length();i++) {
			char chars = str.charAt(i);
			if(charFrequency.containsKey(chars)) {
				Integer count = charFrequency.get(chars);
				charFrequency.put(chars, count+1);
			}else {
				charFrequency.put(chars, 1);
			}
		}
		System.out.println(charFrequency);
	}
	
	public static void main(String[] args) {
		countFrequencyOfCharacter2();
	}
}
