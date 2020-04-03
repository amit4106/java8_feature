package io;
/**
 * Stream- It is an ordered sequences of data.
 * Types of stream -
 * 1. character stream (text based)
 * example: text file, document file , html , xml.
   2.Binary stream (data based)
   example: .class file, zip file, images(jpg, png,).
   
  Q. How to read and write characters from text file?
  Ans: With the help of Reader and Writer Abstract Class.
  Q. How to read and write bytes(data) from binary files?
  Ans: With the help of InputStream and OutputStream. 
  NOTE:- UTF-16 represents txt file. 
         UTF-8 represents binary file.
         StringReader:- A character stream that operates on a string.
         InputStreamReader:- This class is a bridge between character stream and byte stream.
         FileReader:- It is derived class of InputStreamReader which provides support  for 
         reading character files
         PipedReader:- The PipedReader and PipedWriter classes form a pair for piped 
         reading/writing of characters.
         FilterReader:- It supports a filtering operation applied on data as characters 
         are read from the stream.
         PushBackReader:- It is derived class of FilterReader that allows a read characters 
         to be pushed back into the stream.
         BufferedReader:- Adds buffering to the underlying character stream so that there is no need 
         to access the underlying file system for each read and write operation.
         LineNumberReader:- It is a derived class of BufferReader that keeps track of line numbers 
         as the characters are read from the underlying character stream.
         StringWriter:-A character stream that collects the output in a string buffer which
         can be used for creating a string.
         OutputStreamWriter:- This class is a bridge between character streams and byte streams.
         FileWrtiter:- It is a derived class of OutputStreamWriter that provides support for writing 
         character files.
         PipedWriter:- The PipedReader and PipedWriter classes form a pair for piped 
         reading/writing of characters.
         FilterWriter:-It supports a filtering operation applied on data as characters when writing
         them to a character stream.
         PrintWriter:- It supports formatted printing of characters to the output character stream.
         BufferedWriter:- Adds buffering to the underlying character stream so that there is no need 
         to access the underlying file system for each read and write operation. 
         
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;


public class InputOutput {
public static void main(String[] args) throws IOException {
	/*System.out.println("Please enter the character");
	int value = System.in.read();
	System.out.println(value);*/
	
	/*System.out.println("Please enter the sentence");
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	String readLine = br.readLine();
	System.out.println(readLine);*/
	
	PrintStream ps=new PrintStream("log.txt");
	System.setOut(ps);
	System.out.println("There was a King in north and his name was John Snow");
	
}
}
