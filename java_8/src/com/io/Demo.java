package com.io;

import java.io.FileInputStream;

public class Demo {
public static void main(String[] args) {
	try(FileInputStream fis=new FileInputStream("src/Login.class")){
		int read = fis.read();
		while(read!=-1) {
			System.out.println((char)read);
		}
	}catch (Exception e) {
		e.printStackTrace();
		}
}
}
