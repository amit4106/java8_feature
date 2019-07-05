package com.amit.java8.fundamental;

public class Oprator {

	public static void main(String[] args) {
		System.out.println(10 > 20);
		System.out.println((18 >= 18) + "");
		System.out.println('a' == 97);
char ch='d';
System.out.println(ch);
int db=ch;
System.out.println(db);
System.out.println('a'!='a');
Integer a=14;
System.out.println(a instanceof Number);
Oprator op=new Oprator();
System.out.println(op instanceof Object);
System.out.println(10!=10);
	Thread t1=new Thread();
	Thread t2=new Thread();
	Thread t3=t1;
	System.out.println(t1==t2);//false
	System.out.println(t1==t3);//true
	System.out.println("AND"+(true&false));//AND Oprator(if both arguments is true then result will be true)
	System.out.println(true|false);//OR Oprator(if at lease one argument is true then result will be true)
	System.out.println(true^false);//X-OR Oprator(if both arguments are different then result will be true
	if(true&&true)
	{
		System.out.println("hello amit");
	}
	System.out.println((4==4)&&(3>2));
	}

}
