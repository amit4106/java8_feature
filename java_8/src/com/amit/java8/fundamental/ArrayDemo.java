package com.amit.java8.fundamental;

public class ArrayDemo {

	public static  int findMin(int[] source) {
	
	// take first value from the given array and assume it is a min value.
		int min=source[0];
		// traverse the array the and compare if min value is greater than swap otherwise proceed to next value.
		
		for(int i=0;i<source.length;i++) {
			if(min>source[i]) {
				min=source[i];
			}
		}
		return min;
	}
	
	public static  int findMax(int[] source) {
		// take a value from array and find the max value.
		int max=source[0];
		//to check the total value of array and swap with the max number.
		for (int i=0; i<source.length;i++) {
			if(max<source[i]) {
				max=source[i];
			}
				}
		
		return max;
	}
	
	
	
	
	public static void main(String[] args) {
		int[] source= new int[] {20,2,12,100,50,90,85};
	int max=	findMax(source);
	int min= findMin(source);
	if(max==100 && min==2) {
		System.out.println("Pass");
	}else {
		System.out.println("Fail");
	}
	}

}
