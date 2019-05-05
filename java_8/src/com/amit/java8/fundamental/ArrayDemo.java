package com.amit.java8.fundamental;

public class ArrayDemo {

	public int findMin(int[] value) {
	int minValue=value[0];
//	for(int i=1; i<values.length; i++) {
//		if(max<values[i]) {
//			max=values[i];
//		}
//	}
	for(int i=1;i<value.length;i++) {
		if (value[i]<minValue) {
			minValue=value[i];
		}
		
	}
		
		return minValue;
	
	}
	public static void main(String[] args) {
int [] a=new int[10];
a[0]=10;
a[1]=20;
a[2]=30;
a[3]=40;
a[4]=50;
a[5]=60;
a[6]=70;
a[7]=80;
a[8]=90;
a[9]=92;
//for(int i=0; i<a.length; i++) {
	//System.out.println(a[i]);
//}
ArrayDemo ad=new ArrayDemo();
int minValue=ad.findMin(a);
System.out.println(minValue);
	}

}
