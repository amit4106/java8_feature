package com.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * 
 * BasicFileAttributes
 * PosixFileAttributes
 */

public class FileAttributes {
	public static void main(String[] args) {
		Path source = Paths.get("E:\\study\\java book\\Core Java Book.pdf");
		try {
			BasicFileAttributes bs=Files.readAttributes(source, BasicFileAttributes.class);
//			System.out.println((bs.size()/1024)/1024);
			System.out.println(bs.lastAccessTime());
			System.out.println(bs.creationTime());
			boolean readable = Files.isReadable(source);
			System.out.println(readable);
			System.out.println(Files.isWritable(source));
			System.out.println(Files.isExecutable(source));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
