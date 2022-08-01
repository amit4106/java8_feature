package practics2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QA92 {
	public static void main(String[] args) {
		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in))){
			String out=br.readLine();
			System.out.println("input string was "+ out);
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
