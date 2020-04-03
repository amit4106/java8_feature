package com.mis;

/**
 * 1.Declare a static variable of given class type. 2.Make constructor private.
 * 3.Define a static method which return a instance of the given class.
 * 
 * @author HP
 *
 */
public class Singleton {
	private static Singleton instance = new Singleton();

	private Singleton() {

	}

	public static Singleton getInstance() {
		return instance;
	}
}
