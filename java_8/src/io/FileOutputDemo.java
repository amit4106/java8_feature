package io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FileOutputDemo {
	public static void main(String[] args) throws IOException{
		FileOutputStream fout=new FileOutputStream("C:\\Users\\dell\\Desktop\\Test.txt");
		FileChannel channel = fout.getChannel();
		ByteBuffer writeBuffer = ByteBuffer.allocate(1024);
		String mgs="This is first input";
		
		writeBuffer.put(mgs.getBytes());
		writeBuffer.flip();
		int write = channel.write(writeBuffer);
		System.out.println("file written successfully");
	}
}
