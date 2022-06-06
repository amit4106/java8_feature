package com.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;

public class TestDemo {
	public static void main(String[] args) throws IOException{
		File f=new File("E:\\ocpjp","demo.txt");
//		boolean newFile = f.createNewFile();
//		System.out.println("New file created :"+newFile);
//		FileWriter fw=new FileWriter("E:\\ocpjp\\demo.txt");
//		String s="Hi Amit \nHow are you??";
//		fw.write(s);
//		fw.flush();
//		fw.close();
//		FileReader fr=new FileReader(f);
//		int i = fr.read();
//		while(i!=-1) {
//		System.out.print((char)i);
//			i=fr.read();
//		}
//		char[] ch=new char[(int)f.length()];
//		fr.read(ch);
//		for(char c: ch) {
//			System.out.print(c);
//		}
		
//		BufferedWriter bw=new BufferedWriter(new FileWriter("E:\\ocpjp\\demo.txt"));
//		bw.newLine();
//		String str="There was King in nort of India";
//		bw.write(str);
//		bw.flush();
//		bw.close();
//		FileReader fr=new FileReader("E:\\ocpjp\\demo.txt");
//		BufferedReader br=new BufferedReader(fr);
//		String line=br.readLine();
//		while(line!=null) {
//			System.out.println(line);
//			line=br.readLine();
//		}
//		br.close();
		
//		PrintWriter pw=new PrintWriter("E:\\ocpjp\\file3.txt");
//		BufferedReader br=new BufferedReader(new FileReader("E:\\ocpjp\\file1.txt"));
//		String line=br.readLine();
//		while(line!=null) {
//			System.out.println(line);
//			line=br.readLine();
//		}
//		br=new BufferedReader(new FileReader("E:\\ocpjp\\file2.txt"));
//		line=br.readLine();
//		while(line!=null) {
//			System.out.println(line);
//			line=br.readLine();
//		}
//		pw.flush();
//		br.close();
//		pw.close();
		
		PrintWriter pw=new PrintWriter("E:\\ocpjp\\file3.txt");
		BufferedReader br1=new BufferedReader(new FileReader("E:\\ocpjp\\file1.txt"));
		BufferedReader br2=new BufferedReader(new FileReader("E:\\ocpjp\\file2.txt"));
		String line1=br1.readLine();
		String line2=br2.readLine();
		while(line1!=null||line2!=null) {
			if(line1!=null) {
				pw.println(line1);
				line1=br1.readLine();
			}
			if(line2!=null) {
				pw.println(line2);
				line2=br2.readLine();
			}
		}
		pw.flush();
		br1.close();
		br2.close();
		pw.close();
	}
}
