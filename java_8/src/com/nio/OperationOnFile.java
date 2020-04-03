package com.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;

public class OperationOnFile {
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("H:\\Anu\\main.txt");
		// Write operation
		String s="shradha\n anu\n shail\n anjali\n ambe";
		Path write = Files.write(path,s.getBytes());
		System.out.println(write);
	// read operation
		//byte[] readAllBytes = Files.readAllBytes(path);
	//	System.out.println(new String(readAllBytes));
		List<String> readAllLines = Files.readAllLines(path);
		//readAllLines.forEach(System.out::println);
		// copy files
		Path path1 = Paths.get("H:\\Anu\\test.txt");
		Path copy = Files.copy(path, path1,StandardCopyOption.REPLACE_EXISTING);
		System.out.println(copy);
		Path path3 = Paths.get("H:\\sql\\main.txt");
		//move files
		Files.move(path, path3, StandardCopyOption.REPLACE_EXISTING);
		//delete files
		Files.delete(path1);
		System.out.println("File deleted");
		
	}
}
