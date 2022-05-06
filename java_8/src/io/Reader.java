package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Reader {
	public static void main(String[] args) {
		/* Try opening the file with reader */
		try (FileReader fr = new FileReader("log.txt")) {
			int value = 0;
			while ((value = fr.read()) != -1) {
				System.out.print((char) value);
			}
		} catch (FileNotFoundException e) {
			System.out.println("Exception occur while opening the file");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
