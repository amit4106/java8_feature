package com.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {
	public static void main(String[] args) {
		String str=null;
		FileReader fr=null;
		BufferedReader br=null;
		try {
			 fr=new FileReader("src/abc.txt");
			 br=new BufferedReader(fr);
			while((str=br.readLine())!=null) {
				System.out.println(str);
			}
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			
				try {
					if(fr!=null)
					fr.close();
					if(br!=null)
						br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}
}
