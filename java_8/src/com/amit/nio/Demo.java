package com.amit.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Important class/interfaces of nio package
 * 	Path
	Paths	(It has only two methods, get(String), get(URI)
	Files
 * 	File (io) need to explore.
 *
 */
public class Demo {
	public static void main(String[] args) {
	Path path = Paths.get("Z:\\myfolder\\amit.txt");
//	Path path=Paths.get("E:\\study\\java book");
//	Basic information about Path
	System.out.println(path.getFileName());
	System.out.println(path.getRoot());
	System.out.println(path.isAbsolute());
//	System.out.println(path);
	}
}
