package apiGeneric;

import java.util.ArrayList;

public class MyGeneric<T> {
	public void add(T t ) {
		System.out.println(t);
	}
	public void m1(ArrayList<?> al) {
		
		System.out.println(al);
	}
	
}