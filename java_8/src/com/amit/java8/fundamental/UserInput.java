package com.amit.java8.fundamental;

import java.util.*;

public class UserInput {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Please enter you name");
String name=sc.next();
System.out.println("WELCOME "+name);
System.out.println(name.length());
if(name.length()>=10 && name.length()<=50)
{
	System.out.println("vaild input");
	}
else {
	System.out.println("invaild input");
}
	}

}
