package com.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Important classes
 * 	Reader
 * 1	BufferedReader->	LineNumerReader
 * 2	FilterReader->		PushBackReader
 * 3	InputStreamReader->	FileReader
 * 4	StringReader
 * 	
 * 
 * 	Writer
 * 1	BufferedWriter
 * 2	PrintWriter
 * 3	OutputStreamWriter
 * 4	FileWriter
 * 5	FilterWriter
 * 6	StringWriter
 *   
 * @author dell
 *
 */
public class HumanRead {
	public static void main(String[] args) {
		int ch=0;
		FileReader fr=null;
		try {
			 fr = new FileReader("src/abc.txt");
			while((ch=fr.read())!=-1) {
				System.out.print((char)ch);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				
				if(fr!=null)
					fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}











