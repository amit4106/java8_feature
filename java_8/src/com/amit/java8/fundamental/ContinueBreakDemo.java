package com.amit.java8.fundamental;

public class ContinueBreakDemo {
	
	public static void main(String[] args) {
		
//		for(int a=0; a<5;a++) {
//			if(a==2) continue; 
//				System.out.println(a);
//			
//		}
		int ar[]=new int[3];
		int ar1[]=new int[6];
		int k=0;
		int l=0;
		
		lable:for(int i=0;i<3;ar[l++]=i++) {
			//System.out.println();
			for(int j=0; j<3;ar1[k++]=j++) {
				if(j==2) break lable;
				//System.out.print(j);
			}
			
		}
		for(int i: ar) {
			System.out.print(i);
		}
		System.out.println();
		for(int i: ar1) {
			System.out.print(i);
		}
	}

}

