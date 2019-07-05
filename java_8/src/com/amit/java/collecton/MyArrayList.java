package com.amit.java.collecton;

import java.util.ArrayList;
import java.util.List;

public class MyArrayList<T> {

	Object[] array = new Object[4];

	private int size;

	public void add(T data) {

		array[size] = data;
		size++;

	} 
	public int size() {
		
		return size;
	}
	public T get(int index) {
		return (T)array[index];
	}
	
	public void m1(ArrayList<?> al) {
		
	}

}
