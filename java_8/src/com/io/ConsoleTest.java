package com.io;

import java.io.PrintStream;
/**
 * 
reader()
writer()
readPassword()
printf()
readLine()
format()
flush()
 *
 */

public class ConsoleTest {
	public static void main(String[] args) {
		try {
			PrintStream ps=new PrintStream("log.txt");
			System.setOut(ps);//setError, and setIn pen to use
			System.out.println("Hey Amit, Write all the contents in log file");
			System.out.println(10/0);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e);
		}
		
	}
}
