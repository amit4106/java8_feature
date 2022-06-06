package com.amit.nio;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesDemo {
public static void main(String[] args) {
	Path source = Paths.get("E:\\study\\java book\\Core Java Book.pdf");
	Path destination = Paths.get("alok");
	
//	try {	
//		Files.copy(source, destination);
//		System.out.println("file copied");
//		Files.delete(destination);
//		System.out.println("File deleted");
//	} catch (IOException e) {
//		e.printStackTrace();
//	}
	
	File f=new File("abc.txt");
	try {
		Files.readAllLines(Paths.get(f.getAbsolutePath()));
	} catch (IOException e) {
		e.printStackTrace();
	}
	
}
}
