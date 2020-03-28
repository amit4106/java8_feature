package com.amit.java8.test;

public class Test6 { 
	
	 public static void main(String args[]) {
	      
//	      int ar[] [][]=new int[2][2][2];
//	      ar[0][0][0]=10;
//	      ar[0][0][1]=20;
//	      ar[0][1][0]=30;
//	      ar[0][1][1]=40;
//	      ar[1][0][0]=50;
//	      ar[1][0][1]=60;
//	      ar[1][1][0]=70;
//	      ar[1][1][1]=80;
//	      
//	     int ar[][][]= { 
//	    	 {{10,20, 30},{40,50}},  
//	    		 
//	    		 {{60},{70,80}}
//	    	 
//	     }; 
		 int ar[][][]= {
				 {
					 {1,2},{3,4}
					 
				 },
				 
				 {
					 {83,12,19},{26,51},{0},{10}
				 }
				 
		 };
	     System.out.println(ar.length);
	     System.out.println(ar[0].length);
	     System.out.println(ar[0][0].length);
		 for(int i=0;i<ar.length;i++) {
	    	  for(int j=0;j<ar[i].length;j++) {
	    		  for(int k=0;k<ar[i][j].length;k++) {
	    	  
	    	  System.out.println(ar[i][j][k]);
	      }
	    	  }
		 }
	      
	   }
	}
