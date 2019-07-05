package com.amit.java8.fundamental;

public class Test {

	public static void main(String[] args) {
System.out.println(TestClass.b);
TestClass tc=new TestClass();
System.out.println(tc.b);
TestClass.m2();
TestClass.m2();
tc.m1();
byte m3 = TestClass.m3();
System.out.println("byte "+m3);
short m4 = TestClass.m4(); 
System.out.println(m4);
int m5 =TestClass.m5();
System.out.println(m5);
long m6=TestClass.m6();
System.out.println(m6);
float m7=TestClass.m7();
System.out.println(m7);
double m8=TestClass.m8();
System.out.println(m8);
char m9=TestClass.m9();
System.out.println(m9);
boolean m10=TestClass.m10();
System.out.println(m10);

	}

}

