package com.amit.java8.array;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
	
	public static void main(String[] args) {
			
	Student st= new Student("Amit", 21, new Date(), new Address("BIHAR", 1223));
		
	System.out.println(st);
	
	System.out.println(st.getName() +" "  + st.getAddress()+ " ");
	
	System.out.println(st.getName());
	
	Date date=st.getDob();
	
	date.setYear(2000);
	
	System.out.println(st);
	
	Address add=st.getAddress();
	
	add.setPinCode(4567);
	System.out.println(st.getDob());
	}
}

/**
* 1. Make your class final
* 2. Make all fields private
* 3. Provide only getters 
* 4. Make mutable fields final
* 5. Don't return direct reference, use deep cloning/copy constructor   
*    (return copy reference)
*
**/
