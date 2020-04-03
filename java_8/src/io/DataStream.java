package io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class DataStream {

	public static void main(String args[]) {
		try(DataOutputStream dos=new java.io.DataOutputStream(new FileOutputStream("temp.data"))){
			for (int i = 0; i < 10; i++) {
				dos.writeByte(i);
				dos.writeShort(i);
				dos.writeDouble(i);
				dos.writeChar(i);
				dos.writeFloat(i);
				}
		}catch (FileNotFoundException e) {
		}catch (IOException e) {
		}
		try(DataInputStream dis=new DataInputStream(new FileInputStream("temp.data"))){
			for (int i = 0; i < 10; i++) {
				System.out.printf("%d %d %g %c %g \n", dis.readByte(), dis.readShort(), dis.readDouble(), dis.readChar(),
						dis.readFloat());
		}}catch (FileNotFoundException e) {
		}catch (IOException e) {
		}
	}
}
