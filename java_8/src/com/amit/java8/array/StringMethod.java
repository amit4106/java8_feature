package com.amit.java8.array;

import java.util.ArrayList;

public class StringMethod extends Object{

	public static void main(String[] args) {

		char [] charArry= {'a', 'm', 'i', 't'};
System.out.println(charArry);

char [] chararray=new char[4];
chararray[0]='a';
chararray[1]='m';
chararray[2]='i';
chararray[3]='t';
System.out.println(chararray);

String s1=new String(charArry);
System.out.println(s1);

String s2=charArry.toString();
System.out.println(s2);

String s3="AMIT";
System.out.println(s3.substring(2));// ** IMPORTANT

String s4=new String("MAK");
String s5=s4.intern();
System.out.println(s5);

String s6=String.format("amit %s", s4);// ** IMPORTANT

System.out.println(s6);

ArrayList<String> list=new ArrayList<>();
list.add("amit");
list.add("roshan");
list.add("prakash");
String s8=String.join(",",list);
System.out.println(s8);

	
	}

}
