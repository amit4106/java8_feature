package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * PipedInputStream,PipedOutputStream: These classes create a communication channel on
 *  which data can be send and received.PipedOutputStream sends the data and PipedInputStream receives the
 *  data sent on the channel.
 *  FileInputStream,FileOutsputStream: FileInputStream receives a byte stream from a file,FileOutputStream writes 
 *  a byte stream into a file.
 *  FilterInputStream,FilterOutputStream:these filtered streams are used to add functionalities to 
 *  plain  streams. The output of an InputStream can be filtered using FilterInputStream.
 *  The output of an OutputStream can be filtered using FilterOutputStream.
 *  BufferedOutputStream,BufferedInputStream: BufferedInputStream adds buffering capabilities to an InputStream.
 *  BufferOutputStream adds buffering capabilities to an OutputStream.
 *  PushBackInputStream: A sub class of filter InputStream, it adds PushBack functionalities to an InputStream.
 *  DataInputStream,DataOutputStream:DataInputStream can be used to read java primitive data types from an 
 *  InputStream.
 *  DataOutputStream can be used to write java  primitive data types to an output stream.
 */
// Reading a byte stream
public class ByteStream {

	public static void main(String[] args) {
		try(FileInputStream fs=new FileInputStream("Hello.class")){
			int value=0;
			while((value=fs.read())!=-1)
				System.out.println((char)value);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
