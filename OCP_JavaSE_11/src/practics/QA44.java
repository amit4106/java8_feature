package practics;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class QA44 {
	public static void main(String[] args) {
		Path source=Paths.get("E:\\ocpjp\\A\\file3.txt");
		Path destination=Paths.get("E:\\ocpjp");
		try {
			Files.move(source, destination);
			Files.delete(source);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
