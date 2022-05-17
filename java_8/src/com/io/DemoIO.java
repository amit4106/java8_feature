package com.io;

import java.io.IOException;

public class DemoIO {
	public static void main(String[] args)  {
		int value=0;
		System.out.println("Type a Character");
		try {
		 value = System.in.read();
//		 System.out.println(10/0);
		}catch (Exception e) {
			System.err.println("Error occure while the reading the input");;
		}
		System.out.println("You typped :"+ value);
			
	}
}
