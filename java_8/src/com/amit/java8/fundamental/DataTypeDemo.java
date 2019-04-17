package com.amit.java8.fundamental;

public class DataTypeDemo {
// byte short int long float double char boolean(primitive data type)
	// To display any thing in java // System.out.print("");

//	variables
//	1. instance variable // heap memory
//	2. static variable // class variable //method areaja
//	3.  local variable.{} //stack
	{
	m3();
	}
	byte b=m2();// 0
	short s;// 0
	int i;// 0
	long l;// 0
	float f;// 0.0
	double d;// 0.0
	char c;//
	boolean bool;// false
	
	{System.out.println("instance 1: "+bool);}
	
	public void m3() {
		System.out.println("m3()");
	}
	
	public byte m2() {
		System.out.println("m2()");
		return 2;
	}
public static void m1() {
	System.out.println(sb);
//	System.out.println(s);
}


	static byte sb;// 0// method area
	static short ss;// 0
	static int si;// 0
	static long sl;// 0
	static float sf;// 0.0
	static double sd;// 0.0
	static char sc;//
	static boolean sbool;// false
	
	static {
		System.out.println("static1: "+si);
//		System.out.println(i);
	}

	public static void displayRangeoFDataType() {
		int c;// local variable.//stack
		System.out.println(Byte.MIN_VALUE + " " + Byte.MAX_VALUE);
		System.out.println();
		System.out.println(Short.MIN_VALUE + " " + Short.MAX_VALUE + "\n");
		System.out.println(Integer.MIN_VALUE + " " + Integer.MAX_VALUE);
		System.out.println(Long.MIN_VALUE + " " + Long.MAX_VALUE);
		System.out.println(Float.MIN_VALUE + " " + Float.MAX_VALUE);
		System.out.println(Double.MIN_VALUE + " " + Double.MAX_VALUE);
	}
//public static void main(String[] args)
//	public static void main(String args123[])
	static  public void main(String ...args123) {
//		displayRangeoFDataType();
		DataTypeDemo demo = new DataTypeDemo();// heap
//		System.out.println(demo.b);
//		System.out.println(demo.d);
//		System.out.println(sb);
//		System.out.println(sd);

	}
	
	// static variable/static block>instance variable/block.
	
	static {
		System.out.println("static2: "+sbool);
	}
	
	{System.out.println("instance 1: "+bool);}
}