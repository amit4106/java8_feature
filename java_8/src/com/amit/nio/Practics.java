package com.amit.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public class Practics {
	public static void main(String[] args) throws IOException{
	
		Path path=Paths.get("E:\\nio\\impotant methods nio.txt");
		Path path1=Paths.get("E:\\Java Local\\One\\..\\..\\Two\\Test.txt");
		Path path3=Paths.get("src/Abc.txt");
//		System.out.println("Root of the file is : "+path.getRoot());
//		System.out.println("File name is : "+path.getFileName());
//		System.out.println("Folder name of file root : "+path.getParent());
//		System.out.println("Name of the index root file or folder name "+path.getName(1));
//		System.out.println("Dispaly the root name  of given path :  "+path.subpath(0, 2));
		System.out.println("Display the full root name of the given path : "+path.equals(path1));
//		System.out.println(""+path.resolve(path1));
//		System.out.println(""+path.resolveSibling(path1));
//		System.out.println(path.relativize(path1));
//		System.out.println("It will check complete path and return in boolean type :"+path.isAbsolute());
//		System.out.println(path1.getNameCount());
		
//		Path path4=Paths.get("E:\\ocpjp\\file.txt");
//		Path path5=Paths.get("..\\file.txt");
//		Path copy = Files.copy(path4, path5);
//		System.out.println(copy);
		System.out.println(path1.normalize());
		
	}
}
