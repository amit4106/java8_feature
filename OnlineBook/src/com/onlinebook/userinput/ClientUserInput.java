package com.onlinebook.userinput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ClientUserInput {
	
	
	
public static void UserInput()  {
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String bookID=null;
	String bookName=null;
	String author=null;
	String publication=null;
	double cost=0.00;
	int edition=0;
	try {
		System.out.println("Enter BookID: ");
		 bookID = br.readLine();
		System.out.println("Enter BookName: ");
		 bookName = br.readLine();
		
		System.out.println("Enter Author: ");
		 author = br.readLine();
		
		System.out.println("Enter Publication: ");
		 publication = br.readLine();
		
		System.out.println("Enter cost: ");
		 cost = Double.parseDouble(br.readLine());
		
		System.out.println("Enter edition: ");
		 edition = Integer.parseInt(br.readLine());
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
}
	
}
