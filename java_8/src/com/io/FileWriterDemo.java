package com.io;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) {
		String str="\n hello good moring";
		FileWriter fw=null;
		try {
			fw=new FileWriter("src/amit.txt", true);
			fw.write(str);
			System.out.println(str+" successful");
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
