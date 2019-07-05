package com.amit.java8.fundamental;

public class ArrayDemo1 {

	int size=0;
	int [] array =new int[10];
	public void add(int a) {
	array [size]=a;
	size++;		
	}
	public int size(){
		return size;
	}
	public void display() {
		for(int i=0; i<size;i++) {
			int value =array[i];
			System.out.println(value);
		}
		
	}
			
	public static void main(String[] args) {
	ArrayDemo1 ad=new ArrayDemo1();
	ad.add(10);
	ad.add(20);
	ad.add(30);
	ad.add(40);
	ad.add(50);
	int i=ad.size();
	System.out.println(i);
	ad.display();
	}

}
