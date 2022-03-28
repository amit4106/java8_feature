package com.nio;

import java.io.IOException;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathDemo1 {
	public static void main(String[] args) {
//		How can we create an Object of Path?
		Path path = Paths.get("C:\\Users\\HP\\Desktop\\New folder\\OS.pdf");
		System.out.println(path.getFileName());
		System.out.println(path.getRoot());
		System.out.println(path.getParent());
		System.out.println(path.getNameCount());
		System.out.println(path.getName(1));
		System.out.println(path.subpath(1, 3));
		System.out.println(path.normalize());
		System.out.println(path.isAbsolute());
		System.out.println(path.toAbsolutePath());
		System.out.println(path.startsWith("C:\\"));
		System.out.println(path.toUri());
		try {
			System.out.println(path.toRealPath(LinkOption.NOFOLLOW_LINKS));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Path path2 = Paths.get("OS.pdf");
		System.out.println(path.compareTo(path2));
		System.out.println(path2.compareTo(path));
		System.out.println(path.toAbsolutePath().equals(path2.toAbsolutePath()));
	}
}
