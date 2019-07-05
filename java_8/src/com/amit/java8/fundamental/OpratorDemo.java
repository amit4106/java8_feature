package com.amit.java8.fundamental;

public class OpratorDemo {

	public static void main(String[] args) {
 int a=10, b=20;
 if ((a++==11) ^ (a++==11)) {
	 System.out.println(a);
 }
 System.out.println(a);
 System.out.println(~4);//need to explain
 double d=10.12;
 a=(int)d;
	System.out.println(a);
	int c=131;
	byte b1=(byte)c;
	System.out.println(b1);
	int g=(10>9)?(20>30)?30:-2:-1;//ternary Oprator  
	System.out.println(g);
	}

}
