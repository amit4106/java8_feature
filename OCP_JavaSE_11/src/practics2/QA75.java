package practics2;

import java.nio.file.Path;
import java.nio.file.Paths;

public interface QA75 {
public static void main(String[] args) {
	Path p=Paths.get("data\\projects\\a-project\\..\\..\\another-project");
	System.out.println(p.normalize());
}
}
