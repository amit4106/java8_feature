package com.io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileWriteable {
public static void main(String[] args) {
	Path path=Paths.get("E:\\ocpjp");
	try {
		
		File.createTempFile("zing", ".pdf");
	} catch (IOException e) {
		e.printStackTrace();
	}
	
}
}
