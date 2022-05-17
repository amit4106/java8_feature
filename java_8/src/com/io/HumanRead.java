package com.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Important classess
 * 1	Reader->
 * 2	BufferedReader->LineNumerReader
 * 3	FilterReader->PushBackReader
 * 4	InputStreamReader->FileReader
 * 5	StringReader
 * 
 * Writer
 * BufferedWriter
 * PrinterWriter
 * OutputStreamWriter
 * FileWriter
 * FilterWriter
 * StringWriter
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











