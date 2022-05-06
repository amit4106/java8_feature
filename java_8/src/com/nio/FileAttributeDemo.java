package com.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class FileAttributeDemo {
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("H:\\Anu");
		BasicFileAttributes attributes = Files.readAttributes(path, BasicFileAttributes.class);
		System.out.println(attributes.size());
		System.out.println(attributes.lastAccessTime());
		System.out.println(attributes.lastModifiedTime());
	}
}
