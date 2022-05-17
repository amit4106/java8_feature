package com.io;

import java.io.Console;

public class Echo {
public static void main(String[] args) {
	Console console = System.console();
	if(console==null) {
		System.err.println("cannot read the console from IDE");
		System.exit(-1);
	}
	console.printf(console.readLine());
	
}
}
