package practics;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttribute;

public class QA08 {
public static void main(String[] args) {
	try {
		Path path=Path.of("\\two\\three");
//		BasicFileAttributes attributes = Files.readAttributes(path, BasicFileAttributes.class);
//		Files.readAttributes(path, FileAttribute.class);
//		System.out.println(attributes.isDirectory());
	}catch (Exception e) {
		e.printStackTrace();
	}
}
}
