package com.io;

import java.io.Console;
import java.util.Arrays;

public class Login {
public static void main(String[] args) {
	Console console = System.console();
	if(console!=null) {
		String userName="";
		char[] password=null;
		userName = console.readLine("Enter your name");
		password = console.readPassword("Enter password");
		if(userName.equals("Amit") && new String(password).equals("123")) {
			console.printf("login successful");
		}else {
			console.printf("Invaild username or password");
		}
		Arrays.fill(password, ' ');
	}

}
@Deprecated
public static void test() {
	System.out.println("Test");
}
}
