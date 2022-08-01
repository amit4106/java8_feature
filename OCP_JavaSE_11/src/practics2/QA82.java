package practics2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QA82 {
public static void main(String[] args) {
	try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in))){
		System.out.println("Input :");
		String input=br.readLine();
		System.out.println("Echo :"+ input);
	}catch (IOException e) {
		e.printStackTrace();
	}
}
}
