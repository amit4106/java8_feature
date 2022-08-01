package practics2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class QA86 {
public static void main(String[] args){
	try {
	Path path=Paths.get("u01\\work\\filestore.txt");
	boolean result = Files.deleteIfExists(path);
	if(result)
		System.out.println(path+"is deleted");
	else
		System.out.println(path+"not deleted");
	}catch (IOException e) {
		System.out.println("exception");
	}
}
}
