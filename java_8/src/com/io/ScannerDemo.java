package com.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.stream.Stream;

public class ScannerDemo {
	public static void main(String[] args) {
		
		try(Scanner sc=new Scanner(new FileReader("src/abc.txt"))){
			
		while(sc.hasNext()) {
			long count = sc.delimiter().splitAsStream(" ").count();
			Scanner useDelimiter = sc.useDelimiter(" ");
			System.out.println(useDelimiter+" "+sc.next());
		}
		}catch (FileNotFoundException e) {
			
		}
	}
}

//print the name with their frequency
//print the total used words of the sentance -use delimeter.