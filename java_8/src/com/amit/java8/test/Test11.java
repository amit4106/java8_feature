package com.amit.java8.test;

public class Test11 {

	public static void main(String[] args) {
//int a[][][]= new int [2][3][3];
//a[]
//System.out.println(a[1][2][0]);
		int a[][][]= {{{10,20,30},{40,50}}, {{60,70}}};
//		System.out.println(a.length);
//		System.out.println(a[2]);
//		System.out.println(a);
//		System.out.println(a[0]);
		for(int i=0; i<a.length; i++) {
			for(int j=0;j<a[i].length; j++) {
				for(int k=0;k<a[i][j].length; k++) {
					
				}
				
			}
		}
	}

}
