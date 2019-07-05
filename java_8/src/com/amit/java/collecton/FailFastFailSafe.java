package com.amit.java.collecton;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastFailSafe {

	public static void main(String[] args) {
		
CopyOnWriteArrayList cr=new CopyOnWriteArrayList();

cr.add(10);
cr.add(20);
cr.add(30);
cr.add(40);
Iterator iterator = cr.iterator();

while(iterator.hasNext()) {
	
	//System.out.println(Thread.currentThread().getName());
	
	System.out.println(iterator.next());
	
}
System.out.println(Thread.currentThread().getPriority());
cr.remove(2);
System.out.println(cr);

	}

}
