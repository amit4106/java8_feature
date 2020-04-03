package com.mis;

public class Test {
	public static void main(String[] args) {
		Singleton instance = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		Singleton instance3 = Singleton.getInstance();
		Singleton instance4 = Singleton.getInstance();
		System.out.println(instance.hashCode());
		System.out.println(instance2.hashCode());
		System.out.println(instance3.hashCode());
		System.out.println(instance4.hashCode());
//hashCode same means single object is created.
	}

}
