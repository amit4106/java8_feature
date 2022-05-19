package com.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Test {
public static void main(String[] args)throws IOException {
	int i;
	InputStream in=System.in;
	BufferedReader br=new BufferedReader(new InputStreamReader(in));
		try {
			i=br.read();
			System.out.println((char)i);
		}catch (IOException e) {
			System.out.println("IO");
		}
}
}
