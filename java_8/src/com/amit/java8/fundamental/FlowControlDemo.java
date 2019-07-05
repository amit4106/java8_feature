package com.amit.java8.fundamental;

public class FlowControlDemo {
	public void getDiet(String day){
		switch(day) {
		case "Monday":{
			System.out.println("RICE");
			break;
			
		} 
		case "Tuesday":{
			System.out.println("sweet");
			break;
			
		}
		case "Wednesday":{
			System.out.println("fish");
			break;
			
		}
		case "Thurday":{
			System.out.println("egg");
			break;
			
		}
		case "Friday":{
			System.out.println("fruits");
			break;
			
		}
		case "Saturday":{
			System.out.println("litty");
			break;
			
		}
		case "Sunday":{
			System.out.println("khir");
			break;
			
		}
		default: System.out.println("Invaild Day");
		}
		
		
	} 
	

}
